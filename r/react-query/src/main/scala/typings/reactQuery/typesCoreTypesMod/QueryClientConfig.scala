package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.typesCoreMutationCacheMod.MutationCache
import typings.reactQuery.typesCoreQueryCacheMod.QueryCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryClientConfig extends StObject {
  
  var defaultOptions: js.UndefOr[DefaultOptions[Any]] = js.undefined
  
  var mutationCache: js.UndefOr[MutationCache] = js.undefined
  
  var queryCache: js.UndefOr[QueryCache] = js.undefined
}
object QueryClientConfig {
  
  inline def apply(): QueryClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryClientConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryClientConfig] (val x: Self) extends AnyVal {
    
    inline def setDefaultOptions(value: DefaultOptions[Any]): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    
    inline def setMutationCache(value: MutationCache): Self = StObject.set(x, "mutationCache", value.asInstanceOf[js.Any])
    
    inline def setMutationCacheUndefined: Self = StObject.set(x, "mutationCache", js.undefined)
    
    inline def setQueryCache(value: QueryCache): Self = StObject.set(x, "queryCache", value.asInstanceOf[js.Any])
    
    inline def setQueryCacheUndefined: Self = StObject.set(x, "queryCache", js.undefined)
  }
}
