package typings.signalr.SignalR

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
    val __obj = js.Dynamic.literal(foreverFrame = foreverFrame.asInstanceOf[js.Any], longPolling = longPolling.asInstanceOf[js.Any], serverSentEvents = serverSentEvents.asInstanceOf[js.Any], webSockets = webSockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transports]
  }
}

