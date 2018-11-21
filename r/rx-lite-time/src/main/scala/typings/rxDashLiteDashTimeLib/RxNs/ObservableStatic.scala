package typings
package rxDashLiteDashTimeLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObservableStatic extends js.Object {
  def generateWithAbsoluteTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, scala.Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, stdLib.Date]
  ): Observable[TResult] = js.native
  def generateWithAbsoluteTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, scala.Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, stdLib.Date],
    scheduler: rxDashCoreLib.RxNs.IScheduler
  ): Observable[TResult] = js.native
  def generateWithRelativeTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, scala.Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, scala.Double]
  ): Observable[TResult] = js.native
  def generateWithRelativeTime[TState, TResult](
    initialState: TState,
    condition: js.Function1[/* state */ TState, scala.Boolean],
    iterate: js.Function1[/* state */ TState, TState],
    resultSelector: js.Function1[/* state */ TState, TResult],
    timeSelector: js.Function1[/* state */ TState, scala.Double],
    scheduler: rxDashCoreLib.RxNs.IScheduler
  ): Observable[TResult] = js.native
  def timer(dueTime: stdLib.Date): Observable[scala.Double] = js.native
  def timer(dueTime: stdLib.Date, period: scala.Double): Observable[scala.Double] = js.native
  def timer(dueTime: stdLib.Date, period: scala.Double, scheduler: rxDashCoreLib.RxNs.IScheduler): Observable[scala.Double] = js.native
  def timer(dueTime: stdLib.Date, scheduler: rxDashCoreLib.RxNs.IScheduler): Observable[scala.Double] = js.native
}

