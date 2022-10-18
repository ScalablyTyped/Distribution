package typings.reactQuery

import typings.reactQuery.typesCoreFocusManagerMod.FocusManager_
import typings.reactQuery.typesCoreHydrationMod.DehydrateOptions
import typings.reactQuery.typesCoreHydrationMod.DehydratedState
import typings.reactQuery.typesCoreHydrationMod.HydrateOptions
import typings.reactQuery.typesCoreLoggerMod.Logger
import typings.reactQuery.typesCoreMutationCacheMod.MutationCacheConfig
import typings.reactQuery.typesCoreMutationMod.MutationConfig
import typings.reactQuery.typesCoreNotifyManagerMod.NotifyManager_
import typings.reactQuery.typesCoreOnlineManagerMod.OnlineManager_
import typings.reactQuery.typesCoreQueryCacheMod.QueryCacheConfig
import typings.reactQuery.typesCoreQueryMod.QueryConfig
import typings.reactQuery.typesCoreTypesMod.CancelOptions
import typings.reactQuery.typesCoreTypesMod.InfiniteQueryObserverOptions
import typings.reactQuery.typesCoreTypesMod.MutationObserverOptions
import typings.reactQuery.typesCoreTypesMod.QueryClientConfig
import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesCoreTypesMod.QueryObserverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreMod {
  
  @JSImport("react-query/types/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-query/types/core", "CancelledError")
  @js.native
  open class CancelledError ()
    extends typings.reactQuery.typesCoreRetryerMod.CancelledError {
    def this(options: CancelOptions) = this()
  }
  
  @JSImport("react-query/types/core", "InfiniteQueryObserver")
  @js.native
  open class InfiniteQueryObserver[TQueryFnData, TError, TData, TQueryData] protected ()
    extends typings.reactQuery.typesCoreInfiniteQueryObserverMod.InfiniteQueryObserver[TQueryFnData, TError, TData, TQueryData] {
    def this(
      client: typings.reactQuery.typesCoreQueryClientMod.QueryClient,
      options: InfiniteQueryObserverOptions[TQueryFnData, TError, TData, TQueryData, QueryKey]
    ) = this()
  }
  
  @JSImport("react-query/types/core", "Mutation")
  @js.native
  open class Mutation[TData, TError, TVariables, TContext] protected ()
    extends typings.reactQuery.typesCoreMutationMod.Mutation[TData, TError, TVariables, TContext] {
    def this(config: MutationConfig[TData, TError, TVariables, TContext]) = this()
  }
  
  @JSImport("react-query/types/core", "MutationCache")
  @js.native
  open class MutationCache ()
    extends typings.reactQuery.typesCoreMutationCacheMod.MutationCache {
    def this(config: MutationCacheConfig) = this()
  }
  
  @JSImport("react-query/types/core", "MutationObserver")
  @js.native
  open class MutationObserver[TData, TError, TVariables, TContext] protected ()
    extends typings.reactQuery.typesCoreMutationObserverMod.MutationObserver[TData, TError, TVariables, TContext] {
    def this(
      client: typings.reactQuery.typesCoreQueryClientMod.QueryClient,
      options: MutationObserverOptions[TData, TError, TVariables, TContext]
    ) = this()
  }
  
  @JSImport("react-query/types/core", "QueriesObserver")
  @js.native
  open class QueriesObserver protected ()
    extends typings.reactQuery.typesCoreQueriesObserverMod.QueriesObserver {
    def this(client: typings.reactQuery.typesCoreQueryClientMod.QueryClient) = this()
    def this(
      client: typings.reactQuery.typesCoreQueryClientMod.QueryClient,
      queries: js.Array[QueryObserverOptions[Any, Any, Any, Any, QueryKey]]
    ) = this()
  }
  
  @JSImport("react-query/types/core", "Query")
  @js.native
  open class Query[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] protected ()
    extends typings.reactQuery.typesCoreQueryMod.Query[TQueryFnData, TError, TData, TQueryKey] {
    def this(config: QueryConfig[TQueryFnData, TError, TData, TQueryKey]) = this()
  }
  
  @JSImport("react-query/types/core", "QueryCache")
  @js.native
  open class QueryCache ()
    extends typings.reactQuery.typesCoreQueryCacheMod.QueryCache {
    def this(config: QueryCacheConfig) = this()
  }
  
  @JSImport("react-query/types/core", "QueryClient")
  @js.native
  open class QueryClient ()
    extends typings.reactQuery.typesCoreQueryClientMod.QueryClient {
    def this(config: QueryClientConfig) = this()
  }
  
  @JSImport("react-query/types/core", "QueryObserver")
  @js.native
  open class QueryObserver[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */] protected ()
    extends typings.reactQuery.typesCoreQueryObserverMod.QueryObserver[TQueryFnData, TError, TData, TQueryData, TQueryKey] {
    def this(
      client: typings.reactQuery.typesCoreQueryClientMod.QueryClient,
      options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]
    ) = this()
  }
  
  inline def dehydrate(client: typings.reactQuery.typesCoreQueryClientMod.QueryClient): DehydratedState = ^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any]).asInstanceOf[DehydratedState]
  inline def dehydrate(client: typings.reactQuery.typesCoreQueryClientMod.QueryClient, options: DehydrateOptions): DehydratedState = (^.asInstanceOf[js.Dynamic].applyDynamic("dehydrate")(client.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DehydratedState]
  
  @JSImport("react-query/types/core", "focusManager")
  @js.native
  val focusManager: FocusManager_ = js.native
  
  inline def hashQueryKey(queryKey: QueryKey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashQueryKey")(queryKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hydrate(client: typings.reactQuery.typesCoreQueryClientMod.QueryClient, dehydratedState: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(client.asInstanceOf[js.Any], dehydratedState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(
    client: typings.reactQuery.typesCoreQueryClientMod.QueryClient,
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
