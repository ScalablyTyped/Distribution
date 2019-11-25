package typings.socketDotIoDashEmitter

import typings.socketDotIoDashEmitter.socketDotIoDashEmitterMod.SocketIORedisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Socket extends SocketIORedisOptions {
  var socket: String
}

object Anon_Socket {
  @scala.inline
  def apply(socket: String): Anon_Socket = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Socket]
  }
}

