package typings.socketDotIoDashEmitter.socketDotIoDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.socketDotIoDashEmitter.Anon_Host
  - typings.socketDotIoDashEmitter.Anon_Socket
*/
trait SocketIORedisOptions extends js.Object

object SocketIORedisOptions {
  @scala.inline
  def Anon_Host(host: String, port: Double): SocketIORedisOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketIORedisOptions]
  }
  @scala.inline
  def Anon_Socket(socket: String): SocketIORedisOptions = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SocketIORedisOptions]
  }
}

