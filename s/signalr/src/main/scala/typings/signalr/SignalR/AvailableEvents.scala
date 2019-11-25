package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailableEvents extends js.Object {
  var onConnectionSlow: String
  var onDisconnect: String
  var onError: String
  var onReceived: String
  var onReconnect: String
  var onStart: String
  var onStarting: String
  var onStateChanged: String
}

object AvailableEvents {
  @scala.inline
  def apply(
    onConnectionSlow: String,
    onDisconnect: String,
    onError: String,
    onReceived: String,
    onReconnect: String,
    onStart: String,
    onStarting: String,
    onStateChanged: String
  ): AvailableEvents = {
    val __obj = js.Dynamic.literal(onConnectionSlow = onConnectionSlow.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onReceived = onReceived.asInstanceOf[js.Any], onReconnect = onReconnect.asInstanceOf[js.Any], onStart = onStart.asInstanceOf[js.Any], onStarting = onStarting.asInstanceOf[js.Any], onStateChanged = onStateChanged.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AvailableEvents]
  }
}

