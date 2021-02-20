package typings.reduxFirstRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationState[TKeys, TState] extends StObject {
  
  var hasSSR: js.UndefOr[Boolean] = js.native
  
  var history: Nullable[HistoryData] = js.native
  
  var kind: Nullable[String] = js.native
  
  var pathname: String = js.native
  
  var payload: Payload = js.native
  
  var prev: Location = js.native
  
  var query: js.UndefOr[Query] = js.native
  
  var routesMap: RoutesMap[TKeys, TState] = js.native
  
  var search: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object LocationState {
  
  @scala.inline
  def apply[TKeys, TState](
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
  
  @scala.inline
  implicit class LocationStateMutableBuilder[Self <: LocationState[_, _], TKeys, TState] (val x: Self with (LocationState[TKeys, TState])) extends AnyVal {
    
    @scala.inline
    def setHasSSR(value: Boolean): Self = StObject.set(x, "hasSSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSSRUndefined: Self = StObject.set(x, "hasSSR", js.undefined)
    
    @scala.inline
    def setHistory(value: Nullable[HistoryData]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryNull: Self = StObject.set(x, "history", null)
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setKind(value: Nullable[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindNull: Self = StObject.set(x, "kind", null)
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: Location): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRoutesMap(value: RoutesMap[TKeys, TState]): Self = StObject.set(x, "routesMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
