package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends IObserver[T] {
  def asObserver(): Observer[T]
  def toNotifier(): js.Function1[/* notification */ Notification[T], scala.Unit]
}

