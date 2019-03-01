package typings
package reactDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ reactDashRouterLib.reactDashRouterLibStrings.Anon_Location with js.Any */] extends js.Object {
  var location: historyLib.historyMod.Location[historyLib.historyMod.LocationState]
  var `match`: reactDashRouterLib.reactDashRouterMod.`match`[Params]
}

object Anon_Location {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ reactDashRouterLib.reactDashRouterLibStrings.Anon_Location with js.Any */](
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState],
    `match`: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  ): Anon_Location[Params] = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[Anon_Location[Params]]
  }
}

