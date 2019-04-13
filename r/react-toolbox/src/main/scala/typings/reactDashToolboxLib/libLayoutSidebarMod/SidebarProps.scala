package typings
package reactDashToolboxLib.libLayoutSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps
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
    * If true, the sidebar will be pinned open.
    * @default false
    */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[SidebarTheme] = js.undefined
  /**
    * Width in standard increments (1-12) or percentage (25, 33, 50, 66, 75, 100)
    * @default 5
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SidebarProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    clipped: js.UndefOr[scala.Boolean] = js.undefined,
    insideTree: js.UndefOr[scala.Boolean] = js.undefined,
    onOverlayClick: js.Function = null,
    permanentAt: reactDashToolboxLib.reactDashToolboxLibStrings.sm | reactDashToolboxLib.reactDashToolboxLibStrings.smTablet | reactDashToolboxLib.reactDashToolboxLibStrings.md | reactDashToolboxLib.reactDashToolboxLibStrings.lg | reactDashToolboxLib.reactDashToolboxLibStrings.lgTablet | reactDashToolboxLib.reactDashToolboxLibStrings.xl | reactDashToolboxLib.reactDashToolboxLibStrings.xxl | reactDashToolboxLib.reactDashToolboxLibStrings.xxxl = null,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    theme: SidebarTheme = null,
    `type`: reactDashToolboxLib.reactDashToolboxLibStrings.left | reactDashToolboxLib.reactDashToolboxLibStrings.right = null,
    width: scala.Int | scala.Double = null,
    withOverlay: js.UndefOr[scala.Boolean] = js.undefined
  ): SidebarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped)
    if (!js.isUndefined(insideTree)) __obj.updateDynamic("insideTree")(insideTree)
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick)
    if (permanentAt != null) __obj.updateDynamic("permanentAt")(permanentAt.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay)
    __obj.asInstanceOf[SidebarProps]
  }
}

