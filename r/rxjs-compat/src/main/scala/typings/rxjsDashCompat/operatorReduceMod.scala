package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/reduce", JSImport.Namespace)
@js.native
object operatorReduceMod extends js.Object {
  def reduce[T](
    `this`: Observable[T],
    accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T]
  ): Observable[T] = js.native
  def reduce[T](
    `this`: Observable[T],
    accumulator: js.Function3[/* acc */ T, /* value */ T, /* index */ Double, T],
    seed: T
  ): Observable[T] = js.native
  @JSName("reduce")
  def reduce_TR[T, R](
    `this`: Observable[T],
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R]
  ): Observable[R] = js.native
  @JSName("reduce")
  def reduce_TR[T, R](
    `this`: Observable[T],
    accumulator: js.Function3[/* acc */ R, /* value */ T, /* index */ Double, R],
    seed: R
  ): Observable[R] = js.native
}

