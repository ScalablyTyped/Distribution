package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/subscribeOn", JSImport.Namespace)
@js.native
object operatorSubscribeOnMod extends js.Object {
  def subscribeOn[T](`this`: rxjsLib.rxjsMod.Observable[T], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.rxjsMod.Observable[T] = js.native
  def subscribeOn[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike,
    delay: scala.Double
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

