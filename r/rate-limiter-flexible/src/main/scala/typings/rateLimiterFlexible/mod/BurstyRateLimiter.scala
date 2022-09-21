package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rate-limiter-flexible", "BurstyRateLimiter")
@js.native
open class BurstyRateLimiter protected () extends StObject {
  def this(rateLimiter: RateLimiterAbstract, burstLimiter: RateLimiterAbstract) = this()
  
  def consume(key: String): js.Promise[RateLimiterRes] = js.native
  def consume(key: String, pointsToConsume: Double): js.Promise[RateLimiterRes] = js.native
  def consume(key: String, pointsToConsume: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def consume(key: String, pointsToConsume: Unit, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double, pointsToConsume: Double): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double, pointsToConsume: Double, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
  def consume(key: Double, pointsToConsume: Unit, options: IRateLimiterMongoFunctionOptions): js.Promise[RateLimiterRes] = js.native
}
