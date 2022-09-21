package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rate-limiter-flexible", "RateLimiterUnion")
@js.native
open class RateLimiterUnion protected () extends StObject {
  def this(limiters: RateLimiterAbstract*) = this()
  
  def consume(key: String): js.Promise[js.Array[RateLimiterRes]] = js.native
  def consume(key: String, points: Double): js.Promise[js.Array[RateLimiterRes]] = js.native
  def consume(key: Double): js.Promise[js.Array[RateLimiterRes]] = js.native
  def consume(key: Double, points: Double): js.Promise[js.Array[RateLimiterRes]] = js.native
}
