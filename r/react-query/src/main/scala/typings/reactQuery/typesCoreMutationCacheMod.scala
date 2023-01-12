package typings.reactQuery

import typings.reactQuery.typesCoreMutationMod.Mutation
import typings.reactQuery.typesCoreMutationMod.MutationState
import typings.reactQuery.typesCoreQueryClientMod.QueryClient
import typings.reactQuery.typesCoreSubscribableMod.Subscribable
import typings.reactQuery.typesCoreTypesMod.MutationOptions
import typings.reactQuery.typesCoreUtilsMod.MutationFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreMutationCacheMod {
  
  @JSImport("react-query/types/core/mutationCache", "MutationCache")
  @js.native
  open class MutationCache () extends Subscribable[MutationCacheListener] {
    def this(config: MutationCacheConfig) = this()
    
    def add(mutation: Mutation[Any, Any, Any, Any]): Unit = js.native
    
    def build[TData, TError, TVariables, TContext](client: QueryClient, options: MutationOptions[TData, TError, TVariables, TContext]): Mutation[TData, TError, TVariables, TContext] = js.native
    def build[TData, TError, TVariables, TContext](
      client: QueryClient,
      options: MutationOptions[TData, TError, TVariables, TContext],
      state: MutationState[TData, TError, TVariables, TContext]
    ): Mutation[TData, TError, TVariables, TContext] = js.native
    
    def clear(): Unit = js.native
    
    var config: MutationCacheConfig = js.native
    
    def find[TData, TError, TVariables, TContext](filters: MutationFilters): js.UndefOr[Mutation[TData, TError, TVariables, TContext]] = js.native
    
    def findAll(filters: MutationFilters): js.Array[Mutation[Any, Any, Unit, Any]] = js.native
    
    def getAll(): js.Array[Mutation[Any, Any, Unit, Any]] = js.native
    
    /* private */ var mutationId: Any = js.native
    
    /* private */ var mutations: Any = js.native
    
    def notify(mutation: Mutation[Any, Any, Any, Any]): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onOnline(): Unit = js.native
    
    def remove(mutation: Mutation[Any, Any, Any, Any]): Unit = js.native
    
    def resumePausedMutations(): js.Promise[Unit] = js.native
  }
  
  trait MutationCacheConfig extends StObject {
    
    var onError: js.UndefOr[
        js.Function4[
          /* error */ Any, 
          /* variables */ Any, 
          /* context */ Any, 
          /* mutation */ Mutation[Any, Any, Any, Any], 
          Unit
        ]
      ] = js.undefined
    
    var onMutate: js.UndefOr[
        js.Function2[/* variables */ Any, /* mutation */ Mutation[Any, Any, Any, Any], Unit]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[
        js.Function4[
          /* data */ Any, 
          /* variables */ Any, 
          /* context */ Any, 
          /* mutation */ Mutation[Any, Any, Any, Any], 
          Unit
        ]
      ] = js.undefined
  }
  object MutationCacheConfig {
    
    inline def apply(): MutationCacheConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutationCacheConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MutationCacheConfig] (val x: Self) extends AnyVal {
      
      inline def setOnError(
        value: (/* error */ Any, /* variables */ Any, /* context */ Any, /* mutation */ Mutation[Any, Any, Any, Any]) => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnMutate(value: (/* variables */ Any, /* mutation */ Mutation[Any, Any, Any, Any]) => Unit): Self = StObject.set(x, "onMutate", js.Any.fromFunction2(value))
      
      inline def setOnMutateUndefined: Self = StObject.set(x, "onMutate", js.undefined)
      
      inline def setOnSuccess(
        value: (/* data */ Any, /* variables */ Any, /* context */ Any, /* mutation */ Mutation[Any, Any, Any, Any]) => Unit
      ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction4(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    }
  }
  
  type MutationCacheListener = js.Function1[/* mutation */ js.UndefOr[Mutation[Any, Any, Unit, Any]], Unit]
}
