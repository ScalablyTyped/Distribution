package typings.rcDashCalendar.rcDashCalendarMod

import typings.moment.momentMod.Moment
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dateInputPlaceholder: js.UndefOr[String] = js.undefined
  var dateRender: js.UndefOr[js.Function2[/* current */ Moment, /* value */ Moment, ReactNode]] = js.undefined
  var defaultValue: js.UndefOr[Moment] = js.undefined
  var disabledDate: js.UndefOr[js.Function1[/* current */ js.UndefOr[Moment], Boolean]] = js.undefined
  var disabledTime: js.UndefOr[js.Function1[/* current */ js.UndefOr[Moment], js.Object]] = js.undefined
  var format: js.UndefOr[String | js.Array[String]] = js.undefined
  var inputMode: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* date */ Moment | Null, Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPanelChange: js.UndefOr[js.Function2[/* date */ Moment | Null, /* mode */ Mode, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* date */ Moment, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var renderSidebar: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var selectedValue: js.UndefOr[Moment] = js.undefined
  var showDateInput: js.UndefOr[Boolean] = js.undefined
  var showOk: js.UndefOr[Boolean] = js.undefined
  var showToday: js.UndefOr[Boolean] = js.undefined
  var showWeekNumber: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var timePicker: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[Moment] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    className: String = null,
    dateInputPlaceholder: String = null,
    dateRender: (/* current */ Moment, /* value */ Moment) => ReactNode = null,
    defaultValue: Moment = null,
    disabledDate: /* current */ js.UndefOr[Moment] => Boolean = null,
    disabledTime: /* current */ js.UndefOr[Moment] => js.Object = null,
    format: String | js.Array[String] = null,
    inputMode: String = null,
    locale: js.Object = null,
    mode: Mode = null,
    onChange: /* date */ Moment | Null => Unit = null,
    onClear: () => Unit = null,
    onKeyDown: () => Unit = null,
    onOk: () => Unit = null,
    onPanelChange: (/* date */ Moment | Null, /* mode */ Mode) => Unit = null,
    onSelect: /* date */ Moment => Unit = null,
    prefixCls: String = null,
    renderFooter: () => ReactNode = null,
    renderSidebar: () => ReactNode = null,
    selectedValue: Moment = null,
    showDateInput: js.UndefOr[Boolean] = js.undefined,
    showOk: js.UndefOr[Boolean] = js.undefined,
    showToday: js.UndefOr[Boolean] = js.undefined,
    showWeekNumber: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    timePicker: ReactNode = null,
    value: Moment = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (dateInputPlaceholder != null) __obj.updateDynamic("dateInputPlaceholder")(dateInputPlaceholder)
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction1(disabledTime))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction0(onKeyDown))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction0(onOk))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(js.Any.fromFunction0(renderFooter))
    if (renderSidebar != null) __obj.updateDynamic("renderSidebar")(js.Any.fromFunction0(renderSidebar))
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue)
    if (!js.isUndefined(showDateInput)) __obj.updateDynamic("showDateInput")(showDateInput)
    if (!js.isUndefined(showOk)) __obj.updateDynamic("showOk")(showOk)
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday)
    if (!js.isUndefined(showWeekNumber)) __obj.updateDynamic("showWeekNumber")(showWeekNumber)
    if (style != null) __obj.updateDynamic("style")(style)
    if (timePicker != null) __obj.updateDynamic("timePicker")(timePicker.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Props]
  }
}

