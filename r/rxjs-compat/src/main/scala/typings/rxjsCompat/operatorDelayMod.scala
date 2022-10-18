package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDelayMod {
  
  @JSImport("rxjs-compat/operator/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay[T](delay: js.Date): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def delay[T](delay: js.Date, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def delay[T](delay: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def delay[T](delay: Double, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(delay.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
