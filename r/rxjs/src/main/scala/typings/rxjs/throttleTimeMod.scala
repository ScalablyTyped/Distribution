package typings.rxjs

import typings.rxjs.throttleMod.ThrottleConfig
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/throttleTime", JSImport.Namespace)
@js.native
object throttleTimeMod extends js.Object {
  def throttleTime[T](duration: Double): MonoTypeOperatorFunction[T] = js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def throttleTime[T](duration: Double, scheduler: SchedulerLike, config: ThrottleConfig): MonoTypeOperatorFunction[T] = js.native
}

