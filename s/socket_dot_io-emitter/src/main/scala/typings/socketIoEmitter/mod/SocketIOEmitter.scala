package typings.socketIoEmitter.mod

import typings.socketIoEmitter.anon.Recordbroadcastjsonvolati
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socket.io-emitter", "SocketIOEmitter")
@js.native
class SocketIOEmitter () extends js.Object {
  
  var _flags: Recordbroadcastjsonvolati = js.native
  
  var _rooms: js.Array[String] = js.native
  
  // TypeScript Version: 3.6
  def broadcast: this.type = js.native
  
  var channel: String = js.native
  
  def emit(data: js.Any*): this.type = js.native
  
  def in(room: String): this.type = js.native
  
  // TypeScript Version: 3.6
  def json: this.type = js.native
  
  var nsp: String = js.native
  
  def of(nsp: String): SocketIOEmitter = js.native
  
  var prefix: String = js.native
  
  var redis: RedisClient = js.native
  
  def to(room: String): this.type = js.native
  
  // TypeScript Version: 3.6
  def volatile: this.type = js.native
}
