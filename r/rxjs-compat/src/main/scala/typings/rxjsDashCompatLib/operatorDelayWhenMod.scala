package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/delayWhen", JSImport.Namespace)
@js.native
object operatorDelayWhenMod extends js.Object {
  def delayWhen[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    delayDurationSelector: js.Function1[/* value */ T, rxjsLib.rxjsMod.Observable[_]]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def delayWhen[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    delayDurationSelector: js.Function1[/* value */ T, rxjsLib.rxjsMod.Observable[_]],
    subscriptionDelay: rxjsLib.rxjsMod.Observable[_]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

