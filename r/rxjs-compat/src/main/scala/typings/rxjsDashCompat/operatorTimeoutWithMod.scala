package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/timeoutWith", JSImport.Namespace)
@js.native
object operatorTimeoutWithMod extends js.Object {
  def timeoutWith[T](`this`: Observable[T], due: Double, withObservable: ObservableInput[T]): Observable[T] = js.native
  def timeoutWith[T](`this`: Observable[T], due: Double, withObservable: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = js.native
  def timeoutWith[T](`this`: Observable[T], due: Date, withObservable: ObservableInput[T]): Observable[T] = js.native
  def timeoutWith[T](`this`: Observable[T], due: Date, withObservable: ObservableInput[T], scheduler: SchedulerLike): Observable[T] = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](`this`: Observable[T], due: Double, withObservable: ObservableInput[R]): Observable[T | R] = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](`this`: Observable[T], due: Double, withObservable: ObservableInput[R], scheduler: SchedulerLike): Observable[T | R] = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](`this`: Observable[T], due: Date, withObservable: ObservableInput[R]): Observable[T | R] = js.native
  @JSName("timeoutWith")
  def timeoutWith_TR[T, R](`this`: Observable[T], due: Date, withObservable: ObservableInput[R], scheduler: SchedulerLike): Observable[T | R] = js.native
}

