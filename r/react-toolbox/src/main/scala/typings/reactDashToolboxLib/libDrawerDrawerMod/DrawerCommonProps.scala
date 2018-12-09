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
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * If true the Drawer is rendered inside the normal tree.
     * @default false
     */
  var insideTree: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Callback function to be invoked when the overlay is clicked.
     */
  var onOverlayClick: js.UndefOr[coreDashJsLib.Function] = js.undefined
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

