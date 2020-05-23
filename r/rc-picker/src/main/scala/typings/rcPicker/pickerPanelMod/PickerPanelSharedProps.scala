package typings.rcPicker.pickerPanelMod

import typings.rcPicker.dateBodyMod.DateRender
import typings.rcPicker.generateMod.GenerateConfig
import typings.rcPicker.interfaceMod.Components
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.OnPanelChange
import typings.rcPicker.interfaceMod.PanelMode
import typings.rcPicker.monthBodyMod.MonthCellRender
import typings.rcPicker.rcPickerStrings.ltr
import typings.rcPicker.rcPickerStrings.rtl
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerPanelSharedProps[DateType] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /** @private Internal usage. Do not use in your production env */
  var components: js.UndefOr[Components] = js.undefined
  var dateRender: js.UndefOr[DateRender[DateType]] = js.undefined
  /** [Legacy] Set default display picker view date */
  var defaultPickerValue: js.UndefOr[DateType] = js.undefined
  var defaultValue: js.UndefOr[DateType] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.undefined
  var generateConfig: GenerateConfig[DateType]
  /** @private This is internal usage. Do not use in your production env */
  var hideHeader: js.UndefOr[Boolean] = js.undefined
  var locale: Locale
  /** @deprecated Will be removed in next big version. Please use `mode` instead */
  var mode: js.UndefOr[PanelMode] = js.undefined
  var monthCellRender: js.UndefOr[MonthCellRender[DateType]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
  var onPanelChange: js.UndefOr[OnPanelChange[DateType]] = js.undefined
  /** @private This is internal usage. Do not use in your production env */
  var onPickerValueChange: js.UndefOr[js.Function1[/* date */ DateType, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* value */ DateType, Unit]] = js.undefined
  /** [Legacy] Set default display picker view date */
  var pickerValue: js.UndefOr[DateType] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ PanelMode, ReactNode]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[DateType | Null] = js.undefined
}

object PickerPanelSharedProps {
  @scala.inline
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    className: String = null,
    components: Components = null,
    dateRender: (DateType, DateType) => ReactNode = null,
    defaultPickerValue: DateType = null,
    defaultValue: DateType = null,
    direction: ltr | rtl = null,
    disabledDate: /* date */ DateType => Boolean = null,
    hideHeader: js.UndefOr[Boolean] = js.undefined,
    mode: PanelMode = null,
    monthCellRender: (DateType, /* locale */ Locale) => ReactNode = null,
    onChange: /* value */ DateType => Unit = null,
    onMouseDown: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onOk: /* date */ DateType => Unit = null,
    onPanelChange: (DateType, /* mode */ PanelMode) => Unit = null,
    onPickerValueChange: /* date */ DateType => Unit = null,
    onSelect: /* value */ DateType => Unit = null,
    pickerValue: DateType = null,
    prefixCls: String = null,
    renderExtraFooter: /* mode */ PanelMode => ReactNode = null,
    style: CSSProperties = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Null | DateType] = js.undefined
  ): PickerPanelSharedProps[DateType] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (!js.isUndefined(hideHeader)) __obj.updateDynamic("hideHeader")(hideHeader.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (monthCellRender != null) __obj.updateDynamic("monthCellRender")(js.Any.fromFunction2(monthCellRender))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onPickerValueChange != null) __obj.updateDynamic("onPickerValueChange")(js.Any.fromFunction1(onPickerValueChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (pickerValue != null) __obj.updateDynamic("pickerValue")(pickerValue.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1(renderExtraFooter))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerPanelSharedProps[DateType]]
  }
}

