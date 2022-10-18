package typings.reactQuery.typesCoreQueryMod

import typings.reactQuery.typesCoreTypesMod.QueryStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryState[TData, TError] extends StObject {
  
  var data: js.UndefOr[TData] = js.undefined
  
  var dataUpdateCount: Double
  
  var dataUpdatedAt: Double
  
  var error: TError | Null
  
  var errorUpdateCount: Double
  
  var errorUpdatedAt: Double
  
  var fetchFailureCount: Double
  
  var fetchMeta: Any
  
  var isFetching: Boolean
  
  var isInvalidated: Boolean
  
  var isPaused: Boolean
  
  var status: QueryStatus
}
object QueryState {
  
  inline def apply[TData, TError](
    dataUpdateCount: Double,
    dataUpdatedAt: Double,
    errorUpdateCount: Double,
    errorUpdatedAt: Double,
    fetchFailureCount: Double,
    fetchMeta: Any,
    isFetching: Boolean,
    isInvalidated: Boolean,
    isPaused: Boolean,
    status: QueryStatus
  ): QueryState[TData, TError] = {
    val __obj = js.Dynamic.literal(dataUpdateCount = dataUpdateCount.asInstanceOf[js.Any], dataUpdatedAt = dataUpdatedAt.asInstanceOf[js.Any], errorUpdateCount = errorUpdateCount.asInstanceOf[js.Any], errorUpdatedAt = errorUpdatedAt.asInstanceOf[js.Any], fetchFailureCount = fetchFailureCount.asInstanceOf[js.Any], fetchMeta = fetchMeta.asInstanceOf[js.Any], isFetching = isFetching.asInstanceOf[js.Any], isInvalidated = isInvalidated.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[QueryState[TData, TError]]
  }
  
  extension [Self <: QueryState[?, ?], TData, TError](x: Self & (QueryState[TData, TError])) {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataUpdateCount(value: Double): Self = StObject.set(x, "dataUpdateCount", value.asInstanceOf[js.Any])
    
    inline def setDataUpdatedAt(value: Double): Self = StObject.set(x, "dataUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setError(value: TError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUpdateCount(value: Double): Self = StObject.set(x, "errorUpdateCount", value.asInstanceOf[js.Any])
    
    inline def setErrorUpdatedAt(value: Double): Self = StObject.set(x, "errorUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setFetchFailureCount(value: Double): Self = StObject.set(x, "fetchFailureCount", value.asInstanceOf[js.Any])
    
    inline def setFetchMeta(value: Any): Self = StObject.set(x, "fetchMeta", value.asInstanceOf[js.Any])
    
    inline def setIsFetching(value: Boolean): Self = StObject.set(x, "isFetching", value.asInstanceOf[js.Any])
    
    inline def setIsInvalidated(value: Boolean): Self = StObject.set(x, "isInvalidated", value.asInstanceOf[js.Any])
    
    inline def setIsPaused(value: Boolean): Self = StObject.set(x, "isPaused", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: QueryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
