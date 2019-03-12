package typings
package rmcDashDrawerLib.rmcDashDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var children: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | js.Array[reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var docked: js.UndefOr[scala.Boolean] = js.undefined
  var dragHandleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var dragToggleDistance: js.UndefOr[scala.Double] = js.undefined
  var enableDragHandle: js.UndefOr[scala.Boolean] = js.undefined
  var onOpenChange: js.UndefOr[
    js.Function2[
      /* open */ scala.Boolean, 
      /* overlay */ js.UndefOr[rmcDashDrawerLib.Anon_OverlayClicked], 
      scala.Unit
    ]
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var position: js.UndefOr[
    rmcDashDrawerLib.rmcDashDrawerLibStrings.left | rmcDashDrawerLib.rmcDashDrawerLibStrings.right | rmcDashDrawerLib.rmcDashDrawerLibStrings.top | rmcDashDrawerLib.rmcDashDrawerLibStrings.bottom
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var sidebar: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var sidebarStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var touch: js.UndefOr[scala.Boolean] = js.undefined
  var transitions: js.UndefOr[scala.Boolean] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode | js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    className: java.lang.String = null,
    contentStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    docked: js.UndefOr[scala.Boolean] = js.undefined,
    dragHandleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    dragToggleDistance: scala.Int | scala.Double = null,
    enableDragHandle: js.UndefOr[scala.Boolean] = js.undefined,
    onOpenChange: (/* open */ scala.Boolean, /* overlay */ js.UndefOr[rmcDashDrawerLib.Anon_OverlayClicked]) => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    overlayStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    position: rmcDashDrawerLib.rmcDashDrawerLibStrings.left | rmcDashDrawerLib.rmcDashDrawerLibStrings.right | rmcDashDrawerLib.rmcDashDrawerLibStrings.top | rmcDashDrawerLib.rmcDashDrawerLibStrings.bottom = null,
    prefixCls: java.lang.String = null,
    sidebar: reactLib.reactMod.ReactNs.ReactNode = null,
    sidebarStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined,
    transitions: js.UndefOr[scala.Boolean] = js.undefined
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

