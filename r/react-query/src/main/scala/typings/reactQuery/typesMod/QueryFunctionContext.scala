package typings.reactQuery.typesMod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFunctionContext[TQueryKey /* <: QueryKey */, TPageParam] extends StObject {
  
  var meta: js.UndefOr[QueryMeta] = js.undefined
  
  var pageParam: js.UndefOr[TPageParam] = js.undefined
  
  var queryKey: EnsuredQueryKey[TQueryKey]
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object QueryFunctionContext {
  
  inline def apply[TQueryKey /* <: QueryKey */, TPageParam](queryKey: EnsuredQueryKey[TQueryKey]): QueryFunctionContext[TQueryKey, TPageParam] = {
    val __obj = js.Dynamic.literal(queryKey = queryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFunctionContext[TQueryKey, TPageParam]]
  }
  
  extension [Self <: QueryFunctionContext[?, ?], TQueryKey /* <: QueryKey */, TPageParam](x: Self & (QueryFunctionContext[TQueryKey, TPageParam])) {
    
    inline def setMeta(value: QueryMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setPageParam(value: TPageParam): Self = StObject.set(x, "pageParam", value.asInstanceOf[js.Any])
    
    inline def setPageParamUndefined: Self = StObject.set(x, "pageParam", js.undefined)
    
    inline def setQueryKey(value: EnsuredQueryKey[TQueryKey]): Self = StObject.set(x, "queryKey", value.asInstanceOf[js.Any])
    
    inline def setQueryKeyVarargs(value: TQueryKey*): Self = StObject.set(x, "queryKey", js.Array(value*))
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
