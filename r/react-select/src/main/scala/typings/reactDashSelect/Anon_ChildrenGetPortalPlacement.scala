package typings.reactDashSelect

import typings.react.reactMod.ReactElement
import typings.reactDashSelect.srcComponentsMenuMod.MenuState
import typings.reactDashSelect.srcTypesMod.MenuPlacement
import typings.reactDashSelect.srcTypesMod.MenuPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenGetPortalPlacement extends js.Object {
  /** The children to be rendered. */
  var children: ReactElement
  /** Props to be passed to the menu wrapper. */
  var innerProps: js.Object
  /** Set the maximum height of the menu. */
  var maxMenuHeight: Double
  /** Set whether the menu should be at the top, at the bottom. The auto options sets it to bottom. */
  var menuPlacement: MenuPlacement
  /* The CSS position value of the menu, when "fixed" extra layout management is required */
  var menuPosition: MenuPosition
  /** Set whether the page should scroll to show the menu. */
  var menuShouldScrollIntoView: Boolean
  /** Set the minimum height of the menu. */
  var minMenuHeight: Double
  /** Callback to update the portal after possible flip. */
  def getPortalPlacement(state: MenuState): Unit
}

object Anon_ChildrenGetPortalPlacement {
  @scala.inline
  def apply(
    children: ReactElement,
    getPortalPlacement: MenuState => Unit,
    innerProps: js.Object,
    maxMenuHeight: Double,
    menuPlacement: MenuPlacement,
    menuPosition: MenuPosition,
    menuShouldScrollIntoView: Boolean,
    minMenuHeight: Double
  ): Anon_ChildrenGetPortalPlacement = {
    val __obj = js.Dynamic.literal(children = children, getPortalPlacement = js.Any.fromFunction1(getPortalPlacement), innerProps = innerProps, maxMenuHeight = maxMenuHeight, menuPlacement = menuPlacement, menuPosition = menuPosition, menuShouldScrollIntoView = menuShouldScrollIntoView, minMenuHeight = minMenuHeight)
  
    __obj.asInstanceOf[Anon_ChildrenGetPortalPlacement]
  }
}

