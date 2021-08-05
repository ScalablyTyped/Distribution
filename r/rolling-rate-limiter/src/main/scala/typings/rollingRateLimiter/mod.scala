package typings.rollingRateLimiter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: InMemoryOptions): SyncOrAsyncLimiter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SyncOrAsyncLimiter]
  inline def apply(options: WithRedisOptions): AsyncLimiter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[AsyncLimiter]
  
  @JSImport("rolling-rate-limiter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AsyncLimiter = AsyncLimiterWithToken
  
  type AsyncLimiterCallback = js.Function3[/* err */ js.Any, /* timeLeft */ Double, /* actionsLeft */ Double, Unit]
  
  type AsyncLimiterWithToken = js.Function2[/* token */ String, /* callback */ AsyncLimiterCallback, Unit]
  
  type AsyncLimiterWithoutToken = js.Function1[/* callback */ AsyncLimiterCallback, Unit]
  
  trait CompatibleRedisClient extends StObject {
    
    def multi(): js.Any
  }
  object CompatibleRedisClient {
    
    inline def apply(multi: () => js.Any): CompatibleRedisClient = {
      val __obj = js.Dynamic.literal(multi = js.Any.fromFunction0(multi))
      __obj.asInstanceOf[CompatibleRedisClient]
    }
    
    extension [Self <: CompatibleRedisClient](x: Self) {
      
      inline def setMulti(value: () => js.Any): Self = StObject.set(x, "multi", js.Any.fromFunction0(value))
    }
  }
  
  trait GeneralOptions extends StObject {
    
    var interval: Double
    
    var maxInInterval: Double
    
    var minDifference: js.UndefOr[Double] = js.undefined
  }
  object GeneralOptions {
    
    inline def apply(interval: Double, maxInInterval: Double): GeneralOptions = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneralOptions]
    }
    
    extension [Self <: GeneralOptions](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setMaxInInterval(value: Double): Self = StObject.set(x, "maxInInterval", value.asInstanceOf[js.Any])
      
      inline def setMinDifference(value: Double): Self = StObject.set(x, "minDifference", value.asInstanceOf[js.Any])
      
      inline def setMinDifferenceUndefined: Self = StObject.set(x, "minDifference", js.undefined)
    }
  }
  
  type InMemoryOptions = GeneralOptions
  
  type SyncLimiter = js.Function1[/* token */ js.UndefOr[String], Double]
  
  @js.native
  trait SyncOrAsyncLimiter
    extends SyncLimiter
       with AsyncLimiterWithToken {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* token */ js.UndefOr[String]): Double = js.native
    /* InferMemberOverrides */
    override def apply(arg1: /* token */ String, arg2: /* callback */ AsyncLimiterCallback): Unit = js.native
  }
  
  trait WithRedisOptions
    extends StObject
       with GeneralOptions {
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var redis: CompatibleRedisClient
  }
  object WithRedisOptions {
    
    inline def apply(interval: Double, maxInInterval: Double, redis: CompatibleRedisClient): WithRedisOptions = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithRedisOptions]
    }
    
    extension [Self <: WithRedisOptions](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setRedis(value: CompatibleRedisClient): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
    }
  }
}
