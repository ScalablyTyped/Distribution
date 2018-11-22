package typings
package rcDashTooltipLib.rcDashTooltipMod.RCTooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Props
  extends reactLib.reactMod.ReactNs.Props[js.Any] {
  var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  var align: js.UndefOr[js.Object] = js.undefined
  var arrowContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var destroyTooltipOnHide: js.UndefOr[scala.Boolean] = js.undefined
  var getTooltipContainer: js.UndefOr[js.Function0[reactLib.Element]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var mouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  var onPopupAlign: js.UndefOr[
    js.Function2[/* popupDomNode */ reactLib.Element, /* align */ js.Object, scala.Unit]
  ] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  var overlay: reactLib.reactMod.ReactNs.ReactNode
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var placement: js.UndefOr[Placement | js.Object] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

