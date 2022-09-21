package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rate-limiter-flexible", "RateLimiterStoreAbstract")
@js.native
open class RateLimiterStoreAbstract protected () extends RateLimiterAbstract {
  def this(opts: IRateLimiterStoreOptions) = this()
  
  /**
    * Cleanup keys blocked in current process memory
    */
  def deleteInMemoryBlockedAll(): Unit = js.native
}
