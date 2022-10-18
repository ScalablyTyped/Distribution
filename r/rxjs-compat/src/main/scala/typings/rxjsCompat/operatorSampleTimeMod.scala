package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSampleTimeMod {
  
  @JSImport("rxjs-compat/operator/sampleTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sampleTime[T](period: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sampleTime")(period.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def sampleTime[T](period: Double, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleTime")(period.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
