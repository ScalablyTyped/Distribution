package typings.reactDashSelect.srcComponentsMenuMod

import typings.react.reactMod.Component
import typings.react.reactMod.Ref
import typings.reactDashSelect.Anon_GetPortalPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/components/Menu", "Menu")
@js.native
class Menu[OptionType] ()
  extends Component[MenuProps[OptionType], MenuState, js.Any] {
  def getPlacement(ref: Ref[_]): Unit = js.native
  def getState(): MenuProps[OptionType] with MenuState = js.native
}

/* static members */
@JSImport("react-select/src/components/Menu", "Menu")
@js.native
object Menu extends js.Object {
  var contextTypes: Anon_GetPortalPlacement = js.native
}

