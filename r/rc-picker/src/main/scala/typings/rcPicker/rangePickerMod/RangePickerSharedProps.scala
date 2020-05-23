package typings.rcPicker.rangePickerMod

import typings.rcPicker.interfaceMod.DisabledTimes
import typings.rcPicker.interfaceMod.EventValue
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.interfaceMod.RangeValue
import typings.rcPicker.rcPickerNumbers.`0`
import typings.rcPicker.rcPickerNumbers.`1`
import typings.rcPicker.rcPickerStrings.end
import typings.rcPicker.rcPickerStrings.ltr
import typings.rcPicker.rcPickerStrings.rtl
import typings.rcPicker.rcPickerStrings.start
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ReactNode
import typings.std.Exclude
import typings.std.HTMLInputElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangePickerSharedProps[DateType] extends js.Object {
  /** @private Internal control of active picker. Do not use since it's private usage */
  var activePickerIndex: js.UndefOr[`0` | `1`] = js.undefined
  var allowEmpty: js.UndefOr[js.Tuple2[Boolean, Boolean]] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var defaultPickerValue: js.UndefOr[js.Tuple2[DateType, DateType]] = js.undefined
  var defaultValue: js.UndefOr[RangeValue[DateType]] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var disabled: js.UndefOr[Boolean | (js.Tuple2[Boolean, Boolean])] = js.undefined
  var disabledTime: js.UndefOr[
    js.Function2[/* date */ EventValue[DateType], /* type */ start | end, DisabledTimes]
  ] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[js.Tuple2[PanelMode, PanelMode]] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onCalendarChange: js.UndefOr[
    js.Function2[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* values */ RangeValue[DateType], 
      /* formatString */ js.Tuple2[String, String], 
      Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* dates */ RangeValue[DateType], Unit]] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode], Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var ranges: js.UndefOr[
    Record[
      String, 
      (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
    ]
  ] = js.undefined
  var separator: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[RangeValue[DateType]] = js.undefined
}

object RangePickerSharedProps {
  @scala.inline
  def apply[DateType](
    activePickerIndex: `0` | `1` = null,
    allowEmpty: js.Tuple2[Boolean, Boolean] = null,
    autoComplete: String = null,
    defaultPickerValue: js.Tuple2[DateType, DateType] = null,
    defaultValue: js.UndefOr[Null | RangeValue[DateType]] = js.undefined,
    direction: ltr | rtl = null,
    disabled: Boolean | (js.Tuple2[Boolean, Boolean]) = null,
    disabledTime: (/* date */ EventValue[DateType], /* type */ start | end) => DisabledTimes = null,
    id: String = null,
    mode: js.Tuple2[PanelMode, PanelMode] = null,
    onBlur: FocusEvent[HTMLInputElement] => Unit = null,
    onCalendarChange: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit = null,
    onChange: (/* values */ RangeValue[DateType], /* formatString */ js.Tuple2[String, String]) => Unit = null,
    onFocus: FocusEvent[HTMLInputElement] => Unit = null,
    onOk: /* dates */ RangeValue[DateType] => Unit = null,
    onPanelChange: (/* values */ RangeValue[DateType], /* modes */ js.Tuple2[PanelMode, PanelMode]) => Unit = null,
    placeholder: js.Tuple2[String, String] = null,
    ranges: Record[
      String, 
      (Exclude[RangeValue[DateType], Null]) | (js.Function0[Exclude[RangeValue[DateType], Null]])
    ] = null,
    separator: ReactNode = null,
    value: js.UndefOr[Null | RangeValue[DateType]] = js.undefined
  ): RangePickerSharedProps[DateType] = {
    val __obj = js.Dynamic.literal()
    if (activePickerIndex != null) __obj.updateDynamic("activePickerIndex")(activePickerIndex.asInstanceOf[js.Any])
    if (allowEmpty != null) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction2(disabledTime))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCalendarChange != null) __obj.updateDynamic("onCalendarChange")(js.Any.fromFunction2(onCalendarChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerSharedProps[DateType]]
  }
}

