package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallableFunction
  extends js.Function {
  /**
    * Calls the function with the specified object as the this value and the elements of specified array as the arguments.
    * @param thisArg The object to be used as the this object.
    * @param args An array of argument values to be passed to the function.
    */
  @JSName("apply")
  def apply[T, R](`this`: js.ThisFunction0[/* this */ T, R], thisArg: T): R = js.native
  @JSName("apply")
  def apply[T, A /* <: js.Array[_] */, R](`this`: js.ThisFunction1[/* this */ T, /* args */ A, R], thisArg: T, args: A): R = js.native
  /**
    * For a given function, creates a bound function that has the same body as the original function.
    * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
    * @param thisArg The object to be used as the this object.
    * @param args Arguments to bind to the parameters of the function.
    */
  def bind[T](`this`: T, thisArg: ThisParameterType[T]): OmitThisParameter[T] = js.native
  def bind[T, AX, R](`this`: js.ThisFunction1[/* this */ T, /* repeated */ AX, R], thisArg: T, args: AX*): js.Function1[/* repeated */ AX, R] = js.native
  def bind[T, A0, A /* <: js.Array[_] */, R](`this`: js.ThisFunction2[/* this */ T, /* arg0 */ A0, /* args */ A, R], thisArg: T, arg0: A0): js.Function1[/* args */ A, R] = js.native
  def bind[T, A0, A1, A /* <: js.Array[_] */, R](
    `this`: js.ThisFunction3[/* this */ T, /* arg0 */ A0, /* arg1 */ A1, /* args */ A, R],
    thisArg: T,
    arg0: A0,
    arg1: A1
  ): js.Function1[/* args */ A, R] = js.native
  def bind[T, A0, A1, A2, A /* <: js.Array[_] */, R](
    `this`: js.ThisFunction4[/* this */ T, /* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* args */ A, R],
    thisArg: T,
    arg0: A0,
    arg1: A1,
    arg2: A2
  ): js.Function1[/* args */ A, R] = js.native
  def bind[T, A0, A1, A2, A3, A /* <: js.Array[_] */, R](
    `this`: js.ThisFunction5[/* this */ T, /* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* args */ A, R],
    thisArg: T,
    arg0: A0,
    arg1: A1,
    arg2: A2,
    arg3: A3
  ): js.Function1[/* args */ A, R] = js.native
  /**
    * Calls the function with the specified object as the this value and the specified rest arguments as the arguments.
    * @param thisArg The object to be used as the this object.
    * @param args Argument values to be passed to the function.
    */
  def call[T, A /* <: js.Array[_] */, R](
    `this`: js.ThisFunction1[/* this */ T, /* args */ A, R],
    thisArg: T,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type A is not an array type */ args: A
  ): R = js.native
}

