package typings.reactDashRouterDashConfig.reactDashRouterDashConfigMod

import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedRoute[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactDashRouterDashConfig.reactDashRouterDashConfigStrings.MatchedRoute with js.Any */] extends js.Object {
  var `match`: typings.reactDashRouter.reactDashRouterMod.`match`[Params]
  var route: RouteConfig
}

object MatchedRoute {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouterDashConfig.reactDashRouterDashConfigStrings.MatchedRoute with js.Any */](`match`: `match`[Params], route: RouteConfig): MatchedRoute[Params] = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedRoute[Params]]
  }
}

