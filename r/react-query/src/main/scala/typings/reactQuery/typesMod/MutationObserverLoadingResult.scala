package typings.reactQuery.typesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationObserverLoadingResult[TData, TError, TVariables, TContext]
  extends StObject
     with MutationObserverBaseResult[TData, TError, TVariables, TContext]
     with MutationObserverResult[TData, TError, TVariables, TContext] {
  
  @JSName("data")
  var data_MutationObserverLoadingResult: Unit
  
  @JSName("error")
  var error_MutationObserverLoadingResult: Null
  
  @JSName("isError")
  var isError_MutationObserverLoadingResult: `false`
  
  @JSName("isIdle")
  var isIdle_MutationObserverLoadingResult: `false`
  
  @JSName("isLoading")
  var isLoading_MutationObserverLoadingResult: `true`
  
  @JSName("isSuccess")
  var isSuccess_MutationObserverLoadingResult: `false`
  
  @JSName("status")
  var status_MutationObserverLoadingResult: loading
}
object MutationObserverLoadingResult {
  
  inline def apply[TData, TError, TVariables, TContext](
    data: Unit,
    error: Null,
    failureCount: Double,
    isPaused: Boolean,
    mutate: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData],
    reset: () => Unit
  ): MutationObserverLoadingResult[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], isError = false, isIdle = false, isLoading = true, isPaused = isPaused.asInstanceOf[js.Any], isSuccess = false, mutate = js.Any.fromFunction2(mutate), reset = js.Any.fromFunction0(reset), status = "loading")
    __obj.asInstanceOf[MutationObserverLoadingResult[TData, TError, TVariables, TContext]]
  }
  
  extension [Self <: MutationObserverLoadingResult[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutationObserverLoadingResult[TData, TError, TVariables, TContext])) {
    
    inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: Null): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsError(value: `false`): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setIsIdle(value: `false`): Self = StObject.set(x, "isIdle", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: `true`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsSuccess(value: `false`): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: loading): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
