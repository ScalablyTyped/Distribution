package typings.reactQuery.typesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryBooleans.`true`
import typings.reactQuery.reactQueryStrings.idle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationObserverIdleResult[TData, TError, TVariables, TContext]
  extends StObject
     with MutationObserverBaseResult[TData, TError, TVariables, TContext]
     with MutationObserverResult[TData, TError, TVariables, TContext] {
  
  @JSName("data")
  var data_MutationObserverIdleResult: Unit
  
  @JSName("error")
  var error_MutationObserverIdleResult: Null
  
  @JSName("isError")
  var isError_MutationObserverIdleResult: `false`
  
  @JSName("isIdle")
  var isIdle_MutationObserverIdleResult: `true`
  
  @JSName("isLoading")
  var isLoading_MutationObserverIdleResult: `false`
  
  @JSName("isSuccess")
  var isSuccess_MutationObserverIdleResult: `false`
  
  @JSName("status")
  var status_MutationObserverIdleResult: idle
}
object MutationObserverIdleResult {
  
  inline def apply[TData, TError, TVariables, TContext](
    data: Unit,
    error: Null,
    failureCount: Double,
    isPaused: Boolean,
    mutate: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData],
    reset: () => Unit
  ): MutationObserverIdleResult[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], isError = false, isIdle = true, isLoading = false, isPaused = isPaused.asInstanceOf[js.Any], isSuccess = false, mutate = js.Any.fromFunction2(mutate), reset = js.Any.fromFunction0(reset), status = "idle")
    __obj.asInstanceOf[MutationObserverIdleResult[TData, TError, TVariables, TContext]]
  }
  
  extension [Self <: MutationObserverIdleResult[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutationObserverIdleResult[TData, TError, TVariables, TContext])) {
    
    inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: Null): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsError(value: `false`): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    inline def setIsIdle(value: `true`): Self = StObject.set(x, "isIdle", value.asInstanceOf[js.Any])
    
    inline def setIsLoading(value: `false`): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsSuccess(value: `false`): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: idle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
