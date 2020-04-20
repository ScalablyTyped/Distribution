package typings.protooServer.mod

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
  def apply(close: () => Unit, closed: Boolean, send: js.Any => js.Promise[Unit]): WebSocketTransport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = closed.asInstanceOf[js.Any], send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[WebSocketTransport]
  }
}

