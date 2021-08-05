package typings.reactRelay.anon

import typings.relayRuntime.relayRuntimeTypesMod.FetchQueryFetchPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchPolicy extends StObject {
  
  var fetchPolicy: js.UndefOr[FetchQueryFetchPolicy] = js.undefined
  
  var networkCacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.undefined
}
object FetchPolicy {
  
  inline def apply(): FetchPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchPolicy]
  }
  
  extension [Self <: FetchPolicy](x: Self) {
    
    inline def setFetchPolicy(value: FetchQueryFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    inline def setNetworkCacheConfig(value: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
  }
}
