package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRateLimiterStoreNoAutoExpiryOptions
  extends StObject
     with IRateLimiterStoreOptions {
  
  var clearExpiredByTimeout: js.UndefOr[Boolean] = js.undefined
}
object IRateLimiterStoreNoAutoExpiryOptions {
  
  inline def apply(storeClient: Any): IRateLimiterStoreNoAutoExpiryOptions = {
    val __obj = js.Dynamic.literal(storeClient = storeClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRateLimiterStoreNoAutoExpiryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRateLimiterStoreNoAutoExpiryOptions] (val x: Self) extends AnyVal {
    
    inline def setClearExpiredByTimeout(value: Boolean): Self = StObject.set(x, "clearExpiredByTimeout", value.asInstanceOf[js.Any])
    
    inline def setClearExpiredByTimeoutUndefined: Self = StObject.set(x, "clearExpiredByTimeout", js.undefined)
  }
}
