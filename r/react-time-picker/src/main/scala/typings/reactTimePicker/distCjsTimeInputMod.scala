package typings.reactTimePicker

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.reactTimePicker.distCjsSharedTypesMod.Detail
import typings.reactTimePicker.distCjsSharedTypesMod.LooseValuePiece
import typings.reactTimePicker.distCjsSharedTypesMod.Value
import typings.reactTimePicker.reactTimePickerStrings.hour
import typings.reactTimePicker.reactTimePickerStrings.minute
import typings.reactTimePicker.reactTimePickerStrings.second
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTimeInputMod {
  
  object default {
    
    inline def apply(param0: TimeInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-time-picker/dist/cjs/TimeInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.amPmAriaLabel")
      @js.native
      def amPmAriaLabel: Requireable[String] = js.native
      inline def amPmAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amPmAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.className")
      @js.native
      def className: Validator[String] = js.native
      inline def className_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.format")
      @js.native
      def format: Requireable[String] = js.native
      inline def format_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.hourAriaLabel")
      @js.native
      def hourAriaLabel: Requireable[String] = js.native
      inline def hourAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.hourPlaceholder")
      @js.native
      def hourPlaceholder: Requireable[String] = js.native
      inline def hourPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.isClockOpen")
      @js.native
      def isClockOpen: Requireable[Boolean] = js.native
      inline def isClockOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClockOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.maxDetail")
      @js.native
      def maxDetail: Requireable[hour | minute | second] = js.native
      inline def maxDetail_=(x: Requireable[hour | minute | second]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.maxTime")
      @js.native
      def maxTime: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def maxTime_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxTime")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.minTime")
      @js.native
      def minTime: js.Function3[
            /* props */ Record[String, Any], 
            /* propName */ String, 
            /* componentName */ String, 
            js.Error | Null
          ] = js.native
      inline def minTime_=(
        x: js.Function3[
              /* props */ Record[String, Any], 
              /* propName */ String, 
              /* componentName */ String, 
              js.Error | Null
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minTime")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.minuteAriaLabel")
      @js.native
      def minuteAriaLabel: Requireable[String] = js.native
      inline def minuteAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.minutePlaceholder")
      @js.native
      def minutePlaceholder: Requireable[String] = js.native
      inline def minutePlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minutePlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.nativeInputAriaLabel")
      @js.native
      def nativeInputAriaLabel: Requireable[String] = js.native
      inline def nativeInputAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeInputAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.secondAriaLabel")
      @js.native
      def secondAriaLabel: Requireable[String] = js.native
      inline def secondAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.secondPlaceholder")
      @js.native
      def secondPlaceholder: Requireable[String] = js.native
      inline def secondPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput", "default.propTypes.value")
      @js.native
      def value: Requireable[js.Object] = js.native
      inline def value_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  trait TimeInputProps extends StObject {
    
    var amPmAriaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: String
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hourAriaLabel: js.UndefOr[String] = js.undefined
    
    var hourPlaceholder: js.UndefOr[String] = js.undefined
    
    var isClockOpen: js.UndefOr[Boolean | Null] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDetail: js.UndefOr[Detail] = js.undefined
    
    var maxTime: js.UndefOr[String] = js.undefined
    
    var minTime: js.UndefOr[String] = js.undefined
    
    var minuteAriaLabel: js.UndefOr[String] = js.undefined
    
    var minutePlaceholder: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ Value, /* shouldCloseClock */ Boolean, Unit]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var secondAriaLabel: js.UndefOr[String] = js.undefined
    
    var secondPlaceholder: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[LooseValuePiece] = js.undefined
  }
  object TimeInputProps {
    
    inline def apply(className: String): TimeInputProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeInputProps] (val x: Self) extends AnyVal {
      
      inline def setAmPmAriaLabel(value: String): Self = StObject.set(x, "amPmAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setAmPmAriaLabelUndefined: Self = StObject.set(x, "amPmAriaLabel", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      inline def setHourPlaceholder(value: String): Self = StObject.set(x, "hourPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setHourPlaceholderUndefined: Self = StObject.set(x, "hourPlaceholder", js.undefined)
      
      inline def setIsClockOpen(value: Boolean): Self = StObject.set(x, "isClockOpen", value.asInstanceOf[js.Any])
      
      inline def setIsClockOpenNull: Self = StObject.set(x, "isClockOpen", null)
      
      inline def setIsClockOpenUndefined: Self = StObject.set(x, "isClockOpen", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDetail(value: Detail): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      inline def setMinutePlaceholder(value: String): Self = StObject.set(x, "minutePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMinutePlaceholderUndefined: Self = StObject.set(x, "minutePlaceholder", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      inline def setOnChange(value: (/* value */ Value, /* shouldCloseClock */ Boolean) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSecondAriaLabel(value: String): Self = StObject.set(x, "secondAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondAriaLabelUndefined: Self = StObject.set(x, "secondAriaLabel", js.undefined)
      
      inline def setSecondPlaceholder(value: String): Self = StObject.set(x, "secondPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSecondPlaceholderUndefined: Self = StObject.set(x, "secondPlaceholder", js.undefined)
      
      inline def setValue(value: LooseValuePiece): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
