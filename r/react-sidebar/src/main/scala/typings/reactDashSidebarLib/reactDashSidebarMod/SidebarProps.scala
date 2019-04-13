package typings
package reactDashSidebarLib.reactDashSidebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var contentClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentId: js.UndefOr[java.lang.String] = js.undefined
  var defaultSidebarWidth: js.UndefOr[scala.Double] = js.undefined
  var docked: js.UndefOr[scala.Boolean] = js.undefined
  var dragToggleDistance: js.UndefOr[scala.Double] = js.undefined
  var onSetOpen: js.UndefOr[js.Function1[/* open */ scala.Boolean, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayId: js.UndefOr[java.lang.String] = js.undefined
  var pullRight: js.UndefOr[scala.Boolean] = js.undefined
  var rootClassName: js.UndefOr[java.lang.String] = js.undefined
  var rootId: js.UndefOr[java.lang.String] = js.undefined
  var shadow: js.UndefOr[scala.Boolean] = js.undefined
  var sidebar: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var sidebarClassName: js.UndefOr[java.lang.String] = js.undefined
  var sidebarId: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[SidebarStyles] = js.undefined
  var touch: js.UndefOr[scala.Boolean] = js.undefined
  var touchHandleWidth: js.UndefOr[scala.Double] = js.undefined
  var transitions: js.UndefOr[scala.Boolean] = js.undefined
}

object SidebarProps {
  @scala.inline
  def apply(
    contentClassName: java.lang.String = null,
    contentId: java.lang.String = null,
    defaultSidebarWidth: scala.Int | scala.Double = null,
    docked: js.UndefOr[scala.Boolean] = js.undefined,
    dragToggleDistance: scala.Int | scala.Double = null,
    onSetOpen: /* open */ scala.Boolean => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    overlayClassName: java.lang.String = null,
    overlayId: java.lang.String = null,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined,
    rootClassName: java.lang.String = null,
    rootId: java.lang.String = null,
    shadow: js.UndefOr[scala.Boolean] = js.undefined,
    sidebar: reactLib.reactMod.ReactNode = null,
    sidebarClassName: java.lang.String = null,
    sidebarId: java.lang.String = null,
    styles: SidebarStyles = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined,
    touchHandleWidth: scala.Int | scala.Double = null,
    transitions: js.UndefOr[scala.Boolean] = js.undefined
  ): SidebarProps = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (defaultSidebarWidth != null) __obj.updateDynamic("defaultSidebarWidth")(defaultSidebarWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked)
    if (dragToggleDistance != null) __obj.updateDynamic("dragToggleDistance")(dragToggleDistance.asInstanceOf[js.Any])
    if (onSetOpen != null) __obj.updateDynamic("onSetOpen")(js.Any.fromFunction1(onSetOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayId != null) __obj.updateDynamic("overlayId")(overlayId)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    if (rootClassName != null) __obj.updateDynamic("rootClassName")(rootClassName)
    if (rootId != null) __obj.updateDynamic("rootId")(rootId)
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow)
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    if (sidebarClassName != null) __obj.updateDynamic("sidebarClassName")(sidebarClassName)
    if (sidebarId != null) __obj.updateDynamic("sidebarId")(sidebarId)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (touchHandleWidth != null) __obj.updateDynamic("touchHandleWidth")(touchHandleWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions)
    __obj.asInstanceOf[SidebarProps]
  }
}

