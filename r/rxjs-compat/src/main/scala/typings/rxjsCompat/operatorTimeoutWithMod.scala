package typings.rxjsCompat

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs-compat/operator/timeoutWith", JSImport.Namespace)
@js.native
object operatorTimeoutWithMod extends js.Object {
  def timeoutWith[T](
    due: Double,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
  ): js.Any = js.native
  def timeoutWith[T](
    due: Double,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def timeoutWith[T](
    due: Date,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any
  ): js.Any = js.native
  def timeoutWith[T](
    due: Date,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](
    due: Double,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
  ): js.Any = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](
    due: Double,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](
    due: Date,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any
  ): js.Any = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](
    due: Date,
    withObservable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObservableInput<R> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

