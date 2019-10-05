package typings.rxDashLite.Rx

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends IObserver[T] {
  def asObserver(): Observer[T]
  def toNotifier(): js.Function1[/* notification */ Notification[T], Unit]
}

@JSGlobal("Rx.Observer")
@js.native
object Observer extends TopLevel[ObserverStatic]

