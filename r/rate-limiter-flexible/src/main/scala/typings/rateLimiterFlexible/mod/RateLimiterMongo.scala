package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rate-limiter-flexible", "RateLimiterMongo")
@js.native
open class RateLimiterMongo protected () extends RateLimiterStoreAbstract {
  def this(opts: IRateLimiterMongoOptions) = this()
  
  def block(key: String, secDuration: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def block(key: Double, secDuration: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  
  def consume(key: String, pointsToConsume: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def consume(key: String, pointsToConsume: Unit, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double, pointsToConsume: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double, pointsToConsume: Unit, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  
  def delete(key: String, options: IRateLimiterMongoFunctionOptions): js.Promise[Boolean] = js.native
  def delete(key: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[Boolean] = js.native
  
  def get(key: String, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes | Null] = js.native
  def get(key: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes | Null] = js.native
  
  def indexKeyPrefix(): js.Object = js.native
  def indexKeyPrefix(obj: js.Object): Unit = js.native
  @JSName("indexKeyPrefix")
  def indexKeyPrefix_Unit(): Unit = js.native
  
  def penalty(key: String, points: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def penalty(key: String, points: Unit, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def penalty(key: Double, points: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def penalty(key: Double, points: Unit, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  
  def reward(key: String, points: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def reward(key: String, points: Unit, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def reward(key: Double, points: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def reward(key: Double, points: Unit, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  
  def set(key: String, points: Double, secDuration: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def set(key: Double, points: Double, secDuration: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
}
