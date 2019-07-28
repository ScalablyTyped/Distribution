package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/bufferTime", JSImport.Namespace)
@js.native
object operatorBufferTimeMod extends js.Object {
  def bufferTime[T](`this`: Observable[T], bufferTimeSpan: Double): Observable[js.Array[T]] = js.native
  def bufferTime[T](
    `this`: Observable[T],
    bufferTimeSpan: Double,
    bufferCreationInterval: js.UndefOr[scala.Nothing],
    maxBufferSize: Double
  ): Observable[js.Array[T]] = js.native
  def bufferTime[T](
    `this`: Observable[T],
    bufferTimeSpan: Double,
    bufferCreationInterval: js.UndefOr[scala.Nothing],
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): Observable[js.Array[T]] = js.native
  def bufferTime[T](
    `this`: Observable[T],
    bufferTimeSpan: Double,
    bufferCreationInterval: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): Observable[js.Array[T]] = js.native
  def bufferTime[T](`this`: Observable[T], bufferTimeSpan: Double, bufferCreationInterval: Double): Observable[js.Array[T]] = js.native
  def bufferTime[T](
    `this`: Observable[T],
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    maxBufferSize: Double
  ): Observable[js.Array[T]] = js.native
  def bufferTime[T](
    `this`: Observable[T],
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): Observable[js.Array[T]] = js.native
  def bufferTime[T](
    `this`: Observable[T],
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    scheduler: SchedulerLike
  ): Observable[js.Array[T]] = js.native
  def bufferTime[T](`this`: Observable[T], bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): Observable[js.Array[T]] = js.native
  def bufferTime[T](
    `this`: Observable[T],
    bufferTimeSpan: Double,
    bufferCreationInterval: Null,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): Observable[js.Array[T]] = js.native
  def bufferTime[T](
    `this`: Observable[T],
    bufferTimeSpan: Double,
    bufferCreationInterval: Null,
    scheduler: SchedulerLike
  ): Observable[js.Array[T]] = js.native
  def bufferTime[T](`this`: Observable[T], bufferTimeSpan: Double, scheduler: SchedulerLike): Observable[js.Array[T]] = js.native
}

