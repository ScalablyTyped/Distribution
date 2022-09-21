package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rate-limiter-flexible", "RateLimiterQueue")
@js.native
open class RateLimiterQueue protected () extends StObject {
  def this(limiterFlexible: BurstyRateLimiter) = this()
  def this(limiterFlexible: RateLimiterAbstract) = this()
  def this(limiterFlexible: BurstyRateLimiter, opts: IRateLimiterQueueOpts) = this()
  def this(limiterFlexible: RateLimiterAbstract, opts: IRateLimiterQueueOpts) = this()
  
  def getTokensRemaining(): js.Promise[Double] = js.native
  def getTokensRemaining(key: String): js.Promise[Double] = js.native
  def getTokensRemaining(key: Double): js.Promise[Double] = js.native
  
  def removeTokens(tokens: Double): js.Promise[Double] = js.native
  def removeTokens(tokens: Double, key: String): js.Promise[Double] = js.native
  def removeTokens(tokens: Double, key: Double): js.Promise[Double] = js.native
}
