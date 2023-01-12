package typings.reactQuery.typesCoreQueryMod

import typings.reactQuery.typesCoreQueryCacheMod.QueryCache
import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesCoreTypesMod.QueryMeta
import typings.reactQuery.typesCoreTypesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryConfig[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] extends StObject {
  
  var cache: QueryCache
  
  var defaultOptions: js.UndefOr[QueryOptions[TQueryFnData, TError, TData, TQueryKey]] = js.undefined
  
  var meta: js.UndefOr[QueryMeta] = js.undefined
  
  var options: js.UndefOr[QueryOptions[TQueryFnData, TError, TData, TQueryKey]] = js.undefined
  
  var queryHash: String
  
  var queryKey: TQueryKey
  
  var state: js.UndefOr[QueryState[TData, TError]] = js.undefined
}
object QueryConfig {
  
  inline def apply[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](cache: QueryCache, queryHash: String, queryKey: TQueryKey): QueryConfig[TQueryFnData, TError, TData, TQueryKey] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], queryHash = queryHash.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryConfig[TQueryFnData, TError, TData, TQueryKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryConfig[?, ?, ?, ?], TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] (val x: Self & (QueryConfig[TQueryFnData, TError, TData, TQueryKey])) extends AnyVal {
    
    inline def setCache(value: QueryCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setDefaultOptions(value: QueryOptions[TQueryFnData, TError, TData, TQueryKey]): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    
    inline def setMeta(value: QueryMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setOptions(value: QueryOptions[TQueryFnData, TError, TData, TQueryKey]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setQueryHash(value: String): Self = StObject.set(x, "queryHash", value.asInstanceOf[js.Any])
    
    inline def setQueryKey(value: TQueryKey): Self = StObject.set(x, "queryKey", value.asInstanceOf[js.Any])
    
    inline def setState(value: QueryState[TData, TError]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
