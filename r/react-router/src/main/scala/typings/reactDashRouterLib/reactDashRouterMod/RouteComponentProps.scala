package typings
package reactDashRouterLib.reactDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteComponentProps[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ reactDashRouterLib.reactDashRouterLibStrings.RouteComponentProps with js.Any */, C /* <: StaticContext */, S] extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var location: historyLib.historyMod.Location[S]
  var `match`: `match`[Params]
  var staticContext: js.UndefOr[C] = js.undefined
}

object RouteComponentProps {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.RouteComponentProps with js.Any */, C /* <: StaticContext */, S](
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    location: historyLib.historyMod.Location[S],
    `match`: `match`[Params],
    staticContext: C = null
  ): RouteComponentProps[Params, C, S] = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("history")(history)
    __obj.updateDynamic("location")(location)
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params, C, S]]
  }
}

