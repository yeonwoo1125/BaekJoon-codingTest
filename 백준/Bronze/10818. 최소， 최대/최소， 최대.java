import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[n-1]);
    }
}