package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/debounce", JSImport.Namespace)
@js.native
object operatorDebounceMod extends js.Object {
  def debounce[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    durationSelector: js.Function1[/* value */ T, rxjsLib.internalTypesMod.SubscribableOrPromise[_]]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

