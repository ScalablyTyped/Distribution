package typings.reactNavigationRouters.stackRouterMod

import typings.reactNavigationRouters.reactNavigationRoutersBooleans.`false`
import typings.reactNavigationRouters.reactNavigationRoutersStrings.stack
import typings.reactNavigationRouters.typesMod.NavigationRoute
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<ParamList> & {  type :'stack'} */
@js.native
trait StackNavigationState[ParamList /* <: ParamListBase */] extends js.Object {
  
  val history: js.UndefOr[js.Array[_]] = js.native
  
  val index: Double = js.native
  
  val key: String = js.native
  
  val routeNames: js.Array[Extract[/* keyof ParamList */ String, String]] = js.native
  
  val routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]] = js.native
  
  val stale: `false` = js.native
  
  /**
    * Type of the router, in this case, it's stack.
    */
  val `type`: String with stack = js.native
}
object StackNavigationState {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */](
    index: Double,
    key: String,
    routeNames: js.Array[Extract[/* keyof ParamList */ String, String]],
    routes: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]],
    stale: `false`,
    `type`: String with stack
  ): StackNavigationState[ParamList] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackNavigationState[ParamList]]
  }
  
  @scala.inline
  implicit class StackNavigationStateOps[Self <: StackNavigationState[_], ParamList /* <: ParamListBase */] (val x: Self with StackNavigationState[ParamList]) extends AnyVal {
    
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
    def setRouteNamesVarargs(value: (Extract[/* keyof ParamList */ String, String])*): Self = this.set("routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRouteNames(value: js.Array[Extract[/* keyof ParamList */ String, String]]): Self = this.set("routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (NavigationRoute[ParamList, /* keyof ParamList */ String])*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[NavigationRoute[ParamList, /* keyof ParamList */ String]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStale(value: `false`): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String with stack): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
  }
}
