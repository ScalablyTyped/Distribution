package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsWindowTimeMod {
  
  @JSImport("rxjs-compat/operators/windowTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowTime[T](windowTimeSpan: Double): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, scheduler: SchedulerLike): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Null, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Null,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Unit, maxWindowSize: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Unit,
    maxWindowSize: Double,
    scheduler: SchedulerLike
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
}
