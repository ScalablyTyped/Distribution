package typings
package rxDashLiteDashTimeLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observable[T] extends js.Object {
  def bufferWithTime(timeSpan: scala.Double): Observable[js.Array[T]] = js.native
  def bufferWithTime(timeSpan: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[js.Array[T]] = js.native
  def bufferWithTime(timeSpan: scala.Double, timeShift: scala.Double): Observable[js.Array[T]] = js.native
  def bufferWithTime(timeSpan: scala.Double, timeShift: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[js.Array[T]] = js.native
  def bufferWithTimeOrCount(timeSpan: scala.Double, count: scala.Double): Observable[js.Array[T]] = js.native
  def bufferWithTimeOrCount(timeSpan: scala.Double, count: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[js.Array[T]] = js.native
  def debounceWithSelector[TTimeout](debounceDurationSelector: js.Function1[/* item */ T, Observable[TTimeout]]): Observable[T] = js.native
  def delaySubscription(dueTime: scala.Double): Observable[T] = js.native
  def delaySubscription(dueTime: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[T] = js.native
  def delayWithSelector(delayDurationSelector: js.Function1[/* item */ T, scala.Double]): Observable[T] = js.native
  def delayWithSelector(subscriptionDelay: scala.Double, delayDurationSelector: js.Function1[/* item */ T, scala.Double]): Observable[T] = js.native
  def skipLastWithTime(duration: scala.Double): Observable[T] = js.native
  def skipLastWithTime(duration: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[T] = js.native
  def skipUntilWithTime(duration: scala.Double): Observable[T] = js.native
  def skipUntilWithTime(duration: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[T] = js.native
  def skipUntilWithTime(startTime: stdLib.Date): Observable[T] = js.native
  def skipUntilWithTime(startTime: stdLib.Date, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[T] = js.native
  def skipWithTime(duration: scala.Double): Observable[T] = js.native
  def skipWithTime(duration: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[T] = js.native
  def takeLastBufferWithTime(duration: scala.Double): Observable[js.Array[T]] = js.native
  def takeLastBufferWithTime(duration: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[js.Array[T]] = js.native
  def takeLastWithTime(duration: scala.Double): Observable[T] = js.native
  def takeLastWithTime(duration: scala.Double, timerScheduler: rxDashLiteLib.RxNs.IScheduler): Observable[T] = js.native
  def takeLastWithTime(
    duration: scala.Double,
    timerScheduler: rxDashLiteLib.RxNs.IScheduler,
    loopScheduler: rxDashLiteLib.RxNs.IScheduler
  ): Observable[T] = js.native
  def takeUntilWithTime(duration: scala.Double): Observable[T] = js.native
  def takeUntilWithTime(duration: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[T] = js.native
  def takeUntilWithTime(endTime: stdLib.Date): Observable[T] = js.native
  def takeUntilWithTime(endTime: stdLib.Date, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[T] = js.native
  def takeWithTime(duration: scala.Double): Observable[T] = js.native
  def takeWithTime(duration: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[T] = js.native
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
  def windowWithTime(timeSpan: scala.Double): Observable[Observable[T]] = js.native
  def windowWithTime(timeSpan: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[Observable[T]] = js.native
  def windowWithTime(timeSpan: scala.Double, timeShift: scala.Double): Observable[Observable[T]] = js.native
  def windowWithTime(timeSpan: scala.Double, timeShift: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[Observable[T]] = js.native
  def windowWithTimeOrCount(timeSpan: scala.Double, count: scala.Double): Observable[Observable[T]] = js.native
  def windowWithTimeOrCount(timeSpan: scala.Double, count: scala.Double, scheduler: rxDashLiteLib.RxNs.IScheduler): Observable[Observable[T]] = js.native
}

