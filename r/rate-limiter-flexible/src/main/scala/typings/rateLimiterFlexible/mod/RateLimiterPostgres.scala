package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rate-limiter-flexible", "RateLimiterPostgres")
@js.native
open class RateLimiterPostgres protected () extends RateLimiterStoreAbstract {
  def this(opts: IRateLimiterStoreNoAutoExpiryOptions) = this()
  def this(opts: IRateLimiterStoreNoAutoExpiryOptions, cb: ICallbackReady) = this()
}
