package typings.rsmqWorker

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.eventsMod.EventEmitter
import typings.redis.mod.ClientOpts
import typings.redis.mod.RedisClient
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rsmq-worker", JSImport.Namespace)
  @js.native
  class ^ protected () extends Client {
    def this(queuename: String) = this()
    def this(queuename: String, options: Options) = this()
  }
  @JSImport("rsmq-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RSMQWorkerStatic = js.native
  
  type CallbackT[R] = js.Function2[/* e */ js.UndefOr[Error], /* res */ js.UndefOr[R], Unit]
  
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ js.Any, 
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
    
    var options: js.UndefOr[ClientOpts] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var redis: js.UndefOr[RedisClient] = js.undefined
    
    var redisPrefix: js.UndefOr[String] = js.undefined
    
    var rsmq: js.UndefOr[Client] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      @scala.inline
      def setCustomExceedCheck(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisSMQ.Message */ /* message */ js.Any => Boolean
      ): Self = StObject.set(x, "customExceedCheck", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomExceedCheckUndefined: Self = StObject.set(x, "customExceedCheck", js.undefined)
      
      @scala.inline
      def setDefaultDelay(value: Double): Self = StObject.set(x, "defaultDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDelayUndefined: Self = StObject.set(x, "defaultDelay", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setInvisibletime(value: Double): Self = StObject.set(x, "invisibletime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvisibletimeUndefined: Self = StObject.set(x, "invisibletime", js.undefined)
      
      @scala.inline
      def setMaxReceiveCount(value: Double): Self = StObject.set(x, "maxReceiveCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReceiveCountUndefined: Self = StObject.set(x, "maxReceiveCount", js.undefined)
      
      @scala.inline
      def setOptions(value: ClientOpts): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setRedis(value: RedisClient): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedisPrefix(value: String): Self = StObject.set(x, "redisPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedisPrefixUndefined: Self = StObject.set(x, "redisPrefix", js.undefined)
      
      @scala.inline
      def setRedisUndefined: Self = StObject.set(x, "redis", js.undefined)
      
      @scala.inline
      def setRsmq(value: Client): Self = StObject.set(x, "rsmq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRsmqUndefined: Self = StObject.set(x, "rsmq", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
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
