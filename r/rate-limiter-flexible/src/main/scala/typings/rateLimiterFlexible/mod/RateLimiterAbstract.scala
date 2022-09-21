package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rate-limiter-flexible", "RateLimiterAbstract")
@js.native
open class RateLimiterAbstract protected () extends StObject {
  def this(opts: IRateLimiterOptions) = this()
  
  /**
    * Block key by setting consumed points to points + 1 for secDuration seconds.
    *
    * It force updates expire, if there is already key.
    *
    * Blocked key never expires, if secDuration is 0.
    * @returns Promise, which:
    * - `resolved` with RateLimiterRes
    * - `rejected` only for database limiters if insuranceLimiter isn't setup: when some error happened, where reject reason `rejRes` is Error object
    * - `rejected` only for RateLimiterCluster if insuranceLimiter isn't setup: when timeoutMs exceeded, where reject reason `rejRes` is Error object
    */
  def block(key: String, secDuration: Double): js.Promise[RateLimiterRes] = js.native
  def block(key: String, secDuration: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def block(key: Double, secDuration: Double): js.Promise[RateLimiterRes] = js.native
  def block(key: Double, secDuration: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  
  /**
    * If positive number and consumed more than points in current duration, block for blockDuration
    * seconds.
    */
  var blockDuration: Double = js.native
  
  /**
    * @param key is usually IP address or some unique client id
    * @param pointsToConsume number of points consumed. default: 1
    * @param options is object with additional settings:
    * - customDuration expire in seconds for this operation only overwrites limiter's duration. It doesn't work, if key already created.
    * @returns Returns Promise, which:
    * - `resolved` with `RateLimiterRes` when point(s) is consumed, so action can be done
    * - `rejected` only for store and database limiters if insuranceLimiter isn't setup: when some error happened, where reject reason `rejRes` is Error object
    * - `rejected` only for RateLimiterCluster if insuranceLimiter isn't setup: when timeoutMs exceeded, where reject reason `rejRes` is Error object
    * - `rejected` when there is no points to be consumed, where reject reason `rejRes` is `RateLimiterRes` object
    * - `rejected` when key is blocked (if block strategy is set up), where reject reason `rejRes` is `RateLimiterRes` object
    */
  def consume(key: String): js.Promise[RateLimiterRes] = js.native
  def consume(key: String, pointsToConsume: Double): js.Promise[RateLimiterRes] = js.native
  def consume(key: String, pointsToConsume: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def consume(key: String, pointsToConsume: Unit, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double, pointsToConsume: Double): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double, pointsToConsume: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double, pointsToConsume: Unit, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  
  /**
    * Delete all data related to key.
    *
    * For example, previously blocked key is not blocked after delete as there is no data anymore.
    * @returns Promise, which:
    * - `resolved` with boolean, true if data is removed by key, false if there is no such key.
    * - `rejected` only for database limiters if insuranceLimiter isn't setup: when some error happened, where reject reason `rejRes` is Error object
    * - `rejected` only for RateLimiterCluster if insuranceLimiter isn't setup: when timeoutMs exceeded, where reject reason `rejRes` is Error object
    */
  def delete(key: String): js.Promise[Boolean] = js.native
  def delete(key: String, options: StringDictionary[Any]): js.Promise[Boolean] = js.native
  def delete(key: Double): js.Promise[Boolean] = js.native
  def delete(key: Double, options: StringDictionary[Any]): js.Promise[Boolean] = js.native
  
  /**
    * Number of seconds before consumed points are reset.
    * Keys never expire, if duration is 0.
    */
  var duration: Double = js.native
  
  /**
    * Delay action to be executed evenly over duration First action in duration is executed without
    * delay. All next allowed actions in current duration are delayed by formula
    * msBeforeDurationEnd / (remainingPoints + 2) with minimum delay of duration * 1000 / points.
    * It allows to cut off load peaks similar way to Leaky Bucket.
    *
    * Note: it isn't recommended to use it for long duration and few points, as it may delay action
    * for too long with default execEvenlyMinDelayMs.
    */
  var execEvenly: Boolean = js.native
  
  /**
    * Sets minimum delay in milliseconds, when action is delayed with execEvenly
    */
  var execEvenlyMinDelayMs: Double = js.native
  
  /**
    * Get RateLimiterRes in current duration. It always returns RateLimiterRes.isFirstInDuration=false.
    * @param key is usually IP address or some unique client id
    * @param options
    * @returns  Promise, which:
    * - `resolved` with RateLimiterRes if key is set
    * - `resolved` with null if key is NOT set or expired
    * - `rejected` only for database limiters if insuranceLimiter isn't setup: when some error happened, where reject reason `rejRes` is Error object
    * - `rejected` only for RateLimiterCluster if insuranceLimiter isn't setup: when timeoutMs exceeded, where reject reason `rejRes` is Error object
    */
  def get(key: String): js.Promise[RateLimiterRes | Null] = js.native
  def get(key: String, options: StringDictionary[Any]): js.Promise[RateLimiterRes | Null] = js.native
  def get(key: Double): js.Promise[RateLimiterRes | Null] = js.native
  def get(key: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes | Null] = js.native
  
  /**
    * Returns internal key prefixed with keyPrefix option as it is saved in store.
    */
  def getKey(key: String): String = js.native
  def getKey(key: Double): String = js.native
  
  /**
    * If you need to create several limiters for different purpose.
    * Set to empty string '', if keys should be stored without prefix.
    */
  var keyPrefix: String = js.native
  
  /**
    * blockDuration in milliseconds
    */
  def msBlockDuration: Double = js.native
  
  /**
    * duration in milliseconds
    */
  def msDuration: Double = js.native
  
  /**
    * Returns internal key without the keyPrefix.
    */
  def parseKey(rlKey: String): String = js.native
  
  /**
    * Fine key by points number of points for one duration.
    *
    * Note: Depending on time penalty may go to next durations
    *
    * @returns Returns Promise, which:
    * - `resolved` with RateLimiterRes
    * - `rejected` only for database limiters if insuranceLimiter isn't setup: when some error happened, where reject reason `rejRes` is Error object
    * - `rejected` only for RateLimiterCluster if insuranceLimiter isn't setup: when timeoutMs exceeded, where reject reason `rejRes` is Error object
    */
  def penalty(key: String): js.Promise[RateLimiterRes] = js.native
  def penalty(key: String, points: Double): js.Promise[RateLimiterRes] = js.native
  def penalty(key: String, points: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def penalty(key: String, points: Unit, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def penalty(key: Double): js.Promise[RateLimiterRes] = js.native
  def penalty(key: Double, points: Double): js.Promise[RateLimiterRes] = js.native
  def penalty(key: Double, points: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def penalty(key: Double, points: Unit, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  
  /**
    * Maximum number of points can be consumed over duration. Limiter compares this number with
    * number of consumed points by key to decide if an operation should be rejected or resolved.
    */
  var points: Double = js.native
  
  /**
    * Reward key by points number of points for one duration.
    * Note: Depending on time reward may go to next durations
    * @returns Promise, which:
    * - `resolved` with RateLimiterRes
    * - `rejected` only for database limiters if insuranceLimiter isn't setup: when some error happened, where reject reason `rejRes` is Error object
    * - `rejected` only for RateLimiterCluster if insuranceLimiter isn't setup: when timeoutMs exceeded, where reject reason `rejRes` is Error object
    */
  def reward(key: String): js.Promise[RateLimiterRes] = js.native
  def reward(key: String, points: Double): js.Promise[RateLimiterRes] = js.native
  def reward(key: String, points: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def reward(key: String, points: Unit, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def reward(key: Double): js.Promise[RateLimiterRes] = js.native
  def reward(key: Double, points: Double): js.Promise[RateLimiterRes] = js.native
  def reward(key: Double, points: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def reward(key: Double, points: Unit, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  
  /**
    * Set points to key for secDuration seconds.
    * Store it forever, if secDuration is 0.
    * @param key
    * @param points
    * @param secDuration
    * @param options
    * @returns Promise, which:
    * - `resolved` with RateLimiterRes
    * - `rejected` only for database limiters if insuranceLimiter isn't setup: when some error happened, where reject reason `rejRes` is Error object
    * - `rejected` only for RateLimiterCluster if insuranceLimiter isn't setup: when timeoutMs exceeded, where reject reason `rejRes` is Error object
    */
  def set(key: String, points: Double, secDuration: Double): js.Promise[RateLimiterRes] = js.native
  def set(key: String, points: Double, secDuration: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
  def set(key: Double, points: Double, secDuration: Double): js.Promise[RateLimiterRes] = js.native
  def set(key: Double, points: Double, secDuration: Double, options: StringDictionary[Any]): js.Promise[RateLimiterRes] = js.native
}
