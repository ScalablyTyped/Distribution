package typings.reactQuery

import typings.reactQuery.queryClientMod.QueryClient
import typings.reactQuery.queryMod.Action
import typings.reactQuery.queryMod.Query
import typings.reactQuery.queryMod.QueryState
import typings.reactQuery.queryObserverMod.QueryObserver
import typings.reactQuery.reactQueryStrings.observerAdded
import typings.reactQuery.reactQueryStrings.observerRemoved
import typings.reactQuery.reactQueryStrings.observerResultsUpdated
import typings.reactQuery.reactQueryStrings.queryAdded
import typings.reactQuery.reactQueryStrings.queryRemoved
import typings.reactQuery.reactQueryStrings.queryUpdated
import typings.reactQuery.subscribableMod.Subscribable
import typings.reactQuery.typesMod.QueryKey
import typings.reactQuery.typesMod.QueryOptions
import typings.reactQuery.utilsMod.QueryFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryCacheMod {
  
  @JSImport("react-query/types/core/queryCache", "QueryCache")
  @js.native
  open class QueryCache () extends Subscribable[QueryCacheListener] {
    def this(config: QueryCacheConfig) = this()
    
    def add(query: Query[Any, Any, Any, Any]): Unit = js.native
    
    def build[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](client: QueryClient, options: QueryOptions[TQueryFnData, TError, TData, TQueryKey]): Query[TQueryFnData, TError, TData, TQueryKey] = js.native
    def build[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](
      client: QueryClient,
      options: QueryOptions[TQueryFnData, TError, TData, TQueryKey],
      state: QueryState[TData, TError]
    ): Query[TQueryFnData, TError, TData, TQueryKey] = js.native
    
    def clear(): Unit = js.native
    
    var config: QueryCacheConfig = js.native
    
    def find[TQueryFnData, TError, TData](arg1: QueryKey): js.UndefOr[Query[TQueryFnData, TError, TData, QueryKey]] = js.native
    def find[TQueryFnData, TError, TData](arg1: QueryKey, arg2: QueryFilters): js.UndefOr[Query[TQueryFnData, TError, TData, QueryKey]] = js.native
    
    def findAll(): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(arg1: QueryFilters, arg2: QueryFilters): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(filters: QueryFilters): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(queryKey: Unit, filters: QueryFilters): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(queryKey: QueryKey): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(queryKey: QueryKey, filters: QueryFilters): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    
    def get[TQueryFnData, TError, TData, TQueyKey /* <: QueryKey */](queryHash: String): js.UndefOr[Query[TQueryFnData, TError, TData, TQueyKey]] = js.native
    
    def getAll(): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    
    def notify(event: QueryCacheNotifyEvent): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onOnline(): Unit = js.native
    
    /* private */ var queries: Any = js.native
    
    /* private */ var queriesMap: Any = js.native
    
    def remove(query: Query[Any, Any, Any, Any]): Unit = js.native
  }
  
  trait NotifyEventObserverAdded
    extends StObject
       with QueryCacheNotifyEvent {
    
    var observer: QueryObserver[Any, Any, Any, Any, Any]
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: observerAdded
  }
  object NotifyEventObserverAdded {
    
    inline def apply(observer: QueryObserver[Any, Any, Any, Any, Any], query: Query[Any, Any, Any, Any]): NotifyEventObserverAdded = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerAdded")
      __obj.asInstanceOf[NotifyEventObserverAdded]
    }
    
    extension [Self <: NotifyEventObserverAdded](x: Self) {
      
      inline def setObserver(value: QueryObserver[Any, Any, Any, Any, Any]): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: observerAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventObserverRemoved
    extends StObject
       with QueryCacheNotifyEvent {
    
    var observer: QueryObserver[Any, Any, Any, Any, Any]
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: observerRemoved
  }
  object NotifyEventObserverRemoved {
    
    inline def apply(observer: QueryObserver[Any, Any, Any, Any, Any], query: Query[Any, Any, Any, Any]): NotifyEventObserverRemoved = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerRemoved")
      __obj.asInstanceOf[NotifyEventObserverRemoved]
    }
    
    extension [Self <: NotifyEventObserverRemoved](x: Self) {
      
      inline def setObserver(value: QueryObserver[Any, Any, Any, Any, Any]): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: observerRemoved): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventObserverResultsUpdated
    extends StObject
       with QueryCacheNotifyEvent {
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: observerResultsUpdated
  }
  object NotifyEventObserverResultsUpdated {
    
    inline def apply(query: Query[Any, Any, Any, Any]): NotifyEventObserverResultsUpdated = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerResultsUpdated")
      __obj.asInstanceOf[NotifyEventObserverResultsUpdated]
    }
    
    extension [Self <: NotifyEventObserverResultsUpdated](x: Self) {
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: observerResultsUpdated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventQueryAdded
    extends StObject
       with QueryCacheNotifyEvent {
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: queryAdded
  }
  object NotifyEventQueryAdded {
    
    inline def apply(query: Query[Any, Any, Any, Any]): NotifyEventQueryAdded = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryAdded")
      __obj.asInstanceOf[NotifyEventQueryAdded]
    }
    
    extension [Self <: NotifyEventQueryAdded](x: Self) {
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: queryAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventQueryRemoved
    extends StObject
       with QueryCacheNotifyEvent {
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: queryRemoved
  }
  object NotifyEventQueryRemoved {
    
    inline def apply(query: Query[Any, Any, Any, Any]): NotifyEventQueryRemoved = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryRemoved")
      __obj.asInstanceOf[NotifyEventQueryRemoved]
    }
    
    extension [Self <: NotifyEventQueryRemoved](x: Self) {
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: queryRemoved): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventQueryUpdated
    extends StObject
       with QueryCacheNotifyEvent {
    
    var action: Action[Any, Any]
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: queryUpdated
  }
  object NotifyEventQueryUpdated {
    
    inline def apply(action: Action[Any, Any], query: Query[Any, Any, Any, Any]): NotifyEventQueryUpdated = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryUpdated")
      __obj.asInstanceOf[NotifyEventQueryUpdated]
    }
    
    extension [Self <: NotifyEventQueryUpdated](x: Self) {
      
      inline def setAction(value: Action[Any, Any]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: queryUpdated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryCacheConfig extends StObject {
    
    var onError: js.UndefOr[js.Function2[/* error */ Any, /* query */ Query[Any, Any, Any, QueryKey], Unit]] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function2[/* data */ Any, /* query */ Query[Any, Any, Any, QueryKey], Unit]] = js.undefined
  }
  object QueryCacheConfig {
    
    inline def apply(): QueryCacheConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryCacheConfig]
    }
    
    extension [Self <: QueryCacheConfig](x: Self) {
      
      inline def setOnError(value: (/* error */ Any, /* query */ Query[Any, Any, Any, QueryKey]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSuccess(value: (/* data */ Any, /* query */ Query[Any, Any, Any, QueryKey]) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    }
  }
  
  type QueryCacheListener = js.Function1[/* event */ js.UndefOr[QueryCacheNotifyEvent], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactQuery.queryCacheMod.NotifyEventQueryAdded
    - typings.reactQuery.queryCacheMod.NotifyEventQueryRemoved
    - typings.reactQuery.queryCacheMod.NotifyEventQueryUpdated
    - typings.reactQuery.queryCacheMod.NotifyEventObserverAdded
    - typings.reactQuery.queryCacheMod.NotifyEventObserverRemoved
    - typings.reactQuery.queryCacheMod.NotifyEventObserverResultsUpdated
  */
  trait QueryCacheNotifyEvent extends StObject
  object QueryCacheNotifyEvent {
    
    inline def NotifyEventObserverAdded(observer: QueryObserver[Any, Any, Any, Any, Any], query: Query[Any, Any, Any, Any]): typings.reactQuery.queryCacheMod.NotifyEventObserverAdded = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerAdded")
      __obj.asInstanceOf[typings.reactQuery.queryCacheMod.NotifyEventObserverAdded]
    }
    
    inline def NotifyEventObserverRemoved(observer: QueryObserver[Any, Any, Any, Any, Any], query: Query[Any, Any, Any, Any]): typings.reactQuery.queryCacheMod.NotifyEventObserverRemoved = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerRemoved")
      __obj.asInstanceOf[typings.reactQuery.queryCacheMod.NotifyEventObserverRemoved]
    }
    
    inline def NotifyEventObserverResultsUpdated(query: Query[Any, Any, Any, Any]): typings.reactQuery.queryCacheMod.NotifyEventObserverResultsUpdated = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerResultsUpdated")
      __obj.asInstanceOf[typings.reactQuery.queryCacheMod.NotifyEventObserverResultsUpdated]
    }
    
    inline def NotifyEventQueryAdded(query: Query[Any, Any, Any, Any]): typings.reactQuery.queryCacheMod.NotifyEventQueryAdded = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryAdded")
      __obj.asInstanceOf[typings.reactQuery.queryCacheMod.NotifyEventQueryAdded]
    }
    
    inline def NotifyEventQueryRemoved(query: Query[Any, Any, Any, Any]): typings.reactQuery.queryCacheMod.NotifyEventQueryRemoved = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryRemoved")
      __obj.asInstanceOf[typings.reactQuery.queryCacheMod.NotifyEventQueryRemoved]
    }
    
    inline def NotifyEventQueryUpdated(action: Action[Any, Any], query: Query[Any, Any, Any, Any]): typings.reactQuery.queryCacheMod.NotifyEventQueryUpdated = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryUpdated")
      __obj.asInstanceOf[typings.reactQuery.queryCacheMod.NotifyEventQueryUpdated]
    }
  }
}
