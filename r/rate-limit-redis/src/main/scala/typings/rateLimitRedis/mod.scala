package typings.rateLimitRedis

import typings.expressRateLimit.mod.Store
import typings.expressRateLimit.mod.StoreIncrementCallback
import typings.ioredis.mod.Redis
import typings.redis.mod.RedisClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rate-limit-redis", JSImport.Namespace)
  @js.native
  class ^ () extends RedisStore {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var client: js.UndefOr[RedisClient | Redis] = js.native
    
    var expiry: js.UndefOr[Double] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var redisURL: js.UndefOr[String] = js.native
    
    var resetExpiryOnChange: js.UndefOr[Boolean] = js.native
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
      def setClient(value: RedisClient | Redis): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRedisURL(value: String): Self = StObject.set(x, "redisURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedisURLUndefined: Self = StObject.set(x, "redisURL", js.undefined)
      
      @scala.inline
      def setResetExpiryOnChange(value: Boolean): Self = StObject.set(x, "resetExpiryOnChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetExpiryOnChangeUndefined: Self = StObject.set(x, "resetExpiryOnChange", js.undefined)
    }
  }
  
  @js.native
  trait RedisStore extends Store
  object RedisStore {
    
    @scala.inline
    def apply(
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
