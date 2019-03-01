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
    asObserver: js.Function0[Observer[T]],
    onCompleted: js.Function0[scala.Unit],
    onError: js.Function1[js.Any, scala.Unit],
    onNext: js.Function1[T, scala.Unit],
    toNotifier: js.Function0[js.Function1[/* notification */ Notification[T], scala.Unit]]
  ): Observer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asObserver")(asObserver)
    __obj.updateDynamic("onCompleted")(onCompleted)
    __obj.updateDynamic("onError")(onError)
    __obj.updateDynamic("onNext")(onNext)
    __obj.updateDynamic("toNotifier")(toNotifier)
    __obj.asInstanceOf[Observer[T]]
  }
}

