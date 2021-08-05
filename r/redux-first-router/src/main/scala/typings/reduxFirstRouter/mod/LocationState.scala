package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationState[TKeys, TState] extends StObject {
  
  var hasSSR: js.UndefOr[Boolean] = js.undefined
  
  var history: Nullable[HistoryData]
  
  var kind: Nullable[String]
  
  var pathname: String
  
  var payload: Payload
  
  var prev: Location
  
  var query: js.UndefOr[Query] = js.undefined
  
  var routesMap: RoutesMap[TKeys, TState]
  
  var search: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object LocationState {
  
  inline def apply[TKeys, TState](
    pathname: String,
    payload: Payload,
    prev: Location,
    routesMap: RoutesMap[TKeys, TState],
    `type`: String
  ): LocationState[TKeys, TState] = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], routesMap = routesMap.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationState[TKeys, TState]]
  }
  
  extension [Self <: LocationState[?, ?], TKeys, TState](x: Self & (LocationState[TKeys, TState])) {
    
    inline def setHasSSR(value: Boolean): Self = StObject.set(x, "hasSSR", value.asInstanceOf[js.Any])
    
    inline def setHasSSRUndefined: Self = StObject.set(x, "hasSSR", js.undefined)
    
    inline def setHistory(value: Nullable[HistoryData]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryNull: Self = StObject.set(x, "history", null)
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setKind(value: Nullable[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: Location): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRoutesMap(value: RoutesMap[TKeys, TState]): Self = StObject.set(x, "routesMap", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
