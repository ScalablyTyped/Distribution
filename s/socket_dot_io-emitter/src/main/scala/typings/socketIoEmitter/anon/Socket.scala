package typings.socketIoEmitter.anon

import typings.socketIoEmitter.mod.SocketIORedisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socket extends SocketIORedisOptions {
  var socket: String
}

object Socket {
  @scala.inline
  def apply(socket: String): Socket = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Socket]
  }
}

