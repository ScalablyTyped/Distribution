package typings.reactQuery.typesCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchQueryOptions[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */]
  extends StObject
     with QueryOptions[TQueryFnData, TError, TData, TQueryKey] {
  
  /**
    * The time in milliseconds after data is considered stale.
    * If the data is fresh it will be returned from the cache.
    */
  var staleTime: js.UndefOr[Double] = js.undefined
}
object FetchQueryOptions {
  
  inline def apply[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](): FetchQueryOptions[TQueryFnData, TError, TData, TQueryKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchQueryOptions[TQueryFnData, TError, TData, TQueryKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchQueryOptions[?, ?, ?, ?], TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] (val x: Self & (FetchQueryOptions[TQueryFnData, TError, TData, TQueryKey])) extends AnyVal {
    
    inline def setStaleTime(value: Double): Self = StObject.set(x, "staleTime", value.asInstanceOf[js.Any])
    
    inline def setStaleTimeUndefined: Self = StObject.set(x, "staleTime", js.undefined)
  }
}
