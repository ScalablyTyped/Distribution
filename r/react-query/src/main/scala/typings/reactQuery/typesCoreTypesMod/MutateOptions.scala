package typings.reactQuery.typesCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutateOptions[TData, TError, TVariables, TContext] extends StObject {
  
  var onError: js.UndefOr[
    js.Function3[
      /* error */ TError, 
      /* variables */ TVariables, 
      /* context */ js.UndefOr[TContext], 
      js.Promise[Any] | Unit
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
      /* context */ TContext, 
      js.Promise[Any] | Unit
    ]
  ] = js.undefined
}
object MutateOptions {
  
  inline def apply[TData, TError, TVariables, TContext](): MutateOptions[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateOptions[TData, TError, TVariables, TContext]]
  }
  
  extension [Self <: MutateOptions[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutateOptions[TData, TError, TVariables, TContext])) {
    
    inline def setOnError(
      value: (/* error */ TError, /* variables */ TVariables, /* context */ js.UndefOr[TContext]) => js.Promise[Any] | Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSettled(
      value: (/* data */ js.UndefOr[TData], /* error */ TError | Null, /* variables */ TVariables, /* context */ js.UndefOr[TContext]) => js.Promise[Any] | Unit
    ): Self = StObject.set(x, "onSettled", js.Any.fromFunction4(value))
    
    inline def setOnSettledUndefined: Self = StObject.set(x, "onSettled", js.undefined)
    
    inline def setOnSuccess(
      value: (/* data */ TData, /* variables */ TVariables, /* context */ TContext) => js.Promise[Any] | Unit
    ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
