package typings.reactDashRouter.reactDashRouterMod

import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteChildrenProps[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactDashRouter.reactDashRouterStrings.RouteChildrenProps with js.Any */, S] extends js.Object {
  var history: History[LocationState]
  var location: Location[S]
  var `match`: typings.reactDashRouter.reactDashRouterMod.`match`[Params] | Null
}

object RouteChildrenProps {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactDashRouter.reactDashRouterStrings.RouteChildrenProps with js.Any */, S](history: History[LocationState], location: Location[S], `match`: `match`[Params] = null): RouteChildrenProps[Params, S] = {
    val __obj = js.Dynamic.literal(history = history, location = location)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[RouteChildrenProps[Params, S]]
  }
}

