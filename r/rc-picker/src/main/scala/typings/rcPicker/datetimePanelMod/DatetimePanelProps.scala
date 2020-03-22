package typings.rcPicker.datetimePanelMod

import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.DisabledTime
import typings.rcPicker.interfaceMod.DisabledTimes
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.NullableDateType
import typings.rcPicker.interfaceMod.OnSelect
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.interfaceMod.PanelRefProps
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.rcPicker.timePanelMod.SharedTimeProps
import typings.rcPicker.uiUtilMod.KeyboardConfig
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-picker.rc-picker/lib/panels/DatePanel.DatePanelProps<DateType>, 'disabledHours' | 'disabledMinutes' | 'disabledSeconds'> */
trait DatetimePanelProps[DateType] extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
  var defaultPickerValue: js.UndefOr[DateType] = js.undefined
  var defaultValue: js.UndefOr[DateType] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var disabledTime: js.UndefOr[DisabledTime[DateType]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  var keyboardConfig: js.UndefOr[KeyboardConfig] = js.undefined
  var locale: Locale
  var nextIcon: js.UndefOr[ReactNode] = js.undefined
  var onPanelChange: js.Function2[/* mode */ PanelMode | Null, /* viewValue */ DateType, Unit]
  var onSelect: OnSelect[DateType]
  var onViewDateChange: js.Function1[/* value */ DateType, Unit]
  var operationRef: MutableRefObject[PanelRefProps]
  var panelName: js.UndefOr[String] = js.undefined
  var prefixCls: String
  var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactNode]] = js.undefined
  var prevIcon: js.UndefOr[ReactNode] = js.undefined
  var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.undefined
  var showTime: js.UndefOr[Boolean | SharedTimeProps[DateType]] = js.undefined
  var superNextIcon: js.UndefOr[ReactNode] = js.undefined
  var superPrevIcon: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[NullableDateType[DateType]] = js.undefined
  var viewDate: DateType
}

object DatetimePanelProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onPanelChange: (/* mode */ PanelMode | Null, /* viewValue */ DateType) => Unit,
    onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
    onViewDateChange: /* value */ DateType => Unit,
    operationRef: MutableRefObject[PanelRefProps],
    prefixCls: String,
    viewDate: DateType,
    active: js.UndefOr[Boolean] = js.undefined,
    dateRender: (DateType, DateType) => ReactNode = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    disabledDate: /* date */ DateType => Boolean = null,
    disabledTime: /* date */ DateType | Null => DisabledTimes = null,
    keyboardConfig: KeyboardConfig = null,
    nextIcon: ReactNode = null,
    panelName: String = null,
    prefixColumn: /* date */ DateType => ReactNode = null,
    prevIcon: ReactNode = null,
    rowClassName: /* date */ DateType => String = null,
    showTime: Boolean | SharedTimeProps[DateType] = null,
    superNextIcon: ReactNode = null,
    superPrevIcon: ReactNode = null,
    value: NullableDateType[DateType] = null
  ): DatetimePanelProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onPanelChange = js.Any.fromFunction2(onPanelChange), onSelect = js.Any.fromFunction2(onSelect), onViewDateChange = js.Any.fromFunction1(onViewDateChange), operationRef = operationRef.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1(disabledTime))
    if (keyboardConfig != null) __obj.updateDynamic("keyboardConfig")(keyboardConfig.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (panelName != null) __obj.updateDynamic("panelName")(panelName.asInstanceOf[js.Any])
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1(prefixColumn))
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimePanelProps[DateType]]
  }
}

