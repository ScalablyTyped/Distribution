package typings.primereact

import typings.primereact.anon.OriginalEventTarget
import typings.primereact.anon.OriginalEventValue
import typings.primereact.tooltipOptionsMod.TooltipOptions
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Date
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarCalendarMod {
  
  @JSImport("primereact/components/calendar/Calendar", "Calendar")
  @js.native
  class Calendar protected ()
    extends Component[CalendarProps, js.Any, js.Any] {
    def this(props: CalendarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CalendarProps, context: js.Any) = this()
  }
  
  trait CalendarProps extends StObject {
    
    var appendTo: js.UndefOr[js.Any] = js.undefined
    
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButtonClassName: js.UndefOr[String] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var dateTemplate: js.UndefOr[js.Function1[/* dateMeta */ DateMetaData, ReactNode]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledDates: js.UndefOr[js.Array[Date]] = js.undefined
    
    var disabledDays: js.UndefOr[js.Array[Double]] = js.undefined
    
    var footerTemplate: js.UndefOr[js.Function0[ReactNode]] = js.undefined
    
    var headerTemplate: js.UndefOr[js.Function0[ReactNode]] = js.undefined
    
    var hideOnDateTimeSelect: js.UndefOr[Boolean] = js.undefined
    
    var hourFormat: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var inputClassName: js.UndefOr[String] = js.undefined
    
    var inputId: js.UndefOr[String] = js.undefined
    
    var inputStyle: js.UndefOr[js.Object] = js.undefined
    
    var keepInvalid: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[LocaleSettings] = js.undefined
    
    var maxDate: js.UndefOr[Date] = js.undefined
    
    var maxDateCount: js.UndefOr[Double] = js.undefined
    
    var minDate: js.UndefOr[Date] = js.undefined
    
    var monthNavigator: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var numberOfMonths: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ OriginalEventTarget, Unit]] = js.undefined
    
    var onClearButtonClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onInput: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* e */ OriginalEventValue, Unit]] = js.undefined
    
    var onTodayButtonClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onViewDateChange: js.UndefOr[js.Function1[/* e */ OriginalEventValue, Unit]] = js.undefined
    
    var panelClassName: js.UndefOr[String] = js.undefined
    
    var panelStyle: js.UndefOr[js.Object] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var readOnlyInput: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var selectOtherMonths: js.UndefOr[Boolean] = js.undefined
    
    var selectionMode: js.UndefOr[String] = js.undefined
    
    var shortYearCutoff: js.UndefOr[String] = js.undefined
    
    var showButtonBar: js.UndefOr[Boolean] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var showMillisec: js.UndefOr[Boolean] = js.undefined
    
    var showOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var showOtherMonths: js.UndefOr[Boolean] = js.undefined
    
    var showSeconds: js.UndefOr[Boolean] = js.undefined
    
    var showTime: js.UndefOr[Boolean] = js.undefined
    
    var showWeek: js.UndefOr[Boolean] = js.undefined
    
    var stepHour: js.UndefOr[Double] = js.undefined
    
    var stepMillisec: js.UndefOr[Double] = js.undefined
    
    var stepMinute: js.UndefOr[Double] = js.undefined
    
    var stepSecond: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabIndex: js.UndefOr[String] = js.undefined
    
    var timeOnly: js.UndefOr[Boolean] = js.undefined
    
    var todayButtonClassName: js.UndefOr[String] = js.undefined
    
    var tooltip: js.UndefOr[js.Any] = js.undefined
    
    var tooltipOptions: js.UndefOr[TooltipOptions] = js.undefined
    
    var touchUI: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Date | js.Array[Date]] = js.undefined
    
    var view: js.UndefOr[String] = js.undefined
    
    var viewDate: js.UndefOr[Date] = js.undefined
    
    var yearNavigator: js.UndefOr[Boolean] = js.undefined
    
    var yearRange: js.UndefOr[String] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(): CalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps]
    }
    
    extension [Self <: CalendarProps](x: Self) {
      
      inline def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButtonClassName(value: String): Self = StObject.set(x, "clearButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setClearButtonClassNameUndefined: Self = StObject.set(x, "clearButtonClassName", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDateTemplate(value: /* dateMeta */ DateMetaData => ReactNode): Self = StObject.set(x, "dateTemplate", js.Any.fromFunction1(value))
      
      inline def setDateTemplateUndefined: Self = StObject.set(x, "dateTemplate", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledDates(value: js.Array[Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: Date*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      inline def setDisabledDays(value: js.Array[Double]): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      inline def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      inline def setDisabledDaysVarargs(value: Double*): Self = StObject.set(x, "disabledDays", js.Array(value :_*))
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFooterTemplate(value: () => ReactNode): Self = StObject.set(x, "footerTemplate", js.Any.fromFunction0(value))
      
      inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      inline def setHeaderTemplate(value: () => ReactNode): Self = StObject.set(x, "headerTemplate", js.Any.fromFunction0(value))
      
      inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      inline def setHideOnDateTimeSelect(value: Boolean): Self = StObject.set(x, "hideOnDateTimeSelect", value.asInstanceOf[js.Any])
      
      inline def setHideOnDateTimeSelectUndefined: Self = StObject.set(x, "hideOnDateTimeSelect", js.undefined)
      
      inline def setHourFormat(value: String): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
      
      inline def setHourFormatUndefined: Self = StObject.set(x, "hourFormat", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setInputStyle(value: js.Object): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setKeepInvalid(value: Boolean): Self = StObject.set(x, "keepInvalid", value.asInstanceOf[js.Any])
      
      inline def setKeepInvalidUndefined: Self = StObject.set(x, "keepInvalid", js.undefined)
      
      inline def setLocale(value: LocaleSettings): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateCount(value: Double): Self = StObject.set(x, "maxDateCount", value.asInstanceOf[js.Any])
      
      inline def setMaxDateCountUndefined: Self = StObject.set(x, "maxDateCount", js.undefined)
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthNavigator(value: Boolean): Self = StObject.set(x, "monthNavigator", value.asInstanceOf[js.Any])
      
      inline def setMonthNavigatorUndefined: Self = StObject.set(x, "monthNavigator", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      inline def setOnBlur(value: /* event */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* e */ OriginalEventTarget => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClearButtonClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onClearButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnClearButtonClickUndefined: Self = StObject.set(x, "onClearButtonClick", js.undefined)
      
      inline def setOnFocus(value: /* event */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInput(value: /* event */ Event => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      inline def setOnSelect(value: /* e */ OriginalEventValue => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnTodayButtonClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onTodayButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnTodayButtonClickUndefined: Self = StObject.set(x, "onTodayButtonClick", js.undefined)
      
      inline def setOnViewDateChange(value: /* e */ OriginalEventValue => Unit): Self = StObject.set(x, "onViewDateChange", js.Any.fromFunction1(value))
      
      inline def setOnViewDateChangeUndefined: Self = StObject.set(x, "onViewDateChange", js.undefined)
      
      inline def setPanelClassName(value: String): Self = StObject.set(x, "panelClassName", value.asInstanceOf[js.Any])
      
      inline def setPanelClassNameUndefined: Self = StObject.set(x, "panelClassName", js.undefined)
      
      inline def setPanelStyle(value: js.Object): Self = StObject.set(x, "panelStyle", value.asInstanceOf[js.Any])
      
      inline def setPanelStyleUndefined: Self = StObject.set(x, "panelStyle", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnlyInput(value: Boolean): Self = StObject.set(x, "readOnlyInput", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyInputUndefined: Self = StObject.set(x, "readOnlyInput", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSelectOtherMonths(value: Boolean): Self = StObject.set(x, "selectOtherMonths", value.asInstanceOf[js.Any])
      
      inline def setSelectOtherMonthsUndefined: Self = StObject.set(x, "selectOtherMonths", js.undefined)
      
      inline def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShortYearCutoff(value: String): Self = StObject.set(x, "shortYearCutoff", value.asInstanceOf[js.Any])
      
      inline def setShortYearCutoffUndefined: Self = StObject.set(x, "shortYearCutoff", js.undefined)
      
      inline def setShowButtonBar(value: Boolean): Self = StObject.set(x, "showButtonBar", value.asInstanceOf[js.Any])
      
      inline def setShowButtonBarUndefined: Self = StObject.set(x, "showButtonBar", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setShowMillisec(value: Boolean): Self = StObject.set(x, "showMillisec", value.asInstanceOf[js.Any])
      
      inline def setShowMillisecUndefined: Self = StObject.set(x, "showMillisec", js.undefined)
      
      inline def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      inline def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      inline def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
      
      inline def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
      
      inline def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
      
      inline def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
      
      inline def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      inline def setShowWeek(value: Boolean): Self = StObject.set(x, "showWeek", value.asInstanceOf[js.Any])
      
      inline def setShowWeekUndefined: Self = StObject.set(x, "showWeek", js.undefined)
      
      inline def setStepHour(value: Double): Self = StObject.set(x, "stepHour", value.asInstanceOf[js.Any])
      
      inline def setStepHourUndefined: Self = StObject.set(x, "stepHour", js.undefined)
      
      inline def setStepMillisec(value: Double): Self = StObject.set(x, "stepMillisec", value.asInstanceOf[js.Any])
      
      inline def setStepMillisecUndefined: Self = StObject.set(x, "stepMillisec", js.undefined)
      
      inline def setStepMinute(value: Double): Self = StObject.set(x, "stepMinute", value.asInstanceOf[js.Any])
      
      inline def setStepMinuteUndefined: Self = StObject.set(x, "stepMinute", js.undefined)
      
      inline def setStepSecond(value: Double): Self = StObject.set(x, "stepSecond", value.asInstanceOf[js.Any])
      
      inline def setStepSecondUndefined: Self = StObject.set(x, "stepSecond", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTimeOnly(value: Boolean): Self = StObject.set(x, "timeOnly", value.asInstanceOf[js.Any])
      
      inline def setTimeOnlyUndefined: Self = StObject.set(x, "timeOnly", js.undefined)
      
      inline def setTodayButtonClassName(value: String): Self = StObject.set(x, "todayButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setTodayButtonClassNameUndefined: Self = StObject.set(x, "todayButtonClassName", js.undefined)
      
      inline def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTouchUI(value: Boolean): Self = StObject.set(x, "touchUI", value.asInstanceOf[js.Any])
      
      inline def setTouchUIUndefined: Self = StObject.set(x, "touchUI", js.undefined)
      
      inline def setValue(value: Date | js.Array[Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Date*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewDate(value: Date): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
      
      inline def setViewDateUndefined: Self = StObject.set(x, "viewDate", js.undefined)
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setYearNavigator(value: Boolean): Self = StObject.set(x, "yearNavigator", value.asInstanceOf[js.Any])
      
      inline def setYearNavigatorUndefined: Self = StObject.set(x, "yearNavigator", js.undefined)
      
      inline def setYearRange(value: String): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
      
      inline def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    }
  }
  
  trait DateMetaData extends StObject {
    
    var day: Double
    
    var month: Double
    
    var otherMonth: Boolean
    
    var selectable: Boolean
    
    var today: Boolean
    
    var year: Double
  }
  object DateMetaData {
    
    inline def apply(day: Double, month: Double, otherMonth: Boolean, selectable: Boolean, today: Boolean, year: Double): DateMetaData = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], otherMonth = otherMonth.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateMetaData]
    }
    
    extension [Self <: DateMetaData](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setOtherMonth(value: Boolean): Self = StObject.set(x, "otherMonth", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocaleSettings extends StObject {
    
    var clear: String
    
    var dayNames: js.Array[String]
    
    var dayNamesMin: js.Array[String]
    
    var dayNamesShort: js.Array[String]
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var monthNames: js.Array[String]
    
    var monthNamesShort: js.Array[String]
    
    var today: String
  }
  object LocaleSettings {
    
    inline def apply(
      clear: String,
      dayNames: js.Array[String],
      dayNamesMin: js.Array[String],
      dayNamesShort: js.Array[String],
      monthNames: js.Array[String],
      monthNamesShort: js.Array[String],
      today: String
    ): LocaleSettings = {
      val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], dayNamesMin = dayNamesMin.asInstanceOf[js.Any], dayNamesShort = dayNamesShort.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], monthNamesShort = monthNamesShort.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleSettings]
    }
    
    extension [Self <: LocaleSettings](x: Self) {
      
      inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      inline def setDayNamesMin(value: js.Array[String]): Self = StObject.set(x, "dayNamesMin", value.asInstanceOf[js.Any])
      
      inline def setDayNamesMinVarargs(value: String*): Self = StObject.set(x, "dayNamesMin", js.Array(value :_*))
      
      inline def setDayNamesShort(value: js.Array[String]): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
      
      inline def setDayNamesShortVarargs(value: String*): Self = StObject.set(x, "dayNamesShort", js.Array(value :_*))
      
      inline def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesShort(value: js.Array[String]): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesShortVarargs(value: String*): Self = StObject.set(x, "monthNamesShort", js.Array(value :_*))
      
      inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
      
      inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    }
  }
}
