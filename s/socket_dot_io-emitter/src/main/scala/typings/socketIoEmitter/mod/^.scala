package typings.socketIoEmitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socket.io-emitter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(redisOptions: String): SocketIOEmitter = js.native
  def apply(redisOptions: String, options: SocketIOEmitterOptions): SocketIOEmitter = js.native
  def apply(redisOptions: RedisClient): SocketIOEmitter = js.native
  def apply(redisOptions: RedisClient, options: SocketIOEmitterOptions): SocketIOEmitter = js.native
  def apply(redisOptions: SocketIORedisOptions): SocketIOEmitter = js.native
  def apply(redisOptions: SocketIORedisOptions, options: SocketIOEmitterOptions): SocketIOEmitter = js.native
}
