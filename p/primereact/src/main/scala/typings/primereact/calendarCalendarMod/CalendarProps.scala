package typings.primereact.calendarCalendarMod

import typings.primereact.anon.OriginalEventTarget
import typings.primereact.anon.OriginalEventValue
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.ReactNode
import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarProps extends js.Object {
  
  var appendTo: js.UndefOr[js.Any] = js.native
  
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  var autoZIndex: js.UndefOr[Boolean] = js.native
  
  var baseZIndex: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var clearButtonClassName: js.UndefOr[String] = js.native
  
  var dateFormat: js.UndefOr[String] = js.native
  
  var dateTemplate: js.UndefOr[js.Function1[/* dateMeta */ DateMetaData, ReactNode]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var disabledDates: js.UndefOr[js.Array[Date]] = js.native
  
  var disabledDays: js.UndefOr[js.Array[Double]] = js.native
  
  var footerTemplate: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var headerTemplate: js.UndefOr[js.Function0[ReactNode]] = js.native
  
  var hideOnDateTimeSelect: js.UndefOr[Boolean] = js.native
  
  var hourFormat: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var inputClassName: js.UndefOr[String] = js.native
  
  var inputId: js.UndefOr[String] = js.native
  
  var inputStyle: js.UndefOr[js.Object] = js.native
  
  var keepInvalid: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[LocaleSettings] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var maxDateCount: js.UndefOr[Double] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var monthNavigator: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var numberOfMonths: js.UndefOr[Double] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ OriginalEventTarget, Unit]] = js.native
  
  var onClearButtonClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onInput: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onSelect: js.UndefOr[js.Function1[/* e */ OriginalEventValue, Unit]] = js.native
  
  var onTodayButtonClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onViewDateChange: js.UndefOr[js.Function1[/* e */ OriginalEventValue, Unit]] = js.native
  
  var panelClassName: js.UndefOr[String] = js.native
  
  var panelStyle: js.UndefOr[js.Object] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var readOnlyInput: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var selectOtherMonths: js.UndefOr[Boolean] = js.native
  
  var selectionMode: js.UndefOr[String] = js.native
  
  var shortYearCutoff: js.UndefOr[String] = js.native
  
  var showButtonBar: js.UndefOr[Boolean] = js.native
  
  var showIcon: js.UndefOr[Boolean] = js.native
  
  var showMillisec: js.UndefOr[Boolean] = js.native
  
  var showOnFocus: js.UndefOr[Boolean] = js.native
  
  var showOtherMonths: js.UndefOr[Boolean] = js.native
  
  var showSeconds: js.UndefOr[Boolean] = js.native
  
  var showTime: js.UndefOr[Boolean] = js.native
  
  var showWeek: js.UndefOr[Boolean] = js.native
  
  var stepHour: js.UndefOr[Double] = js.native
  
  var stepMillisec: js.UndefOr[Double] = js.native
  
  var stepMinute: js.UndefOr[Double] = js.native
  
  var stepSecond: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var tabIndex: js.UndefOr[String] = js.native
  
  var timeOnly: js.UndefOr[Boolean] = js.native
  
  var todayButtonClassName: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[js.Any] = js.native
  
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  
  var touchUI: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[Date | js.Array[Date]] = js.native
  
  var view: js.UndefOr[String] = js.native
  
  var viewDate: js.UndefOr[Date] = js.native
  
  var yearNavigator: js.UndefOr[Boolean] = js.native
  
  var yearRange: js.UndefOr[String] = js.native
}
object CalendarProps {
  
