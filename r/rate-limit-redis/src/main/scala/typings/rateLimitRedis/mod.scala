package typings.rateLimitRedis

import typings.expressRateLimit.mod.Store
import typings.expressRateLimit.mod.StoreIncrementCallback
import typings.ioredis.mod.Redis
import typings.redis.mod.RedisClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rate-limit-redis", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with RedisStore {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def decrement(key: String): Unit = js.native
    
    /* CompleteClass */
    override def incr(key: String, cb: StoreIncrementCallback): Unit = js.native
    
    /* CompleteClass */
    override def resetAll(): Unit = js.native
    
    /* CompleteClass */
    override def resetKey(key: String): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var client: js.UndefOr[RedisClient | Redis] = js.undefined
    
    var expiry: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var redisURL: js.UndefOr[String] = js.undefined
    
    var resetExpiryOnChange: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClient(value: RedisClient | Redis): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRedisURL(value: String): Self = StObject.set(x, "redisURL", value.asInstanceOf[js.Any])
      
      inline def setRedisURLUndefined: Self = StObject.set(x, "redisURL", js.undefined)
      
      inline def setResetExpiryOnChange(value: Boolean): Self = StObject.set(x, "resetExpiryOnChange", value.asInstanceOf[js.Any])
      
      inline def setResetExpiryOnChangeUndefined: Self = StObject.set(x, "resetExpiryOnChange", js.undefined)
    }
  }
  
  trait RedisStore
    extends StObject
       with Store
  object RedisStore {
    
    inline def apply(
      decrement: String => Unit,
      incr: (String, StoreIncrementCallback) => Unit,
      resetAll: () => Unit,
      resetKey: String => Unit
    ): RedisStore = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), incr = js.Any.fromFunction2(incr), resetAll = js.Any.fromFunction0(resetAll), resetKey = js.Any.fromFunction1(resetKey))
      __obj.asInstanceOf[RedisStore]
    }
  }
}
