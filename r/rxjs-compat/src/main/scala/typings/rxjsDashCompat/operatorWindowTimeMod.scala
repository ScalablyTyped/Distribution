package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/windowTime", JSImport.Namespace)
@js.native
object operatorWindowTimeMod extends js.Object {
  def windowTime[T](`this`: Observable[T], windowTimeSpan: Double): Observable[Observable[T]] = js.native
  def windowTime[T](`this`: Observable[T], windowTimeSpan: Double, scheduler: SchedulerLike): Observable[Observable[T]] = js.native
  def windowTime[T](`this`: Observable[T], windowTimeSpan: Double, windowCreationInterval: Double): Observable[Observable[T]] = js.native
  def windowTime[T](
    `this`: Observable[T],
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double
  ): Observable[Observable[T]] = js.native
  def windowTime[T](
    `this`: Observable[T],
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): Observable[Observable[T]] = js.native
  def windowTime[T](
    `this`: Observable[T],
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    scheduler: SchedulerLike
  ): Observable[Observable[T]] = js.native
}

