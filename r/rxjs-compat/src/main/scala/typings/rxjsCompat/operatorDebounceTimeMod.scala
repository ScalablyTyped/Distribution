package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDebounceTimeMod {
  
  @JSImport("rxjs-compat/operator/debounceTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounceTime[T](dueTime: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceTime")(dueTime.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def debounceTime[T](dueTime: Double, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceTime")(dueTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
