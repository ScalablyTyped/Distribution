package typings.rxjs

import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/bufferTime", JSImport.Namespace)
@js.native
object internalOperatorsBufferTimeMod extends js.Object {
  def bufferTime[T](bufferTimeSpan: Double): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: js.UndefOr[scala.Nothing], maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: js.UndefOr[scala.Nothing],
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Null,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
}

