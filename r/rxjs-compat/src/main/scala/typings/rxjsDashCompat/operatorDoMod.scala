package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.PartialObserver
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/do", JSImport.Namespace)
@js.native
object operatorDoMod extends js.Object {
  def _do[T](`this`: Observable[T], next: js.Function1[/* x */ T, Unit]): Observable[T] = js.native
  def _do[T](
    `this`: Observable[T],
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ js.Any, Unit]
  ): Observable[T] = js.native
  def _do[T](
    `this`: Observable[T],
    next: js.Function1[/* x */ T, Unit],
    error: js.Function1[/* e */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): Observable[T] = js.native
  def _do[T](`this`: Observable[T], observer: PartialObserver[T]): Observable[T] = js.native
}

