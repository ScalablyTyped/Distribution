package typings.reactRelay.anon

import typings.relayRuntime.relayRuntimeTypesMod.RenderPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchKey extends StObject {
  
  var UNSTABLE_renderPolicy: js.UndefOr[RenderPolicy] = js.native
  
  var fetchKey: js.UndefOr[String | Double] = js.native
  
  var fetchPolicy: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy] = js.native
  
  var networkCacheConfig: js.UndefOr[typings.relayRuntime.relayRuntimeTypesMod.CacheConfig] = js.native
}
object FetchKey {
  
  @scala.inline
  def apply(): FetchKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchKey]
  }
  
  @scala.inline
  implicit class FetchKeyMutableBuilder[Self <: FetchKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchKey(value: String | Double): Self = StObject.set(x, "fetchKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchKeyUndefined: Self = StObject.set(x, "fetchKey", js.undefined)
    
    @scala.inline
    def setFetchPolicy(value: typings.relayRuntime.relayRuntimeTypesMod.FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    @scala.inline
    def setNetworkCacheConfig(value: typings.relayRuntime.relayRuntimeTypesMod.CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
    
    @scala.inline
    def setUNSTABLE_renderPolicy(value: RenderPolicy): Self = StObject.set(x, "UNSTABLE_renderPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNSTABLE_renderPolicyUndefined: Self = StObject.set(x, "UNSTABLE_renderPolicy", js.undefined)
  }
}
