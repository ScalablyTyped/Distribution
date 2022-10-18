package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorShareReplayMod {
  
  @JSImport("rxjs-compat/operator/shareReplay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shareReplay[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")().asInstanceOf[Observable_[T]]
  inline def shareReplay[T](bufferSize: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def shareReplay[T](bufferSize: Double, windowTime: Double): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def shareReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def shareReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def shareReplay[T](bufferSize: Unit, windowTime: Double): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def shareReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def shareReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def shareReplay[T](
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShareReplayConfig */ Any
  ): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(config.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
