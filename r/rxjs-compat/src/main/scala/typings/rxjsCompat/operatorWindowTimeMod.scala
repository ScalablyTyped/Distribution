package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorWindowTimeMod {
  
  @JSImport("rxjs-compat/operator/windowTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowTime[T](windowTimeSpan: Double): Observable_[Observable_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any]).asInstanceOf[Observable_[Observable_[T]]]
  inline def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): Observable_[Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Observable_[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): Observable_[Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any])).asInstanceOf[Observable_[Observable_[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): Observable_[Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[Observable_[Observable_[T]]]
  inline def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): Observable_[Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Observable_[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): Observable_[Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[Observable_[T]]]
}
