package typings.reactQuery.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactQuery.typesMod.MutationObserverIdleResult[TData, TError, TVariables, TContext]
  - typings.reactQuery.typesMod.MutationObserverLoadingResult[TData, TError, TVariables, TContext]
  - typings.reactQuery.typesMod.MutationObserverErrorResult[TData, TError, TVariables, TContext]
  - typings.reactQuery.typesMod.MutationObserverSuccessResult[TData, TError, TVariables, TContext]
*/
trait MutationObserverResult[TData, TError, TVariables, TContext] extends StObject
object MutationObserverResult {
  
  inline def MutationObserverErrorResult[TData, TError, TVariables, TContext](
    data: Unit,
    error: TError,
    failureCount: Double,
    isPaused: Boolean,
    mutate: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData],
    reset: () => Unit
  ): typings.reactQuery.typesMod.MutationObserverErrorResult[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], isError = true, isIdle = false, isLoading = false, isPaused = isPaused.asInstanceOf[js.Any], isSuccess = false, mutate = js.Any.fromFunction2(mutate), reset = js.Any.fromFunction0(reset), status = "error")
    __obj.asInstanceOf[typings.reactQuery.typesMod.MutationObserverErrorResult[TData, TError, TVariables, TContext]]
  }
  
  inline def MutationObserverIdleResult[TData, TError, TVariables, TContext](
    data: Unit,
    error: Null,
    failureCount: Double,
    isPaused: Boolean,
    mutate: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData],
    reset: () => Unit
  ): typings.reactQuery.typesMod.MutationObserverIdleResult[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], isError = false, isIdle = true, isLoading = false, isPaused = isPaused.asInstanceOf[js.Any], isSuccess = false, mutate = js.Any.fromFunction2(mutate), reset = js.Any.fromFunction0(reset), status = "idle")
    __obj.asInstanceOf[typings.reactQuery.typesMod.MutationObserverIdleResult[TData, TError, TVariables, TContext]]
  }
  
  inline def MutationObserverLoadingResult[TData, TError, TVariables, TContext](
    data: Unit,
    error: Null,
    failureCount: Double,
    isPaused: Boolean,
    mutate: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData],
    reset: () => Unit
  ): typings.reactQuery.typesMod.MutationObserverLoadingResult[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], isError = false, isIdle = false, isLoading = true, isPaused = isPaused.asInstanceOf[js.Any], isSuccess = false, mutate = js.Any.fromFunction2(mutate), reset = js.Any.fromFunction0(reset), status = "loading")
    __obj.asInstanceOf[typings.reactQuery.typesMod.MutationObserverLoadingResult[TData, TError, TVariables, TContext]]
  }
  
  inline def MutationObserverSuccessResult[TData, TError, TVariables, TContext](
    data: TData,
    error: Null,
    failureCount: Double,
    isPaused: Boolean,
    mutate: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData],
    reset: () => Unit
  ): typings.reactQuery.typesMod.MutationObserverSuccessResult[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], failureCount = failureCount.asInstanceOf[js.Any], isError = false, isIdle = false, isLoading = false, isPaused = isPaused.asInstanceOf[js.Any], isSuccess = true, mutate = js.Any.fromFunction2(mutate), reset = js.Any.fromFunction0(reset), status = "success")
    __obj.asInstanceOf[typings.reactQuery.typesMod.MutationObserverSuccessResult[TData, TError, TVariables, TContext]]
  }
}
