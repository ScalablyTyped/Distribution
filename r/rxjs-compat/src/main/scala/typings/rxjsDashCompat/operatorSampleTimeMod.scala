package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/sampleTime", JSImport.Namespace)
@js.native
object operatorSampleTimeMod extends js.Object {
  def sampleTime[T](`this`: Observable[T], period: Double): Observable[T] = js.native
  def sampleTime[T](`this`: Observable[T], period: Double, scheduler: SchedulerLike): Observable[T] = js.native
}

