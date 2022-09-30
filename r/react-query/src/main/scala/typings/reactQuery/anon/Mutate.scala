package typings.reactQuery.anon

import typings.reactQuery.reactTypesMod.UseMutateFunction
import typings.reactQuery.typesMod.MutateFunction
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mutate[TData, TError, TVariables, TContext] extends StObject {
  
  var mutate: UseMutateFunction[TData, TError, TVariables, TContext]
}
object Mutate {
  
  inline def apply[TData, TError, TVariables, TContext](mutate: /* args */ Parameters[MutateFunction[TData, TError, TVariables, TContext]] => Unit): Mutate[TData, TError, TVariables, TContext] = {
    val __obj = js.Dynamic.literal(mutate = js.Any.fromFunction1(mutate))
    __obj.asInstanceOf[Mutate[TData, TError, TVariables, TContext]]
  }
  
  extension [Self <: Mutate[?, ?, ?, ?], TData, TError, TVariables, TContext](x: Self & (Mutate[TData, TError, TVariables, TContext])) {
    
    inline def setMutate(value: /* args */ Parameters[MutateFunction[TData, TError, TVariables, TContext]] => Unit): Self = StObject.set(x, "mutate", js.Any.fromFunction1(value))
  }
}
