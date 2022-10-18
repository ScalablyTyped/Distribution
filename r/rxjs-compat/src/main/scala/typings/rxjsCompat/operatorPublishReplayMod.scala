package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.ConnectableObservable
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorPublishReplayMod {
  
  @JSImport("rxjs-compat/operator/publishReplay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publishReplay[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Double): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): ConnectableObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ConnectableObservable[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Double, selector: Unit, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Double, selector: MonoTypeOperatorFunction[T]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](
    bufferSize: Double,
    windowTime: Double,
    selector: MonoTypeOperatorFunction[T],
    scheduler: SchedulerLike
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): ConnectableObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ConnectableObservable[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Unit, selector: MonoTypeOperatorFunction[T]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](
    bufferSize: Double,
    windowTime: Unit,
    selector: MonoTypeOperatorFunction[T],
    scheduler: SchedulerLike
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Double): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): ConnectableObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ConnectableObservable[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Double, selector: Unit, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Double, selector: MonoTypeOperatorFunction[T]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](
    bufferSize: Unit,
    windowTime: Double,
    selector: MonoTypeOperatorFunction[T],
    scheduler: SchedulerLike
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): ConnectableObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[ConnectableObservable[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Unit, selector: Unit, scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Unit, selector: MonoTypeOperatorFunction[T]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def publishReplay[T](
    bufferSize: Unit,
    windowTime: Unit,
    selector: MonoTypeOperatorFunction[T],
    scheduler: SchedulerLike
  ): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  
  inline def publishReplay_TR[T, R](): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[Observable_[R]]
  inline def publishReplay_TR[T, R](bufferSize: Double): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
  inline def publishReplay_TR[T, R](bufferSize: Double, windowTime: Double): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def publishReplay_TR[T, R](bufferSize: Double, windowTime: Double, selector: OperatorFunction[T, R]): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def publishReplay_TR[T, R](bufferSize: Double, windowTime: Unit, selector: OperatorFunction[T, R]): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def publishReplay_TR[T, R](bufferSize: Unit, windowTime: Double): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def publishReplay_TR[T, R](bufferSize: Unit, windowTime: Double, selector: OperatorFunction[T, R]): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  inline def publishReplay_TR[T, R](bufferSize: Unit, windowTime: Unit, selector: OperatorFunction[T, R]): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
  
  inline def publishReplay_T_ConnectableObservable[T](): ConnectableObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[ConnectableObservable[T]]
  inline def publishReplay_T_ConnectableObservable[T](bufferSize: Double): ConnectableObservable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[ConnectableObservable[T]]
  inline def publishReplay_T_ConnectableObservable[T](bufferSize: Double, windowTime: Double): ConnectableObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[ConnectableObservable[T]]
  inline def publishReplay_T_ConnectableObservable[T](bufferSize: Unit, windowTime: Double): ConnectableObservable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[ConnectableObservable[T]]
}
