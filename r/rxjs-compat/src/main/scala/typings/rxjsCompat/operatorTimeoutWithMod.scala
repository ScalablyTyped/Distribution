package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTimeoutWithMod {
  
  @JSImport("rxjs-compat/operator/timeoutWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeoutWith[T](due: js.Date, withObservable: ObservableInput[T]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def timeoutWith[T](due: js.Date, withObservable: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def timeoutWith[T](due: Double, withObservable: ObservableInput[T]): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  inline def timeoutWith[T](due: Double, withObservable: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
  
  inline def timeoutWith_TR[T, R](due: js.Date, withObservable: ObservableInput[R]): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
  inline def timeoutWith_TR[T, R](due: js.Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
  inline def timeoutWith_TR[T, R](due: Double, withObservable: ObservableInput[R]): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
  inline def timeoutWith_TR[T, R](due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): Observable_[T | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable_[T | R]]
}
