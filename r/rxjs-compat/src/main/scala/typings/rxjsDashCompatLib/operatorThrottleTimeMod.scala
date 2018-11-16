package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/throttleTime", JSImport.Namespace)
@js.native
object operatorThrottleTimeMod extends js.Object {
  def throttleTime[T](`this`: rxjsLib.rxjsMod.Observable[T], duration: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  def throttleTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    duration: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  def throttleTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    duration: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike,
    config: js.Any
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

