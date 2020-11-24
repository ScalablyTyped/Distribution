package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationState[TKeys, TState] extends js.Object {
  
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
  implicit class LocationStateOps[Self <: LocationState[_, _], TKeys, TState] (val x: Self with (LocationState[TKeys, TState])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: Location): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesMap(value: RoutesMap[TKeys, TState]): Self = this.set("routesMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSSR(value: Boolean): Self = this.set("hasSSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSSR: Self = this.set("hasSSR", js.undefined)
    
    @scala.inline
    def setHistory(value: Nullable[HistoryData]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setHistoryNull: Self = this.set("history", null)
    
    @scala.inline
    def setKind(value: Nullable[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setKindNull: Self = this.set("kind", null)
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
  }
}
