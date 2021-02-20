package typings.redisRateLimiter

import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.redis.mod.RedisClient
import typings.redisRateLimiter.redisRateLimiterStrings.ip
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-rate-limiter", JSImport.Namespace)
  @js.native
  class ^ () extends RedisRateLimiter
  
  /* static member */
  @JSImport("redis-rate-limiter", "create")
  @js.native
  def create(options: Options): js.Function2[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* callback */ js.Function2[/* err */ Error, /* res */ Response, Unit], 
    Unit
  ] = js.native
  
  /* static member */
  @JSImport("redis-rate-limiter", "middleware")
  @js.native
  def middleware(options: Options): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var deleteImmediatelyIfRaceCondition: js.UndefOr[Boolean] = js.native
    
    var key: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]) = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var onPossibleRaceCondition: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
    
    var rate: js.UndefOr[String] = js.native
    
    var redis: RedisClient = js.native
    
    var window: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      key: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]),
      redis: RedisClient
    ): Options = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], redis = redis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteImmediatelyIfRaceCondition(value: Boolean): Self = StObject.set(x, "deleteImmediatelyIfRaceCondition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteImmediatelyIfRaceConditionUndefined: Self = StObject.set(x, "deleteImmediatelyIfRaceCondition", js.undefined)
      
      @scala.inline
      def setKey(value: ip | (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFunction1(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOnPossibleRaceCondition(value: /* key */ String => Unit): Self = StObject.set(x, "onPossibleRaceCondition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPossibleRaceConditionUndefined: Self = StObject.set(x, "onPossibleRaceCondition", js.undefined)
      
      @scala.inline
      def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      @scala.inline
      def setRedis(value: RedisClient): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  @js.native
  trait RedisRateLimiter extends StObject
  
  @js.native
  trait Response extends StObject {
    
    var current: Double = js.native
    
    var key: String = js.native
    
    var limit: Double = js.native
    
    var over: Boolean = js.native
    
    var window: Double = js.native
  }
  object Response {
    
    @scala.inline
    def apply(current: Double, key: String, limit: Double, over: Boolean, window: Double): Response = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOver(value: Boolean): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
}
