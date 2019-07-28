package typings.rmcDashPicker.libPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultSelectedValue: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var indicatorClassName: js.UndefOr[String] = js.undefined
  var indicatorStyle: js.UndefOr[js.Any] = js.undefined
  var itemStyle: js.UndefOr[js.Any] = js.undefined
  var noAnimate: js.UndefOr[Boolean] = js.undefined
  var onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  /** web only */
  var prefixCls: js.UndefOr[String] = js.undefined
  var selectedValue: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object IPickerProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultSelectedValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indicatorClassName: String = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    noAnimate: js.UndefOr[Boolean] = js.undefined,
    onScrollChange: /* value */ js.Any => Unit = null,
    onValueChange: /* value */ js.Any => Unit = null,
    prefixCls: String = null,
    selectedValue: js.Any = null,
    style: js.Any = null
  ): IPickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultSelectedValue != null) __obj.updateDynamic("defaultSelectedValue")(defaultSelectedValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (indicatorClassName != null) __obj.updateDynamic("indicatorClassName")(indicatorClassName)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (!js.isUndefined(noAnimate)) __obj.updateDynamic("noAnimate")(noAnimate)
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IPickerProps]
  }
}

