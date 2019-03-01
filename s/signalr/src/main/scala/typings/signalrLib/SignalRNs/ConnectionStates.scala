package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStates extends js.Object {
  var connected: scala.Double
  var connecting: scala.Double
  var disconnected: scala.Double
  var reconnecting: scala.Double
}

object ConnectionStates {
  @scala.inline
  def apply(
    connected: scala.Double,
    connecting: scala.Double,
    disconnected: scala.Double,
    reconnecting: scala.Double
  ): ConnectionStates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connected")(connected)
    __obj.updateDynamic("connecting")(connecting)
    __obj.updateDynamic("disconnected")(disconnected)
    __obj.updateDynamic("reconnecting")(reconnecting)
    __obj.asInstanceOf[ConnectionStates]
  }
}

