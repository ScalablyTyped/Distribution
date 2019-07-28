package typings.rxDashLiteDashTime.RxNs

import typings.rxDashCore.RxNs.IScheduler
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableStatic extends js.Object {
  def generateWithAbsoluteTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, Date]
  ): Observable[TResult] = js.native
  def generateWithAbsoluteTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, Date],
    scheduler: IScheduler
  ): Observable[TResult] = js.native
  def generateWithRelativeTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, Double]
  ): Observable[TResult] = js.native
  def generateWithRelativeTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, Double],
    scheduler: IScheduler
  ): Observable[TResult] = js.native
  def timer(dueTime: Date): Observable[Double] = js.native
  def timer(dueTime: Date, period: Double): Observable[Double] = js.native
  def timer(dueTime: Date, period: Double, scheduler: IScheduler): Observable[Double] = js.native
  def timer(dueTime: Date, scheduler: IScheduler): Observable[Double] = js.native
}

