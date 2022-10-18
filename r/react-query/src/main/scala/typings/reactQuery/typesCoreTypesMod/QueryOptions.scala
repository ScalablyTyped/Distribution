package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.typesCoreQueryMod.QueryBehavior
import typings.reactQuery.typesCoreRetryerMod.RetryDelayValue
import typings.reactQuery.typesCoreRetryerMod.RetryValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] extends StObject {
  
  var _defaulted: js.UndefOr[Boolean] = js.undefined
  
  var behavior: js.UndefOr[QueryBehavior[TQueryFnData, TError, TData, QueryKey]] = js.undefined
  
  var cacheTime: js.UndefOr[Double] = js.undefined
  
  /**
    * This function can be set to automatically get the next cursor for infinite queries.
    * The result will also be used to determine the value of `hasNextPage`.
    */
  var getNextPageParam: js.UndefOr[GetNextPageParamFunction[TQueryFnData]] = js.undefined
  
  /**
    * This function can be set to automatically get the previous cursor for infinite queries.
    * The result will also be used to determine the value of `hasPreviousPage`.
    */
  var getPreviousPageParam: js.UndefOr[GetPreviousPageParamFunction[TQueryFnData]] = js.undefined
  
  var initialData: js.UndefOr[TData | InitialDataFunction[TData]] = js.undefined
  
  var initialDataUpdatedAt: js.UndefOr[Double | js.Function0[js.UndefOr[Double]]] = js.undefined
  
  var isDataEqual: js.UndefOr[js.Function2[/* oldData */ js.UndefOr[TData], /* newData */ TData, Boolean]] = js.undefined
  
  /**
    * Additional payload to be stored on each query.
    * Use this property to pass information that can be used in other places.
    */
  var meta: js.UndefOr[QueryMeta] = js.undefined
  
  var queryFn: js.UndefOr[QueryFunction[TQueryFnData, TQueryKey]] = js.undefined
  
  var queryHash: js.UndefOr[String] = js.undefined
  
  var queryKey: js.UndefOr[TQueryKey] = js.undefined
  
  var queryKeyHashFn: js.UndefOr[QueryKeyHashFunction[TQueryKey]] = js.undefined
  
  /**
    * If `false`, failed queries will not retry by default.
    * If `true`, failed queries will retry infinitely., failureCount: num
    * If set to an integer number, e.g. 3, failed queries will retry until the failed query count meets that number.
    * If set to a function `(failureCount, error) => boolean` failed queries will retry until the function returns false.
    */
  var retry: js.UndefOr[RetryValue[TError]] = js.undefined
  
  var retryDelay: js.UndefOr[RetryDelayValue[TError]] = js.undefined
  
  /**
    * Set this to `false` to disable structural sharing between query results.
    * Defaults to `true`.
    */
  var structuralSharing: js.UndefOr[Boolean] = js.undefined
}
object QueryOptions {
  
  inline def apply[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](): QueryOptions[TQueryFnData, TError, TData, TQueryKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions[TQueryFnData, TError, TData, TQueryKey]]
  }
  
  extension [Self <: QueryOptions[?, ?, ?, ?], TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](x: Self & (QueryOptions[TQueryFnData, TError, TData, TQueryKey])) {
    
    inline def setBehavior(value: QueryBehavior[TQueryFnData, TError, TData, QueryKey]): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setCacheTime(value: Double): Self = StObject.set(x, "cacheTime", value.asInstanceOf[js.Any])
    
    inline def setCacheTimeUndefined: Self = StObject.set(x, "cacheTime", js.undefined)
    
    inline def setGetNextPageParam(value: (TQueryFnData, /* allPages */ js.Array[TQueryFnData]) => Any): Self = StObject.set(x, "getNextPageParam", js.Any.fromFunction2(value))
    
    inline def setGetNextPageParamUndefined: Self = StObject.set(x, "getNextPageParam", js.undefined)
    
    inline def setGetPreviousPageParam(value: (TQueryFnData, /* allPages */ js.Array[TQueryFnData]) => Any): Self = StObject.set(x, "getPreviousPageParam", js.Any.fromFunction2(value))
    
    inline def setGetPreviousPageParamUndefined: Self = StObject.set(x, "getPreviousPageParam", js.undefined)
    
    inline def setInitialData(value: TData | InitialDataFunction[TData]): Self = StObject.set(x, "initialData", value.asInstanceOf[js.Any])
    
    inline def setInitialDataFunction0(value: () => js.UndefOr[TData]): Self = StObject.set(x, "initialData", js.Any.fromFunction0(value))
    
    inline def setInitialDataUndefined: Self = StObject.set(x, "initialData", js.undefined)
    
    inline def setInitialDataUpdatedAt(value: Double | js.Function0[js.UndefOr[Double]]): Self = StObject.set(x, "initialDataUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setInitialDataUpdatedAtFunction0(value: () => js.UndefOr[Double]): Self = StObject.set(x, "initialDataUpdatedAt", js.Any.fromFunction0(value))
    
    inline def setInitialDataUpdatedAtUndefined: Self = StObject.set(x, "initialDataUpdatedAt", js.undefined)
    
    inline def setIsDataEqual(value: (/* oldData */ js.UndefOr[TData], /* newData */ TData) => Boolean): Self = StObject.set(x, "isDataEqual", js.Any.fromFunction2(value))
    
    inline def setIsDataEqualUndefined: Self = StObject.set(x, "isDataEqual", js.undefined)
    
    inline def setMeta(value: QueryMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setQueryFn(
      value: /* context */ QueryFunctionContext[TQueryKey, Any] => TQueryFnData | js.Promise[TQueryFnData]
    ): Self = StObject.set(x, "queryFn", js.Any.fromFunction1(value))
    
    inline def setQueryFnUndefined: Self = StObject.set(x, "queryFn", js.undefined)
    
    inline def setQueryHash(value: String): Self = StObject.set(x, "queryHash", value.asInstanceOf[js.Any])
    
    inline def setQueryHashUndefined: Self = StObject.set(x, "queryHash", js.undefined)
    
    inline def setQueryKey(value: TQueryKey): Self = StObject.set(x, "queryKey", value.asInstanceOf[js.Any])
    
    inline def setQueryKeyHashFn(value: TQueryKey => String): Self = StObject.set(x, "queryKeyHashFn", js.Any.fromFunction1(value))
    
    inline def setQueryKeyHashFnUndefined: Self = StObject.set(x, "queryKeyHashFn", js.undefined)
    
    inline def setQueryKeyUndefined: Self = StObject.set(x, "queryKey", js.undefined)
    
    inline def setRetry(value: RetryValue[TError]): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryDelay(value: RetryDelayValue[TError]): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayFunction2(value: (/* failureCount */ Double, TError) => Double): Self = StObject.set(x, "retryDelay", js.Any.fromFunction2(value))
    
    inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
    
    inline def setRetryFunction2(value: (/* failureCount */ Double, TError) => Boolean): Self = StObject.set(x, "retry", js.Any.fromFunction2(value))
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setStructuralSharing(value: Boolean): Self = StObject.set(x, "structuralSharing", value.asInstanceOf[js.Any])
    
    inline def setStructuralSharingUndefined: Self = StObject.set(x, "structuralSharing", js.undefined)
    
    inline def set_defaulted(value: Boolean): Self = StObject.set(x, "_defaulted", value.asInstanceOf[js.Any])
    
    inline def set_defaultedUndefined: Self = StObject.set(x, "_defaulted", js.undefined)
  }
}
