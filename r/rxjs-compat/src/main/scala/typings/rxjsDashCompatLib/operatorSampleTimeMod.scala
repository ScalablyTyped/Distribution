package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/sampleTime", JSImport.Namespace)
@js.native
object operatorSampleTimeMod extends js.Object {
  def sampleTime[T](`this`: rxjsLib.rxjsMod.Observable[T], period: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  def sampleTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    period: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

