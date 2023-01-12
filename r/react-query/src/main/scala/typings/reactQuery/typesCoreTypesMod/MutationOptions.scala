package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.typesCoreRetryerMod.RetryDelayValue
import typings.reactQuery.typesCoreRetryerMod.RetryValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationOptions[TData, TError, TVariables, TContext] extends StObject {
  
  var _defaulted: js.UndefOr[Boolean] = js.undefined
  
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
  
  var variables: js.UndefOr[TVariables] = js.undefined
}
object MutationOptions {
  
  inline def apply[TData, TError, TVariables, TContext](): MutationOptions[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationOptions[TData, TError, TVariables, TContext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutationOptions[?, ?, ?, ?], TData, TError, TVariables, TContext] (val x: Self & (MutationOptions[TData, TError, TVariables, TContext])) extends AnyVal {
    
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
    
    inline def setVariables(value: TVariables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def set_defaulted(value: Boolean): Self = StObject.set(x, "_defaulted", value.asInstanceOf[js.Any])
    
    inline def set_defaultedUndefined: Self = StObject.set(x, "_defaulted", js.undefined)
  }
}
