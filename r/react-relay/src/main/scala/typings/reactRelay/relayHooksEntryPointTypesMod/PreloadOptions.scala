package typings.reactRelay.relayHooksEntryPointTypesMod

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  fetchKey :string | number | undefined,   fetchPolicy :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadFetchPolicy | null | undefined,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined}> */
trait PreloadOptions extends StObject {
  
  val fetchKey: js.UndefOr[String | Double] = js.undefined
  
  val fetchPolicy: js.UndefOr[PreloadFetchPolicy | Null] = js.undefined
  
  val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
}
object PreloadOptions {
  
  inline def apply(): PreloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreloadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreloadOptions] (val x: Self) extends AnyVal {
    
    inline def setFetchKey(value: String | Double): Self = StObject.set(x, "fetchKey", value.asInstanceOf[js.Any])
    
    inline def setFetchKeyUndefined: Self = StObject.set(x, "fetchKey", js.undefined)
    
    inline def setFetchPolicy(value: PreloadFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicyNull: Self = StObject.set(x, "fetchPolicy", null)
    
    inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    inline def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
    
    inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
  }
}
