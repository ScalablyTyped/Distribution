package typings.rmcDashCascader.esCascaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICascaderProps extends js.Object {
  /** web only */
  var className: js.UndefOr[String] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var data: js.Array[ICascaderDataItem]
  var defaultValue: js.UndefOr[CascaderValue] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var indicatorStyle: js.UndefOr[js.Object] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
  /** web only */
  var onScrollChange: js.UndefOr[js.Function1[/* value */ CascaderValue, Unit]] = js.undefined
  var pickerItemStyle: js.UndefOr[js.Object] = js.undefined
  /** web only */
  var pickerPrefixCls: js.UndefOr[String] = js.undefined
  /** web only */
  var prefixCls: js.UndefOr[String] = js.undefined
  var rootNativeProps: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[CascaderValue] = js.undefined
}

object ICascaderProps {
  @scala.inline
  def apply(
    data: js.Array[ICascaderDataItem],
    className: String = null,
    cols: Int | Double = null,
    defaultValue: CascaderValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indicatorStyle: js.Object = null,
    onChange: /* value */ CascaderValue => Unit = null,
    onScrollChange: /* value */ CascaderValue => Unit = null,
    pickerItemStyle: js.Object = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    rootNativeProps: js.Object = null,
    style: js.Any = null,
    value: CascaderValue = null
  ): ICascaderProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICascaderProps]
  }
}

