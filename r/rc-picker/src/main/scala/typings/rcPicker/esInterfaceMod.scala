package typings.rcPicker

import typings.rcPicker.anon.Label
import typings.rcPicker.esGenerateMod.GenerateConfig
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  trait Components extends StObject {
    
    var button: js.UndefOr[ComponentType[js.Object] | String] = js.undefined
    
    var rangeItem: js.UndefOr[ComponentType[js.Object] | String] = js.undefined
  }
  object Components {
    
    inline def apply(): Components = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Components]
    }
    
    extension [Self <: Components](x: Self) {
      
      inline def setButton(value: ComponentType[js.Object] | String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setRangeItem(value: ComponentType[js.Object] | String): Self = StObject.set(x, "rangeItem", value.asInstanceOf[js.Any])
      
      inline def setRangeItemUndefined: Self = StObject.set(x, "rangeItem", js.undefined)
    }
  }
  
  type CustomFormat[DateType] = js.Function1[/* value */ DateType, String]
  
  type DisabledTime[DateType] = js.Function1[/* date */ DateType | Null, DisabledTimes]
  
  trait DisabledTimes extends StObject {
    
    var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
    
    var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
    
    var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
  }
  object DisabledTimes {
    
    inline def apply(): DisabledTimes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisabledTimes]
    }
    
    extension [Self <: DisabledTimes](x: Self) {
      
      inline def setDisabledHours(value: () => js.Array[Double]): Self = StObject.set(x, "disabledHours", js.Any.fromFunction0(value))
      
      inline def setDisabledHoursUndefined: Self = StObject.set(x, "disabledHours", js.undefined)
      
      inline def setDisabledMinutes(value: /* hour */ Double => js.Array[Double]): Self = StObject.set(x, "disabledMinutes", js.Any.fromFunction1(value))
      
      inline def setDisabledMinutesUndefined: Self = StObject.set(x, "disabledMinutes", js.undefined)
      
      inline def setDisabledSeconds(value: (/* hour */ Double, /* minute */ Double) => js.Array[Double]): Self = StObject.set(x, "disabledSeconds", js.Any.fromFunction2(value))
      
      inline def setDisabledSecondsUndefined: Self = StObject.set(x, "disabledSeconds", js.undefined)
    }
  }
  
  type EventValue[DateType] = DateType | Null
  
  trait Locale extends StObject {
    
    var backToToday: String
    
    var clear: String
    
    var dateFormat: String
    
    var dateSelect: String
    
    var dateTimeFormat: String
    
    var dayFormat: String
    
    var decadeSelect: String
    
    var locale: String
    
    var month: String
    
    /** Display month before year in date panel header */
    var monthBeforeYear: js.UndefOr[Boolean] = js.undefined
    
    var monthFormat: js.UndefOr[String] = js.undefined
    
    var monthSelect: String
    
    var nextCentury: String
    
    var nextDecade: String
    
    var nextMonth: String
    
    var nextYear: String
    
    var now: String
    
    var ok: String
    
    var previousCentury: String
    
    var previousDecade: String
    
    var previousMonth: String
    
    var previousYear: String
    
    var quarterFormat: js.UndefOr[String] = js.undefined
    
    var shortMonths: js.UndefOr[js.Array[String]] = js.undefined
    
    var shortWeekDays: js.UndefOr[js.Array[String]] = js.undefined
    
    var timeSelect: String
    
    var today: String
    
    var weekSelect: js.UndefOr[String] = js.undefined
    
    var year: String
    
    var yearFormat: String
    
    var yearSelect: String
  }
  object Locale {
    
    inline def apply(
      backToToday: String,
      clear: String,
      dateFormat: String,
      dateSelect: String,
      dateTimeFormat: String,
      dayFormat: String,
      decadeSelect: String,
      locale: String,
      month: String,
      monthSelect: String,
      nextCentury: String,
      nextDecade: String,
      nextMonth: String,
      nextYear: String,
      now: String,
      ok: String,
      previousCentury: String,
      previousDecade: String,
      previousMonth: String,
      previousYear: String,
      timeSelect: String,
      today: String,
      year: String,
      yearFormat: String,
      yearSelect: String
    ): Locale = {
      val __obj = js.Dynamic.literal(backToToday = backToToday.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateSelect = dateSelect.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], dayFormat = dayFormat.asInstanceOf[js.Any], decadeSelect = decadeSelect.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthSelect = monthSelect.asInstanceOf[js.Any], nextCentury = nextCentury.asInstanceOf[js.Any], nextDecade = nextDecade.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], nextYear = nextYear.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], previousCentury = previousCentury.asInstanceOf[js.Any], previousDecade = previousDecade.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], previousYear = previousYear.asInstanceOf[js.Any], timeSelect = timeSelect.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], yearFormat = yearFormat.asInstanceOf[js.Any], yearSelect = yearSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setBackToToday(value: String): Self = StObject.set(x, "backToToday", value.asInstanceOf[js.Any])
      
      inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateSelect(value: String): Self = StObject.set(x, "dateSelect", value.asInstanceOf[js.Any])
      
      inline def setDateTimeFormat(value: String): Self = StObject.set(x, "dateTimeFormat", value.asInstanceOf[js.Any])
      
      inline def setDayFormat(value: String): Self = StObject.set(x, "dayFormat", value.asInstanceOf[js.Any])
      
      inline def setDecadeSelect(value: String): Self = StObject.set(x, "decadeSelect", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthBeforeYear(value: Boolean): Self = StObject.set(x, "monthBeforeYear", value.asInstanceOf[js.Any])
      
      inline def setMonthBeforeYearUndefined: Self = StObject.set(x, "monthBeforeYear", js.undefined)
      
      inline def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
      
      inline def setMonthFormatUndefined: Self = StObject.set(x, "monthFormat", js.undefined)
      
      inline def setMonthSelect(value: String): Self = StObject.set(x, "monthSelect", value.asInstanceOf[js.Any])
      
      inline def setNextCentury(value: String): Self = StObject.set(x, "nextCentury", value.asInstanceOf[js.Any])
      
      inline def setNextDecade(value: String): Self = StObject.set(x, "nextDecade", value.asInstanceOf[js.Any])
      
      inline def setNextMonth(value: String): Self = StObject.set(x, "nextMonth", value.asInstanceOf[js.Any])
      
      inline def setNextYear(value: String): Self = StObject.set(x, "nextYear", value.asInstanceOf[js.Any])
      
      inline def setNow(value: String): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setPreviousCentury(value: String): Self = StObject.set(x, "previousCentury", value.asInstanceOf[js.Any])
      
      inline def setPreviousDecade(value: String): Self = StObject.set(x, "previousDecade", value.asInstanceOf[js.Any])
      
      inline def setPreviousMonth(value: String): Self = StObject.set(x, "previousMonth", value.asInstanceOf[js.Any])
      
      inline def setPreviousYear(value: String): Self = StObject.set(x, "previousYear", value.asInstanceOf[js.Any])
      
      inline def setQuarterFormat(value: String): Self = StObject.set(x, "quarterFormat", value.asInstanceOf[js.Any])
      
      inline def setQuarterFormatUndefined: Self = StObject.set(x, "quarterFormat", js.undefined)
      
      inline def setShortMonths(value: js.Array[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      inline def setShortMonthsUndefined: Self = StObject.set(x, "shortMonths", js.undefined)
      
      inline def setShortMonthsVarargs(value: String*): Self = StObject.set(x, "shortMonths", js.Array(value*))
      
      inline def setShortWeekDays(value: js.Array[String]): Self = StObject.set(x, "shortWeekDays", value.asInstanceOf[js.Any])
      
      inline def setShortWeekDaysUndefined: Self = StObject.set(x, "shortWeekDays", js.undefined)
      
      inline def setShortWeekDaysVarargs(value: String*): Self = StObject.set(x, "shortWeekDays", js.Array(value*))
      
      inline def setTimeSelect(value: String): Self = StObject.set(x, "timeSelect", value.asInstanceOf[js.Any])
      
      inline def setToday(value: String): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setWeekSelect(value: String): Self = StObject.set(x, "weekSelect", value.asInstanceOf[js.Any])
      
      inline def setWeekSelectUndefined: Self = StObject.set(x, "weekSelect", js.undefined)
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearFormat(value: String): Self = StObject.set(x, "yearFormat", value.asInstanceOf[js.Any])
      
      inline def setYearSelect(value: String): Self = StObject.set(x, "yearSelect", value.asInstanceOf[js.Any])
    }
  }
  
  type NullableDateType[DateType] = js.UndefOr[DateType | Null]
  
  type OnPanelChange[DateType] = js.Function2[/* value */ DateType, /* mode */ PanelMode, Unit]
  
  type OnSelect[DateType] = js.Function2[/* value */ DateType, /* type */ key | mouse | submit, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcPicker.rcPickerStrings.time
    - typings.rcPicker.rcPickerStrings.date
    - typings.rcPicker.rcPickerStrings.week
    - typings.rcPicker.rcPickerStrings.month
    - typings.rcPicker.rcPickerStrings.quarter
    - typings.rcPicker.rcPickerStrings.year
    - typings.rcPicker.rcPickerStrings.decade
  */
  trait PanelMode extends StObject
  object PanelMode {
    
    inline def date: typings.rcPicker.rcPickerStrings.date = "date".asInstanceOf[typings.rcPicker.rcPickerStrings.date]
    
    inline def decade: typings.rcPicker.rcPickerStrings.decade = "decade".asInstanceOf[typings.rcPicker.rcPickerStrings.decade]
    
    inline def month: typings.rcPicker.rcPickerStrings.month = "month".asInstanceOf[typings.rcPicker.rcPickerStrings.month]
    
    inline def quarter: typings.rcPicker.rcPickerStrings.quarter = "quarter".asInstanceOf[typings.rcPicker.rcPickerStrings.quarter]
    
    inline def time: typings.rcPicker.rcPickerStrings.time = "time".asInstanceOf[typings.rcPicker.rcPickerStrings.time]
    
    inline def week: typings.rcPicker.rcPickerStrings.week = "week".asInstanceOf[typings.rcPicker.rcPickerStrings.week]
    
    inline def year: typings.rcPicker.rcPickerStrings.year = "year".asInstanceOf[typings.rcPicker.rcPickerStrings.year]
  }
  
  trait PanelRefProps extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Boolean]] = js.undefined
  }
  object PanelRefProps {
    
    inline def apply(): PanelRefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelRefProps]
    }
    
    extension [Self <: PanelRefProps](x: Self) {
      
      inline def setOnBlur(value: FocusEvent[HTMLElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLElement] => Boolean): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  @js.native
  trait PanelSharedProps[DateType] extends StObject {
    
    /** [Legacy] Set default display picker view date */
    var defaultPickerValue: js.UndefOr[DateType] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    var nextIcon: js.UndefOr[ReactNode] = js.native
    
    def onPanelChange(mode: Null, viewValue: DateType): Unit = js.native
    def onPanelChange(mode: PanelMode, viewValue: DateType): Unit = js.native
    
    var onSelect: OnSelect[DateType] = js.native
    
    def onViewDateChange(value: DateType): Unit = js.native
    
    /**
      * Typescript can not handle generic type so we can not use `forwardRef` here.
      * Thus, move ref into operationRef.
      * This is little hack which should refactor after typescript support.
      */
    var operationRef: MutableRefObject[PanelRefProps] = js.native
    
    var prefixCls: String = js.native
    
    var prevIcon: js.UndefOr[ReactNode] = js.native
    
    var superNextIcon: js.UndefOr[ReactNode] = js.native
    
    var superPrevIcon: js.UndefOr[ReactNode] = js.native
    
    var value: js.UndefOr[NullableDateType[DateType]] = js.native
    
    var viewDate: DateType = js.native
  }
  
  /* Inlined std.Exclude<rc-picker.rc-picker/es/interface.PanelMode, 'datetime' | 'decade'> */
  /* Rewritten from type alias, can be one of: 
    - typings.rcPicker.rcPickerStrings.date
    - typings.rcPicker.rcPickerStrings.time
    - typings.rcPicker.rcPickerStrings.quarter
    - typings.rcPicker.rcPickerStrings.week
    - typings.rcPicker.rcPickerStrings.year
    - typings.rcPicker.rcPickerStrings.month
  */
  trait PickerMode extends StObject
  object PickerMode {
    
    inline def date: typings.rcPicker.rcPickerStrings.date = "date".asInstanceOf[typings.rcPicker.rcPickerStrings.date]
    
    inline def month: typings.rcPicker.rcPickerStrings.month = "month".asInstanceOf[typings.rcPicker.rcPickerStrings.month]
    
    inline def quarter: typings.rcPicker.rcPickerStrings.quarter = "quarter".asInstanceOf[typings.rcPicker.rcPickerStrings.quarter]
    
    inline def time: typings.rcPicker.rcPickerStrings.time = "time".asInstanceOf[typings.rcPicker.rcPickerStrings.time]
    
    inline def week: typings.rcPicker.rcPickerStrings.week = "week".asInstanceOf[typings.rcPicker.rcPickerStrings.week]
    
    inline def year: typings.rcPicker.rcPickerStrings.year = "year".asInstanceOf[typings.rcPicker.rcPickerStrings.year]
  }
  
  type RangeList = js.Array[Label]
  
  type RangeValue[DateType] = (js.Tuple2[EventValue[DateType], EventValue[DateType]]) | Null
}
