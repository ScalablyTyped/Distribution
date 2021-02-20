package typings.socketIoEmitter

import typings.socketIoEmitter.anon.Recordbroadcastjsonvolati
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io-emitter", JSImport.Namespace)
  @js.native
  def apply(redisOptions: String): SocketIOEmitter = js.native
  @JSImport("socket.io-emitter", JSImport.Namespace)
  @js.native
  def apply(redisOptions: String, options: SocketIOEmitterOptions): SocketIOEmitter = js.native
  @JSImport("socket.io-emitter", JSImport.Namespace)
  @js.native
  def apply(redisOptions: RedisClient): SocketIOEmitter = js.native
  @JSImport("socket.io-emitter", JSImport.Namespace)
  @js.native
  def apply(redisOptions: RedisClient, options: SocketIOEmitterOptions): SocketIOEmitter = js.native
  @JSImport("socket.io-emitter", JSImport.Namespace)
  @js.native
  def apply(redisOptions: SocketIORedisOptions): SocketIOEmitter = js.native
  @JSImport("socket.io-emitter", JSImport.Namespace)
  @js.native
  def apply(redisOptions: SocketIORedisOptions, options: SocketIOEmitterOptions): SocketIOEmitter = js.native
  
  @JSImport("socket.io-emitter", "SocketIOEmitter")
  @js.native
  class SocketIOEmitter () extends StObject {
    
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
  
  /**
    * The Redis client passed to `socket.io-emitter` only requires the `publish`
    * method, so accept any client that implements this.
    */
  @js.native
  trait RedisClient extends StObject {
    
    def publish(channel: String, message: String): js.Promise[_] = js.native
  }
  object RedisClient {
    
    @scala.inline
    def apply(publish: (String, String) => js.Promise[_]): RedisClient = {
      val __obj = js.Dynamic.literal(publish = js.Any.fromFunction2(publish))
      __obj.asInstanceOf[RedisClient]
    }
    
    @scala.inline
    implicit class RedisClientMutableBuilder[Self <: RedisClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublish(value: (String, String) => js.Promise[_]): Self = StObject.set(x, "publish", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SocketIOEmitterOptions extends StObject {
    
    var key: js.UndefOr[String] = js.native
  }
  object SocketIOEmitterOptions {
    
    @scala.inline
    def apply(): SocketIOEmitterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketIOEmitterOptions]
    }
    
    @scala.inline
    implicit class SocketIOEmitterOptionsMutableBuilder[Self <: SocketIOEmitterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.socketIoEmitter.anon.Host
    - typings.socketIoEmitter.anon.Socket
  */
  trait SocketIORedisOptions extends StObject
  object SocketIORedisOptions {
    
    @scala.inline
    def Host(host: String, port: Double): typings.socketIoEmitter.anon.Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.socketIoEmitter.anon.Host]
    }
    
    @scala.inline
    def Socket(socket: String): typings.socketIoEmitter.anon.Socket = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.socketIoEmitter.anon.Socket]
    }
  }
}
