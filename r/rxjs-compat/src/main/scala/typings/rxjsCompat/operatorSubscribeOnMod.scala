package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSubscribeOnMod {
  
  @JSImport("rxjs-compat/operator/subscribeOn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribeOn[T](scheduler: SchedulerLike): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def subscribeOn[T](scheduler: SchedulerLike, delay: Double): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
