package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends IObserver[T] {
  def asObserver(): Observer[T]
  def toNotifier(): js.Function1[/* notification */ Notification[T], scala.Unit]
}

object Observer {
  @scala.inline
  def apply[T](
    asObserver: () => Observer[T],
    onCompleted: () => scala.Unit,
    onError: js.Any => scala.Unit,
    onNext: T => scala.Unit,
    toNotifier: () => js.Function1[/* notification */ Notification[T], scala.Unit]
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(asObserver = js.Any.fromFunction0(asObserver), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), toNotifier = js.Any.fromFunction0(toNotifier))
  
    __obj.asInstanceOf[Observer[T]]
  }
}

