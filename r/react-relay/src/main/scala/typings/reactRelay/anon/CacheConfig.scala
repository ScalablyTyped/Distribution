package typings.reactRelay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheConfig extends StObject {
  
  var cacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig | Null] = js.native
  
  var fetchPolicy: js.UndefOr[typings.reactRelay.mod.FetchPolicy] = js.native
}
object CacheConfig {
  
  @scala.inline
  def apply(): CacheConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheConfig]
  }
  
  @scala.inline
  implicit class CacheConfigMutableBuilder[Self <: CacheConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheConfig(value: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheConfigNull: Self = StObject.set(x, "cacheConfig", null)
    
    @scala.inline
    def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
    
    @scala.inline
    def setFetchPolicy(value: typings.reactRelay.mod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
  }
}
