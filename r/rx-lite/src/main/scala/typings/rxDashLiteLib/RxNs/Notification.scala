package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSGlobal("Rx.Notification")
@js.native
class Notification[T] () extends js.Object {
  var exception: js.Any = js.native
  var hasValue: scala.Boolean = js.native
  var kind: java.lang.String = js.native
  var value: T = js.native
  def accept(observer: IObserver[T]): scala.Unit = js.native
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
  def equals(other: Notification[T]): scala.Boolean = js.native
  def toObservable(): Observable[T] = js.native
  def toObservable(scheduler: IScheduler): Observable[T] = js.native
}

// Notifications
@JSGlobal("Rx.Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): rxDashLiteLib.RxNs.Notification[T] = js.native
  def createOnError[T](exception: js.Any): rxDashLiteLib.RxNs.Notification[T] = js.native
  def createOnNext[T](value: T): rxDashLiteLib.RxNs.Notification[T] = js.native
}

