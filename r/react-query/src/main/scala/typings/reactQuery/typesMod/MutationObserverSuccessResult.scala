package typings.reactQuery.typesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationObserverSuccessResult[TData, TError, TVariables, TContext]
  extends StObject
     with MutationObserverBaseResult[TData, TError, TVariables, TContext]
     with MutationObserverResult[TData, TError, TVariables, TContext] {
  
  @JSName("data")
  var data_MutationObserverSuccessResult: TData
  
  @JSName("error")
  var error_MutationObserverSuccessResult: Null
  
  @JSName("isError")
  var isError_MutationObserverSuccessResult: `false`
  
  @JSName("isIdle")
  var isIdle_MutationObserverSuccessResult: `false`
  
  @JSName("isLoading")
  var isLoading_MutationObserverSuccessResult: `false`
  
  @JSName("isSuccess")
  var isSuccess_MutationObserverSuccessResult: `true`
  
  @JSName("status")
  var status_MutationObserverSuccessResult: success
}
object MutationObserverSuccessResult {
  
  inline def apply[TData, TError, TVariables, TContext](
    data: TData,
    error: Null,
    failureCount: Double,
    isPaused: Boolean,
    mutate: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData],
    reset: () => Unit
  ): MutationObserverSuccessResult[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], isError = false, isIdle = false, isLoading = false, isPaused = isPaused.asInstanceOf[js.Any], isSuccess = true, mutate = js.Any.fromFunction2(mutate), reset = js.Any.fromFunction0(reset), status = "success")
    __obj.asInstanceOf[MutationObserverSuccessResult[TData, TError, TVariables, TContext]]
  }
  
  extension [Self <: MutationObserverSuccessResult[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutationObserverSuccessResult[TData, TError, TVariables, TContext])) {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: Null): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsError(value: `false`): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setIsIdle(value: `false`): Self = StObject.set(x, "isIdle", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: `false`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsSuccess(value: `true`): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
