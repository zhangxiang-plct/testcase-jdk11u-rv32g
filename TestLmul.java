/**
 * Test case for lmul
 * @author Xiang Zhang
 * @version 1.0
 */

public class TestLmul {
    /**
     * @return By the way, the correct result of examples in the following is 10000.
     */
    public static long lmul(long m1, long m2){
        return m1*m2;
    }

    public static void main(String[] args) {
        System.out.println(lmul(100L,100L));
    }
}