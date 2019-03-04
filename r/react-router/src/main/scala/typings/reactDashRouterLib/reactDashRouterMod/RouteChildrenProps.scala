package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteChildrenProps[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ reactDashRouterLib.reactDashRouterLibStrings.RouteChildrenProps with js.Any */, S] extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var location: historyLib.historyMod.Location[S]
  var `match`: `match`[Params] | scala.Null
}

object RouteChildrenProps {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.RouteChildrenProps with js.Any */, S](
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    location: historyLib.historyMod.Location[S],
    `match`: `match`[Params] = null
  ): RouteChildrenProps[Params, S] = {
    val __obj = js.Dynamic.literal(history = history, location = location)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[RouteChildrenProps[Params, S]]
  }
}

