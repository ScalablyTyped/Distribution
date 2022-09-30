package typings.reactQuery.anon

import typings.reactQuery.reactTypesMod.UseMutateAsyncFunction
import typings.reactQuery.typesMod.MutateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutateAsync[TData, TError, TVariables, TContext] extends StObject {
  
  var mutateAsync: UseMutateAsyncFunction[TData, TError, TVariables, TContext]
}
object MutateAsync {
  
  inline def apply[TData, TError, TVariables, TContext](
    mutateAsync: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData]
  ): MutateAsync[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(mutateAsync = js.Any.fromFunction2(mutateAsync))
    __obj.asInstanceOf[MutateAsync[TData, TError, TVariables, TContext]]
  }
  
  extension [Self <: MutateAsync[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (MutateAsync[TData, TError, TVariables, TContext])) {
    
    inline def setMutateAsync(
      value: (TVariables, /* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]]) => js.Promise[TData]
    ): Self = StObject.set(x, "mutateAsync", js.Any.fromFunction2(value))
  }
}
