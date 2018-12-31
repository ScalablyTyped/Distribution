package typings
package reactDashToolboxLib.libListListItemActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionsProps extends js.Object {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
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

