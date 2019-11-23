package typings.protooDashServer.protooDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketTransport extends js.Object {
  var closed: Boolean
  def close(): Unit
  def send(message: js.Any): js.Promise[Unit]
}

object WebSocketTransport {
  @scala.inline
  def apply(close: () => Unit, closed: Boolean, send: js.Any => js.Promise[Unit], toString: () => String): WebSocketTransport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = closed, send = js.Any.fromFunction1(send), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[WebSocketTransport]
  }
}

