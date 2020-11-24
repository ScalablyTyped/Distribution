package typings.reactNavigationNative.anon

import typings.reactNavigationNative.reactNavigationNativeBooleans.`true`
import typings.reactNavigationRouters.typesMod.PartialRoute
import typings.reactNavigationRouters.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | @react-navigation/core.@react-navigation/core.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'key' | 'index' | 'routeNames' | 'history' | 'type'>> & std.Readonly<{  stale :true | undefined,   routes :std.Array<@react-navigation/core.@react-navigation/core.PartialRoute<@react-navigation/core.@react-navigation/core.Route<string, object | undefined>>>}> & {  state :std.Partial<std.Pick<std.Readonly<{  key :string,   index :number,   routeNames :std.Array<string>,   history :std.Array<unknown> | undefined,   routes :std.Array<std.Readonly<{  key :string,   name :string}> & std.Readonly<{  params :object | undefined}> & {  state :std.Readonly<any> | @react-navigation/core.@react-navigation/core.PartialState<std.Readonly<any>> | undefined}>,   type :string,   stale :false}>, 'key' | 'index' | 'routeNames' | 'history' | 'type'>> & std.Readonly<{  stale :true | undefined,   routes :std.Array<@react-navigation/core.@react-navigation/core.PartialRoute<@react-navigation/core.@react-navigation/core.Route<string, object | undefined>>>}> & any | undefined} */
@js.native
trait PartialPickReadonlykeystrHistory extends js.Object {
  
  var history: js.UndefOr[js.Array[_]] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var routeNames: js.UndefOr[js.Array[String]] = js.native
  
  val routes: js.Array[PartialRoute[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  val stale: js.UndefOr[`true`] = js.native
  
  var state: js.UndefOr[PartialPickReadonlykeystr with Readonlystaletrueundefine with js.Any] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object PartialPickReadonlykeystrHistory {
  
  @scala.inline
  def apply(routes: js.Array[PartialRoute[Route[String, js.UndefOr[js.Object]]]]): PartialPickReadonlykeystrHistory = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickReadonlykeystrHistory]
  }
  
  @scala.inline
  implicit class PartialPickReadonlykeystrHistoryOps[Self <: PartialPickReadonlykeystrHistory] (val x: Self) extends AnyVal {
    
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
    def setRoutesVarargs(value: (PartialRoute[Route[String, js.UndefOr[js.Object]]])*): Self = this.set("routes", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[PartialRoute[Route[String, js.UndefOr[js.Object]]]]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[_]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setRouteNamesVarargs(value: String*): Self = this.set("routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRouteNames(value: js.Array[String]): Self = this.set("routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteNames: Self = this.set("routeNames", js.undefined)
    
    @scala.inline
    def setStale(value: `true`): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    
    @scala.inline
    def setState(value: PartialPickReadonlykeystr with Readonlystaletrueundefine with js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
