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
    children: ReactNode,
    controlElement: HTMLElement,
    menuPlacement: MenuPlacement,
    menuPosition: MenuPosition
  ): Anon_AppendTo = {
    val __obj = js.Dynamic.literal(appendTo = appendTo, children = children.asInstanceOf[js.Any], controlElement = controlElement, menuPlacement = menuPlacement, menuPosition = menuPosition)
  
    __obj.asInstanceOf[Anon_AppendTo]
  }
}

