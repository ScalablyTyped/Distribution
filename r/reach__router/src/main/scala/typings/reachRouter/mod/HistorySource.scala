package typings.reachRouter.mod

import typings.reachRouter.AnonPushState
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistorySource extends js.Object {
  var history: AnonPushState
  val location: WindowLocation
  def addEventListener(name: String, listener: js.Function1[/* event */ Event_, Unit]): Unit
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event_, Unit]): Unit
}

object HistorySource {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ Event_, Unit]) => Unit,
    history: AnonPushState,
    location: WindowLocation,
    removeEventListener: (String, js.Function1[/* event */ Event_, Unit]) => Unit
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[HistorySource]
  }
}

