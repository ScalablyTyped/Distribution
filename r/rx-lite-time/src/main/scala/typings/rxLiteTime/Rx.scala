package typings.rxLiteTime

import typings.rxCore.Rx.IScheduler
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx")
@js.native
object Rx extends js.Object {
  @js.native
  trait Observable[T] extends js.Object {
    def bufferWithTime(timeSpan: Double): Observable[js.Array[T]] = js.native
    def bufferWithTime(timeSpan: Double, scheduler: IScheduler): Observable[js.Array[T]] = js.native
    def bufferWithTime(timeSpan: Double, timeShift: Double): Observable[js.Array[T]] = js.native
    def bufferWithTime(timeSpan: Double, timeShift: Double, scheduler: IScheduler): Observable[js.Array[T]] = js.native
    def bufferWithTimeOrCount(timeSpan: Double, count: Double): Observable[js.Array[T]] = js.native
    def bufferWithTimeOrCount(timeSpan: Double, count: Double, scheduler: IScheduler): Observable[js.Array[T]] = js.native
    def debounceWithSelector[TTimeout](debounceDurationSelector: js.Function1[/* item */ T, Observable[TTimeout]]): Observable[T] = js.native
    def delaySubscription(dueTime: Double): Observable[T] = js.native
    def delaySubscription(dueTime: Double, scheduler: IScheduler): Observable[T] = js.native
    def delayWithSelector(delayDurationSelector: js.Function1[/* item */ T, Double]): Observable[T] = js.native
    def delayWithSelector(subscriptionDelay: Double, delayDurationSelector: js.Function1[/* item */ T, Double]): Observable[T] = js.native
    def skipLastWithTime(duration: Double): Observable[T] = js.native
    def skipLastWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
    def skipUntilWithTime(duration: Double): Observable[T] = js.native
    def skipUntilWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
    def skipUntilWithTime(startTime: Date): Observable[T] = js.native
    def skipUntilWithTime(startTime: Date, scheduler: IScheduler): Observable[T] = js.native
    def skipWithTime(duration: Double): Observable[T] = js.native
    def skipWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
    def takeLastBufferWithTime(duration: Double): Observable[js.Array[T]] = js.native
    def takeLastBufferWithTime(duration: Double, scheduler: IScheduler): Observable[js.Array[T]] = js.native
    def takeLastWithTime(duration: Double): Observable[T] = js.native
    def takeLastWithTime(duration: Double, timerScheduler: IScheduler): Observable[T] = js.native
    def takeLastWithTime(duration: Double, timerScheduler: IScheduler, loopScheduler: IScheduler): Observable[T] = js.native
    def takeUntilWithTime(duration: Double): Observable[T] = js.native
    def takeUntilWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
    def takeUntilWithTime(endTime: Date): Observable[T] = js.native
    def takeUntilWithTime(endTime: Date, scheduler: IScheduler): Observable[T] = js.native
    def takeWithTime(duration: Double): Observable[T] = js.native
    def takeWithTime(duration: Double, scheduler: IScheduler): Observable[T] = js.native
    /**
      * @deprecated use #debounceWithSelector instead.
      */
    def throttleWithSelector[TTimeout](debounceDurationSelector: js.Function1[/* item */ T, Observable[TTimeout]]): Observable[T] = js.native
    def timeoutWithSelector[TTimeout](firstTimeout: Observable[TTimeout]): Observable[T] = js.native
    def timeoutWithSelector[TTimeout](
      firstTimeout: Observable[TTimeout],
      timeoutdurationSelector: js.Function1[/* item */ T, Observable[TTimeout]]
    ): Observable[T] = js.native
    def timeoutWithSelector[TTimeout](
      firstTimeout: Observable[TTimeout],
      timeoutdurationSelector: js.Function1[/* item */ T, Observable[TTimeout]],
      other: Observable[T]
    ): Observable[T] = js.native
    def windowWithTime(timeSpan: Double): Observable[Observable[T]] = js.native
    def windowWithTime(timeSpan: Double, scheduler: IScheduler): Observable[Observable[T]] = js.native
    def windowWithTime(timeSpan: Double, timeShift: Double): Observable[Observable[T]] = js.native
    def windowWithTime(timeSpan: Double, timeShift: Double, scheduler: IScheduler): Observable[Observable[T]] = js.native
    def windowWithTimeOrCount(timeSpan: Double, count: Double): Observable[Observable[T]] = js.native
    def windowWithTimeOrCount(timeSpan: Double, count: Double, scheduler: IScheduler): Observable[Observable[T]] = js.native
  }
  
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
  
}

