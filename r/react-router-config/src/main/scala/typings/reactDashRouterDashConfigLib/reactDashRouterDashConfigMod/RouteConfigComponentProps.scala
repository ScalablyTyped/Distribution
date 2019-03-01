package typings
package reactDashRouterDashConfigLib.reactDashRouterDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfigComponentProps[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ reactDashRouterDashConfigLib.reactDashRouterDashConfigLibStrings.RouteConfigComponentProps with js.Any */]
  extends reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
      Params, 
      reactDashRouterLib.reactDashRouterMod.StaticContext, 
      historyLib.historyMod.LocationState
    ] {
  var route: js.UndefOr[RouteConfig] = js.undefined
}

object RouteConfigComponentProps {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterDashConfigLib.reactDashRouterDashConfigLibStrings.RouteConfigComponentProps with js.Any */](
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState],
    `match`: reactDashRouterLib.reactDashRouterMod.`match`[Params],
    route: RouteConfig = null,
    staticContext: reactDashRouterLib.reactDashRouterMod.StaticContext = null
  ): RouteConfigComponentProps[Params] = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("history")(history)
    __obj.updateDynamic("location")(location)
    if (route != null) __obj.updateDynamic("route")(route)
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext)
    __obj.asInstanceOf[RouteConfigComponentProps[Params]]
  }
}

