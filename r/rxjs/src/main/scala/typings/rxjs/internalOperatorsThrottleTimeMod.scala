package typings.rxjs

import typings.rxjs.internalOperatorsThrottleMod.ThrottleConfig
import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/throttleTime", JSImport.Namespace)
@js.native
object internalOperatorsThrottleTimeMod extends js.Object {
  def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
}

