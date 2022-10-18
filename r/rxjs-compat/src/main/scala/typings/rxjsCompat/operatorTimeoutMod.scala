package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTimeoutMod {
  
  @JSImport("rxjs-compat/operator/timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeout[T](due: js.Date): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def timeout[T](due: js.Date, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def timeout[T](due: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def timeout[T](due: Double, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
