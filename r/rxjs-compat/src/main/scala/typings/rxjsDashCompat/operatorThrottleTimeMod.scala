package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/throttleTime", JSImport.Namespace)
@js.native
object operatorThrottleTimeMod extends js.Object {
  def throttleTime[T](`this`: Observable[T], duration: Double): Observable[T] = js.native
  def throttleTime[T](`this`: Observable[T], duration: Double, scheduler: SchedulerLike): Observable[T] = js.native
  def throttleTime[T](
    `this`: Observable[T],
    duration: Double,
    scheduler: SchedulerLike,
    config: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
  ): Observable[T] = js.native
}

