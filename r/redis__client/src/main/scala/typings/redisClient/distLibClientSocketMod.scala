package typings.redisClient

import typings.node.eventsMod.EventEmitter
import typings.node.netMod.SocketConnectOpts
import typings.node.tlsMod.ConnectionOptions
import typings.redisClient.anon.Tls
import typings.redisClient.distLibCommandsMod.RedisCommandArguments
import typings.redisClient.redisClientBooleans.`false`
import typings.redisClient.redisClientBooleans.`true`
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientSocketMod {
  
  @JSImport("@redis/client/dist/lib/client/socket", JSImport.Default)
  @js.native
  open class default protected () extends RedisSocket {
    def this(initiator: RedisSocketInitiator) = this()
    def this(initiator: RedisSocketInitiator, options: RedisSocketOptions) = this()
  }
  
  type RedisNetSocketOptions = Partial[SocketConnectOpts] & Tls
  
  @js.native
  trait RedisSocket extends EventEmitter {
    
    def connect(): js.Promise[Unit] = js.native
    
    def cork(): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def isOpen: Boolean = js.native
    
    def isReady: Boolean = js.native
    
    /* private */ var `private`: Any = js.native
    
    def quit[T](fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    def ref(): Unit = js.native
    
    def unref(): Unit = js.native
    
    def writableNeedDrain: Boolean = js.native
    
    def writeCommand(args: RedisCommandArguments): Unit = js.native
  }
  
  trait RedisSocketCommonOptions extends StObject {
    
    /**
      * Connection Timeout (in milliseconds)
      */
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Toggle [`keep-alive`](https://nodejs.org/api/net.html#net_socket_setkeepalive_enable_initialdelay)
      */
    var keepAlive: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * Toggle [`Nagle's algorithm`](https://nodejs.org/api/net.html#net_socket_setnodelay_nodelay)
      */
    var noDelay: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the socket closes unexpectedly (without calling `.quit()`/`.disconnect()`), the client uses `reconnectStrategy` to decide what to do. The following values are supported:
      * 1. `false` -> do not reconnect, close the client and flush the command queue.
      * 2. `number` -> wait for `X` milliseconds before reconnecting.
      * 3. `(retries: number, cause: Error) => false | number | Error` -> `number` is the same as configuring a `number` directly, `Error` is the same as `false`, but with a custom error.
      * Defaults to `retries => Math.min(retries * 50, 500)`
      */
    var reconnectStrategy: js.UndefOr[
        `false` | Double | (js.Function2[/* retries */ Double, /* cause */ js.Error, `false` | js.Error | Double])
      ] = js.undefined
  }
  object RedisSocketCommonOptions {
    
    inline def apply(): RedisSocketCommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisSocketCommonOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisSocketCommonOptions] (val x: Self) extends AnyVal {
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setKeepAlive(value: Double | `false`): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      inline def setReconnectStrategy(
        value: `false` | Double | (js.Function2[/* retries */ Double, /* cause */ js.Error, `false` | js.Error | Double])
      ): Self = StObject.set(x, "reconnectStrategy", value.asInstanceOf[js.Any])
      
      inline def setReconnectStrategyFunction2(value: (/* retries */ Double, /* cause */ js.Error) => `false` | js.Error | Double): Self = StObject.set(x, "reconnectStrategy", js.Any.fromFunction2(value))
      
      inline def setReconnectStrategyUndefined: Self = StObject.set(x, "reconnectStrategy", js.undefined)
    }
  }
  
  type RedisSocketInitiator = js.Function0[js.Promise[Unit]]
  
  type RedisSocketOptions = (RedisNetSocketOptions & RedisSocketCommonOptions) | (RedisTlsSocketOptions & RedisSocketCommonOptions)
  
  trait RedisTlsSocketOptions
    extends StObject
       with ConnectionOptions {
    
    var tls: `true`
  }
  object RedisTlsSocketOptions {
    
    inline def apply(): RedisTlsSocketOptions = {
      val __obj = js.Dynamic.literal(tls = true)
      __obj.asInstanceOf[RedisTlsSocketOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisTlsSocketOptions] (val x: Self) extends AnyVal {
      
      inline def setTls(value: `true`): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    }
  }
}
