package typings.reactQuery.typesCoreQueryMod

import typings.reactQuery.typesCoreQueryObserverMod.QueryObserver
import typings.reactQuery.typesCoreTypesMod.CancelOptions
import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesCoreTypesMod.QueryMeta
import typings.reactQuery.typesCoreTypesMod.QueryOptions
import typings.reactQuery.typesCoreTypesMod.SetDataOptions
import typings.reactQuery.typesCoreUtilsMod.Updater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-query/types/core/query", "Query")
@js.native
open class Query[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] protected () extends StObject {
  def this(config: QueryConfig[TQueryFnData, TError, TData, TQueryKey]) = this()
  
  /* private */ var abortSignalConsumed: Any = js.native
  
  def addObserver(observer: QueryObserver[Any, Any, Any, Any, Any]): Unit = js.native
  
  /* private */ var cache: Any = js.native
  
  var cacheTime: Double = js.native
  
  def cancel(): js.Promise[Unit] = js.native
  def cancel(options: CancelOptions): js.Promise[Unit] = js.native
  
  /* private */ var clearGcTimeout: Any = js.native
  
  /* private */ var defaultOptions: Any = js.native
  
  def destroy(): Unit = js.native
  
  /* private */ var dispatch: Any = js.native
  
  def fetch(): js.Promise[TData] = js.native
  def fetch(options: Unit, fetchOptions: FetchOptions): js.Promise[TData] = js.native
  def fetch(options: QueryOptions[TQueryFnData, TError, TData, TQueryKey]): js.Promise[TData] = js.native
  def fetch(options: QueryOptions[TQueryFnData, TError, TData, TQueryKey], fetchOptions: FetchOptions): js.Promise[TData] = js.native
  
  /* private */ var gcTimeout: Any = js.native
  
  /* protected */ def getDefaultState(options: QueryOptions[TQueryFnData, TError, TData, TQueryKey]): QueryState[TData, TError] = js.native
  
  def getObserversCount(): Double = js.native
  
  /* private */ var hadObservers: Any = js.native
  
  var initialState: QueryState[TData, TError] = js.native
  
  def invalidate(): Unit = js.native
  
  def isActive(): Boolean = js.native
  
  def isFetching(): Boolean = js.native
  
  def isStale(): Boolean = js.native
  
  def isStaleByTime(): Boolean = js.native
  def isStaleByTime(staleTime: Double): Boolean = js.native
  
  var meta: js.UndefOr[QueryMeta] = js.native
  
  /* private */ var observers: Any = js.native
  
  def onFocus(): Unit = js.native
  
  def onOnline(): Unit = js.native
  
  /* private */ var optionalRemove: Any = js.native
  
  var options: QueryOptions[TQueryFnData, TError, TData, TQueryKey] = js.native
  
  /* private */ var promise: Any = js.native
  
  var queryHash: String = js.native
  
  var queryKey: TQueryKey = js.native
  
  /* protected */ def reducer(state: QueryState[TData, TError], action: Action[TData, TError]): QueryState[TData, TError] = js.native
  
  def removeObserver(observer: QueryObserver[Any, Any, Any, Any, Any]): Unit = js.native
  
  def reset(): Unit = js.native
  
  /* private */ var retryer: Any = js.native
  
  var revertState: js.UndefOr[QueryState[TData, TError]] = js.native
  
  /* private */ var scheduleGc: Any = js.native
  
  def setData(updater: Updater[js.UndefOr[TData], TData]): TData = js.native
  def setData(updater: Updater[js.UndefOr[TData], TData], options: SetDataOptions): TData = js.native
  
  def setDefaultOptions(options: QueryOptions[TQueryFnData, TError, TData, TQueryKey]): Unit = js.native
  
  /* private */ var setOptions: Any = js.native
  
  def setState(state: QueryState[TData, TError]): Unit = js.native
  def setState(state: QueryState[TData, TError], setStateOptions: SetStateOptions): Unit = js.native
  
  var state: QueryState[TData, TError] = js.native
}
