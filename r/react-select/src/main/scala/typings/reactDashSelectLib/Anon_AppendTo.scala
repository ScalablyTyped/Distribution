package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppendTo extends js.Object {
  var appendTo: reactLib.HTMLElement
  var children: reactLib.reactMod.ReactNs.ReactNode
   // ideally Menu<MenuProps>
  var controlElement: reactLib.HTMLElement
  var menuPlacement: reactDashSelectLib.libTypesMod.MenuPlacement
  var menuPosition: reactDashSelectLib.libTypesMod.MenuPosition
}

object Anon_AppendTo {
  @scala.inline
  def apply(
    appendTo: reactLib.HTMLElement,
    children: reactLib.reactMod.ReactNs.ReactNode,
    controlElement: reactLib.HTMLElement,
    menuPlacement: reactDashSelectLib.libTypesMod.MenuPlacement,
    menuPosition: reactDashSelectLib.libTypesMod.MenuPosition
  ): Anon_AppendTo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendTo")(appendTo)
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("controlElement")(controlElement)
    __obj.updateDynamic("menuPlacement")(menuPlacement)
    __obj.updateDynamic("menuPosition")(menuPosition)
    __obj.asInstanceOf[Anon_AppendTo]
  }
}

