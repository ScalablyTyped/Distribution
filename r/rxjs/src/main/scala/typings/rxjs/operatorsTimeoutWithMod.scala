package typings.rxjs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsTimeoutWithMod {
  
  @JSImport("rxjs/operators/timeoutWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeoutWith[T](
    due: Double,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def timeoutWith[T](
    due: Double,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def timeoutWith[T](
    due: Date,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def timeoutWith[T](
    due: Date,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def timeoutWith_TR[T, R](
    due: Double,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def timeoutWith_TR[T, R](
    due: Double,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def timeoutWith_TR[T, R](
    due: Date,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def timeoutWith_TR[T, R](
    due: Date,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeoutWith")(due.asInstanceOf[js.Any], withObservable.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
