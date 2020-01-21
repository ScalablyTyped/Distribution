package typings.reactSelect.menuMod

import typings.react.mod.Component
import typings.reactSelect.AnonGetPortalPlacement
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Menu", "MenuPortal")
@js.native
class MenuPortal[OptionType /* <: OptionTypeBase */] ()
  extends Component[MenuPortalProps[OptionType], MenuPortalState, js.Any] {
  def getChildContext(): AnonGetPortalPlacement = js.native
  // callback for occassions where the menu must "flip"
  def getPortalPlacement(state: MenuState): Unit = js.native
}

/* static members */
@JSImport("react-select/src/components/Menu", "MenuPortal")
@js.native
object MenuPortal extends js.Object {
  var childContextTypes: AnonGetPortalPlacement = js.native
}

