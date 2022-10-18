package typings.sentryUtils

import typings.sentryTypes.typesTransportMod.TransportMakeRequestResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRatelimitMod {
  
  @JSImport("@sentry/utils/types/ratelimit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils/types/ratelimit", "DEFAULT_RETRY_AFTER")
  @js.native
  val DEFAULT_RETRY_AFTER: Double = js.native
  
  inline def disabledUntil(limits: RateLimits, category: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("disabledUntil")(limits.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isRateLimited(limits: RateLimits, category: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRateLimited")(limits.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isRateLimited(limits: RateLimits, category: String, now: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRateLimited")(limits.asInstanceOf[js.Any], category.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseRetryAfterHeader(header: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(header.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseRetryAfterHeader(header: String, now: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(header.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def updateRateLimits(limits: RateLimits, hasStatusCodeHeaders: TransportMakeRequestResponse): RateLimits = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRateLimits")(limits.asInstanceOf[js.Any], hasStatusCodeHeaders.asInstanceOf[js.Any])).asInstanceOf[RateLimits]
  inline def updateRateLimits(limits: RateLimits, hasStatusCodeHeaders: TransportMakeRequestResponse, now: Double): RateLimits = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRateLimits")(limits.asInstanceOf[js.Any], hasStatusCodeHeaders.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[RateLimits]
  
  type RateLimits = Record[String, Double]
}
