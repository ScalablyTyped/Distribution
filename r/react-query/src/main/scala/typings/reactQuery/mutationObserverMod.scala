package typings.reactQuery

import typings.reactQuery.mutationMod.Action
import typings.reactQuery.queryClientMod.QueryClient
import typings.reactQuery.subscribableMod.Subscribable
import typings.reactQuery.typesMod.MutateOptions
import typings.reactQuery.typesMod.MutationObserverOptions
import typings.reactQuery.typesMod.MutationObserverResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mutationObserverMod {
  
  @JSImport("react-query/types/core/mutationObserver", "MutationObserver")
  @js.native
  open class MutationObserver[TData, TError, TVariables, TContext] protected () extends Subscribable[MutationObserverListener[TData, TError, TVariables, TContext]] {
    def this(client: QueryClient, options: MutationObserverOptions[TData, TError, TVariables, TContext]) = this()
    
    /* protected */ def bindMethods(): Unit = js.native
    
    /* private */ var client: Any = js.native
    
    /* private */ var currentMutation: Any = js.native
    
    /* private */ var currentResult: Any = js.native
    
    def getCurrentResult(): MutationObserverResult[TData, TError, TVariables, TContext] = js.native
    
    def mutate(): js.Promise[TData] = js.native
    def mutate(variables: TVariables): js.Promise[TData] = js.native
    def mutate(variables: TVariables, options: MutateOptions[TData, TError, TVariables, TContext]): js.Promise[TData] = js.native
    def mutate(variables: Unit, options: MutateOptions[TData, TError, TVariables, TContext]): js.Promise[TData] = js.native
    
    /* private */ var mutateOptions: Any = js.native
    
    /* private */ @JSName("notify")
    var notify_FMutationObserver: Any = js.native
    
    def onMutationUpdate(action: Action[TData, TError, TVariables, TContext]): Unit = js.native
    
    var options: MutationObserverOptions[TData, TError, TVariables, TContext] = js.native
    
    def reset(): Unit = js.native
    
    def setOptions(): Unit = js.native
    def setOptions(options: MutationObserverOptions[TData, TError, TVariables, TContext]): Unit = js.native
    
    /* private */ var updateResult: Any = js.native
  }
  
  type MutationObserverListener[TData, TError, TVariables, TContext] = js.Function1[/* result */ MutationObserverResult[TData, TError, TVariables, TContext], Unit]
}
