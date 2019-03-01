package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailableEvents extends js.Object {
  var onConnectionSlow: java.lang.String
  var onDisconnect: java.lang.String
  var onError: java.lang.String
  var onReceived: java.lang.String
  var onReconnect: java.lang.String
  var onStart: java.lang.String
  var onStarting: java.lang.String
  var onStateChanged: java.lang.String
}

object AvailableEvents {
  @scala.inline
  def apply(
    onConnectionSlow: java.lang.String,
    onDisconnect: java.lang.String,
    onError: java.lang.String,
    onReceived: java.lang.String,
    onReconnect: java.lang.String,
    onStart: java.lang.String,
    onStarting: java.lang.String,
    onStateChanged: java.lang.String
  ): AvailableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onConnectionSlow")(onConnectionSlow)
    __obj.updateDynamic("onDisconnect")(onDisconnect)
    __obj.updateDynamic("onError")(onError)
    __obj.updateDynamic("onReceived")(onReceived)
    __obj.updateDynamic("onReconnect")(onReconnect)
    __obj.updateDynamic("onStart")(onStart)
    __obj.updateDynamic("onStarting")(onStarting)
    __obj.updateDynamic("onStateChanged")(onStateChanged)
    __obj.asInstanceOf[AvailableEvents]
  }
}

