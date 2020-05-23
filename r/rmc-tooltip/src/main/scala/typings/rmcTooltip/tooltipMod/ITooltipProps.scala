package typings.rmcTooltip.tooltipMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProps extends js.Object {
  var afterVisibleChange: js.UndefOr[js.Function] = js.undefined
  var align: js.UndefOr[js.Object] = js.undefined
  var animation: js.UndefOr[js.Any] = js.undefined
  var arrowContent: js.UndefOr[js.Any] = js.undefined
  var defaultVisible: js.UndefOr[Boolean] = js.undefined
  var destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined
  var getTooltipContainer: js.UndefOr[js.Function] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function] = js.undefined
  var overlay: ReactNode | js.Function
  var overlayClassName: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[js.Object] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[js.Any] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ITooltipProps {
  @scala.inline
  def apply(
    afterVisibleChange: js.Function = null,
    align: js.Object = null,
    animation: js.Any = null,
    arrowContent: js.Any = null,
    defaultVisible: js.UndefOr[Boolean] = js.undefined,
    destroyTooltipOnHide: js.UndefOr[Boolean] = js.undefined,
    getTooltipContainer: js.Function = null,
    onVisibleChange: js.Function = null,
    overlay: ReactNode | js.Function = null,
    overlayClassName: String = null,
    overlayStyle: js.Object = null,
    placement: String = null,
    prefixCls: String = null,
    transitionName: String = null,
    trigger: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ITooltipProps = {
    val __obj = js.Dynamic.literal()
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(afterVisibleChange.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (arrowContent != null) __obj.updateDynamic("arrowContent")(arrowContent.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultVisible)) __obj.updateDynamic("defaultVisible")(defaultVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyTooltipOnHide)) __obj.updateDynamic("destroyTooltipOnHide")(destroyTooltipOnHide.get.asInstanceOf[js.Any])
    if (getTooltipContainer != null) __obj.updateDynamic("getTooltipContainer")(getTooltipContainer.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(onVisibleChange.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipProps]
  }
}

