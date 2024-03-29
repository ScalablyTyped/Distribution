package typings.reactQuery

import typings.reactQuery.anon.Mutations
import typings.reactQuery.typesCoreMutationMod.Mutation
import typings.reactQuery.typesCoreMutationMod.MutationState
import typings.reactQuery.typesCoreQueryClientMod.QueryClient
import typings.reactQuery.typesCoreQueryMod.Query
import typings.reactQuery.typesCoreQueryMod.QueryState
import typings.reactQuery.typesCoreTypesMod.MutationKey
import typings.reactQuery.typesCoreTypesMod.QueryKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreHydrationMod {
  
  @JSImport("react-query/types/core/hydration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dehydrate(client: QueryClient): DehydratedState = ^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any]).asInstanceOf[DehydratedState]
  inline def dehydrate(client: QueryClient, options: DehydrateOptions): DehydratedState = (^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DehydratedState]
  
  inline def hydrate(client: QueryClient, dehydratedState: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(client: QueryClient, dehydratedState: Any, options: HydrateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DehydrateOptions extends StObject {
    
    var dehydrateMutations: js.UndefOr[Boolean] = js.undefined
    
    var dehydrateQueries: js.UndefOr[Boolean] = js.undefined
    
    var shouldDehydrateMutation: js.UndefOr[ShouldDehydrateMutationFunction] = js.undefined
    
    var shouldDehydrateQuery: js.UndefOr[ShouldDehydrateQueryFunction] = js.undefined
  }
  object DehydrateOptions {
    
    inline def apply(): DehydrateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DehydrateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DehydrateOptions] (val x: Self) extends AnyVal {
      
      inline def setDehydrateMutations(value: Boolean): Self = StObject.set(x, "dehydrateMutations", value.asInstanceOf[js.Any])
      
      inline def setDehydrateMutationsUndefined: Self = StObject.set(x, "dehydrateMutations", js.undefined)
      
      inline def setDehydrateQueries(value: Boolean): Self = StObject.set(x, "dehydrateQueries", value.asInstanceOf[js.Any])
      
      inline def setDehydrateQueriesUndefined: Self = StObject.set(x, "dehydrateQueries", js.undefined)
      
      inline def setShouldDehydrateMutation(value: /* mutation */ Mutation[Any, Any, Unit, Any] => Boolean): Self = StObject.set(x, "shouldDehydrateMutation", js.Any.fromFunction1(value))
      
      inline def setShouldDehydrateMutationUndefined: Self = StObject.set(x, "shouldDehydrateMutation", js.undefined)
      
      inline def setShouldDehydrateQuery(value: /* query */ Query[Any, Any, Any, QueryKey] => Boolean): Self = StObject.set(x, "shouldDehydrateQuery", js.Any.fromFunction1(value))
      
      inline def setShouldDehydrateQueryUndefined: Self = StObject.set(x, "shouldDehydrateQuery", js.undefined)
    }
  }
  
  trait DehydratedMutation extends StObject {
    
    var mutationKey: js.UndefOr[MutationKey] = js.undefined
    
    var state: MutationState[Any, Any, Unit, Any]
  }
  object DehydratedMutation {
    
    inline def apply(state: MutationState[Any, Any, Unit, Any]): DehydratedMutation = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DehydratedMutation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DehydratedMutation] (val x: Self) extends AnyVal {
      
      inline def setMutationKey(value: MutationKey): Self = StObject.set(x, "mutationKey", value.asInstanceOf[js.Any])
      
      inline def setMutationKeyUndefined: Self = StObject.set(x, "mutationKey", js.undefined)
      
      inline def setMutationKeyVarargs(value: Any*): Self = StObject.set(x, "mutationKey", js.Array(value*))
      
      inline def setState(value: MutationState[Any, Any, Unit, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait DehydratedQuery extends StObject {
    
    var queryHash: String
    
    var queryKey: QueryKey
    
    var state: QueryState[Any, Any]
  }
  object DehydratedQuery {
    
    inline def apply(queryHash: String, queryKey: QueryKey, state: QueryState[Any, Any]): DehydratedQuery = {
      val __obj = js.Dynamic.literal(queryHash = queryHash.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DehydratedQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DehydratedQuery] (val x: Self) extends AnyVal {
      
      inline def setQueryHash(value: String): Self = StObject.set(x, "queryHash", value.asInstanceOf[js.Any])
      
      inline def setQueryKey(value: QueryKey): Self = StObject.set(x, "queryKey", value.asInstanceOf[js.Any])
      
      inline def setQueryKeyVarargs(value: Any*): Self = StObject.set(x, "queryKey", js.Array(value*))
      
      inline def setState(value: QueryState[Any, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait DehydratedState extends StObject {
    
    var mutations: js.Array[DehydratedMutation]
    
    var queries: js.Array[DehydratedQuery]
  }
  object DehydratedState {
    
    inline def apply(mutations: js.Array[DehydratedMutation], queries: js.Array[DehydratedQuery]): DehydratedState = {
      val __obj = js.Dynamic.literal(mutations = mutations.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any])
      __obj.asInstanceOf[DehydratedState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DehydratedState] (val x: Self) extends AnyVal {
      
      inline def setMutations(value: js.Array[DehydratedMutation]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
      
      inline def setMutationsVarargs(value: DehydratedMutation*): Self = StObject.set(x, "mutations", js.Array(value*))
      
      inline def setQueries(value: js.Array[DehydratedQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesVarargs(value: DehydratedQuery*): Self = StObject.set(x, "queries", js.Array(value*))
    }
  }
  
  trait HydrateOptions extends StObject {
    
    var defaultOptions: js.UndefOr[Mutations] = js.undefined
  }
  object HydrateOptions {
    
    inline def apply(): HydrateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HydrateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HydrateOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultOptions(value: Mutations): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    }
  }
  
  type ShouldDehydrateMutationFunction = js.Function1[/* mutation */ Mutation[Any, Any, Unit, Any], Boolean]
  
  type ShouldDehydrateQueryFunction = js.Function1[/* query */ Query[Any, Any, Any, QueryKey], Boolean]
}
