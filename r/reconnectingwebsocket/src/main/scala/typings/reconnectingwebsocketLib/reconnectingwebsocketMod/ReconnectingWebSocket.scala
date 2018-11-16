package typings
package reconnectingwebsocketLib.reconnectingwebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReconnectingWebSocket extends js.Object {
  var maxReconnectAttempts: scala.Double = js.native
  var protocol: java.lang.String | scala.Null = js.native
  var readyState: scala.Double = js.native
  var reconnectAttempts: scala.Double = js.native
  var url: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def close(code: scala.Double): scala.Unit = js.native
  def close(code: scala.Double, reason: java.lang.String): scala.Unit = js.native
  def onclose(event: js.Any): scala.Unit = js.native
  def onconnecting(event: js.Any): scala.Unit = js.native
  def onerror(event: js.Any): scala.Unit = js.native
  def onmessage(event: js.Any): scala.Unit = js.native
  def onopen(event: js.Any): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def open(reconnectAttempt: scala.Boolean): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
}

