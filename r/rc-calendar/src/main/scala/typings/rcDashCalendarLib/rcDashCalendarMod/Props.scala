package typings
package rcDashCalendarLib.rcDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dateInputPlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var dateRender: js.UndefOr[
    js.Function2[
      /* current */ momentLib.momentMod.momentNs.Moment, 
      /* value */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var defaultValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var disabledDate: js.UndefOr[
    js.Function1[/* current */ js.UndefOr[momentLib.momentMod.momentNs.Moment], scala.Boolean]
  ] = js.undefined
  var disabledTime: js.UndefOr[
    js.Function1[/* current */ js.UndefOr[momentLib.momentMod.momentNs.Moment], js.Object]
  ] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* date */ momentLib.momentMod.momentNs.Moment | scala.Null, scala.Unit]
  ] = js.undefined
  var onClear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[
      /* date */ momentLib.momentMod.momentNs.Moment | scala.Null, 
      /* mode */ Mode, 
      scala.Unit
    ]
  ] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* date */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var renderSidebar: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var selectedValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var showDateInput: js.UndefOr[scala.Boolean] = js.undefined
  var showOk: js.UndefOr[scala.Boolean] = js.undefined
  var showToday: js.UndefOr[scala.Boolean] = js.undefined
  var showWeekNumber: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var timePicker: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var value: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    dateInputPlaceholder: java.lang.String = null,
    dateRender: js.Function2[
      /* current */ momentLib.momentMod.momentNs.Moment, 
      /* value */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    defaultValue: momentLib.momentMod.momentNs.Moment = null,
    disabledDate: js.Function1[/* current */ js.UndefOr[momentLib.momentMod.momentNs.Moment], scala.Boolean] = null,
    disabledTime: js.Function1[/* current */ js.UndefOr[momentLib.momentMod.momentNs.Moment], js.Object] = null,
    format: java.lang.String = null,
    locale: js.Object = null,
    mode: Mode = null,
    onChange: js.Function1[/* date */ momentLib.momentMod.momentNs.Moment | scala.Null, scala.Unit] = null,
    onClear: js.Function0[scala.Unit] = null,
    onKeyDown: js.Function0[scala.Unit] = null,
    onOk: js.Function0[scala.Unit] = null,
    onPanelChange: js.Function2[
      /* date */ momentLib.momentMod.momentNs.Moment | scala.Null, 
      /* mode */ Mode, 
      scala.Unit
    ] = null,
    onSelect: js.Function1[/* date */ momentLib.momentMod.momentNs.Moment, scala.Unit] = null,
    prefixCls: java.lang.String = null,
    renderFooter: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    renderSidebar: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    selectedValue: momentLib.momentMod.momentNs.Moment = null,
    showDateInput: js.UndefOr[scala.Boolean] = js.undefined,
    showOk: js.UndefOr[scala.Boolean] = js.undefined,
    showToday: js.UndefOr[scala.Boolean] = js.undefined,
    showWeekNumber: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    timePicker: reactLib.reactMod.ReactNs.ReactNode = null,
    value: momentLib.momentMod.momentNs.Moment = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (dateInputPlaceholder != null) __obj.updateDynamic("dateInputPlaceholder")(dateInputPlaceholder)
    if (dateRender != null) __obj.updateDynamic("dateRender")(dateRender)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(disabledDate)
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(disabledTime)
    if (format != null) __obj.updateDynamic("format")(format)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClear != null) __obj.updateDynamic("onClear")(onClear)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onOk != null) __obj.updateDynamic("onOk")(onOk)
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(onPanelChange)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter)
    if (renderSidebar != null) __obj.updateDynamic("renderSidebar")(renderSidebar)
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

