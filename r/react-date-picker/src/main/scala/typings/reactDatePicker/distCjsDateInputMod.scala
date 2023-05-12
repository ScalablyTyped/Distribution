package typings.reactDatePicker

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.reactDatePicker.distCjsSharedTypesMod.Detail
import typings.reactDatePicker.distCjsSharedTypesMod.LooseValuePiece
import typings.reactDatePicker.distCjsSharedTypesMod.Value
import typings.reactDatePicker.reactDatePickerStrings.century
import typings.reactDatePicker.reactDatePickerStrings.decade
import typings.reactDatePicker.reactDatePickerStrings.end
import typings.reactDatePicker.reactDatePickerStrings.month
import typings.reactDatePicker.reactDatePickerStrings.range
import typings.reactDatePicker.reactDatePickerStrings.start
import typings.reactDatePicker.reactDatePickerStrings.year
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsDateInputMod {
  
  object default {
    
    inline def apply(param0: DateInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-date-picker/dist/cjs/DateInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.className")
      @js.native
      def className: Validator[String] = js.native
      inline def className_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.dayAriaLabel")
      @js.native
      def dayAriaLabel: Requireable[String] = js.native
      inline def dayAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.dayPlaceholder")
      @js.native
      def dayPlaceholder: Requireable[String] = js.native
      inline def dayPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.format")
      @js.native
      def format: Requireable[String] = js.native
      inline def format_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.isCalendarOpen")
      @js.native
      def isCalendarOpen: Requireable[Boolean] = js.native
      inline def isCalendarOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCalendarOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.maxDate")
      @js.native
      def maxDate: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def maxDate_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.maxDetail")
      @js.native
      def maxDetail: Requireable[month | year | century | decade] = js.native
      inline def maxDetail_=(x: Requireable[month | year | century | decade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.minDate")
      @js.native
      def minDate: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def minDate_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.monthAriaLabel")
      @js.native
      def monthAriaLabel: Requireable[String] = js.native
      inline def monthAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.monthPlaceholder")
      @js.native
      def monthPlaceholder: Requireable[String] = js.native
      inline def monthPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.nativeInputAriaLabel")
      @js.native
      def nativeInputAriaLabel: Requireable[String] = js.native
      inline def nativeInputAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeInputAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.returnValue")
      @js.native
      def returnValue: Requireable[String] = js.native
      inline def returnValue_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.showLeadingZeros")
      @js.native
      def showLeadingZeros: Requireable[Boolean] = js.native
      inline def showLeadingZeros_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLeadingZeros")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.value")
      @js.native
      def value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]] = js.native
      inline def value_=(x: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.yearAriaLabel")
      @js.native
      def yearAriaLabel: Requireable[String] = js.native
      inline def yearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput", "default.propTypes.yearPlaceholder")
      @js.native
      def yearPlaceholder: Requireable[String] = js.native
      inline def yearPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearPlaceholder")(x.asInstanceOf[js.Any])
    }
  }
  
  trait DateInputProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: String
    
    var dayAriaLabel: js.UndefOr[String] = js.undefined
    
    var dayPlaceholder: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var isCalendarOpen: js.UndefOr[Boolean | Null] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var maxDetail: js.UndefOr[Detail] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthPlaceholder: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ Value, /* shouldCloseCalendar */ Boolean, Unit]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var returnValue: js.UndefOr[start | end | range] = js.undefined
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[LooseValuePiece] = js.undefined
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
    
    var yearPlaceholder: js.UndefOr[String] = js.undefined
  }
  object DateInputProps {
    
    inline def apply(className: String): DateInputProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateInputProps] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDayAriaLabel(value: String): Self = StObject.set(x, "dayAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDayAriaLabelUndefined: Self = StObject.set(x, "dayAriaLabel", js.undefined)
      
      inline def setDayPlaceholder(value: String): Self = StObject.set(x, "dayPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setDayPlaceholderUndefined: Self = StObject.set(x, "dayPlaceholder", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIsCalendarOpen(value: Boolean): Self = StObject.set(x, "isCalendarOpen", value.asInstanceOf[js.Any])
      
      inline def setIsCalendarOpenNull: Self = StObject.set(x, "isCalendarOpen", null)
      
      inline def setIsCalendarOpenUndefined: Self = StObject.set(x, "isCalendarOpen", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxDetail(value: Detail): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      inline def setMonthPlaceholder(value: String): Self = StObject.set(x, "monthPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMonthPlaceholderUndefined: Self = StObject.set(x, "monthPlaceholder", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      inline def setOnChange(value: (/* value */ Value, /* shouldCloseCalendar */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setReturnValue(value: start | end | range): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setShowLeadingZeros(value: Boolean): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      inline def setShowLeadingZerosUndefined: Self = StObject.set(x, "showLeadingZeros", js.undefined)
      
      inline def setValue(value: LooseValuePiece): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
      
      inline def setYearPlaceholder(value: String): Self = StObject.set(x, "yearPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setYearPlaceholderUndefined: Self = StObject.set(x, "yearPlaceholder", js.undefined)
    }
  }
}
