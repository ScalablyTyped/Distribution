package typings.std

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewableFunction
  extends js.Function {
  /**
    * Calls the function with the specified object as the this value and the elements of specified array as the arguments.
    * @param thisArg The object to be used as the this object.
    * @param args An array of argument values to be passed to the function.
    */
  @JSName("apply")
  def apply[T](thisArg: T): Unit = js.native
  @JSName("apply")
  def apply[T, A /* <: js.Array[_] */](thisArg: T, args: A): Unit = js.native
  /**
    * For a given function, creates a bound function that has the same body as the original function.
    * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
    * @param thisArg The object to be used as the this object.
    * @param args Arguments to bind to the parameters of the function.
    */
  def bind[T](thisArg: js.Any): T = js.native
  def bind[A0, A /* <: js.Array[_] */, R](thisArg: js.Any, arg0: A0): Instantiable1[/* args */ A, R] = js.native
  def bind[A0, A1, A /* <: js.Array[_] */, R](thisArg: js.Any, arg0: A0, arg1: A1): Instantiable1[/* args */ A, R] = js.native
  def bind[A0, A1, A2, A /* <: js.Array[_] */, R](thisArg: js.Any, arg0: A0, arg1: A1, arg2: A2): Instantiable1[/* args */ A, R] = js.native
  def bind[A0, A1, A2, A3, A /* <: js.Array[_] */, R](thisArg: js.Any, arg0: A0, arg1: A1, arg2: A2, arg3: A3): Instantiable1[/* args */ A, R] = js.native
  /**
    * Calls the function with the specified object as the this value and the specified rest arguments as the arguments.
    * @param thisArg The object to be used as the this object.
    * @param args Argument values to be passed to the function.
    */
  def call[T, A /* <: js.Array[_] */](
    thisArg: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
  ): Unit = js.native
}

