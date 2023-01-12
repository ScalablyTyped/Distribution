package typings.reactRelay.relayHooksEntryPointTypesMod

import typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  fetchPolicy :relay-runtime.relay-runtime.FetchPolicy | null | undefined,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   onQueryAstLoadTimeout :(): void | null | undefined}> */
trait LoadQueryOptions extends StObject {
  
  val fetchPolicy: js.UndefOr[FetchPolicy | Null] = js.undefined
  
  val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  
  val onQueryAstLoadTimeout: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
}
object LoadQueryOptions {
  
  inline def apply(): LoadQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadQueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadQueryOptions] (val x: Self) extends AnyVal {
    
    inline def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicyNull: Self = StObject.set(x, "fetchPolicy", null)
    
    inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    inline def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
    
    inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
    
    inline def setOnQueryAstLoadTimeout(value: () => Unit): Self = StObject.set(x, "onQueryAstLoadTimeout", js.Any.fromFunction0(value))
    
    inline def setOnQueryAstLoadTimeoutNull: Self = StObject.set(x, "onQueryAstLoadTimeout", null)
    
    inline def setOnQueryAstLoadTimeoutUndefined: Self = StObject.set(x, "onQueryAstLoadTimeout", js.undefined)
  }
}
