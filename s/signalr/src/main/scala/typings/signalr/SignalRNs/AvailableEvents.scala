package typings.signalr.SignalRNs

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
    val __obj = js.Dynamic.literal(onConnectionSlow = onConnectionSlow, onDisconnect = onDisconnect, onError = onError, onReceived = onReceived, onReconnect = onReconnect, onStart = onStart, onStarting = onStarting, onStateChanged = onStateChanged)
  
    __obj.asInstanceOf[AvailableEvents]
  }
}

