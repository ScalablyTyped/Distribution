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

