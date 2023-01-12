package typings.reactQuery

import typings.reactQuery.anon.Mutate
import typings.reactQuery.anon.MutateAsync
import typings.reactQuery.typesCoreRetryerMod.RetryDelayValue
import typings.reactQuery.typesCoreRetryerMod.RetryValue
import typings.reactQuery.typesCoreTypesMod.InfiniteQueryObserverOptions
import typings.reactQuery.typesCoreTypesMod.InfiniteQueryObserverResult
import typings.reactQuery.typesCoreTypesMod.MutateFunction
import typings.reactQuery.typesCoreTypesMod.MutationFunction
import typings.reactQuery.typesCoreTypesMod.MutationKey
import typings.reactQuery.typesCoreTypesMod.MutationMeta
import typings.reactQuery.typesCoreTypesMod.MutationObserverResult
import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesCoreTypesMod.QueryObserverOptions
import typings.reactQuery.typesCoreTypesMod.QueryObserverResult
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactTypesMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof A ]: K extends keyof B? B[K] : A[K]}
    }}}
    */
  @js.native
  trait Override[A, B] extends StObject
  
  type UseBaseMutationResult[TData, TError, TVariables, TContext] = (Override[
    MutationObserverResult[TData, TError, TVariables, TContext], 
    Mutate[TData, TError, TVariables, TContext]
  ]) & (MutateAsync[TData, TError, TVariables, TContext])
  
  type UseBaseQueryOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */] = QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]
  
  type UseBaseQueryResult[TData, TError] = QueryObserverResult[TData, TError]
  
  type UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */] = InfiniteQueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]
  
  type UseInfiniteQueryResult[TData, TError] = InfiniteQueryObserverResult[TData, TError]
  
  type UseMutateAsyncFunction[TData, TError, TVariables, TContext] = MutateFunction[TData, TError, TVariables, TContext]
  
  type UseMutateFunction[TData, TError, TVariables, TContext] = js.Function1[/* args */ Parameters[MutateFunction[TData, TError, TVariables, TContext]], Unit]
  
  /* Inlined parent std.Omit<react-query.react-query/types/core/types.MutationObserverOptions<TData, TError, TVariables, TContext>, '_defaulted' | 'variables'> */
  trait UseMutationOptions[TData, TError, TVariables, TContext] extends StObject {
    
    var meta: js.UndefOr[MutationMeta] = js.undefined
    
    var mutationFn: js.UndefOr[MutationFunction[TData, TVariables]] = js.undefined
    
    var mutationKey: js.UndefOr[MutationKey] = js.undefined
    
    var onError: js.UndefOr[
        js.Function3[
          /* error */ TError, 
          /* variables */ TVariables, 
          /* context */ js.UndefOr[TContext], 
          js.Promise[Any] | Unit
        ]
      ] = js.undefined
    
    var onMutate: js.UndefOr[
        js.Function1[
          /* variables */ TVariables, 
          js.UndefOr[js.Promise[js.UndefOr[TContext]] | TContext]
        ]
      ] = js.undefined
    
    var onSettled: js.UndefOr[
        js.Function4[
          /* data */ js.UndefOr[TData], 
          /* error */ TError | Null, 
          /* variables */ TVariables, 
          /* context */ js.UndefOr[TContext], 
          js.Promise[Any] | Unit
        ]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[
        js.Function3[
          /* data */ TData, 
          /* variables */ TVariables, 
          /* context */ js.UndefOr[TContext], 
          js.Promise[Any] | Unit
        ]
      ] = js.undefined
    
    var retry: js.UndefOr[RetryValue[TError]] = js.undefined
    
    var retryDelay: js.UndefOr[RetryDelayValue[TError]] = js.undefined
    
    var useErrorBoundary: js.UndefOr[Boolean | (js.Function1[/* error */ TError, Boolean])] = js.undefined
  }
  object UseMutationOptions {
    
    inline def apply[TData, TError, TVariables, TContext](): UseMutationOptions[TData, TError, TVariables, TContext] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseMutationOptions[TData, TError, TVariables, TContext]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseMutationOptions[?, ?, ?, ?], TData, TError, TVariables, TContext] (val x: Self & (UseMutationOptions[TData, TError, TVariables, TContext])) extends AnyVal {
      
      inline def setMeta(value: MutationMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMutationFn(value: TVariables => js.Promise[TData]): Self = StObject.set(x, "mutationFn", js.Any.fromFunction1(value))
      
      inline def setMutationFnUndefined: Self = StObject.set(x, "mutationFn", js.undefined)
      
      inline def setMutationKey(value: MutationKey): Self = StObject.set(x, "mutationKey", value.asInstanceOf[js.Any])
      
      inline def setMutationKeyUndefined: Self = StObject.set(x, "mutationKey", js.undefined)
      
      inline def setMutationKeyVarargs(value: Any*): Self = StObject.set(x, "mutationKey", js.Array(value*))
      
      inline def setOnError(
        value: (/* error */ TError, /* variables */ TVariables, /* context */ js.UndefOr[TContext]) => js.Promise[Any] | Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnMutate(value: /* variables */ TVariables => js.UndefOr[js.Promise[js.UndefOr[TContext]] | TContext]): Self = StObject.set(x, "onMutate", js.Any.fromFunction1(value))
      
      inline def setOnMutateUndefined: Self = StObject.set(x, "onMutate", js.undefined)
      
      inline def setOnSettled(
        value: (/* data */ js.UndefOr[TData], /* error */ TError | Null, /* variables */ TVariables, /* context */ js.UndefOr[TContext]) => js.Promise[Any] | Unit
      ): Self = StObject.set(x, "onSettled", js.Any.fromFunction4(value))
      
      inline def setOnSettledUndefined: Self = StObject.set(x, "onSettled", js.undefined)
      
      inline def setOnSuccess(
        value: (/* data */ TData, /* variables */ TVariables, /* context */ js.UndefOr[TContext]) => js.Promise[Any] | Unit
      ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setRetry(value: RetryValue[TError]): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryDelay(value: RetryDelayValue[TError]): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayFunction2(value: (/* failureCount */ Double, TError) => Double): Self = StObject.set(x, "retryDelay", js.Any.fromFunction2(value))
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryFunction2(value: (/* failureCount */ Double, TError) => Boolean): Self = StObject.set(x, "retry", js.Any.fromFunction2(value))
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setUseErrorBoundary(value: Boolean | (js.Function1[/* error */ TError, Boolean])): Self = StObject.set(x, "useErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def setUseErrorBoundaryFunction1(value: /* error */ TError => Boolean): Self = StObject.set(x, "useErrorBoundary", js.Any.fromFunction1(value))
      
      inline def setUseErrorBoundaryUndefined: Self = StObject.set(x, "useErrorBoundary", js.undefined)
    }
  }
  
  type UseMutationResult[TData, TError, TVariables, TContext] = UseBaseMutationResult[TData, TError, TVariables, TContext]
  
  type UseQueryOptions[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] = UseBaseQueryOptions[TQueryFnData, TError, TData, TQueryFnData, TQueryKey]
  
  type UseQueryResult[TData, TError] = UseBaseQueryResult[TData, TError]
}
