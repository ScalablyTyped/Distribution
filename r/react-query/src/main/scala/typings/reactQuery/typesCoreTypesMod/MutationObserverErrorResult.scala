package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationObserverErrorResult[TData, TError, TVariables, TContext]
  extends StObject
     with MutationObserverBaseResult[TData, TError, TVariables, TContext]
     with MutationObserverResult[TData, TError, TVariables, TContext] {
  
  @JSName("data")
  var data_MutationObserverErrorResult: Unit
  
  @JSName("error")
  var error_MutationObserverErrorResult: TError
  
  @JSName("isError")
  var isError_MutationObserverErrorResult: `true`
  
  @JSName("isIdle")
  var isIdle_MutationObserverErrorResult: `false`
  
  @JSName("isLoading")
  var isLoading_MutationObserverErrorResult: `false`
  
  @JSName("isSuccess")
  var isSuccess_MutationObserverErrorResult: `false`
  
  @JSName("status")
  var status_MutationObserverErrorResult: error
}
object MutationObserverErrorResult {
  
  inline def apply[TData, TError, TVariables, TContext](
    data: Unit,
    error: TError,
    failureCount: Double,
    isPaused: Boolean,
    mutate: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData],
    reset: () => Unit
  ): MutationObserverErrorResult[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], isError = true, isIdle = false, isLoading = false, isPaused = isPaused.asInstanceOf[js.Any], isSuccess = false, mutate = js.Any.fromFunction2(mutate), reset = js.Any.fromFunction0(reset), status = "error")
    __obj.asInstanceOf[MutationObserverErrorResult[TData, TError, TVariables, TContext]]
  }
  
  extension [Self <: MutationObserverErrorResult[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutationObserverErrorResult[TData, TError, TVariables, TContext])) {
    
    inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: TError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsError(value: `true`): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setIsIdle(value: `false`): Self = StObject.set(x, "isIdle", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: `false`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsSuccess(value: `false`): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
