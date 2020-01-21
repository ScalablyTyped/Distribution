package typings.reactSidebar.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var contentClassName: js.UndefOr[String] = js.undefined
  var contentId: js.UndefOr[String] = js.undefined
  var defaultSidebarWidth: js.UndefOr[Double] = js.undefined
  var docked: js.UndefOr[Boolean] = js.undefined
  var dragToggleDistance: js.UndefOr[Double] = js.undefined
  var onSetOpen: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayId: js.UndefOr[String] = js.undefined
  var pullRight: js.UndefOr[Boolean] = js.undefined
  var rootClassName: js.UndefOr[String] = js.undefined
  var rootId: js.UndefOr[String] = js.undefined
  var shadow: js.UndefOr[Boolean] = js.undefined
  var sidebar: js.UndefOr[ReactNode] = js.undefined
  var sidebarClassName: js.UndefOr[String] = js.undefined
  var sidebarId: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[SidebarStyles] = js.undefined
  var touch: js.UndefOr[Boolean] = js.undefined
  var touchHandleWidth: js.UndefOr[Double] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
}

object SidebarProps {
  @scala.inline
  def apply(
    contentClassName: String = null,
    contentId: String = null,
    defaultSidebarWidth: Int | Double = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    dragToggleDistance: Int | Double = null,
    onSetOpen: /* open */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    overlayClassName: String = null,
    overlayId: String = null,
    pullRight: js.UndefOr[Boolean] = js.undefined,
    rootClassName: String = null,
    rootId: String = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    sidebar: ReactNode = null,
    sidebarClassName: String = null,
    sidebarId: String = null,
    styles: SidebarStyles = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    touchHandleWidth: Int | Double = null,
    transitions: js.UndefOr[Boolean] = js.undefined
  ): SidebarProps = {
    val __obj = js.Dynamic.literal()
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (defaultSidebarWidth != null) __obj.updateDynamic("defaultSidebarWidth")(defaultSidebarWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked.asInstanceOf[js.Any])
    if (dragToggleDistance != null) __obj.updateDynamic("dragToggleDistance")(dragToggleDistance.asInstanceOf[js.Any])
    if (onSetOpen != null) __obj.updateDynamic("onSetOpen")(js.Any.fromFunction1(onSetOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayId != null) __obj.updateDynamic("overlayId")(overlayId.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight.asInstanceOf[js.Any])
    if (rootClassName != null) __obj.updateDynamic("rootClassName")(rootClassName.asInstanceOf[js.Any])
    if (rootId != null) __obj.updateDynamic("rootId")(rootId.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    if (sidebarClassName != null) __obj.updateDynamic("sidebarClassName")(sidebarClassName.asInstanceOf[js.Any])
    if (sidebarId != null) __obj.updateDynamic("sidebarId")(sidebarId.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (touchHandleWidth != null) __obj.updateDynamic("touchHandleWidth")(touchHandleWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarProps]
  }
}

