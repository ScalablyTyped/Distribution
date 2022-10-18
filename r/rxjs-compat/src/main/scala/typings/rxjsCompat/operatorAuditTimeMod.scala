package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorAuditTimeMod {
  
  @JSImport("rxjs-compat/operator/auditTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def auditTime[T](duration: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def auditTime[T](duration: Double, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
