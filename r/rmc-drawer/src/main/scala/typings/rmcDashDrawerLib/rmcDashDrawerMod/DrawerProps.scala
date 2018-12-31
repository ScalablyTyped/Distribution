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

