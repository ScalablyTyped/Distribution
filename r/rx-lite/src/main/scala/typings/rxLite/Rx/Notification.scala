package typings.rxLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSGlobal("Rx.Notification")
@js.native
class Notification[T] () extends js.Object {
  var exception: js.Any = js.native
  var hasValue: Boolean = js.native
  var kind: String = js.native
  var value: T = js.native
  def accept(observer: IObserver[T]): Unit = js.native
  def accept[TResult](onNext: js.Function1[/* value */ T, TResult]): TResult = js.native
  def accept[TResult](
    onNext: js.Function1[/* value */ T, TResult],
    onError: js.Function1[/* exception */ js.Any, TResult]
  ): TResult = js.native
  def accept[TResult](
    onNext: js.Function1[/* value */ T, TResult],
    onError: js.Function1[/* exception */ js.Any, TResult],
    onCompleted: js.Function0[TResult]
  ): TResult = js.native
  def equals(other: Notification[T]): Boolean = js.native
  def toObservable(): Observable[T] = js.native
  def toObservable(scheduler: IScheduler): Observable[T] = js.native
}

/* static members */
@JSGlobal("Rx.Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): Notification[T] = js.native
  def createOnError[T](exception: js.Any): Notification[T] = js.native
  def createOnNext[T](value: T): Notification[T] = js.native
}

