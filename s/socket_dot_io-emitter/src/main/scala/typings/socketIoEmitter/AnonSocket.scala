package typings.socketIoEmitter

import typings.socketIoEmitter.mod.SocketIORedisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSocket extends SocketIORedisOptions {
  var socket: String
}

object AnonSocket {
  @scala.inline
  def apply(socket: String): AnonSocket = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSocket]
  }
}

