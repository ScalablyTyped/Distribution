package typings.reactRelay.anon

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.RenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchKey extends StObject {
  
  var UNSTABLE_renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  
  var fetchKey: js.UndefOr[String | Double] = js.undefined
  
  var fetchPolicy: js.UndefOr[typings.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy] = js.undefined
  
  var networkCacheConfig: js.UndefOr[typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig] = js.undefined
}
object FetchKey {
  
  inline def apply(): FetchKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchKey] (val x: Self) extends AnyVal {
    
    inline def setFetchKey(value: String | Double): Self = StObject.set(x, "fetchKey", value.asInstanceOf[js.Any])
    
    inline def setFetchKeyUndefined: Self = StObject.set(x, "fetchKey", js.undefined)
    
    inline def setFetchPolicy(value: typings.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    inline def setNetworkCacheConfig(value: typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
    
    inline def setUNSTABLE_renderPolicy(value: RenderPolicy): Self = StObject.set(x, "UNSTABLE_renderPolicy", value.asInstanceOf[js.Any])
    
    inline def setUNSTABLE_renderPolicyUndefined: Self = StObject.set(x, "UNSTABLE_renderPolicy", js.undefined)
  }
}
