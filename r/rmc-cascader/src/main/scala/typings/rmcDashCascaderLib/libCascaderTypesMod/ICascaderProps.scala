package typings
package rmcDashCascaderLib.libCascaderTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICascaderProps extends js.Object {
  /** web only */
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var data: js.Array[ICascaderDataItem]
  var defaultValue: js.UndefOr[CascaderValue] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var indicatorStyle: js.UndefOr[js.Object] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ CascaderValue, scala.Unit]] = js.undefined
  /** web only */
  var onScrollChange: js.UndefOr[js.Function1[/* value */ CascaderValue, scala.Unit]] = js.undefined
  var pickerItemStyle: js.UndefOr[js.Object] = js.undefined
  /** web only */
  var pickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  /** web only */
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var rootNativeProps: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[CascaderValue] = js.undefined
}

object ICascaderProps {
  @scala.inline
  def apply(
    data: js.Array[ICascaderDataItem],
    className: java.lang.String = null,
    cols: scala.Int | scala.Double = null,
    defaultValue: CascaderValue = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    indicatorStyle: js.Object = null,
    onChange: /* value */ CascaderValue => scala.Unit = null,
    onScrollChange: /* value */ CascaderValue => scala.Unit = null,
    pickerItemStyle: js.Object = null,
    pickerPrefixCls: java.lang.String = null,
    prefixCls: java.lang.String = null,
    rootNativeProps: js.Object = null,
    style: js.Any = null,
    value: CascaderValue = null
  ): ICascaderProps = {
    val __obj = js.Dynamic.literal(data = data)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle)
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ICascaderProps]
  }
}

