package typings.rxjs.internalOperatorsShareReplayMod

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
@js.native
object shareReplay extends js.Object {
  def apply[T](): MonoTypeOperatorFunction[T] = js.native
  def apply[T](bufferSize: Double): MonoTypeOperatorFunction[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def apply[T](config: ShareReplayConfig): MonoTypeOperatorFunction[T] = js.native
}

