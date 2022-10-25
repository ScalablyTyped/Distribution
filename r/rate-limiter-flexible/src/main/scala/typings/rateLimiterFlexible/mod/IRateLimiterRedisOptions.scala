package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRateLimiterRedisOptions
  extends StObject
     with IRateLimiterStoreOptions {
  
  var rejectIfRedisNotReady: js.UndefOr[Boolean] = js.undefined
}
object IRateLimiterRedisOptions {
  
  inline def apply(storeClient: Any): IRateLimiterRedisOptions = {
    val __obj = js.Dynamic.literal(storeClient = storeClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRateLimiterRedisOptions]
  }
  
  extension [Self <: IRateLimiterRedisOptions](x: Self) {
    
    inline def setRejectIfRedisNotReady(value: Boolean): Self = StObject.set(x, "rejectIfRedisNotReady", value.asInstanceOf[js.Any])
    
    inline def setRejectIfRedisNotReadyUndefined: Self = StObject.set(x, "rejectIfRedisNotReady", js.undefined)
  }
}
