package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStates extends js.Object {
  var connected: Double
  var connecting: Double
  var disconnected: Double
  var reconnecting: Double
}

object ConnectionStates {
  @scala.inline
  def apply(connected: Double, connecting: Double, disconnected: Double, reconnecting: Double): ConnectionStates = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], reconnecting = reconnecting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStates]
  }
}

