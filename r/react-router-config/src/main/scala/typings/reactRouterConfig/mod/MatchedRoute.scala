package typings.reactRouterConfig.mod

import org.scalablytyped.runtime.TopLevel
import typings.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchedRoute[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute with TopLevel[js.Any] */] extends js.Object {
  var `match`: typings.reactRouter.mod.`match`[Params] = js.native
  var route: RouteConfig = js.native
}

object MatchedRoute {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute with org.scalablytyped.runtime.TopLevel[js.Any] */ Params](`match`: `match`[Params], route: RouteConfig): MatchedRoute[Params] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedRoute[Params]]
  }
  @scala.inline
  implicit class MatchedRouteOps[Self <: MatchedRoute[_], /* <: / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    * / typings.reactRouterConfig.reactRouterConfigStrings.MatchedRoute with org.scalablytyped.runtime.TopLevel[js.Any] */ Params] (val x: Self with MatchedRoute[Params]) extends AnyVal {
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
    def setMatch(value: `match`[Params]): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoute(value: RouteConfig): Self = this.set("route", value.asInstanceOf[js.Any])
  }
  
}

