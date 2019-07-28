package typings.reactDashRouterDashConfig.reactDashRouterDashConfigMod

import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typings.reactDashRouter.reactDashRouterMod.StaticContext
import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfigComponentProps[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactDashRouterDashConfig.reactDashRouterDashConfigStrings.RouteConfigComponentProps with js.Any */] extends RouteComponentProps[Params, StaticContext, LocationState] {
  var route: js.UndefOr[RouteConfig] = js.undefined
}

object RouteConfigComponentProps {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouterDashConfig.reactDashRouterDashConfigStrings.RouteConfigComponentProps with js.Any */](
    history: History[LocationState],
    location: Location[LocationState],
    `match`: `match`[Params],
    route: RouteConfig = null,
    staticContext: StaticContext = null
  ): RouteConfigComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history, location = location)
    __obj.updateDynamic("match")(`match`)
    if (route != null) __obj.updateDynamic("route")(route)
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext)
    __obj.asInstanceOf[RouteConfigComponentProps[Params]]
  }
}

