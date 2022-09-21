package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallableFunction
  extends js.Function {
  
  /**
    * Calls the function with the specified object as the this value and the elements of specified array as the arguments.
    * @param thisArg The object to be used as the this object.
    * @param args An array of argument values to be passed to the function.
    */
  /* standard es5 */
  @JSName("apply")
  def apply[T, R](thisArg: T): R = js.native
  /* standard es5 */
  @JSName("apply")
  def apply[T, A /* <: js.Array[Any] */, R](thisArg: T, args: A): R = js.native
  
  /**
    * For a given function, creates a bound function that has the same body as the original function.
    * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
    * @param thisArg The object to be used as the this object.
    * @param args Arguments to bind to the parameters of the function.
    */
  /* standard es5 */
  def bind[T](thisArg: ThisParameterType[T]): OmitThisParameter[T] = js.native
  /* standard es5 */
  def bind[T, AX, R](thisArg: T, args: AX*): js.Function1[/* repeated */ AX, R] = js.native
  /* standard es5 */
  def bind[T, A0, A /* <: js.Array[Any] */, R](thisArg: T, arg0: A0): js.Function1[/* args */ A, R] = js.native
  /* standard es5 */
  def bind[T, A0, A1, A /* <: js.Array[Any] */, R](thisArg: T, arg0: A0, arg1: A1): js.Function1[/* args */ A, R] = js.native
  /* standard es5 */
  def bind[T, A0, A1, A2, A /* <: js.Array[Any] */, R](thisArg: T, arg0: A0, arg1: A1, arg2: A2): js.Function1[/* args */ A, R] = js.native
  /* standard es5 */
  def bind[T, A0, A1, A2, A3, A /* <: js.Array[Any] */, R](thisArg: T, arg0: A0, arg1: A1, arg2: A2, arg3: A3): js.Function1[/* args */ A, R] = js.native
  
  /**
    * Calls the function with the specified object as the this value and the specified rest arguments as the arguments.
    * @param thisArg The object to be used as the this object.
    * @param args Argument values to be passed to the function.
    */
  /* standard es5 */
  def call[T, A /* <: js.Array[Any] */, R](
    thisArg: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
  ): R = js.native
}
