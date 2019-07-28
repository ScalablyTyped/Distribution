package typings.rmcDashDrawer.rmcDashDrawerMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.rmcDashDrawer.Anon_OverlayClicked
import typings.rmcDashDrawer.rmcDashDrawerStrings.bottom
import typings.rmcDashDrawer.rmcDashDrawerStrings.left
import typings.rmcDashDrawer.rmcDashDrawerStrings.right
import typings.rmcDashDrawer.rmcDashDrawerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var docked: js.UndefOr[Boolean] = js.undefined
  var dragHandleStyle: js.UndefOr[CSSProperties] = js.undefined
  var dragToggleDistance: js.UndefOr[Double] = js.undefined
  var enableDragHandle: js.UndefOr[Boolean] = js.undefined
  var onOpenChange: js.UndefOr[
    js.Function2[/* open */ Boolean, /* overlay */ js.UndefOr[Anon_OverlayClicked], Unit]
  ] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  var position: js.UndefOr[left | right | top | bottom] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var sidebar: js.UndefOr[ReactNode] = js.undefined
  var sidebarStyle: js.UndefOr[CSSProperties] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var touch: js.UndefOr[Boolean] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    children: ReactNode | js.Array[ReactNode] = null,
    className: String = null,
    contentStyle: CSSProperties = null,
    docked: js.UndefOr[Boolean] = js.undefined,
    dragHandleStyle: CSSProperties = null,
    dragToggleDistance: Int | Double = null,
    enableDragHandle: js.UndefOr[Boolean] = js.undefined,
    onOpenChange: (/* open */ Boolean, /* overlay */ js.UndefOr[Anon_OverlayClicked]) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    overlayStyle: CSSProperties = null,
    position: left | right | top | bottom = null,
    prefixCls: String = null,
    sidebar: ReactNode = null,
    sidebarStyle: CSSProperties = null,
    style: CSSProperties = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    transitions: js.UndefOr[Boolean] = js.undefined
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked)
    if (dragHandleStyle != null) __obj.updateDynamic("dragHandleStyle")(dragHandleStyle)
    if (dragToggleDistance != null) __obj.updateDynamic("dragToggleDistance")(dragToggleDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDragHandle)) __obj.updateDynamic("enableDragHandle")(enableDragHandle)
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction2(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    if (sidebarStyle != null) __obj.updateDynamic("sidebarStyle")(sidebarStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions)
    __obj.asInstanceOf[DrawerProps]
  }
}

