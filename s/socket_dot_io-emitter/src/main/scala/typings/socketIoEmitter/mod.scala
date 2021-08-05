package typings.socketIoEmitter

import typings.socketIoEmitter.anon.Recordbroadcastjsonvolati
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(redisOptions: String): SocketIOEmitter = ^.asInstanceOf[js.Dynamic].apply(redisOptions.asInstanceOf[js.Any]).asInstanceOf[SocketIOEmitter]
  inline def apply(redisOptions: String, options: SocketIOEmitterOptions): SocketIOEmitter = (^.asInstanceOf[js.Dynamic].apply(redisOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SocketIOEmitter]
  inline def apply(redisOptions: RedisClient): SocketIOEmitter = ^.asInstanceOf[js.Dynamic].apply(redisOptions.asInstanceOf[js.Any]).asInstanceOf[SocketIOEmitter]
  inline def apply(redisOptions: RedisClient, options: SocketIOEmitterOptions): SocketIOEmitter = (^.asInstanceOf[js.Dynamic].apply(redisOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SocketIOEmitter]
  inline def apply(redisOptions: SocketIORedisOptions): SocketIOEmitter = ^.asInstanceOf[js.Dynamic].apply(redisOptions.asInstanceOf[js.Any]).asInstanceOf[SocketIOEmitter]
  inline def apply(redisOptions: SocketIORedisOptions, options: SocketIOEmitterOptions): SocketIOEmitter = (^.asInstanceOf[js.Dynamic].apply(redisOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SocketIOEmitter]
  
  @JSImport("socket.io-emitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socket.io-emitter", "SocketIOEmitter")
  @js.native
  class SocketIOEmitter () extends StObject {
    
    /* private */ var _flags: Recordbroadcastjsonvolati = js.native
    
    /* private */ var _rooms: js.Array[String] = js.native
    
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
  trait RedisClient extends StObject {
    
    def publish(channel: String, message: String): js.Promise[js.Any]
  }
  object RedisClient {
    
    inline def apply(publish: (String, String) => js.Promise[js.Any]): RedisClient = {
      val __obj = js.Dynamic.literal(publish = js.Any.fromFunction2(publish))
      __obj.asInstanceOf[RedisClient]
    }
    
    extension [Self <: RedisClient](x: Self) {
      
      inline def setPublish(value: (String, String) => js.Promise[js.Any]): Self = StObject.set(x, "publish", js.Any.fromFunction2(value))
    }
  }
  
  trait SocketIOEmitterOptions extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
  }
  object SocketIOEmitterOptions {
    
    inline def apply(): SocketIOEmitterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketIOEmitterOptions]
    }
    
    extension [Self <: SocketIOEmitterOptions](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.socketIoEmitter.anon.Host
    - typings.socketIoEmitter.anon.Socket
  */
  trait SocketIORedisOptions extends StObject
  object SocketIORedisOptions {
    
    inline def Host(host: String, port: Double): typings.socketIoEmitter.anon.Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.socketIoEmitter.anon.Host]
    }
    
    inline def Socket(socket: String): typings.socketIoEmitter.anon.Socket = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.socketIoEmitter.anon.Socket]
    }
  }
}
