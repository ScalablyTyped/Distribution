package typings
package reactDashToolboxLib.libLayoutNavDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavDrawerProps
  extends reactDashToolboxLib.libDrawerDrawerMod.DrawerCommonProps {
  /**
     * If true, when the `AppBar` gets pinned, it will stand over the `Drawer`.
     * @default false
     */
  var clipped: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * The breakpoint at which the drawer is automatically pinned.
     */
  var permanentAt: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.sm | reactDashToolboxLib.reactDashToolboxLibStrings.smTablet | reactDashToolboxLib.reactDashToolboxLibStrings.md | reactDashToolboxLib.reactDashToolboxLibStrings.lg | reactDashToolboxLib.reactDashToolboxLibStrings.lgTablet | reactDashToolboxLib.reactDashToolboxLibStrings.xl | reactDashToolboxLib.reactDashToolboxLibStrings.xxl | reactDashToolboxLib.reactDashToolboxLibStrings.xxxl
  ] = js.undefined
  /**
     * If true, the drawer will be pinned open. pinned takes precedence over active.
     * @default false
     */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[NavDrawerTheme] = js.undefined
}

