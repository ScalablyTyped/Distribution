package typings.rollingRateLimiter

import typings.node.timersMod.global.NodeJS.Timeout
import typings.rollingRateLimiter.rollingRateLimiterStrings.microseconds
import typings.rollingRateLimiter.rollingRateLimiterStrings.milliseconds
import typings.rollingRateLimiter.rollingRateLimiterStrings.seconds
import typings.std.Number
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rolling-rate-limiter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rolling-rate-limiter", "InMemoryRateLimiter")
  @js.native
  open class InMemoryRateLimiter protected () extends RateLimiter {
    def this(options: RateLimiterOptions) = this()
    
    var storage: Record[Id, js.UndefOr[js.Array[Double]]] = js.native
    
    var ttls: Record[Id, js.UndefOr[Timeout]] = js.native
  }
  
  @JSImport("rolling-rate-limiter", "RateLimiter")
  @js.native
  open class RateLimiter protected () extends StObject {
    def this(hasIntervalMaxInIntervalMinDifference: RateLimiterOptions) = this()
    
    /**
      * Given a list of timestamps, computes the RateLimitingInfo. The last item in the list is the
      * timestamp of the current action.
      */
    /* private */ var calculateInfo: Any = js.native
    
    /**
      * Clears rate limiting state for the provided ID.
      */
    def clear(_id: Id): js.Promise[Unit] = js.native
    
    /**
      * Returns the list of timestamps of actions attempted within `interval` for the provided ID. If
      * `addNewTimestamp` flag is set, adds a new action with the current microsecond timestamp.
      */
    /* protected */ def getTimestamps(_id: Id, _addNewTimestamp: Boolean): js.Promise[js.Array[Microseconds]] = js.native
    
    var interval: Microseconds = js.native
    
    /**
      * Attempts an action for the provided ID. Returns whether it was blocked.
      */
    def limit(id: Id): js.Promise[Boolean] = js.native
    
    /**
      * Attempts an action for the provided ID. Return information about whether the action was
      * allowed and why, and whether upcoming actions will be allowed.
      */
    def limitWithInfo(id: Id): js.Promise[RateLimitInfo] = js.native
    
    var maxInInterval: Double = js.native
    
    var minDifference: Microseconds = js.native
    
    /**
      * Returns whether an action for the provided ID would be blocked, if it were attempted.
      */
    def wouldLimit(id: Id): js.Promise[Boolean] = js.native
    
    /**
      * Returns information about what would happen if an action were attempted for the provided ID.
      */
    def wouldLimitWithInfo(id: Id): js.Promise[RateLimitInfo] = js.native
  }
  
  @JSImport("rolling-rate-limiter", "RedisRateLimiter")
  @js.native
  open class RedisRateLimiter protected () extends RateLimiter {
    def this(hasClientNamespaceBaseOptions: RedisRateLimiterOptions) = this()
    
    var client: RedisClient = js.native
    
    /* private */ var extractTimestampsFromZRangeResult: Any = js.native
    
    /* private */ var getZRangeResult: Any = js.native
    
    def makeKey(id: Id): String = js.native
    
    var namespace: String = js.native
    
    var ttl: Double = js.native
  }
  
  inline def getCurrentMicroseconds(): Microseconds = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentMicroseconds")().asInstanceOf[Microseconds]
  
  inline def microsecondsToMilliseconds(microseconds: Microseconds): Milliseconds = ^.asInstanceOf[js.Dynamic].applyDynamic("microsecondsToMilliseconds")(microseconds.asInstanceOf[js.Any]).asInstanceOf[Milliseconds]
  
  inline def microsecondsToSeconds(microseconds: Microseconds): Seconds = ^.asInstanceOf[js.Dynamic].applyDynamic("microsecondsToSeconds")(microseconds.asInstanceOf[js.Any]).asInstanceOf[Seconds]
  
  inline def millisecondsToMicroseconds(milliseconds: Milliseconds): Microseconds = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToMicroseconds")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Microseconds]
  
  type Id = Double | String
  
  @js.native
  trait Microseconds
    extends StObject
       with Number {
    
    var __brand: microseconds = js.native
  }
  
  @js.native
  trait Milliseconds
    extends StObject
       with Number {
    
    var __brand: milliseconds = js.native
  }
  
  trait RateLimitInfo extends StObject {
    
    var actionsRemaining: Double
    
    var blocked: Boolean
    
    var blockedDueToCount: Boolean
    
    var blockedDueToMinDifference: Boolean
    
    var millisecondsUntilAllowed: Milliseconds
  }
  object RateLimitInfo {
    
    inline def apply(
      actionsRemaining: Double,
      blocked: Boolean,
      blockedDueToCount: Boolean,
      blockedDueToMinDifference: Boolean,
      millisecondsUntilAllowed: Milliseconds
    ): RateLimitInfo = {
      val __obj = js.Dynamic.literal(actionsRemaining = actionsRemaining.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any], blockedDueToCount = blockedDueToCount.asInstanceOf[js.Any], blockedDueToMinDifference = blockedDueToMinDifference.asInstanceOf[js.Any], millisecondsUntilAllowed = millisecondsUntilAllowed.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimitInfo]
    }
    
    extension [Self <: RateLimitInfo](x: Self) {
      
      inline def setActionsRemaining(value: Double): Self = StObject.set(x, "actionsRemaining", value.asInstanceOf[js.Any])
      
      inline def setBlocked(value: Boolean): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
      
      inline def setBlockedDueToCount(value: Boolean): Self = StObject.set(x, "blockedDueToCount", value.asInstanceOf[js.Any])
      
      inline def setBlockedDueToMinDifference(value: Boolean): Self = StObject.set(x, "blockedDueToMinDifference", value.asInstanceOf[js.Any])
      
      inline def setMillisecondsUntilAllowed(value: Milliseconds): Self = StObject.set(x, "millisecondsUntilAllowed", value.asInstanceOf[js.Any])
    }
  }
  
  trait RateLimiterOptions extends StObject {
    
    var interval: Double
    
    var maxInInterval: Double
    
    var minDifference: js.UndefOr[Double] = js.undefined
  }
  object RateLimiterOptions {
    
    inline def apply(interval: Double, maxInInterval: Double): RateLimiterOptions = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any])
      __obj.asInstanceOf[RateLimiterOptions]
    }
    
    extension [Self <: RateLimiterOptions](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setMaxInInterval(value: Double): Self = StObject.set(x, "maxInInterval", value.asInstanceOf[js.Any])
      
      inline def setMinDifference(value: Double): Self = StObject.set(x, "minDifference", value.asInstanceOf[js.Any])
      
      inline def setMinDifferenceUndefined: Self = StObject.set(x, "minDifference", js.undefined)
    }
  }
  
  /** Minimal interface of a Redis batch command needed for algorithm. */
  @js.native
  trait RedisBatch extends StObject {
    
    def exec(cb: js.Function2[/* err */ js.Error | Null, /* result */ js.Array[Any], Unit]): Unit = js.native
    
    def expire(key: String, time: Double): Unit = js.native
    
    def zadd(key: String, score: String, value: String): Unit = js.native
    def zadd(key: String, score: Double, value: String): Unit = js.native
    
    def zrange(key: String, min: Double, max: Double, withScores: Any): Unit = js.native
    
    def zremrangebyscore(key: String, min: Double, max: Double): Unit = js.native
  }
  
  /**
    * Minimal interface of a Redis client needed for algorithm.
    * Ideally, this would be `RedisClient | IORedisClient`, but that would force consumers of this
    * library to have `@types/redis` and `@types/ioredis` to be installed.
    */
  trait RedisClient extends StObject {
    
    def del(args: String*): Any
    
    def multi(): RedisBatch
  }
  object RedisClient {
    
    inline def apply(del: /* repeated */ String => Any, multi: () => RedisBatch): RedisClient = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), multi = js.Any.fromFunction0(multi))
      __obj.asInstanceOf[RedisClient]
    }
    
    extension [Self <: RedisClient](x: Self) {
      
      inline def setDel(value: /* repeated */ String => Any): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setMulti(value: () => RedisBatch): Self = StObject.set(x, "multi", js.Any.fromFunction0(value))
    }
  }
  
  trait RedisRateLimiterOptions
    extends StObject
       with RateLimiterOptions {
    
    var client: RedisClient
    
    var namespace: String
  }
  object RedisRateLimiterOptions {
    
    inline def apply(client: RedisClient, interval: Double, maxInInterval: Double, namespace: String): RedisRateLimiterOptions = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedisRateLimiterOptions]
    }
    
    extension [Self <: RedisRateLimiterOptions](x: Self) {
      
      inline def setClient(value: RedisClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Seconds
    extends StObject
       with Number {
    
    var __brand: seconds = js.native
  }
}
