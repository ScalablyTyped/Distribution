package typings.rxjs

import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/bufferTime", JSImport.Namespace)
@js.native
object bufferTimeMod extends js.Object {
  def bufferTime[T](bufferTimeSpan: Double): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: js.UndefOr[Double | Null], maxBufferSize: Double): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: js.UndefOr[Double | Null],
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
  def bufferTime[T](bufferTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, js.Array[T]] = js.native
}

