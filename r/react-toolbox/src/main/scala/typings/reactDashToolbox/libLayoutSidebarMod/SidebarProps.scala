package typings.reactDashToolbox.libLayoutSidebarMod

import typings.react.reactMod.ReactNode
import typings.reactDashToolbox.libDrawerDrawerMod.DrawerCommonProps
import typings.reactDashToolbox.reactDashToolboxStrings.left
import typings.reactDashToolbox.reactDashToolboxStrings.lg
import typings.reactDashToolbox.reactDashToolboxStrings.lgTablet
import typings.reactDashToolbox.reactDashToolboxStrings.md
import typings.reactDashToolbox.reactDashToolboxStrings.right
import typings.reactDashToolbox.reactDashToolboxStrings.sm
import typings.reactDashToolbox.reactDashToolboxStrings.smTablet
import typings.reactDashToolbox.reactDashToolboxStrings.xl
import typings.reactDashToolbox.reactDashToolboxStrings.xxl
import typings.reactDashToolbox.reactDashToolboxStrings.xxxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends DrawerCommonProps {
  /**
    * If true, when the `AppBar` gets pinned, it will stand over the `Drawer`.
    * @default false
    */
  var clipped: js.UndefOr[Boolean] = js.undefined
  /**
    * The breakpoint at which the drawer is automatically pinned.
    */
  var permanentAt: js.UndefOr[sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl] = js.undefined
  /**
    * If true, the sidebar will be pinned open.
    * @default false
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[SidebarTheme] = js.undefined
  /**
    * Width in standard increments (1-12) or percentage (25, 33, 50, 66, 75, 100)
    * @default 5
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SidebarProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    clipped: js.UndefOr[Boolean] = js.undefined,
    insideTree: js.UndefOr[Boolean] = js.undefined,
    onOverlayClick: js.Function = null,
    permanentAt: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    theme: SidebarTheme = null,
    `type`: left | right = null,
    width: Int | Double = null,
    withOverlay: js.UndefOr[Boolean] = js.undefined
  ): SidebarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (!js.isUndefined(insideTree)) __obj.updateDynamic("insideTree")(insideTree.asInstanceOf[js.Any])
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick.asInstanceOf[js.Any])
    if (permanentAt != null) __obj.updateDynamic("permanentAt")(permanentAt.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarProps]
  }
}