  @scala.inline
  def apply(): CalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps]
  }
  
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppendTo(value: js.Any): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setAutoZIndex(value: Boolean): Self = this.set("autoZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoZIndex: Self = this.set("autoZIndex", js.undefined)
    
    @scala.inline
    def setBaseZIndex(value: Double): Self = this.set("baseZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseZIndex: Self = this.set("baseZIndex", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearButtonClassName(value: String): Self = this.set("clearButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButtonClassName: Self = this.set("clearButtonClassName", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDateTemplate(value: /* dateMeta */ DateMetaData => ReactNode): Self = this.set("dateTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDateTemplate: Self = this.set("dateTemplate", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: Date*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDates(value: js.Array[Date]): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setDisabledDaysVarargs(value: Double*): Self = this.set("disabledDays", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDays(value: js.Array[Double]): Self = this.set("disabledDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDays: Self = this.set("disabledDays", js.undefined)
    
    @scala.inline
    def setFooterTemplate(value: () => ReactNode): Self = this.set("footerTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFooterTemplate: Self = this.set("footerTemplate", js.undefined)
    
    @scala.inline
    def setHeaderTemplate(value: () => ReactNode): Self = this.set("headerTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHeaderTemplate: Self = this.set("headerTemplate", js.undefined)
    
    @scala.inline
    def setHideOnDateTimeSelect(value: Boolean): Self = this.set("hideOnDateTimeSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnDateTimeSelect: Self = this.set("hideOnDateTimeSelect", js.undefined)
    
    @scala.inline
    def setHourFormat(value: String): Self = this.set("hourFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourFormat: Self = this.set("hourFormat", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    
    @scala.inline
    def setInputStyle(value: js.Object): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setKeepInvalid(value: Boolean): Self = this.set("keepInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepInvalid: Self = this.set("keepInvalid", js.undefined)
    
    @scala.inline
    def setLocale(value: LocaleSettings): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMaxDateCount(value: Double): Self = this.set("maxDateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDateCount: Self = this.set("maxDateCount", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMonthNavigator(value: Boolean): Self = this.set("monthNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNavigator: Self = this.set("monthNavigator", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNumberOfMonths(value: Double): Self = this.set("numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfMonths: Self = this.set("numberOfMonths", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* event */ Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ OriginalEventTarget => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClearButtonClick(value: /* event */ Event => Unit): Self = this.set("onClearButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClearButtonClick: Self = this.set("onClearButtonClick", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* event */ Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInput(value: /* event */ Event => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* e */ OriginalEventValue => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnTodayButtonClick(value: /* event */ Event => Unit): Self = this.set("onTodayButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTodayButtonClick: Self = this.set("onTodayButtonClick", js.undefined)
    
    @scala.inline
    def setOnViewDateChange(value: /* e */ OriginalEventValue => Unit): Self = this.set("onViewDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnViewDateChange: Self = this.set("onViewDateChange", js.undefined)
    
    @scala.inline
    def setPanelClassName(value: String): Self = this.set("panelClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelClassName: Self = this.set("panelClassName", js.undefined)
    
    @scala.inline
    def setPanelStyle(value: js.Object): Self = this.set("panelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelStyle: Self = this.set("panelStyle", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReadOnlyInput(value: Boolean): Self = this.set("readOnlyInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnlyInput: Self = this.set("readOnlyInput", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSelectOtherMonths(value: Boolean): Self = this.set("selectOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOtherMonths: Self = this.set("selectOtherMonths", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setShortYearCutoff(value: String): Self = this.set("shortYearCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortYearCutoff: Self = this.set("shortYearCutoff", js.undefined)
    
    @scala.inline
    def setShowButtonBar(value: Boolean): Self = this.set("showButtonBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowButtonBar: Self = this.set("showButtonBar", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    
    @scala.inline
    def setShowMillisec(value: Boolean): Self = this.set("showMillisec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMillisec: Self = this.set("showMillisec", js.undefined)
    
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = this.set("showOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnFocus: Self = this.set("showOnFocus", js.undefined)
    
    @scala.inline
    def setShowOtherMonths(value: Boolean): Self = this.set("showOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOtherMonths: Self = this.set("showOtherMonths", js.undefined)
    
    @scala.inline
    def setShowSeconds(value: Boolean): Self = this.set("showSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSeconds: Self = this.set("showSeconds", js.undefined)
    
    @scala.inline
    def setShowTime(value: Boolean): Self = this.set("showTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTime: Self = this.set("showTime", js.undefined)
    
    @scala.inline
    def setShowWeek(value: Boolean): Self = this.set("showWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeek: Self = this.set("showWeek", js.undefined)
    
    @scala.inline
    def setStepHour(value: Double): Self = this.set("stepHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepHour: Self = this.set("stepHour", js.undefined)
    
    @scala.inline
    def setStepMillisec(value: Double): Self = this.set("stepMillisec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepMillisec: Self = this.set("stepMillisec", js.undefined)
    
    @scala.inline
    def setStepMinute(value: Double): Self = this.set("stepMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepMinute: Self = this.set("stepMinute", js.undefined)
    
    @scala.inline
    def setStepSecond(value: Double): Self = this.set("stepSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepSecond: Self = this.set("stepSecond", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTimeOnly(value: Boolean): Self = this.set("timeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOnly: Self = this.set("timeOnly", js.undefined)
    
    @scala.inline
    def setTodayButtonClassName(value: String): Self = this.set("todayButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayButtonClassName: Self = this.set("todayButtonClassName", js.undefined)
    
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipOptions(value: TooltipOptions): Self = this.set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipOptions: Self = this.set("tooltipOptions", js.undefined)
    
    @scala.inline
    def setTouchUI(value: Boolean): Self = this.set("touchUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchUI: Self = this.set("touchUI", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: Date*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Date | js.Array[Date]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewDate(value: Date): Self = this.set("viewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewDate: Self = this.set("viewDate", js.undefined)
    
    @scala.inline
    def setYearNavigator(value: Boolean): Self = this.set("yearNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearNavigator: Self = this.set("yearNavigator", js.undefined)
    
    @scala.inline
    def setYearRange(value: String): Self = this.set("yearRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearRange: Self = this.set("yearRange", js.undefined)
  }
}
