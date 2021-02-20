package typings.rollingRateLimiter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rolling-rate-limiter", JSImport.Namespace)
  @js.native
  def apply(options: InMemoryOptions): SyncOrAsyncLimiter = js.native
  @JSImport("rolling-rate-limiter", JSImport.Namespace)
  @js.native
  def apply(options: WithRedisOptions): AsyncLimiter = js.native
  
  type AsyncLimiter = AsyncLimiterWithToken
  
  type AsyncLimiterCallback = js.Function3[/* err */ js.Any, /* timeLeft */ Double, /* actionsLeft */ Double, Unit]
  
  type AsyncLimiterWithToken = js.Function2[/* token */ String, /* callback */ AsyncLimiterCallback, Unit]
  
  type AsyncLimiterWithoutToken = js.Function1[/* callback */ AsyncLimiterCallback, Unit]
  
  @js.native
  trait CompatibleRedisClient extends StObject {
    
    def multi(): js.Any = js.native
  }
  object CompatibleRedisClient {
    
    @scala.inline
    def apply(multi: () => js.Any): CompatibleRedisClient = {
      val __obj = js.Dynamic.literal(multi = js.Any.fromFunction0(multi))
      __obj.asInstanceOf[CompatibleRedisClient]
    }
    
    @scala.inline
    implicit class CompatibleRedisClientMutableBuilder[Self <: CompatibleRedisClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMulti(value: () => js.Any): Self = StObject.set(x, "multi", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait GeneralOptions extends StObject {
    
    var interval: Double = js.native
    
    var maxInInterval: Double = js.native
    
    var minDifference: js.UndefOr[Double] = js.native
  }
  object GeneralOptions {
    
    @scala.inline
    def apply(interval: Double, maxInInterval: Double): GeneralOptions = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneralOptions]
    }
    
    @scala.inline
    implicit class GeneralOptionsMutableBuilder[Self <: GeneralOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInInterval(value: Double): Self = StObject.set(x, "maxInInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDifference(value: Double): Self = StObject.set(x, "minDifference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDifferenceUndefined: Self = StObject.set(x, "minDifference", js.undefined)
    }
  }
  
  type InMemoryOptions = GeneralOptions
  
  type SyncLimiter = js.Function1[/* token */ js.UndefOr[String], Double]
  
  type SyncOrAsyncLimiter = SyncLimiter with AsyncLimiter
  
  @js.native
  trait WithRedisOptions extends GeneralOptions {
    
    var namespace: js.UndefOr[String] = js.native
    
    var redis: CompatibleRedisClient = js.native
  }
  object WithRedisOptions {
    
    @scala.inline
    def apply(interval: Double, maxInInterval: Double, redis: CompatibleRedisClient): WithRedisOptions = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithRedisOptions]
    }
    
    @scala.inline
    implicit class WithRedisOptionsMutableBuilder[Self <: WithRedisOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setRedis(value: CompatibleRedisClient): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
    }
  }
}
