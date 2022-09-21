package typings.relayRuntime.anon

import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.FetchQueryFetchPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPolicy extends StObject {
  
  var fetchPolicy: js.UndefOr[FetchQueryFetchPolicy | Null] = js.undefined
  
  var networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
}
object FetchPolicy {
  
  inline def apply(): FetchPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchPolicy]
  }
  
  extension [Self <: FetchPolicy](x: Self) {
    
    inline def setFetchPolicy(value: FetchQueryFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicyNull: Self = StObject.set(x, "fetchPolicy", null)
    
    inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    inline def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
    
    inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
  }
}
