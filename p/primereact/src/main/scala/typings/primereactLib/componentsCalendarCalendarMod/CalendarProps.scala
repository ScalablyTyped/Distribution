package typings
package primereactLib.componentsCalendarCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.undefined
  var autoZIndex: js.UndefOr[scala.Boolean] = js.undefined
  var baseZIndex: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clearButtonStyleClass: js.UndefOr[java.lang.String] = js.undefined
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  var dateTemplate: js.UndefOr[js.Function1[/* dateMeta */ DateMetaData, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledDates: js.UndefOr[js.Array[stdLib.Date]] = js.undefined
  var disabledDays: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var footerTemplate: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var headerTemplate: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var hideOnDateTimeSelect: js.UndefOr[scala.Boolean] = js.undefined
  var hourFormat: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  var inputStyle: js.UndefOr[js.Object] = js.undefined
  var locale: js.UndefOr[LocaleSettings] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var maxDateCount: js.UndefOr[scala.Double] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var monthNavigator: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var numberOfMonths: js.UndefOr[scala.Double] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValueArray, scala.Unit]] = js.undefined
  var onClearButtonClick: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onInput: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValueDate, scala.Unit]] = js.undefined
  var onTodayButtonClick: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var onViewDateChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValueDate, scala.Unit]] = js.undefined
  var panelClassName: js.UndefOr[java.lang.String] = js.undefined
  var panelStyle: js.UndefOr[js.Object] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnlyInput: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var selectOtherMonths: js.UndefOr[scala.Boolean] = js.undefined
  var selectionMode: js.UndefOr[java.lang.String] = js.undefined
  var shortYearCutoff: js.UndefOr[java.lang.String] = js.undefined
  var showButtonBar: js.UndefOr[scala.Boolean] = js.undefined
  var showIcon: js.UndefOr[scala.Boolean] = js.undefined
  var showOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var showOtherMonths: js.UndefOr[scala.Boolean] = js.undefined
  var showSeconds: js.UndefOr[scala.Boolean] = js.undefined
  var showTime: js.UndefOr[scala.Boolean] = js.undefined
  var stepHour: js.UndefOr[scala.Double] = js.undefined
  var stepMinute: js.UndefOr[scala.Double] = js.undefined
  var stepSecond: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
  var timeOnly: js.UndefOr[scala.Boolean] = js.undefined
  var todayButtonClassName: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var touchUI: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[stdLib.Date | js.Array[stdLib.Date]] = js.undefined
  var view: js.UndefOr[java.lang.String] = js.undefined
  var viewDate: js.UndefOr[stdLib.Date] = js.undefined
  var yearNavigator: js.UndefOr[scala.Boolean] = js.undefined
  var yearRange: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply(
    appendTo: js.Any = null,
    autoZIndex: js.UndefOr[scala.Boolean] = js.undefined,
    baseZIndex: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    clearButtonStyleClass: java.lang.String = null,
    dateFormat: java.lang.String = null,
    dateTemplate: /* dateMeta */ DateMetaData => reactLib.reactMod.ReactNs.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledDates: js.Array[stdLib.Date] = null,
    disabledDays: js.Array[scala.Double] = null,
    footerTemplate: () => reactLib.reactMod.ReactNs.ReactNode = null,
    headerTemplate: () => reactLib.reactMod.ReactNs.ReactNode = null,
    hideOnDateTimeSelect: js.UndefOr[scala.Boolean] = js.undefined,
    hourFormat: java.lang.String = null,
    icon: java.lang.String = null,
    id: java.lang.String = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    inputClassName: java.lang.String = null,
    inputId: java.lang.String = null,
    inputStyle: js.Object = null,
    locale: LocaleSettings = null,
    maxDate: stdLib.Date = null,
    maxDateCount: scala.Int | scala.Double = null,
    minDate: stdLib.Date = null,
    monthNavigator: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    numberOfMonths: scala.Int | scala.Double = null,
    onBlur: /* event */ stdLib.Event => scala.Unit = null,
    onChange: /* e */ primereactLib.Anon_OriginalEventValueArray => scala.Unit = null,
    onClearButtonClick: /* event */ stdLib.Event => scala.Unit = null,
    onFocus: /* event */ stdLib.Event => scala.Unit = null,
    onInput: /* event */ stdLib.Event => scala.Unit = null,
    onSelect: /* e */ primereactLib.Anon_OriginalEventValueDate => scala.Unit = null,
    onTodayButtonClick: /* event */ stdLib.Event => scala.Unit = null,
    onViewDateChange: /* e */ primereactLib.Anon_OriginalEventValueDate => scala.Unit = null,
    panelClassName: java.lang.String = null,
    panelStyle: js.Object = null,
    placeholder: java.lang.String = null,
    readOnlyInput: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    selectOtherMonths: js.UndefOr[scala.Boolean] = js.undefined,
    selectionMode: java.lang.String = null,
    shortYearCutoff: java.lang.String = null,
    showButtonBar: js.UndefOr[scala.Boolean] = js.undefined,
    showIcon: js.UndefOr[scala.Boolean] = js.undefined,
    showOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    showOtherMonths: js.UndefOr[scala.Boolean] = js.undefined,
    showSeconds: js.UndefOr[scala.Boolean] = js.undefined,
    showTime: js.UndefOr[scala.Boolean] = js.undefined,
    stepHour: scala.Int | scala.Double = null,
    stepMinute: scala.Int | scala.Double = null,
    stepSecond: scala.Int | scala.Double = null,
    style: js.Object = null,
    tabIndex: java.lang.String = null,
    timeOnly: js.UndefOr[scala.Boolean] = js.undefined,
    todayButtonClassName: java.lang.String = null,
    tooltip: js.Any = null,
    tooltipOptions: primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions = null,
    touchUI: js.UndefOr[scala.Boolean] = js.undefined,
    value: stdLib.Date | js.Array[stdLib.Date] = null,
    view: java.lang.String = null,
    viewDate: stdLib.Date = null,
    yearNavigator: js.UndefOr[scala.Boolean] = js.undefined,
    yearRange: java.lang.String = null
  ): CalendarProps = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo)
    if (!js.isUndefined(autoZIndex)) __obj.updateDynamic("autoZIndex")(autoZIndex)
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (clearButtonStyleClass != null) __obj.updateDynamic("clearButtonStyleClass")(clearButtonStyleClass)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (dateTemplate != null) __obj.updateDynamic("dateTemplate")(js.Any.fromFunction1(dateTemplate))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates)
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays)
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(js.Any.fromFunction0(footerTemplate))
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(js.Any.fromFunction0(headerTemplate))
    if (!js.isUndefined(hideOnDateTimeSelect)) __obj.updateDynamic("hideOnDateTimeSelect")(hideOnDateTimeSelect)
    if (hourFormat != null) __obj.updateDynamic("hourFormat")(hourFormat)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (maxDateCount != null) __obj.updateDynamic("maxDateCount")(maxDateCount.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (!js.isUndefined(monthNavigator)) __obj.updateDynamic("monthNavigator")(monthNavigator)
    if (name != null) __obj.updateDynamic("name")(name)
    if (numberOfMonths != null) __obj.updateDynamic("numberOfMonths")(numberOfMonths.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClearButtonClick != null) __obj.updateDynamic("onClearButtonClick")(js.Any.fromFunction1(onClearButtonClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onTodayButtonClick != null) __obj.updateDynamic("onTodayButtonClick")(js.Any.fromFunction1(onTodayButtonClick))
    if (onViewDateChange != null) __obj.updateDynamic("onViewDateChange")(js.Any.fromFunction1(onViewDateChange))
    if (panelClassName != null) __obj.updateDynamic("panelClassName")(panelClassName)
    if (panelStyle != null) __obj.updateDynamic("panelStyle")(panelStyle)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnlyInput)) __obj.updateDynamic("readOnlyInput")(readOnlyInput)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(selectOtherMonths)) __obj.updateDynamic("selectOtherMonths")(selectOtherMonths)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (shortYearCutoff != null) __obj.updateDynamic("shortYearCutoff")(shortYearCutoff)
    if (!js.isUndefined(showButtonBar)) __obj.updateDynamic("showButtonBar")(showButtonBar)
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon)
    if (!js.isUndefined(showOnFocus)) __obj.updateDynamic("showOnFocus")(showOnFocus)
    if (!js.isUndefined(showOtherMonths)) __obj.updateDynamic("showOtherMonths")(showOtherMonths)
    if (!js.isUndefined(showSeconds)) __obj.updateDynamic("showSeconds")(showSeconds)
    if (!js.isUndefined(showTime)) __obj.updateDynamic("showTime")(showTime)
    if (stepHour != null) __obj.updateDynamic("stepHour")(stepHour.asInstanceOf[js.Any])
    if (stepMinute != null) __obj.updateDynamic("stepMinute")(stepMinute.asInstanceOf[js.Any])
    if (stepSecond != null) __obj.updateDynamic("stepSecond")(stepSecond.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (!js.isUndefined(timeOnly)) __obj.updateDynamic("timeOnly")(timeOnly)
    if (todayButtonClassName != null) __obj.updateDynamic("todayButtonClassName")(todayButtonClassName)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions)
    if (!js.isUndefined(touchUI)) __obj.updateDynamic("touchUI")(touchUI)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (viewDate != null) __obj.updateDynamic("viewDate")(viewDate)
    if (!js.isUndefined(yearNavigator)) __obj.updateDynamic("yearNavigator")(yearNavigator)
    if (yearRange != null) __obj.updateDynamic("yearRange")(yearRange)
    __obj.asInstanceOf[CalendarProps]
  }
}

