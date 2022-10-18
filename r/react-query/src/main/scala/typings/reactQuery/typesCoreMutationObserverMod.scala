package typings.reactQuery

import typings.reactQuery.typesCoreMutationMod.Action
import typings.reactQuery.typesCoreQueryClientMod.QueryClient
import typings.reactQuery.typesCoreSubscribableMod.Subscribable
import typings.reactQuery.typesCoreTypesMod.MutateOptions
import typings.reactQuery.typesCoreTypesMod.MutationObserverOptions
import typings.reactQuery.typesCoreTypesMod.MutationObserverResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreMutationObserverMod {
  
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
