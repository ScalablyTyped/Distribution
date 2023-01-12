package typings.reactToolbox

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.`zh-cn`
import typings.reactToolbox.reactToolboxStrings.`zh-hk`
import typings.reactToolbox.reactToolboxStrings.`zh-tw`
import typings.reactToolbox.reactToolboxStrings.af
import typings.reactToolbox.reactToolboxStrings.ar
import typings.reactToolbox.reactToolboxStrings.be
import typings.reactToolbox.reactToolboxStrings.bg
import typings.reactToolbox.reactToolboxStrings.bn
import typings.reactToolbox.reactToolboxStrings.bo
import typings.reactToolbox.reactToolboxStrings.br
import typings.reactToolbox.reactToolboxStrings.bs
import typings.reactToolbox.reactToolboxStrings.ca
import typings.reactToolbox.reactToolboxStrings.de
import typings.reactToolbox.reactToolboxStrings.en
import typings.reactToolbox.reactToolboxStrings.es
import typings.reactToolbox.reactToolboxStrings.eu
import typings.reactToolbox.reactToolboxStrings.fr
import typings.reactToolbox.reactToolboxStrings.gl
import typings.reactToolbox.reactToolboxStrings.it
import typings.reactToolbox.reactToolboxStrings.no
import typings.reactToolbox.reactToolboxStrings.pt
import typings.reactToolbox.reactToolboxStrings.ru
import typings.reactToolbox.reactToolboxStrings.ua
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDatePickerDatePickerMod {
  
  @JSImport("react-toolbox/components/date_picker/DatePicker", JSImport.Default)
  @js.native
  open class default protected () extends DatePicker {
    def this(props: DatePickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DatePickerProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/date_picker/DatePicker", "DatePicker")
  @js.native
  open class DatePicker protected ()
    extends Component[DatePickerProps, js.Object, Any] {
    def this(props: DatePickerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DatePickerProps, context: Any) = this()
  }
  
  trait DatePickerLocale extends StObject {
    
    /**
      * Month names.
      */
    var months: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Month short names.
      */
    var monthsShort: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Day names starting from Sunday.
      */
    var weekdays: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Day letters starting from Sunday.
      */
    var weekdaysLetter: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Day short names starting from Sunday.
      */
    var weekdaysShort: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DatePickerLocale {
    
    inline def apply(): DatePickerLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerLocale] (val x: Self) extends AnyVal {
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
      
      inline def setMonthsShortUndefined: Self = StObject.set(x, "monthsShort", js.undefined)
      
      inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value*))
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
      
      inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysLetter(value: js.Array[String]): Self = StObject.set(x, "weekdaysLetter", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysLetterUndefined: Self = StObject.set(x, "weekdaysLetter", js.undefined)
      
      inline def setWeekdaysLetterVarargs(value: String*): Self = StObject.set(x, "weekdaysLetter", js.Array(value*))
      
      inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShortUndefined: Self = StObject.set(x, "weekdaysShort", js.undefined)
      
      inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value*))
      
      inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
      
      inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value*))
    }
  }
  
  trait DatePickerProps
    extends StObject
       with Props {
    
    /**
      * Allows to control if the picker should be shown from outside. Beware you should update the prop when the Dialog is closed.
      * @default false
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically selects a date upon clicking on a day
      * @default false
      */
    var autoOk: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Label used for cancel button on Dialog.
      * @default "Cancel"
      */
    var cancelLabel: js.UndefOr[String] = js.undefined
    
    /**
      * An array of date objects which will be disabled in the calendar. All other dates will be enabled.
      */
    var disabledDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    /**
      * An array of date objects which will be enabled in the calendar. All other dates will be disabled.
      */
    var enabledDates: js.UndefOr[js.Array[js.Date]] = js.undefined
    
    /**
      * Give an error node to display under the field.
      */
    var error: js.UndefOr[String] = js.undefined
    
    /**
      * A key to identify an Icon from Material Design Icons or a custom Icon Element.
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * This class will be applied to Input component of DatePicker.
      */
    var inputClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Function to format the date displayed on the input.
      */
    var inputFormat: js.UndefOr[js.Function] = js.undefined
    
    /**
      * The text string to use for the floating label element in the input component.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Sets locale for the Dialog.
      * @default "en"
      */
    var locale: js.UndefOr[
        de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale
      ] = js.undefined
    
    /**
      * Date object with the maximum selectable date.
      */
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Date object with the minimum selectable date.
      */
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * Name for the input field.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Label used for 'OK' button on Dialog.
      * @default "Ok"
      */
    var okLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Callback called when the picker value is changed.
      */
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback fired after dismissing the Dialog.
      */
    var onDismiss: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the ESC key is pressed with the overlay active.
      */
    var onEscKeyDown: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback invoked on Input key press.
      */
    var onKeyPress: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback to be invoked when the dialog overlay is clicked.
      */
    var onOverlayClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * The input element will be readonly and look like disabled.
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used in case the input is required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set week's first day to Sunday. Default week's first day is Monday.
      * @default false
      */
    var sundayFirstDayOfWeek: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[DatePickerTheme] = js.undefined
    
    /**
      * Date object with the currently selected date.
      */
    var value: js.UndefOr[js.Date | String] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(): DatePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAutoOk(value: Boolean): Self = StObject.set(x, "autoOk", value.asInstanceOf[js.Any])
      
      inline def setAutoOkUndefined: Self = StObject.set(x, "autoOk", js.undefined)
      
      inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
      
      inline def setDisabledDates(value: js.Array[js.Date]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value*))
      
      inline def setEnabledDates(value: js.Array[js.Date]): Self = StObject.set(x, "enabledDates", value.asInstanceOf[js.Any])
      
      inline def setEnabledDatesUndefined: Self = StObject.set(x, "enabledDates", js.undefined)
      
      inline def setEnabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "enabledDates", js.Array(value*))
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setInputFormat(value: js.Function): Self = StObject.set(x, "inputFormat", value.asInstanceOf[js.Any])
      
      inline def setInputFormatUndefined: Self = StObject.set(x, "inputFormat", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLocale(
        value: de | no | en | es | af | ar | be | bg | bn | bo | br | bs | ca | gl | eu | pt | it | fr | ru | ua | `zh-cn` | `zh-hk` | `zh-tw` | DatePickerLocale
      ): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOkLabel(value: String): Self = StObject.set(x, "okLabel", value.asInstanceOf[js.Any])
      
      inline def setOkLabelUndefined: Self = StObject.set(x, "okLabel", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDismiss(value: js.Function): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOnEscKeyDown(value: js.Function): Self = StObject.set(x, "onEscKeyDown", value.asInstanceOf[js.Any])
      
      inline def setOnEscKeyDownUndefined: Self = StObject.set(x, "onEscKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: js.Function): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnOverlayClick(value: js.Function): Self = StObject.set(x, "onOverlayClick", value.asInstanceOf[js.Any])
      
      inline def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSundayFirstDayOfWeek(value: Boolean): Self = StObject.set(x, "sundayFirstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setSundayFirstDayOfWeekUndefined: Self = StObject.set(x, "sundayFirstDayOfWeek", js.undefined)
      
      inline def setTheme(value: DatePickerTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: js.Date | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DatePickerTheme extends StObject {
    
    /**
      * Used for the active day and year.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the buttons in the dialog.
      */
    var button: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the calendar root element.
      */
    var calendar: js.UndefOr[String] = js.undefined
    
    /**
      * Used as wrapper for the calendar component inside dialog.
      */
    var calendarWrapper: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the date element inside header.
      */
    var date: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the day element inside the calendar.
      */
    var day: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the list of days inside a month.
      */
    var days: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the dialog component.
      */
    var dialog: js.UndefOr[String] = js.undefined
    
    /**
      * Added to day element when day is disabled.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the dialog header,.
      */
    var header: js.UndefOr[String] = js.undefined
    
    /**
      * Used for Input element that opens the picker.
      */
    var input: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the month root element.
      */
    var month: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root dialog when months are displayed.
      */
    var monthsDisplay: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the next month icon.
      */
    var next: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the prev month icon.
      */
    var prev: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the month title element.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the weekdays wrapper.
      */
    var week: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the year element inside header.
      */
    var year: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the years list in years view.
      */
    var years: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root dialog when years are displayed.
      */
    var yearsDisplay: js.UndefOr[String] = js.undefined
  }
  object DatePickerTheme {
    
    inline def apply(): DatePickerTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerTheme] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
      
      inline def setCalendarWrapper(value: String): Self = StObject.set(x, "calendarWrapper", value.asInstanceOf[js.Any])
      
      inline def setCalendarWrapperUndefined: Self = StObject.set(x, "calendarWrapper", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      inline def setDays(value: String): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setDialog(value: String): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setMonthsDisplay(value: String): Self = StObject.set(x, "monthsDisplay", value.asInstanceOf[js.Any])
      
      inline def setMonthsDisplayUndefined: Self = StObject.set(x, "monthsDisplay", js.undefined)
      
      inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWeek(value: String): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      
      inline def setYears(value: String): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      inline def setYearsDisplay(value: String): Self = StObject.set(x, "yearsDisplay", value.asInstanceOf[js.Any])
      
      inline def setYearsDisplayUndefined: Self = StObject.set(x, "yearsDisplay", js.undefined)
      
      inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
}
