package typings.reactDashSelect

import typings.react.reactMod.ReactNode
import typings.reactDashSelect.srcTypesMod.MenuPlacement
import typings.reactDashSelect.srcTypesMod.MenuPosition
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppendTo extends js.Object {
  var appendTo: HTMLElement
  var children: ReactNode
   // ideally Menu<MenuProps>
  var controlElement: HTMLElement
  var menuPlacement: MenuPlacement
  var menuPosition: MenuPosition
}

object Anon_AppendTo {
  @scala.inline
  def apply(
    appendTo: HTMLElement,
    controlElement: HTMLElement,
    menuPlacement: MenuPlacement,
    menuPosition: MenuPosition,
    children: ReactNode = null
  ): Anon_AppendTo = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], controlElement = controlElement.asInstanceOf[js.Any], menuPlacement = menuPlacement.asInstanceOf[js.Any], menuPosition = menuPosition.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AppendTo]
  }
}

