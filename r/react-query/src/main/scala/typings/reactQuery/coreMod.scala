package typings.reactQuery

import typings.reactQuery.focusManagerMod.FocusManager_
import typings.reactQuery.hydrationMod.DehydrateOptions
import typings.reactQuery.hydrationMod.DehydratedState
import typings.reactQuery.hydrationMod.HydrateOptions
import typings.reactQuery.loggerMod.Logger
import typings.reactQuery.mutationCacheMod.MutationCacheConfig
import typings.reactQuery.mutationMod.MutationConfig
import typings.reactQuery.notifyManagerMod.NotifyManager_
import typings.reactQuery.onlineManagerMod.OnlineManager_
import typings.reactQuery.queryCacheMod.QueryCacheConfig
import typings.reactQuery.queryMod.QueryConfig
import typings.reactQuery.typesMod.CancelOptions
import typings.reactQuery.typesMod.InfiniteQueryObserverOptions
import typings.reactQuery.typesMod.MutationObserverOptions
import typings.reactQuery.typesMod.QueryClientConfig
import typings.reactQuery.typesMod.QueryKey
import typings.reactQuery.typesMod.QueryObserverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("react-query/types/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-query/types/core", "CancelledError")
  @js.native
  open class CancelledError ()
    extends typings.reactQuery.retryerMod.CancelledError {
    def this(options: CancelOptions) = this()
  }
  
  @JSImport("react-query/types/core", "InfiniteQueryObserver")
  @js.native
  open class InfiniteQueryObserver[TQueryFnData, TError, TData, TQueryData] protected ()
    extends typings.reactQuery.infiniteQueryObserverMod.InfiniteQueryObserver[TQueryFnData, TError, TData, TQueryData] {
    def this(
      client: typings.reactQuery.queryClientMod.QueryClient,
      options: InfiniteQueryObserverOptions[TQueryFnData, TError, TData, TQueryData, QueryKey]
    ) = this()
  }
  
  @JSImport("react-query/types/core", "Mutation")
  @js.native
  open class Mutation[TData, TError, TVariables, TContext] protected ()
    extends typings.reactQuery.mutationMod.Mutation[TData, TError, TVariables, TContext] {
    def this(config: MutationConfig[TData, TError, TVariables, TContext]) = this()
  }
  
  @JSImport("react-query/types/core", "MutationCache")
  @js.native
  open class MutationCache ()
    extends typings.reactQuery.mutationCacheMod.MutationCache {
    def this(config: MutationCacheConfig) = this()
  }
  
  @JSImport("react-query/types/core", "MutationObserver")
  @js.native
  open class MutationObserver[TData, TError, TVariables, TContext] protected ()
    extends typings.reactQuery.mutationObserverMod.MutationObserver[TData, TError, TVariables, TContext] {
    def this(
      client: typings.reactQuery.queryClientMod.QueryClient,
      options: MutationObserverOptions[TData, TError, TVariables, TContext]
    ) = this()
  }
  
  @JSImport("react-query/types/core", "QueriesObserver")
  @js.native
  open class QueriesObserver protected ()
    extends typings.reactQuery.queriesObserverMod.QueriesObserver {
    def this(client: typings.reactQuery.queryClientMod.QueryClient) = this()
    def this(
      client: typings.reactQuery.queryClientMod.QueryClient,
      queries: js.Array[QueryObserverOptions[Any, Any, Any, Any, QueryKey]]
    ) = this()
  }
  
  @JSImport("react-query/types/core", "Query")
  @js.native
  open class Query[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] protected ()
    extends typings.reactQuery.queryMod.Query[TQueryFnData, TError, TData, TQueryKey] {
    def this(config: QueryConfig[TQueryFnData, TError, TData, TQueryKey]) = this()
  }
  
  @JSImport("react-query/types/core", "QueryCache")
  @js.native
  open class QueryCache ()
    extends typings.reactQuery.queryCacheMod.QueryCache {
    def this(config: QueryCacheConfig) = this()
  }
  
  @JSImport("react-query/types/core", "QueryClient")
  @js.native
  open class QueryClient ()
    extends typings.reactQuery.queryClientMod.QueryClient {
    def this(config: QueryClientConfig) = this()
  }
  
  @JSImport("react-query/types/core", "QueryObserver")
  @js.native
  open class QueryObserver[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */] protected ()
    extends typings.reactQuery.queryObserverMod.QueryObserver[TQueryFnData, TError, TData, TQueryData, TQueryKey] {
    def this(
      client: typings.reactQuery.queryClientMod.QueryClient,
      options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]
    ) = this()
  }
  
  inline def dehydrate(client: typings.reactQuery.queryClientMod.QueryClient): DehydratedState = ^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any]).asInstanceOf[DehydratedState]
  inline def dehydrate(client: typings.reactQuery.queryClientMod.QueryClient, options: DehydrateOptions): DehydratedState = (^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DehydratedState]
  
  @JSImport("react-query/types/core", "focusManager")
  @js.native
  val focusManager: FocusManager_ = js.native
  
  inline def hashQueryKey(queryKey: QueryKey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashQueryKey")(queryKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hydrate(client: typings.reactQuery.queryClientMod.QueryClient, dehydratedState: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(
    client: typings.reactQuery.queryClientMod.QueryClient,
    dehydratedState: Any,
    options: HydrateOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isCancelledError(value: Any): /* is react-query.react-query/types/core/retryer.CancelledError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelledError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-query.react-query/types/core/retryer.CancelledError */ Boolean]
  
  inline def isError(value: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  @JSImport("react-query/types/core", "notifyManager")
  @js.native
  val notifyManager: NotifyManager_ = js.native
  
  @JSImport("react-query/types/core", "onlineManager")
  @js.native
  val onlineManager: OnlineManager_ = js.native
  
  inline def setLogger(newLogger: Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(newLogger.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
