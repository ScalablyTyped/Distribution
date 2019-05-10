package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/reduce", JSImport.Namespace)
@js.native
object operatorReduceMod extends js.Object {
  def reduce[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ scala.Double, T]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def reduce[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ scala.Double, T],
    seed: T
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("reduce")
  def reduce_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ scala.Double, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("reduce")
  def reduce_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ scala.Double, R],
    seed: R
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

