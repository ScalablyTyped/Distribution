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
    
    def quit(fn: js.Function0[js.Promise[Any]]): js.Promise[Unit] = js.native
    
    def reconnectStrategy(retries: Double): Double | js.Error = js.native
    
    def ref(): Unit = js.native
    
    def unref(): Unit = js.native
    
    def writableNeedDrain: Boolean = js.native
    
    def writeCommand(args: RedisCommandArguments): Unit = js.native
  }
  
  trait RedisSocketCommonOptions extends StObject {
    
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    var keepAlive: js.UndefOr[Double | `false`] = js.undefined
    
    var noDelay: js.UndefOr[Boolean] = js.undefined
    
    var reconnectStrategy: js.UndefOr[js.Function1[/* retries */ Double, Double | js.Error]] = js.undefined
  }
  object RedisSocketCommonOptions {
    
    inline def apply(): RedisSocketCommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedisSocketCommonOptions]
    }
    
    extension [Self <: RedisSocketCommonOptions](x: Self) {
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setKeepAlive(value: Double | `false`): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
      
      inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
      
      inline def setReconnectStrategy(value: /* retries */ Double => Double | js.Error): Self = StObject.set(x, "reconnectStrategy", js.Any.fromFunction1(value))
      
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
    
    extension [Self <: RedisTlsSocketOptions](x: Self) {
      
      inline def setTls(value: `true`): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    }
  }
}
