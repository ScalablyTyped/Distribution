package typings
package reactDashToolboxLib.libDrawerDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerCommonProps extends js.Object {
  /**
    * If true, the drawer will be visible.
    * @default false
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * If true the Drawer is rendered inside the normal tree.
    * @default false
    */
  var insideTree: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback function to be invoked when the overlay is clicked.
    */
  var onOverlayClick: js.UndefOr[js.Function] = js.undefined
  /**
    * Type of drawer. It can be left or right to display the drawer on the left or right side of the screen.
    * @default left
    */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.left | reactDashToolboxLib.reactDashToolboxLibStrings.right
  ] = js.undefined
  /**
    * If true display an Overlay that locks the scroll when the Drawer is active.
    * @default true
    */
  var withOverlay: js.UndefOr[scala.Boolean] = js.undefined
}

object DrawerCommonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    insideTree: js.UndefOr[scala.Boolean] = js.undefined,
    onOverlayClick: js.Function = null,
    `type`: reactDashToolboxLib.reactDashToolboxLibStrings.left | reactDashToolboxLib.reactDashToolboxLibStrings.right = null,
    withOverlay: js.UndefOr[scala.Boolean] = js.undefined
  ): DrawerCommonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(insideTree)) __obj.updateDynamic("insideTree")(insideTree)
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay)
    __obj.asInstanceOf[DrawerCommonProps]
  }
}

