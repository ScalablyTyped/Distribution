package typings
package reactDashSelectLib.libComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/components/Menu", "Menu")
@js.native
class Menu[OptionType] ()
  extends reactLib.reactMod.Component[MenuProps[OptionType], MenuState, js.Any] {
  def getPlacement(ref: reactLib.reactMod.ReactNs.Ref[_]): scala.Unit = js.native
  def getState(): MenuProps[OptionType] with MenuState = js.native
}

@JSImport("react-select/lib/components/Menu", "Menu")
@js.native
object Menu extends js.Object {
  var contextTypes: reactDashSelectLib.Anon_GetPortalPlacement = js.native
}

