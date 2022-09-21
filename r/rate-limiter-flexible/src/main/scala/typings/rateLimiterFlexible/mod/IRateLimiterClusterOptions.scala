package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRateLimiterClusterOptions
  extends StObject
     with IRateLimiterOptions {
  
  var timeoutMs: js.UndefOr[Double] = js.undefined
}
object IRateLimiterClusterOptions {
  
  inline def apply(): IRateLimiterClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRateLimiterClusterOptions]
  }
  
  extension [Self <: IRateLimiterClusterOptions](x: Self) {
    
    inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
  }
}
