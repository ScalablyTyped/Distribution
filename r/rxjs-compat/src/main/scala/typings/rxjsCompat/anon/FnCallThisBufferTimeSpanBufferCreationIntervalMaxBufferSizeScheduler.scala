package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisBufferTimeSpanBufferCreationIntervalMaxBufferSizeScheduler extends StObject {
  
  def apply[T](bufferTimeSpan: Double): Observable_[js.Array[T]] = js.native
  def apply[T](bufferTimeSpan: Double, bufferCreationInterval: Double): Observable_[js.Array[T]] = js.native
  def apply[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): Observable_[js.Array[T]] = js.native
  def apply[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): Observable_[js.Array[T]] = js.native
  def apply[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): Observable_[js.Array[T]] = js.native
  def apply[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): Observable_[js.Array[T]] = js.native
  def apply[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Null,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): Observable_[js.Array[T]] = js.native
  def apply[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): Observable_[js.Array[T]] = js.native
  def apply[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, maxBufferSize: Double): Observable_[js.Array[T]] = js.native
  def apply[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Unit,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): Observable_[js.Array[T]] = js.native
  def apply[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, scheduler: SchedulerLike): Observable_[js.Array[T]] = js.native
  def apply[T](bufferTimeSpan: Double, scheduler: SchedulerLike): Observable_[js.Array[T]] = js.native
}
