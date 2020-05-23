package typings.reachRouter.mod

import typings.history.mod.LocationState
import typings.reachRouter.anon.PushState
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistorySource extends js.Object {
  var history: PushState
  val location: WindowLocation[LocationState]
  def addEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
}

object HistorySource {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit,
    history: PushState,
    location: WindowLocation[LocationState],
    removeEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[HistorySource]
  }
}

