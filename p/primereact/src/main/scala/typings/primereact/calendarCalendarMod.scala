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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait CalendarProps extends StObject {
    
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
    implicit class CalendarPropsMutableBuilder[Self <: CalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      @scala.inline
      def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearButtonClassName(value: String): Self = StObject.set(x, "clearButtonClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonClassNameUndefined: Self = StObject.set(x, "clearButtonClassName", js.undefined)
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setDateTemplate(value: /* dateMeta */ DateMetaData => ReactNode): Self = StObject.set(x, "dateTemplate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDateTemplateUndefined: Self = StObject.set(x, "dateTemplate", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDates(value: js.Array[Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      @scala.inline
      def setDisabledDatesVarargs(value: Date*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
      
      @scala.inline
      def setDisabledDays(value: js.Array[Double]): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      @scala.inline
      def setDisabledDaysVarargs(value: Double*): Self = StObject.set(x, "disabledDays", js.Array(value :_*))
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFooterTemplate(value: () => ReactNode): Self = StObject.set(x, "footerTemplate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
      
      @scala.inline
      def setHeaderTemplate(value: () => ReactNode): Self = StObject.set(x, "headerTemplate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setHideOnDateTimeSelect(value: Boolean): Self = StObject.set(x, "hideOnDateTimeSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnDateTimeSelectUndefined: Self = StObject.set(x, "hideOnDateTimeSelect", js.undefined)
      
      @scala.inline
      def setHourFormat(value: String): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourFormatUndefined: Self = StObject.set(x, "hourFormat", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      @scala.inline
      def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      @scala.inline
      def setInputStyle(value: js.Object): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      @scala.inline
      def setKeepInvalid(value: Boolean): Self = StObject.set(x, "keepInvalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepInvalidUndefined: Self = StObject.set(x, "keepInvalid", js.undefined)
      
      @scala.inline
      def setLocale(value: LocaleSettings): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateCount(value: Double): Self = StObject.set(x, "maxDateCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateCountUndefined: Self = StObject.set(x, "maxDateCount", js.undefined)
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMonthNavigator(value: Boolean): Self = StObject.set(x, "monthNavigator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNavigatorUndefined: Self = StObject.set(x, "monthNavigator", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumberOfMonths(value: Double): Self = StObject.set(x, "numberOfMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfMonthsUndefined: Self = StObject.set(x, "numberOfMonths", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ OriginalEventTarget => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClearButtonClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onClearButtonClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClearButtonClickUndefined: Self = StObject.set(x, "onClearButtonClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: /* event */ Event => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* e */ OriginalEventValue => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnTodayButtonClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onTodayButtonClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTodayButtonClickUndefined: Self = StObject.set(x, "onTodayButtonClick", js.undefined)
      
      @scala.inline
      def setOnViewDateChange(value: /* e */ OriginalEventValue => Unit): Self = StObject.set(x, "onViewDateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnViewDateChangeUndefined: Self = StObject.set(x, "onViewDateChange", js.undefined)
      
      @scala.inline
      def setPanelClassName(value: String): Self = StObject.set(x, "panelClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelClassNameUndefined: Self = StObject.set(x, "panelClassName", js.undefined)
      
      @scala.inline
      def setPanelStyle(value: js.Object): Self = StObject.set(x, "panelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelStyleUndefined: Self = StObject.set(x, "panelStyle", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnlyInput(value: Boolean): Self = StObject.set(x, "readOnlyInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyInputUndefined: Self = StObject.set(x, "readOnlyInput", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setSelectOtherMonths(value: Boolean): Self = StObject.set(x, "selectOtherMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectOtherMonthsUndefined: Self = StObject.set(x, "selectOtherMonths", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setShortYearCutoff(value: String): Self = StObject.set(x, "shortYearCutoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortYearCutoffUndefined: Self = StObject.set(x, "shortYearCutoff", js.undefined)
      
      @scala.inline
      def setShowButtonBar(value: Boolean): Self = StObject.set(x, "showButtonBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowButtonBarUndefined: Self = StObject.set(x, "showButtonBar", js.undefined)
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setShowMillisec(value: Boolean): Self = StObject.set(x, "showMillisec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMillisecUndefined: Self = StObject.set(x, "showMillisec", js.undefined)
      
      @scala.inline
      def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      @scala.inline
      def setShowOtherMonths(value: Boolean): Self = StObject.set(x, "showOtherMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOtherMonthsUndefined: Self = StObject.set(x, "showOtherMonths", js.undefined)
      
      @scala.inline
      def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
      
      @scala.inline
      def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
      
      @scala.inline
      def setShowWeek(value: Boolean): Self = StObject.set(x, "showWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekUndefined: Self = StObject.set(x, "showWeek", js.undefined)
      
      @scala.inline
      def setStepHour(value: Double): Self = StObject.set(x, "stepHour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepHourUndefined: Self = StObject.set(x, "stepHour", js.undefined)
      
      @scala.inline
      def setStepMillisec(value: Double): Self = StObject.set(x, "stepMillisec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepMillisecUndefined: Self = StObject.set(x, "stepMillisec", js.undefined)
      
      @scala.inline
      def setStepMinute(value: Double): Self = StObject.set(x, "stepMinute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepMinuteUndefined: Self = StObject.set(x, "stepMinute", js.undefined)
      
      @scala.inline
      def setStepSecond(value: Double): Self = StObject.set(x, "stepSecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepSecondUndefined: Self = StObject.set(x, "stepSecond", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTimeOnly(value: Boolean): Self = StObject.set(x, "timeOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeOnlyUndefined: Self = StObject.set(x, "timeOnly", js.undefined)
      
      @scala.inline
      def setTodayButtonClassName(value: String): Self = StObject.set(x, "todayButtonClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTodayButtonClassNameUndefined: Self = StObject.set(x, "todayButtonClassName", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptions(value: TooltipOptions): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTouchUI(value: Boolean): Self = StObject.set(x, "touchUI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUIUndefined: Self = StObject.set(x, "touchUI", js.undefined)
      
      @scala.inline
      def setValue(value: Date | js.Array[Date]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: Date*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDate(value: Date): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewDateUndefined: Self = StObject.set(x, "viewDate", js.undefined)
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      @scala.inline
      def setYearNavigator(value: Boolean): Self = StObject.set(x, "yearNavigator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearNavigatorUndefined: Self = StObject.set(x, "yearNavigator", js.undefined)
      
      @scala.inline
      def setYearRange(value: String): Self = StObject.set(x, "yearRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearRangeUndefined: Self = StObject.set(x, "yearRange", js.undefined)
    }
  }
  
  @js.native
  trait DateMetaData extends StObject {
    
    var day: Double = js.native
    
    var month: Double = js.native
    
    var otherMonth: Boolean = js.native
    
    var selectable: Boolean = js.native
    
    var today: Boolean = js.native
    
    var year: Double = js.native
  }
  object DateMetaData {
    
    @scala.inline
    def apply(day: Double, month: Double, otherMonth: Boolean, selectable: Boolean, today: Boolean, year: Double): DateMetaData = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], otherMonth = otherMonth.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateMetaData]
    }
    
    @scala.inline
    implicit class DateMetaDataMutableBuilder[Self <: DateMetaData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherMonth(value: Boolean): Self = StObject.set(x, "otherMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToday(value: Boolean): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocaleSettings extends StObject {
    
    var clear: String = js.native
    
    var dayNames: js.Array[String] = js.native
    
    var dayNamesMin: js.Array[String] = js.native
    
    var dayNamesShort: js.Array[String] = js.native
    
    var firstDayOfWeek: js.UndefOr[Double] = js.native
    
    var monthNames: js.Array[String] = js.native
    
    var monthNamesShort: js.Array[String] = js.native
    
    var today: String = js.native
  }
  object LocaleSettings {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class LocaleSettingsMutableBuilder[Self <: LocaleSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesMin(value: js.Array[String]): Self = StObject.set(x, "dayNamesMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesMinVarargs(value: String*): Self = StObject.set(x, "dayNamesMin", js.Array(value :_*))
      
      @scala.inline
      def setDayNamesShort(value: js.Array[String]): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesShortVarargs(value: String*): Self = StObject.set(x, "dayNamesShort", js.Array(value :_*))
      
      @scala.inline
      def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
      
      @scala.inline
      def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesShort(value: js.Array[String]): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesShortVarargs(value: String*): Self = StObject.set(x, "monthNamesShort", js.Array(value :_*))
      
      @scala.inline
      def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
      
      @scala.inline
      def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
    }
  }
}
