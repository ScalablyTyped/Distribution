package typings
package reactDashSelectLib.libComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/components/Menu", "MenuPortal")
@js.native
class MenuPortal[OptionType] ()
  extends reactLib.reactMod.Component[MenuPortalProps[OptionType], MenuPortalState, js.Any] {
  def getChildContext(): reactDashSelectLib.Anon_GetPortalPlacement = js.native
  // callback for occassions where the menu must "flip"
  def getPortalPlacement(state: MenuState): scala.Unit = js.native
}

@JSImport("react-select/lib/components/Menu", "MenuPortal")
@js.native
object MenuPortal extends js.Object {
  var childContextTypes: reactDashSelectLib.Anon_GetPortalPlacement = js.native
}

