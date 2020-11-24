package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'stale' | 'key' | 'index' | 'routeNames' | 'history' | 'type'> & {  routes :std.Array<std.Pick<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.Route<string, object | undefined>, 'name' | 'params'>>} */
@js.native
trait PickReadonlykeystringinde extends js.Object {
  
  var history: js.UndefOr[js.Array[_]] = js.native
  
  var index: Double = js.native
  
  var key: String = js.native
  
  var routeNames: js.Array[String] = js.native
  
  var routes: js.Array[PickRoutestringobjectunde] = js.native
  
  var stale: `false` = js.native
  
  var `type`: String = js.native
}
object PickReadonlykeystringinde {
  
  @scala.inline
  def apply(
    index: Double,
    key: String,
    routeNames: js.Array[String],
    routes: js.Array[PickRoutestringobjectunde],
    stale: `false`,
    `type`: String
  ): PickReadonlykeystringinde = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickReadonlykeystringinde]
  }
  
  @scala.inline
  implicit class PickReadonlykeystringindeOps[Self <: PickReadonlykeystringinde] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNamesVarargs(value: String*): Self = this.set("routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRouteNames(value: js.Array[String]): Self = this.set("routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: PickRoutestringobjectunde*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[PickRoutestringobjectunde]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStale(value: `false`): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
  }
}
