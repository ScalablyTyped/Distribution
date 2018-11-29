package typings
package stdLib

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
  def apply[T](`this`: ScalablyTyped.runtime.Instantiable0[T], thisArg: T): scala.Unit = js.native
  @JSName("apply")
  def apply[T, A /* <: js.Array[_] */](`this`: ScalablyTyped.runtime.Instantiable1[/* args */ A, T], thisArg: T, args: A): scala.Unit = js.native
  /**
        * For a given function, creates a bound function that has the same body as the original function.
        * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
        * @param thisArg The object to be used as the this object.
        * @param args Arguments to bind to the parameters of the function.
        */
  def bind[A /* <: js.Array[_] */, R](`this`: ScalablyTyped.runtime.Instantiable1[/* args */ A, R], thisArg: js.Any): ScalablyTyped.runtime.Instantiable1[/* args */ A, R] = js.native
  def bind[AX, R](
    `this`: ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ AX, R],
    thisArg: js.Any,
    args: AX*
  ): ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ AX, R] = js.native
  def bind[A0, A /* <: js.Array[_] */, R](
    `this`: ScalablyTyped.runtime.Instantiable2[/* arg0 */ A0, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0
  ): ScalablyTyped.runtime.Instantiable1[/* args */ A, R] = js.native
  def bind[A0, A1, A /* <: js.Array[_] */, R](
    `this`: ScalablyTyped.runtime.Instantiable3[/* arg0 */ A0, /* arg1 */ A1, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0,
    arg1: A1
  ): ScalablyTyped.runtime.Instantiable1[/* args */ A, R] = js.native
  def bind[A0, A1, A2, A /* <: js.Array[_] */, R](
    `this`: ScalablyTyped.runtime.Instantiable4[/* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0,
    arg1: A1,
    arg2: A2
  ): ScalablyTyped.runtime.Instantiable1[/* args */ A, R] = js.native
  def bind[A0, A1, A2, A3, A /* <: js.Array[_] */, R](
    `this`: ScalablyTyped.runtime.Instantiable5[/* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0,
    arg1: A1,
    arg2: A2,
    arg3: A3
  ): ScalablyTyped.runtime.Instantiable1[/* args */ A, R] = js.native
  /**
        * Calls the function with the specified object as the this value and the specified rest arguments as the arguments.
        * @param thisArg The object to be used as the this object.
        * @param args Argument values to be passed to the function.
        */
  def call[T, A /* <: js.Array[_] */](
    `this`: ScalablyTyped.runtime.Instantiable1[/* args */ A, T],
    thisArg: T,
    /* import warning: Dropping repeated marker of param TsIdentSimple(args) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(A))),List())) is not an array type */args: A
  ): scala.Unit = js.native
}

