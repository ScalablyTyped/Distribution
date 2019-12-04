package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/sampleTime", JSImport.Namespace)
@js.native
object internalOperatorsSampleTimeMod extends js.Object {
  def sampleTime[T](period: Double): MonoTypeOperatorFunction[T] = js.native
  def sampleTime[T](period: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
}

