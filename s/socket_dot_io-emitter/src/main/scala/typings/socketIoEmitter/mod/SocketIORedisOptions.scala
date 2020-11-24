package typings.socketIoEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.socketIoEmitter.anon.Host
  - typings.socketIoEmitter.anon.Socket
*/
trait SocketIORedisOptions extends js.Object
object SocketIORedisOptions {
  
  @scala.inline
  def Host(host: String, port: Double): SocketIORedisOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketIORedisOptions]
  }
  
  @scala.inline
  def Socket(socket: String): SocketIORedisOptions = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketIORedisOptions]
  }
}
