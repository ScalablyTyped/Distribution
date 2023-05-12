package typings.rollingRateLimiter

import typings.node.timersMod.global.NodeJS.Timeout
import typings.rollingRateLimiter.anon.Score
import typings.rollingRateLimiter.rollingRateLimiterStrings.WITHSCORES
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
  
  @JSImport("rolling-rate-limiter", "IORedisRateLimiter")
  @js.native
  open class IORedisRateLimiter protected () extends BaseRedisRateLimiter {
    def this(param0: RedisRateLimiterOptions[IORedisClient]) = this()
  }
  
  @JSImport("rolling-rate-limiter", "InMemoryRateLimiter")
  @js.native
  open class InMemoryRateLimiter protected () extends RateLimiter {
    def this(options: RateLimiterOptions) = this()
    
    var storage: Record[Id, js.UndefOr[js.Array[Double]]] = js.native
    
    var ttls: Record[Id, js.UndefOr[Timeout]] = js.native
  }
  
  @JSImport("rolling-rate-limiter", "NodeRedisRateLimiter")
  @js.native
  open class NodeRedisRateLimiter protected () extends BaseRedisRateLimiter {
    def this(param0: RedisRateLimiterOptions[NodeRedisClient]) = this()
  }
  
  @JSImport("rolling-rate-limiter", "RateLimiter")
  @js.native
  open class RateLimiter protected () extends StObject {
    def this(param0: RateLimiterOptions) = this()
    
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
  open class RedisRateLimiter protected () extends BaseRedisRateLimiter {
    def this(param0: RedisRateLimiterOptions[Any]) = this()
    
    val detectedClientType: RedisClientType = js.native
  }
  /* static members */
  object RedisRateLimiter {
    
    @JSImport("rolling-rate-limiter", "RedisRateLimiter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given an unknown object, determine what type of redis client it is.
      * Used by the constructor of this class.
      */
    inline def determineRedisClientType(client: Any): RedisClientType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("determineRedisClientType")(client.asInstanceOf[js.Any]).asInstanceOf[RedisClientType | Null]
  }
  
  inline def getCurrentMicroseconds(): Microseconds = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentMicroseconds")().asInstanceOf[Microseconds]
  
  inline def microsecondsToMilliseconds(microseconds: Microseconds): Milliseconds = ^.asInstanceOf[js.Dynamic].applyDynamic("microsecondsToMilliseconds")(microseconds.asInstanceOf[js.Any]).asInstanceOf[Milliseconds]
  
  inline def microsecondsToSeconds(microseconds: Microseconds): Seconds = ^.asInstanceOf[js.Dynamic].applyDynamic("microsecondsToSeconds")(microseconds.asInstanceOf[js.Any]).asInstanceOf[Seconds]
  
  inline def millisecondsToMicroseconds(milliseconds: Milliseconds): Microseconds = ^.asInstanceOf[js.Dynamic].applyDynamic("millisecondsToMicroseconds")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[Microseconds]
  
  /**
    * Abstract base class for Redis-based implementations.
    */
  @js.native
  trait BaseRedisRateLimiter extends RateLimiter {
    
    var client: RedisClientWrapper = js.native
    
    def makeKey(id: Id): String = js.native
    
    var namespace: String = js.native
    
    var ttl: Double = js.native
  }
  
  /**
    * Duck-typed `ioredis` client. We don't want to use the actual typing because that would
    * force users to install `ioredis` as a peer dependency.
    */
  trait IORedisClient extends StObject {
    
    def del(arg: String): Any
    
    def multi(): IORedisMulti
  }
  object IORedisClient {
    
    inline def apply(del: String => Any, multi: () => IORedisMulti): IORedisClient = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), multi = js.Any.fromFunction0(multi))
      __obj.asInstanceOf[IORedisClient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IORedisClient] (val x: Self) extends AnyVal {
      
      inline def setDel(value: String => Any): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setMulti(value: () => IORedisMulti): Self = StObject.set(x, "multi", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Duck-typed `ioredis` multi object. We don't want to use the actual typing because that would
    * force users to install `ioredis` as a peer dependency.
    */
  trait IORedisMulti extends StObject {
    
    def exec(): js.Promise[(js.Array[js.Tuple2[/* error */ js.Error | Null, /* result */ Any]]) | Null]
    
    def expire(key: String, time: Double): Unit
    
    def zadd(key: String, score: Double, value: String): Unit
    
    @JSName("zrange")
    def zrange_WITHSCORES(key: String, min: Double, max: Double, withScores: WITHSCORES): Unit
    
    def zremrangebyscore(key: String, min: Double, max: Double): Unit
  }
  object IORedisMulti {
    
    inline def apply(
      exec: () => js.Promise[(js.Array[js.Tuple2[/* error */ js.Error | Null, /* result */ Any]]) | Null],
      expire: (String, Double) => Unit,
      zadd: (String, Double, String) => Unit,
      zrange: (String, Double, Double, WITHSCORES) => Unit,
      zremrangebyscore: (String, Double, Double) => Unit
    ): IORedisMulti = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction0(exec), expire = js.Any.fromFunction2(expire), zadd = js.Any.fromFunction3(zadd), zrange = js.Any.fromFunction4(zrange), zremrangebyscore = js.Any.fromFunction3(zremrangebyscore))
      __obj.asInstanceOf[IORedisMulti]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IORedisMulti] (val x: Self) extends AnyVal {
      
      inline def setExec(
        value: () => js.Promise[(js.Array[js.Tuple2[/* error */ js.Error | Null, /* result */ Any]]) | Null]
      ): Self = StObject.set(x, "exec", js.Any.fromFunction0(value))
      
      inline def setExpire(value: (String, Double) => Unit): Self = StObject.set(x, "expire", js.Any.fromFunction2(value))
      
      inline def setZadd(value: (String, Double, String) => Unit): Self = StObject.set(x, "zadd", js.Any.fromFunction3(value))
      
      inline def setZrange(value: (String, Double, Double, WITHSCORES) => Unit): Self = StObject.set(x, "zrange", js.Any.fromFunction4(value))
      
      inline def setZremrangebyscore(value: (String, Double, Double) => Unit): Self = StObject.set(x, "zremrangebyscore", js.Any.fromFunction3(value))
    }
  }
  
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
  
  /**
    * Duck-typed `node-redis` client. We don't want to use the actual typing because that would
    * force users to install `node-redis` as a peer dependency.
    */
  trait NodeRedisClient extends StObject {
    
    def del(arg: String): Any
    
    def multi(): NodeRedisMulti
  }
  object NodeRedisClient {
    
    inline def apply(del: String => Any, multi: () => NodeRedisMulti): NodeRedisClient = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), multi = js.Any.fromFunction0(multi))
      __obj.asInstanceOf[NodeRedisClient]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeRedisClient] (val x: Self) extends AnyVal {
      
      inline def setDel(value: String => Any): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setMulti(value: () => NodeRedisMulti): Self = StObject.set(x, "multi", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Duck-typed `node-redis` multi object. We don't want to use the actual typing because that would
    * force users to install `node-redis` as a peer dependency.
    */
  trait NodeRedisMulti extends StObject {
    
    def exec(): js.Promise[js.Array[Any]]
    
    def expire(key: String, time: Double): Unit
    
    def zAdd(key: String, item: Score): Unit
    
    def zRangeWithScores(key: String, min: Double, max: Double): Unit
    
    def zRemRangeByScore(key: String, min: Double, max: Double): Unit
  }
  object NodeRedisMulti {
    
    inline def apply(
      exec: () => js.Promise[js.Array[Any]],
      expire: (String, Double) => Unit,
      zAdd: (String, Score) => Unit,
      zRangeWithScores: (String, Double, Double) => Unit,
      zRemRangeByScore: (String, Double, Double) => Unit
    ): NodeRedisMulti = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction0(exec), expire = js.Any.fromFunction2(expire), zAdd = js.Any.fromFunction2(zAdd), zRangeWithScores = js.Any.fromFunction3(zRangeWithScores), zRemRangeByScore = js.Any.fromFunction3(zRemRangeByScore))
      __obj.asInstanceOf[NodeRedisMulti]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeRedisMulti] (val x: Self) extends AnyVal {
      
      inline def setExec(value: () => js.Promise[js.Array[Any]]): Self = StObject.set(x, "exec", js.Any.fromFunction0(value))
      
      inline def setExpire(value: (String, Double) => Unit): Self = StObject.set(x, "expire", js.Any.fromFunction2(value))
      
      inline def setZAdd(value: (String, Score) => Unit): Self = StObject.set(x, "zAdd", js.Any.fromFunction2(value))
      
      inline def setZRangeWithScores(value: (String, Double, Double) => Unit): Self = StObject.set(x, "zRangeWithScores", js.Any.fromFunction3(value))
      
      inline def setZRemRangeByScore(value: (String, Double, Double) => Unit): Self = StObject.set(x, "zRemRangeByScore", js.Any.fromFunction3(value))
    }
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RateLimitInfo] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RateLimiterOptions] (val x: Self) extends AnyVal {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setMaxInInterval(value: Double): Self = StObject.set(x, "maxInInterval", value.asInstanceOf[js.Any])
      
      inline def setMinDifference(value: Double): Self = StObject.set(x, "minDifference", value.asInstanceOf[js.Any])
      
      inline def setMinDifferenceUndefined: Self = StObject.set(x, "minDifference", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rollingRateLimiter.rollingRateLimiterStrings.`node-redis`
    - typings.rollingRateLimiter.rollingRateLimiterStrings.ioredis
  */
  trait RedisClientType extends StObject
  object RedisClientType {
    
    inline def ioredis: typings.rollingRateLimiter.rollingRateLimiterStrings.ioredis = "ioredis".asInstanceOf[typings.rollingRateLimiter.rollingRateLimiterStrings.ioredis]
    
    inline def `node-redis`: typings.rollingRateLimiter.rollingRateLimiterStrings.`node-redis` = "node-redis".asInstanceOf[typings.rollingRateLimiter.rollingRateLimiterStrings.`node-redis`]
  }
  
  /**
    * Wrapper class around a Redis client.
    * Exposes only the methods we need for the algorithm.
    * This papers over differences between `node-redis` and `ioredis`.
    */
  trait RedisClientWrapper extends StObject {
    
    def del(arg: String): Any
    
    def multi(): RedisMultiWrapper
    
    def parseZRangeResult(result: Any): js.Array[Microseconds]
  }
  object RedisClientWrapper {
    
    inline def apply(
      del: String => Any,
      multi: () => RedisMultiWrapper,
      parseZRangeResult: Any => js.Array[Microseconds]
    ): RedisClientWrapper = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), multi = js.Any.fromFunction0(multi), parseZRangeResult = js.Any.fromFunction1(parseZRangeResult))
      __obj.asInstanceOf[RedisClientWrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisClientWrapper] (val x: Self) extends AnyVal {
      
      inline def setDel(value: String => Any): Self = StObject.set(x, "del", js.Any.fromFunction1(value))
      
      inline def setMulti(value: () => RedisMultiWrapper): Self = StObject.set(x, "multi", js.Any.fromFunction0(value))
      
      inline def setParseZRangeResult(value: Any => js.Array[Microseconds]): Self = StObject.set(x, "parseZRangeResult", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Wrapper class around a Redis multi batch.
    * Exposes only the methods we need for the algorithm.
    * This papers over differences between `node-redis` and `ioredis`.
    */
  trait RedisMultiWrapper extends StObject {
    
    def exec(): js.Promise[js.Array[Any]]
    
    def expire(key: String, time: Double): Unit
    
    def zAdd(key: String, score: Double, value: String): Unit
    
    def zRangeWithScores(key: String, min: Double, max: Double): Unit
    
    def zRemRangeByScore(key: String, min: Double, max: Double): Unit
  }
  object RedisMultiWrapper {
    
    inline def apply(
      exec: () => js.Promise[js.Array[Any]],
      expire: (String, Double) => Unit,
      zAdd: (String, Double, String) => Unit,
      zRangeWithScores: (String, Double, Double) => Unit,
      zRemRangeByScore: (String, Double, Double) => Unit
    ): RedisMultiWrapper = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction0(exec), expire = js.Any.fromFunction2(expire), zAdd = js.Any.fromFunction3(zAdd), zRangeWithScores = js.Any.fromFunction3(zRangeWithScores), zRemRangeByScore = js.Any.fromFunction3(zRemRangeByScore))
      __obj.asInstanceOf[RedisMultiWrapper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisMultiWrapper] (val x: Self) extends AnyVal {
      
      inline def setExec(value: () => js.Promise[js.Array[Any]]): Self = StObject.set(x, "exec", js.Any.fromFunction0(value))
      
      inline def setExpire(value: (String, Double) => Unit): Self = StObject.set(x, "expire", js.Any.fromFunction2(value))
      
      inline def setZAdd(value: (String, Double, String) => Unit): Self = StObject.set(x, "zAdd", js.Any.fromFunction3(value))
      
      inline def setZRangeWithScores(value: (String, Double, Double) => Unit): Self = StObject.set(x, "zRangeWithScores", js.Any.fromFunction3(value))
      
      inline def setZRemRangeByScore(value: (String, Double, Double) => Unit): Self = StObject.set(x, "zRemRangeByScore", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * Generic options for constructing a Redis-backed rate limiter.
    * See `README.md` for more information.
    */
  trait RedisRateLimiterOptions[Client]
    extends StObject
       with RateLimiterOptions {
    
    var client: Client
    
    var namespace: String
  }
  object RedisRateLimiterOptions {
    
    inline def apply[Client](client: Client, interval: Double, maxInInterval: Double, namespace: String): RedisRateLimiterOptions[Client] = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedisRateLimiterOptions[Client]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisRateLimiterOptions[?], Client] (val x: Self & RedisRateLimiterOptions[Client]) extends AnyVal {
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
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
