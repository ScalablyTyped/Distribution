package typings.reactNative

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Blob
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebSocket extends EventTarget {
  var onclose: (js.Function1[/* event */ WebSocketCloseEvent, Unit]) | Null = js.native
  var onerror: (js.Function1[/* event */ WebSocketErrorEvent, Unit]) | Null = js.native
  var onmessage: (js.Function1[/* event */ WebSocketMessageEvent, Unit]) | Null = js.native
  var onopen: js.Function0[Unit] | Null = js.native
  val readyState: Double = js.native
  def close(): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: String): Unit = js.native
  def send(data: String): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def send(data: ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}

