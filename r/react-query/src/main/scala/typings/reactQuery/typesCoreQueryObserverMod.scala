package typings.reactQuery

import typings.reactQuery.typesCoreQueryClientMod.QueryClient
import typings.reactQuery.typesCoreQueryMod.Action
import typings.reactQuery.typesCoreQueryMod.FetchOptions
import typings.reactQuery.typesCoreQueryMod.Query
import typings.reactQuery.typesCoreSubscribableMod.Subscribable
import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesCoreTypesMod.QueryObserverOptions
import typings.reactQuery.typesCoreTypesMod.QueryObserverResult
import typings.reactQuery.typesCoreTypesMod.RefetchOptions
import typings.reactQuery.typesCoreTypesMod.RefetchQueryFilters
import typings.reactQuery.typesCoreTypesMod.ResultOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreQueryObserverMod {
  
  @JSImport("react-query/types/core/queryObserver", "QueryObserver")
  @js.native
  open class QueryObserver[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */] protected () extends Subscribable[QueryObserverListener[TData, TError]] {
    def this(
      client: QueryClient,
      options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]
    ) = this()
    
    /* protected */ def bindMethods(): Unit = js.native
    
    /* private */ var clearRefetchInterval: Any = js.native
    
    /* private */ var clearStaleTimeout: Any = js.native
    
    /* private */ var clearTimers: Any = js.native
    
    /* private */ var client: Any = js.native
    
    /* private */ var computeRefetchInterval: Any = js.native
    
    /* protected */ def createResult(
      query: Query[TQueryFnData, TError, TQueryData, TQueryKey],
      options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]
    ): QueryObserverResult[TData, TError] = js.native
    
    /* private */ var currentQuery: Any = js.native
    
    /* private */ var currentQueryInitialState: Any = js.native
    
    /* private */ var currentRefetchInterval: Any = js.native
    
    /* private */ var currentResult: Any = js.native
    
    /* private */ var currentResultOptions: Any = js.native
    
    /* private */ var currentResultState: Any = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ var executeFetch: Any = js.native
    
    /* protected */ def fetch(): js.Promise[QueryObserverResult[TData, TError]] = js.native
    /* protected */ def fetch(fetchOptions: ObserverFetchOptions): js.Promise[QueryObserverResult[TData, TError]] = js.native
    
    def fetchOptimistic(options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]): js.Promise[QueryObserverResult[TData, TError]] = js.native
    
    def getCurrentQuery(): Query[TQueryFnData, TError, TQueryData, TQueryKey] = js.native
    
    def getCurrentResult(): QueryObserverResult[TData, TError] = js.native
    
    def getNextResult(): js.Promise[QueryObserverResult[TData, TError]] = js.native
    def getNextResult(options: ResultOptions): js.Promise[QueryObserverResult[TData, TError]] = js.native
    
    def getOptimisticResult(options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]): QueryObserverResult[TData, TError] = js.native
    
    /* private */ @JSName("notify")
    var notify_FQueryObserver: Any = js.native
    
    def onQueryUpdate(action: Action[TData, TError]): Unit = js.native
    
    var options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey] = js.native
    
    /* private */ var previousQueryResult: Any = js.native
    
    def refetch[TPageData](): js.Promise[QueryObserverResult[TData, TError]] = js.native
    def refetch[TPageData](options: RefetchOptions & RefetchQueryFilters[TPageData]): js.Promise[QueryObserverResult[TData, TError]] = js.native
    
    /* private */ var refetchIntervalId: Any = js.native
    
    def remove(): Unit = js.native
    
    /* private */ var selectError: Any = js.native
    
    /* private */ var selectFn: Any = js.native
    
    /* private */ var selectResult: Any = js.native
    
    def setOptions(): Unit = js.native
    def setOptions(options: Unit, notifyOptions: NotifyOptions): Unit = js.native
    def setOptions(options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]): Unit = js.native
    def setOptions(
      options: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey],
      notifyOptions: NotifyOptions
    ): Unit = js.native
    
    def shouldFetchOnReconnect(): Boolean = js.native
    
    def shouldFetchOnWindowFocus(): Boolean = js.native
    
    /* private */ var shouldNotifyListeners: Any = js.native
    
    /* private */ var staleTimeoutId: Any = js.native
    
    def trackResult(
      result: QueryObserverResult[TData, TError],
      defaultedOptions: QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]
    ): QueryObserverResult[TData, TError] = js.native
    
    /* private */ var trackedProps: Any = js.native
    
    /* private */ var updateQuery: Any = js.native
    
    /* private */ var updateRefetchInterval: Any = js.native
    
    def updateResult(): Unit = js.native
    def updateResult(notifyOptions: NotifyOptions): Unit = js.native
    
    /* private */ var updateStaleTimeout: Any = js.native
    
    /* private */ var updateTimers: Any = js.native
  }
  
  trait NotifyOptions extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var listeners: js.UndefOr[Boolean] = js.undefined
    
    var onError: js.UndefOr[Boolean] = js.undefined
    
    var onSuccess: js.UndefOr[Boolean] = js.undefined
  }
  object NotifyOptions {
    
    inline def apply(): NotifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotifyOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setListeners(value: Boolean): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setOnError(value: Boolean): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSuccess(value: Boolean): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    }
  }
  
  trait ObserverFetchOptions
    extends StObject
       with FetchOptions {
    
    var throwOnError: js.UndefOr[Boolean] = js.undefined
  }
  object ObserverFetchOptions {
    
    inline def apply(): ObserverFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObserverFetchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObserverFetchOptions] (val x: Self) extends AnyVal {
      
      inline def setThrowOnError(value: Boolean): Self = StObject.set(x, "throwOnError", value.asInstanceOf[js.Any])
      
      inline def setThrowOnErrorUndefined: Self = StObject.set(x, "throwOnError", js.undefined)
    }
  }
  
  type QueryObserverListener[TData, TError] = js.Function1[/* result */ QueryObserverResult[TData, TError], Unit]
}
