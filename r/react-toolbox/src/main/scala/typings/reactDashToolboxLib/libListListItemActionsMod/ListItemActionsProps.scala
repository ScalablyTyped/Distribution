package typings
package reactDashToolboxLib.libListListItemActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionsProps extends js.Object {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[
    ListItemActionsTheme with reactDashToolboxLib.libListListItemActionMod.ListItemActionTheme
  ] = js.undefined
  /**
    * List item action type.
    */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.left | reactDashToolboxLib.reactDashToolboxLibStrings.right
  ] = js.undefined
}

object ListItemActionsProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    theme: ListItemActionsTheme with reactDashToolboxLib.libListListItemActionMod.ListItemActionTheme = null,
    `type`: reactDashToolboxLib.reactDashToolboxLibStrings.left | reactDashToolboxLib.reactDashToolboxLibStrings.right = null
  ): ListItemActionsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemActionsProps]
  }
}

