package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/do", JSImport.Namespace)
@js.native
object operatorDoMod extends js.Object {
  def _do[T](`this`: rxjsLib.rxjsMod.Observable[T], next: js.Function1[/* x */ T, scala.Unit]): rxjsLib.rxjsMod.Observable[T] = js.native
  def _do[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    next: js.Function1[/* x */ T, scala.Unit],
    error: js.Function1[/* e */ js.Any, scala.Unit]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def _do[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    next: js.Function1[/* x */ T, scala.Unit],
    error: js.Function1[/* e */ js.Any, scala.Unit],
    complete: js.Function0[scala.Unit]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def _do[T](`this`: rxjsLib.rxjsMod.Observable[T], observer: rxjsLib.internalTypesMod.PartialObserver[T]): rxjsLib.rxjsMod.Observable[T] = js.native
}

