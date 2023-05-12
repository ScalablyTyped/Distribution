package typings.reactDatetimePicker

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.reactDatetimePicker.distCjsSharedTypesMod.Detail
import typings.reactDatetimePicker.reactDatetimePickerStrings.hour
import typings.reactDatetimePicker.reactDatetimePickerStrings.minute
import typings.reactDatetimePicker.reactDatetimePickerStrings.second
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsDateTimeInputMod {
  
  object default {
    
    inline def apply(param0: DateTimeInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.amPmAriaLabel")
      @js.native
      def amPmAriaLabel: Requireable[String] = js.native
      inline def amPmAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amPmAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.className")
      @js.native
      def className: Validator[String] = js.native
      inline def className_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.dayAriaLabel")
      @js.native
      def dayAriaLabel: Requireable[String] = js.native
      inline def dayAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.dayPlaceholder")
      @js.native
      def dayPlaceholder: Requireable[String] = js.native
      inline def dayPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.format")
      @js.native
      def format: Requireable[String] = js.native
      inline def format_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.hourAriaLabel")
      @js.native
      def hourAriaLabel: Requireable[String] = js.native
      inline def hourAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.hourPlaceholder")
      @js.native
      def hourPlaceholder: Requireable[String] = js.native
      inline def hourPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.isWidgetOpen")
      @js.native
      def isWidgetOpen: Requireable[Boolean] = js.native
      inline def isWidgetOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWidgetOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.maxDate")
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
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.maxDetail")
      @js.native
      def maxDetail: Requireable[hour | minute | second] = js.native
      inline def maxDetail_=(x: Requireable[hour | minute | second]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.minDate")
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
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.minuteAriaLabel")
      @js.native
      def minuteAriaLabel: Requireable[String] = js.native
      inline def minuteAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.minutePlaceholder")
      @js.native
      def minutePlaceholder: Requireable[String] = js.native
      inline def minutePlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minutePlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.monthAriaLabel")
      @js.native
      def monthAriaLabel: Requireable[String] = js.native
      inline def monthAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.monthPlaceholder")
      @js.native
      def monthPlaceholder: Requireable[String] = js.native
      inline def monthPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.nativeInputAriaLabel")
      @js.native
      def nativeInputAriaLabel: Requireable[String] = js.native
      inline def nativeInputAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeInputAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.secondAriaLabel")
      @js.native
      def secondAriaLabel: Requireable[String] = js.native
      inline def secondAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.secondPlaceholder")
      @js.native
      def secondPlaceholder: Requireable[String] = js.native
      inline def secondPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.showLeadingZeros")
      @js.native
      def showLeadingZeros: Requireable[Boolean] = js.native
      inline def showLeadingZeros_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLeadingZeros")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.value")
      @js.native
      def value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]] = js.native
      inline def value_=(x: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.yearAriaLabel")
      @js.native
      def yearAriaLabel: Requireable[String] = js.native
      inline def yearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker/dist/cjs/DateTimeInput", "default.propTypes.yearPlaceholder")
      @js.native
      def yearPlaceholder: Requireable[String] = js.native
      inline def yearPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearPlaceholder")(x.asInstanceOf[js.Any])
    }
  }
  
  trait DateTimeInputProps extends StObject {
    
    var amPmAriaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: String
    
    var dayAriaLabel: js.UndefOr[String] = js.undefined
    
    var dayPlaceholder: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hourAriaLabel: js.UndefOr[String] = js.undefined
    
    var hourPlaceholder: js.UndefOr[String] = js.undefined
    
    var isWidgetOpen: js.UndefOr[Boolean | Null] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var maxDetail: js.UndefOr[Detail] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var minuteAriaLabel: js.UndefOr[String] = js.undefined
    
    var minutePlaceholder: js.UndefOr[String] = js.undefined
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthPlaceholder: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ js.Date | Null, /* shouldCloseWidgets */ Boolean, Unit]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var secondAriaLabel: js.UndefOr[String] = js.undefined
    
    var secondPlaceholder: js.UndefOr[String] = js.undefined
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String | js.Date | Null] = js.undefined
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
    
    var yearPlaceholder: js.UndefOr[String] = js.undefined
  }
  object DateTimeInputProps {
    
    inline def apply(className: String): DateTimeInputProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTimeInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateTimeInputProps] (val x: Self) extends AnyVal {
      
      inline def setAmPmAriaLabel(value: String): Self = StObject.set(x, "amPmAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setAmPmAriaLabelUndefined: Self = StObject.set(x, "amPmAriaLabel", js.undefined)
      
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
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      inline def setHourPlaceholder(value: String): Self = StObject.set(x, "hourPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setHourPlaceholderUndefined: Self = StObject.set(x, "hourPlaceholder", js.undefined)
      
      inline def setIsWidgetOpen(value: Boolean): Self = StObject.set(x, "isWidgetOpen", value.asInstanceOf[js.Any])
      
      inline def setIsWidgetOpenNull: Self = StObject.set(x, "isWidgetOpen", null)
      
      inline def setIsWidgetOpenUndefined: Self = StObject.set(x, "isWidgetOpen", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxDetail(value: Detail): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      inline def setMinutePlaceholder(value: String): Self = StObject.set(x, "minutePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMinutePlaceholderUndefined: Self = StObject.set(x, "minutePlaceholder", js.undefined)
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      inline def setMonthPlaceholder(value: String): Self = StObject.set(x, "monthPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMonthPlaceholderUndefined: Self = StObject.set(x, "monthPlaceholder", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      inline def setOnChange(value: (/* value */ js.Date | Null, /* shouldCloseWidgets */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSecondAriaLabel(value: String): Self = StObject.set(x, "secondAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondAriaLabelUndefined: Self = StObject.set(x, "secondAriaLabel", js.undefined)
      
      inline def setSecondPlaceholder(value: String): Self = StObject.set(x, "secondPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSecondPlaceholderUndefined: Self = StObject.set(x, "secondPlaceholder", js.undefined)
      
      inline def setShowLeadingZeros(value: Boolean): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      inline def setShowLeadingZerosUndefined: Self = StObject.set(x, "showLeadingZeros", js.undefined)
      
      inline def setValue(value: String | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
      
      inline def setYearPlaceholder(value: String): Self = StObject.set(x, "yearPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setYearPlaceholderUndefined: Self = StObject.set(x, "yearPlaceholder", js.undefined)
    }
  }
}
