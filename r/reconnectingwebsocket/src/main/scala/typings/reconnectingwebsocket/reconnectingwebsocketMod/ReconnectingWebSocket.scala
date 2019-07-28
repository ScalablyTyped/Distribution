package typings.reconnectingwebsocket.reconnectingwebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReconnectingWebSocket extends js.Object {
  var maxReconnectAttempts: Double = js.native
  var protocol: String | Null = js.native
  var readyState: Double = js.native
  var reconnectAttempts: Double = js.native
  var url: String = js.native
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: String): Unit = js.native
  def onclose(event: js.Any): Unit = js.native
  def onconnecting(event: js.Any): Unit = js.native
  def onerror(event: js.Any): Unit = js.native
  def onmessage(event: js.Any): Unit = js.native
  def onopen(event: js.Any): Unit = js.native
  def open(): Unit = js.native
  def open(reconnectAttempt: Boolean): Unit = js.native
  def refresh(): Unit = js.native
  def send(data: js.Any): Unit = js.native
}

