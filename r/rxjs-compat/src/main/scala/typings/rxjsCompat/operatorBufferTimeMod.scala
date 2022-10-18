package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorBufferTimeMod {
  
  @JSImport("rxjs-compat/operator/bufferTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bufferTime[T](bufferTimeSpan: Double): Observable_[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, maxBufferSize: Double): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double, scheduler: SchedulerLike): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, maxBufferSize: Double): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Null,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Null, scheduler: SchedulerLike): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, maxBufferSize: Double): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Unit,
    maxBufferSize: Double,
    scheduler: SchedulerLike
  ): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], maxBufferSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Unit, scheduler: SchedulerLike): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], bufferCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
  inline def bufferTime[T](bufferTimeSpan: Double, scheduler: SchedulerLike): Observable_[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferTime")(bufferTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[js.Array[T]]]
}
