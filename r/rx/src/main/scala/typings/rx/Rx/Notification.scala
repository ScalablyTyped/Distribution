package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification[T] extends js.Object {
  var error: js.Any = js.native
  var hasValue: Boolean = js.native
  var kind: String = js.native
  var value: T = js.native
  /**
    * Invokes the delegate corresponding to the notification or the observer's method corresponding to the notification and returns the produced result.
    *
    * @memberOf Notification
    * @param {Any} observerOrOnNext Delegate to invoke for an OnNext notification or Observer to invoke the notification on..
    * @param {Function} onError Delegate to invoke for an OnError notification.
    * @param {Function} onCompleted Delegate to invoke for an OnCompleted notification.
    * @returns {Any} Result produced by the observation.
    */
  def accept(observer: IObserver[T]): Unit = js.native
  /**
    * Invokes the delegate corresponding to the notification or the observer's method corresponding to the notification and returns the produced result.
    *
    * @memberOf Notification
    * @param {Any} observerOrOnNext Delegate to invoke for an OnNext notification or Observer to invoke the notification on..
    * @param {Function} onError Delegate to invoke for an OnError notification.
    * @param {Function} onCompleted Delegate to invoke for an OnCompleted notification.
    * @returns {Any} Result produced by the observation.
    */
  def accept[TResult](
    onNext: js.Function1[/* value */ T, TResult],
    onError: js.Function1[/* exception */ js.Any, TResult],
    onCompleted: js.Function0[TResult]
  ): TResult = js.native
  def equals(other: Notification[T]): Boolean = js.native
  /**
    * Returns an observable sequence with a single notification.
    *
    * @memberOf Notifications
    * @param {Scheduler} [scheduler] Scheduler to send out the notification calls on.
    * @returns {Observable} The observable sequence that surfaces the behavior of the notification upon subscription.
    */
  def toObservable(): Observable[T] = js.native
  def toObservable(scheduler: IScheduler): Observable[T] = js.native
}

