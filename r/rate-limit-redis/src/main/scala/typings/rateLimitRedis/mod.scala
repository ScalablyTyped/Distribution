package typings.rateLimitRedis

import typings.expressRateLimit.mod.IncrementResponse
import typings.expressRateLimit.mod.Store
import typings.ioredis.mod.Redis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rate-limit-redis", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RedisStore {
    def this(options: Options) = this()
    
    /**
    	 * Method to decrement a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    /* CompleteClass */
    override def decrement(key: String): js.Promise[Unit] | Unit = js.native
    
    /* CompleteClass */
    override def incr(
      key: String,
      cb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoreIncrementCallback */ Any
    ): Unit = js.native
    
    /**
    	 * Method to increment a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 *
    	 * @returns {IncrementResponse} - The number of hits and reset time for that client.
    	 */
    /* CompleteClass */
    override def increment(key: String): js.Promise[IncrementResponse] | IncrementResponse = js.native
    
    // rate-limit-redis 1.7.0 doesn't actually implement resetAll() and
    // express-rate-limit 5.1.1 doesn't actually call it, but it's required by
    // the Store interface so it's included here.
    /* CompleteClass */
    @JSName("resetAll")
    override def resetAll_MRedisStore(): Unit = js.native
    
    /**
    	 * Method to reset a client's hit counter.
    	 *
    	 * @param key {string} - The identifier for a client.
    	 */
    /* CompleteClass */
    override def resetKey(key: String): js.Promise[Unit] | Unit = js.native
  }
  
  trait Options extends StObject {
    
    var client: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient */ Any) | Redis
      ] = js.undefined
    
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
      
      inline def setClient(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RedisClient */ Any) | Redis
      ): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
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
       with Store {
    
    def incr(
      key: String,
      cb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoreIncrementCallback */ Any
    ): Unit
    
    // rate-limit-redis 1.7.0 doesn't actually implement resetAll() and
    // express-rate-limit 5.1.1 doesn't actually call it, but it's required by
    // the Store interface so it's included here.
    @JSName("resetAll")
    def resetAll_MRedisStore(): Unit
  }
  object RedisStore {
    
    inline def apply(
      decrement: String => js.Promise[Unit] | Unit,
      incr: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoreIncrementCallback */ Any) => Unit,
      increment: String => js.Promise[IncrementResponse] | IncrementResponse,
      resetAll: () => Unit,
      resetKey: String => js.Promise[Unit] | Unit
    ): RedisStore = {
      val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), incr = js.Any.fromFunction2(incr), increment = js.Any.fromFunction1(increment), resetAll = js.Any.fromFunction0(resetAll), resetKey = js.Any.fromFunction1(resetKey))
      __obj.asInstanceOf[RedisStore]
    }
    
    extension [Self <: RedisStore](x: Self) {
      
      inline def setIncr(
        value: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoreIncrementCallback */ Any) => Unit
      ): Self = StObject.set(x, "incr", js.Any.fromFunction2(value))
      
      inline def setResetAll(value: () => Unit): Self = StObject.set(x, "resetAll", js.Any.fromFunction0(value))
    }
  }
}
