package typings
package rmcDashTooltipLib.esTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProps extends js.Object {
  var afterVisibleChange: js.UndefOr[js.Function] = js.undefined
  var align: js.UndefOr[js.Object] = js.undefined
  var animation: js.UndefOr[js.Any] = js.undefined
  var arrowContent: js.UndefOr[js.Any] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var destroyTooltipOnHide: js.UndefOr[scala.Boolean] = js.undefined
  var getTooltipContainer: js.UndefOr[js.Function] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function] = js.undefined
  var overlay: reactLib.reactMod.ReactNs.ReactNode | js.Function
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[js.Object] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[js.Any] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ITooltipProps {
  @scala.inline
  def apply(
    overlay: reactLib.reactMod.ReactNs.ReactNode | js.Function,
    afterVisibleChange: js.Function = null,
    align: js.Object = null,
    animation: js.Any = null,
    arrowContent: js.Any = null,
    defaultVisible: js.UndefOr[scala.Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[scala.Boolean] = js.undefined,
    getTooltipContainer: js.Function = null,
    onVisibleChange: js.Function = null,
    overlayClassName: java.lang.String = null,
    overlayStyle: js.Object = null,
    placement: java.lang.String = null,
    prefixCls: java.lang.String = null,
    transitionName: java.lang.String = null,
    trigger: js.Any = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ITooltipProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(afterVisibleChange)
    if (align != null) __obj.updateDynamic("align")(align)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (arrowContent != null) __obj.updateDynamic("arrowContent")(arrowContent)
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible)
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide)
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(getTooltipContainer)
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(onVisibleChange)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ITooltipProps]
  }
}

