package typings.atReachRouter.atReachRouterMod

import typings.atReachRouter.Anon_PushState
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistorySource extends js.Object {
  var history: Anon_PushState
  val location: WindowLocation
  def addEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit
}

object HistorySource {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit,
    history: Anon_PushState,
    location: WindowLocation,
    removeEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[HistorySource]
  }
}

