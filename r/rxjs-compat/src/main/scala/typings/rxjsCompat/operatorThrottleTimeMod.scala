package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorThrottleTimeMod {
  
  @JSImport("rxjs-compat/operator/throttleTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def throttleTime[T](duration: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def throttleTime[T](
    duration: Double,
    scheduler: Unit,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def throttleTime[T](duration: Double, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def throttleTime[T](
    duration: Double,
    scheduler: SchedulerLike,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ Any
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttleTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
