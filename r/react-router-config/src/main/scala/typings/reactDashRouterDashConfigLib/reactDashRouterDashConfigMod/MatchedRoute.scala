package typings
package reactDashRouterDashConfigLib.reactDashRouterDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchedRoute[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ reactDashRouterDashConfigLib.reactDashRouterDashConfigLibStrings.MatchedRoute with js.Any */] extends js.Object {
  var `match`: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  var route: RouteConfig
}

object MatchedRoute {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterDashConfigLib.reactDashRouterDashConfigLibStrings.MatchedRoute with js.Any */](`match`: reactDashRouterLib.reactDashRouterMod.`match`[Params], route: RouteConfig): MatchedRoute[Params] = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[MatchedRoute[Params]]
  }
}

