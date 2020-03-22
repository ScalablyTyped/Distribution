package typings.reactSelect.menuMod

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactSelect.AnonGetPortalPlacement
import typings.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Menu", "Menu")
@js.native
class Menu[OptionType /* <: OptionTypeBase */] ()
  extends Component[MenuProps[OptionType], MenuState, js.Any] {
  def getPlacement(ref: Ref[_]): Unit = js.native
  def getState(): MenuProps[OptionType] with MenuState = js.native
}

/* static members */
@JSImport("react-select/src/components/Menu", "Menu")
@js.native
object Menu extends js.Object {
  var contextTypes: AnonGetPortalPlacement = js.native
}

