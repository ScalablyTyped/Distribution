package typings.reactRelay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheConfig extends StObject {
  
  var cacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig | Null] = js.undefined
  
  var fetchPolicy: js.UndefOr[typings.reactRelay.mod.FetchPolicy] = js.undefined
}
object CacheConfig {
  
  inline def apply(): CacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheConfig]
  }
  
  extension [Self <: CacheConfig](x: Self) {
    
    inline def setCacheConfig(value: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
    
    inline def setCacheConfigNull: Self = StObject.set(x, "cacheConfig", null)
    
    inline def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
    
    inline def setFetchPolicy(value: typings.reactRelay.mod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
  }
}
