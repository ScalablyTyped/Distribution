package typings
package reactDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_History[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ reactDashRouterLib.reactDashRouterLibStrings.Anon_History with js.Any */] extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var route: Anon_Location[Params]
}

object Anon_History {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.Anon_History with js.Any */](
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    route: Anon_Location[Params]
  ): Anon_History[Params] = {
    val __obj = js.Dynamic.literal(history = history, route = route)
  
    __obj.asInstanceOf[Anon_History[Params]]
  }
}

