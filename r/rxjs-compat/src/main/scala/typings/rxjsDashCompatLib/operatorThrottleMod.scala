package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/throttle", JSImport.Namespace)
@js.native
object operatorThrottleMod extends js.Object {
  def throttle[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    durationSelector: js.Function1[/* value */ T, rxjsLib.internalTypesMod.SubscribableOrPromise[_]]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def throttle[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    durationSelector: js.Function1[/* value */ T, rxjsLib.internalTypesMod.SubscribableOrPromise[_]],
    config: js.Any
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

