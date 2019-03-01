package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transports extends js.Object {
  var foreverFrame: Transport
  var longPolling: Transport
  var serverSentEvents: Transport
  var webSockets: Transport
}

object Transports {
  @scala.inline
  def apply(
    foreverFrame: Transport,
    longPolling: Transport,
    serverSentEvents: Transport,
    webSockets: Transport
  ): Transports = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("foreverFrame")(foreverFrame)
    __obj.updateDynamic("longPolling")(longPolling)
    __obj.updateDynamic("serverSentEvents")(serverSentEvents)
    __obj.updateDynamic("webSockets")(webSockets)
    __obj.asInstanceOf[Transports]
  }
}

