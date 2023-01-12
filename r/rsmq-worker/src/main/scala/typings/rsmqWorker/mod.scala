package typings.rsmqWorker

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rsmq-worker", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Client {
    def this(queuename: String) = this()
    def this(queuename: String, options: Options) = this()
  }
  @JSImport("rsmq-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RSMQWorkerStatic = js.native
  
  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[js.Error], /* res */ js.UndefOr[R], Unit]
  
  @js.native
  trait Client extends EventEmitter {
    
    def changeInterval(interval: js.Array[Double]): Client = js.native
    def changeInterval(interval: Double): Client = js.native
    
    def del(id: String): Client = js.native
    def del(id: String, cb: CallbackT[Unit]): Client = js.native
    
    def send(message: String): Client = js.native
    def send(message: String, cb: CallbackT[String]): Client = js.native
    def send(message: String, delay: Double): Client = js.native
    def send(message: String, delay: Double, cb: CallbackT[String]): Client = js.native
    def send(message: String, delay: Unit, cb: CallbackT[String]): Client = js.native
    
    def start(): Client = js.native
    
    def stop(): Client = js.native
  }
  
  type CustomExceedCheckCallback = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ Any, 
    Boolean
  ]
  
  trait Options extends StObject {
    
    var autostart: js.UndefOr[Boolean] = js.undefined
    
    var customExceedCheck: js.UndefOr[CustomExceedCheckCallback] = js.undefined
    
    var defaultDelay: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var invisibletime: js.UndefOr[Double] = js.undefined
    
    var maxReceiveCount: js.UndefOr[Double] = js.undefined
    
    var options: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.ClientOpts */ Any
      ] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var redis: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any
      ] = js.undefined
    
    var redisPrefix: js.UndefOr[String] = js.undefined
    
    var rsmq: js.UndefOr[Client] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      inline def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      inline def setCustomExceedCheck(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ Any => Boolean
      ): Self = StObject.set(x, "customExceedCheck", js.Any.fromFunction1(value))
      
      inline def setCustomExceedCheckUndefined: Self = StObject.set(x, "customExceedCheck", js.undefined)
      
      inline def setDefaultDelay(value: Double): Self = StObject.set(x, "defaultDelay", value.asInstanceOf[js.Any])
      
      inline def setDefaultDelayUndefined: Self = StObject.set(x, "defaultDelay", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setInvisibletime(value: Double): Self = StObject.set(x, "invisibletime", value.asInstanceOf[js.Any])
      
      inline def setInvisibletimeUndefined: Self = StObject.set(x, "invisibletime", js.undefined)
      
      inline def setMaxReceiveCount(value: Double): Self = StObject.set(x, "maxReceiveCount", value.asInstanceOf[js.Any])
      
      inline def setMaxReceiveCountUndefined: Self = StObject.set(x, "maxReceiveCount", js.undefined)
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.ClientOpts */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRedis(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify redis.RedisClient */ Any
      ): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      inline def setRedisPrefix(value: String): Self = StObject.set(x, "redisPrefix", value.asInstanceOf[js.Any])
      
      inline def setRedisPrefixUndefined: Self = StObject.set(x, "redisPrefix", js.undefined)
      
      inline def setRedisUndefined: Self = StObject.set(x, "redis", js.undefined)
      
      inline def setRsmq(value: Client): Self = StObject.set(x, "rsmq", value.asInstanceOf[js.Any])
      
      inline def setRsmqUndefined: Self = StObject.set(x, "rsmq", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait RSMQWorkerStatic
    extends StObject
       with Instantiable1[/* queuename */ String, Client]
       with Instantiable2[/* queuename */ String, /* options */ Options, Client]
  
  type _To = js.Object & RSMQWorkerStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & RSMQWorkerStatic = ^
}
