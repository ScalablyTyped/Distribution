package typings.reactQuery.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationObserverOptions[TData, TError, TVariables, TContext]
  extends StObject
     with MutationOptions[TData, TError, TVariables, TContext] {
  
  var useErrorBoundary: js.UndefOr[Boolean | (js.Function1[/* error */ TError, Boolean])] = js.undefined
}
object MutationObserverOptions {
  
  inline def apply[TData, TError, TVariables, TContext](): MutationObserverOptions[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationObserverOptions[TData, TError, TVariables, TContext]]
  }
  
  extension [Self <: MutationObserverOptions[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutationObserverOptions[TData, TError, TVariables, TContext])) {
    
    inline def setUseErrorBoundary(value: Boolean | (js.Function1[/* error */ TError, Boolean])): Self = StObject.set(x, "useErrorBoundary", value.asInstanceOf[js.Any])
    
    inline def setUseErrorBoundaryFunction1(value: /* error */ TError => Boolean): Self = StObject.set(x, "useErrorBoundary", js.Any.fromFunction1(value))
    
    inline def setUseErrorBoundaryUndefined: Self = StObject.set(x, "useErrorBoundary", js.undefined)
  }
}
