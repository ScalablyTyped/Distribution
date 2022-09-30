package typings.reactQuery

import typings.reactQuery.mutationCacheMod.MutationCache
import typings.reactQuery.queryCacheMod.QueryCache
import typings.reactQuery.queryMod.QueryState
import typings.reactQuery.typesMod.CancelOptions
import typings.reactQuery.typesMod.DefaultOptions
import typings.reactQuery.typesMod.FetchInfiniteQueryOptions
import typings.reactQuery.typesMod.FetchQueryOptions
import typings.reactQuery.typesMod.InfiniteData
import typings.reactQuery.typesMod.InvalidateOptions
import typings.reactQuery.typesMod.InvalidateQueryFilters
import typings.reactQuery.typesMod.MutationKey
import typings.reactQuery.typesMod.MutationObserverOptions
import typings.reactQuery.typesMod.MutationOptions
import typings.reactQuery.typesMod.QueryClientConfig
import typings.reactQuery.typesMod.QueryFunction
import typings.reactQuery.typesMod.QueryKey
import typings.reactQuery.typesMod.QueryObserverOptions
import typings.reactQuery.typesMod.RefetchOptions
import typings.reactQuery.typesMod.RefetchQueryFilters
import typings.reactQuery.typesMod.ResetOptions
import typings.reactQuery.typesMod.ResetQueryFilters
import typings.reactQuery.typesMod.SetDataOptions
import typings.reactQuery.utilsMod.MutationFilters
import typings.reactQuery.utilsMod.QueryFilters
import typings.reactQuery.utilsMod.Updater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryClientMod {
  
  @JSImport("react-query/types/core/queryClient", "QueryClient")
  @js.native
  open class QueryClient () extends StObject {
    def this(config: QueryClientConfig) = this()
    
    def cancelMutations(): js.Promise[Unit] = js.native
    
    def cancelQueries(): js.Promise[Unit] = js.native
    def cancelQueries(filters: Unit, options: CancelOptions): js.Promise[Unit] = js.native
    def cancelQueries(filters: QueryFilters): js.Promise[Unit] = js.native
    def cancelQueries(filters: QueryFilters, options: CancelOptions): js.Promise[Unit] = js.native
    def cancelQueries(queryKey: Unit, filters: Unit, options: CancelOptions): js.Promise[Unit] = js.native
    def cancelQueries(queryKey: Unit, filters: QueryFilters): js.Promise[Unit] = js.native
    def cancelQueries(queryKey: Unit, filters: QueryFilters, options: CancelOptions): js.Promise[Unit] = js.native
    def cancelQueries(queryKey: QueryKey): js.Promise[Unit] = js.native
    def cancelQueries(queryKey: QueryKey, filters: Unit, options: CancelOptions): js.Promise[Unit] = js.native
    def cancelQueries(queryKey: QueryKey, filters: QueryFilters): js.Promise[Unit] = js.native
    def cancelQueries(queryKey: QueryKey, filters: QueryFilters, options: CancelOptions): js.Promise[Unit] = js.native
    
    def clear(): Unit = js.native
    
    def defaultMutationOptions[T /* <: MutationOptions[Any, Any, Any, Any] */](): T = js.native
    def defaultMutationOptions[T /* <: MutationOptions[Any, Any, Any, Any] */](options: T): T = js.native
    
    /* private */ var defaultOptions: Any = js.native
    
    def defaultQueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */](): QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey] = js.native
    def defaultQueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */](options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]): QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey] = js.native
    
    def defaultQueryOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */](): QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey] = js.native
    def defaultQueryOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */](options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]): QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey] = js.native
    
    def executeMutation[TData, TError, TVariables, TContext](options: MutationOptions[TData, TError, TVariables, TContext]): js.Promise[TData] = js.native
    
    def fetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: String): js.Promise[InfiniteData[TData]] = js.native
    def fetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: String, options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, String]): js.Promise[InfiniteData[TData]] = js.native
    def fetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: String, queryFn: QueryFunction[TQueryFnData, String]): js.Promise[InfiniteData[TData]] = js.native
    def fetchInfiniteQuery[TQueryFnData, TError, TData](
      queryKey: String,
      queryFn: QueryFunction[TQueryFnData, String],
      options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, String]
    ): js.Promise[InfiniteData[TData]] = js.native
    def fetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any]): js.Promise[InfiniteData[TData]] = js.native
    def fetchInfiniteQuery[TQueryFnData, TError, TData](
      queryKey: js.Array[Any],
      options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, js.Array[Any]]
    ): js.Promise[InfiniteData[TData]] = js.native
    def fetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], queryFn: QueryFunction[TQueryFnData, js.Array[Any]]): js.Promise[InfiniteData[TData]] = js.native
    def fetchInfiniteQuery[TQueryFnData, TError, TData](
      queryKey: js.Array[Any],
      queryFn: QueryFunction[TQueryFnData, js.Array[Any]],
      options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, js.Array[Any]]
    ): js.Promise[InfiniteData[TData]] = js.native
    def fetchInfiniteQuery[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryKey]): js.Promise[InfiniteData[TData]] = js.native
    
    def fetchQuery[TQueryFnData, TError, TData](queryKey: String): js.Promise[TData] = js.native
    def fetchQuery[TQueryFnData, TError, TData](queryKey: String, options: FetchQueryOptions[TQueryFnData, TError, TData, String]): js.Promise[TData] = js.native
    def fetchQuery[TQueryFnData, TError, TData](queryKey: String, queryFn: QueryFunction[TQueryFnData, String]): js.Promise[TData] = js.native
    def fetchQuery[TQueryFnData, TError, TData](
      queryKey: String,
      queryFn: QueryFunction[TQueryFnData, String],
      options: FetchQueryOptions[TQueryFnData, TError, TData, String]
    ): js.Promise[TData] = js.native
    def fetchQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any]): js.Promise[TData] = js.native
    def fetchQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], options: FetchQueryOptions[TQueryFnData, TError, TData, js.Array[Any]]): js.Promise[TData] = js.native
    def fetchQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], queryFn: QueryFunction[TQueryFnData, js.Array[Any]]): js.Promise[TData] = js.native
    def fetchQuery[TQueryFnData, TError, TData](
      queryKey: js.Array[Any],
      queryFn: QueryFunction[TQueryFnData, js.Array[Any]],
      options: FetchQueryOptions[TQueryFnData, TError, TData, js.Array[Any]]
    ): js.Promise[TData] = js.native
    def fetchQuery[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](options: FetchQueryOptions[TQueryFnData, TError, TData, TQueryKey]): js.Promise[TData] = js.native
    
    def getDefaultOptions(): DefaultOptions[Any] = js.native
    
    def getMutationCache(): MutationCache = js.native
    
    def getMutationDefaults(): js.UndefOr[MutationObserverOptions[Any, Any, Any, Any]] = js.native
    def getMutationDefaults(mutationKey: MutationKey): js.UndefOr[MutationObserverOptions[Any, Any, Any, Any]] = js.native
    
    def getQueriesData[TData](filters: QueryFilters): js.Array[js.Tuple2[QueryKey, TData]] = js.native
    def getQueriesData[TData](queryKey: QueryKey): js.Array[js.Tuple2[QueryKey, TData]] = js.native
    
    def getQueryCache(): QueryCache = js.native
    
    def getQueryData[TData](queryKey: QueryKey): js.UndefOr[TData] = js.native
    def getQueryData[TData](queryKey: QueryKey, filters: QueryFilters): js.UndefOr[TData] = js.native
    
    def getQueryDefaults(): js.UndefOr[QueryObserverOptions[Any, Any, Any, Any, Any]] = js.native
    def getQueryDefaults(queryKey: QueryKey): js.UndefOr[QueryObserverOptions[Any, Any, Any, Any, Any]] = js.native
    
    def getQueryState[TData, TError](queryKey: QueryKey): js.UndefOr[QueryState[TData, TError]] = js.native
    def getQueryState[TData, TError](queryKey: QueryKey, filters: QueryFilters): js.UndefOr[QueryState[TData, TError]] = js.native
    
    def invalidateQueries[TPageData](): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](filters: Unit, options: InvalidateOptions): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](filters: InvalidateQueryFilters[TPageData]): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](filters: InvalidateQueryFilters[TPageData], options: InvalidateOptions): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](queryKey: Unit, filters: Unit, options: InvalidateOptions): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](queryKey: Unit, filters: InvalidateQueryFilters[TPageData]): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](queryKey: Unit, filters: InvalidateQueryFilters[TPageData], options: InvalidateOptions): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](queryKey: QueryKey): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](queryKey: QueryKey, filters: Unit, options: InvalidateOptions): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](queryKey: QueryKey, filters: InvalidateQueryFilters[TPageData]): js.Promise[Unit] = js.native
    def invalidateQueries[TPageData](queryKey: QueryKey, filters: InvalidateQueryFilters[TPageData], options: InvalidateOptions): js.Promise[Unit] = js.native
    
    def isFetching(): Double = js.native
    def isFetching(filters: QueryFilters): Double = js.native
    def isFetching(queryKey: Unit, filters: QueryFilters): Double = js.native
    def isFetching(queryKey: QueryKey): Double = js.native
    def isFetching(queryKey: QueryKey, filters: QueryFilters): Double = js.native
    
    def isMutating(): Double = js.native
    def isMutating(filters: MutationFilters): Double = js.native
    
    def mount(): Unit = js.native
    
    /* private */ var mutationCache: Any = js.native
    
    /* private */ var mutationDefaults: Any = js.native
    
    def prefetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: String): js.Promise[Unit] = js.native
    def prefetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: String, options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, String]): js.Promise[Unit] = js.native
    def prefetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: String, queryFn: QueryFunction[TQueryFnData, String]): js.Promise[Unit] = js.native
    def prefetchInfiniteQuery[TQueryFnData, TError, TData](
      queryKey: String,
      queryFn: QueryFunction[TQueryFnData, String],
      options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, String]
    ): js.Promise[Unit] = js.native
    def prefetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any]): js.Promise[Unit] = js.native
    def prefetchInfiniteQuery[TQueryFnData, TError, TData](
      queryKey: js.Array[Any],
      options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, js.Array[Any]]
    ): js.Promise[Unit] = js.native
    def prefetchInfiniteQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], queryFn: QueryFunction[TQueryFnData, js.Array[Any]]): js.Promise[Unit] = js.native
    def prefetchInfiniteQuery[TQueryFnData, TError, TData](
      queryKey: js.Array[Any],
      queryFn: QueryFunction[TQueryFnData, js.Array[Any]],
      options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, js.Array[Any]]
    ): js.Promise[Unit] = js.native
    def prefetchInfiniteQuery[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](options: FetchInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryKey]): js.Promise[Unit] = js.native
    
    def prefetchQuery[TQueryFnData, TError, TData](queryKey: String): js.Promise[Unit] = js.native
    def prefetchQuery[TQueryFnData, TError, TData](queryKey: String, options: FetchQueryOptions[TQueryFnData, TError, TData, String]): js.Promise[Unit] = js.native
    def prefetchQuery[TQueryFnData, TError, TData](queryKey: String, queryFn: QueryFunction[TQueryFnData, String]): js.Promise[Unit] = js.native
    def prefetchQuery[TQueryFnData, TError, TData](
      queryKey: String,
      queryFn: QueryFunction[TQueryFnData, String],
      options: FetchQueryOptions[TQueryFnData, TError, TData, String]
    ): js.Promise[Unit] = js.native
    def prefetchQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any]): js.Promise[Unit] = js.native
    def prefetchQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], options: FetchQueryOptions[TQueryFnData, TError, TData, js.Array[Any]]): js.Promise[Unit] = js.native
    def prefetchQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], queryFn: QueryFunction[TQueryFnData, js.Array[Any]]): js.Promise[Unit] = js.native
    def prefetchQuery[TQueryFnData, TError, TData](
      queryKey: js.Array[Any],
      queryFn: QueryFunction[TQueryFnData, js.Array[Any]],
      options: FetchQueryOptions[TQueryFnData, TError, TData, js.Array[Any]]
    ): js.Promise[Unit] = js.native
    def prefetchQuery[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](options: FetchQueryOptions[TQueryFnData, TError, TData, TQueryKey]): js.Promise[Unit] = js.native
    
    /* private */ var queryCache: Any = js.native
    
    /* private */ var queryDefaults: Any = js.native
    
    def refetchQueries[TPageData](): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](filters: Unit, options: RefetchOptions): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](filters: RefetchQueryFilters[TPageData]): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](filters: RefetchQueryFilters[TPageData], options: RefetchOptions): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](queryKey: Unit, filters: Unit, options: RefetchOptions): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](queryKey: Unit, filters: RefetchQueryFilters[TPageData]): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](queryKey: Unit, filters: RefetchQueryFilters[TPageData], options: RefetchOptions): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](queryKey: QueryKey): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](queryKey: QueryKey, filters: Unit, options: RefetchOptions): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](queryKey: QueryKey, filters: RefetchQueryFilters[TPageData]): js.Promise[Unit] = js.native
    def refetchQueries[TPageData](queryKey: QueryKey, filters: RefetchQueryFilters[TPageData], options: RefetchOptions): js.Promise[Unit] = js.native
    
    def removeQueries(): Unit = js.native
    def removeQueries(filters: QueryFilters): Unit = js.native
    def removeQueries(queryKey: Unit, filters: QueryFilters): Unit = js.native
    def removeQueries(queryKey: QueryKey): Unit = js.native
    def removeQueries(queryKey: QueryKey, filters: QueryFilters): Unit = js.native
    
    def resetQueries[TPageData](): js.Promise[Unit] = js.native
    def resetQueries[TPageData](filters: Unit, options: ResetOptions): js.Promise[Unit] = js.native
    def resetQueries[TPageData](filters: ResetQueryFilters[TPageData]): js.Promise[Unit] = js.native
    def resetQueries[TPageData](filters: ResetQueryFilters[TPageData], options: ResetOptions): js.Promise[Unit] = js.native
    def resetQueries[TPageData](queryKey: Unit, filters: Unit, options: ResetOptions): js.Promise[Unit] = js.native
    def resetQueries[TPageData](queryKey: Unit, filters: ResetQueryFilters[TPageData]): js.Promise[Unit] = js.native
    def resetQueries[TPageData](queryKey: Unit, filters: ResetQueryFilters[TPageData], options: ResetOptions): js.Promise[Unit] = js.native
    def resetQueries[TPageData](queryKey: QueryKey): js.Promise[Unit] = js.native
    def resetQueries[TPageData](queryKey: QueryKey, filters: Unit, options: ResetOptions): js.Promise[Unit] = js.native
    def resetQueries[TPageData](queryKey: QueryKey, filters: ResetQueryFilters[TPageData]): js.Promise[Unit] = js.native
    def resetQueries[TPageData](queryKey: QueryKey, filters: ResetQueryFilters[TPageData], options: ResetOptions): js.Promise[Unit] = js.native
    
    def resumePausedMutations(): js.Promise[Unit] = js.native
    
    def setDefaultOptions(options: DefaultOptions[Any]): Unit = js.native
    
    def setMutationDefaults(mutationKey: MutationKey, options: MutationObserverOptions[Any, Any, Any, Any]): Unit = js.native
    
    def setQueriesData[TData](filters: QueryFilters, updater: Updater[js.UndefOr[TData], TData]): js.Array[js.Tuple2[QueryKey, TData]] = js.native
    def setQueriesData[TData](filters: QueryFilters, updater: Updater[js.UndefOr[TData], TData], options: SetDataOptions): js.Array[js.Tuple2[QueryKey, TData]] = js.native
    def setQueriesData[TData](queryKey: QueryKey, updater: Updater[js.UndefOr[TData], TData]): js.Array[js.Tuple2[QueryKey, TData]] = js.native
    def setQueriesData[TData](queryKey: QueryKey, updater: Updater[js.UndefOr[TData], TData], options: SetDataOptions): js.Array[js.Tuple2[QueryKey, TData]] = js.native
    
    def setQueryData[TData](queryKey: QueryKey, updater: Updater[js.UndefOr[TData], TData]): TData = js.native
    def setQueryData[TData](queryKey: QueryKey, updater: Updater[js.UndefOr[TData], TData], options: SetDataOptions): TData = js.native
    
    def setQueryDefaults(queryKey: QueryKey, options: QueryObserverOptions[Any, Any, Any, Any, QueryKey]): Unit = js.native
    
    def unmount(): Unit = js.native
    
    /* private */ var unsubscribeFocus: Any = js.native
    
    /* private */ var unsubscribeOnline: Any = js.native
  }
}
