package typings.reactTimePicker

import typings.propTypes.mod.Requireable
import typings.react.mod.ChangeEvent
import typings.react.mod.global.JSX.Element
import typings.reactTimePicker.reactTimePickerStrings.hour
import typings.reactTimePicker.reactTimePickerStrings.minute
import typings.reactTimePicker.reactTimePickerStrings.second
import typings.std.HTMLInputElement
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTimeInputNativeInputMod {
  
  object default {
    
    inline def apply(param0: NativeInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes.ariaLabel")
      @js.native
      def ariaLabel: Requireable[String] = js.native
      inline def ariaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes.maxTime")
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
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes.minTime")
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
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes.value")
      @js.native
      def value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]] = js.native
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/NativeInput", "default.propTypes.valueType")
      @js.native
      def valueType: Requireable[String] = js.native
      inline def valueType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueType")(x.asInstanceOf[js.Any])
      
      inline def value_=(x: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  trait NativeInputProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var maxTime: js.UndefOr[String] = js.undefined
    
    var minTime: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String | js.Date | Null] = js.undefined
    
    var valueType: hour | minute | second
  }
  object NativeInputProps {
    
    inline def apply(valueType: hour | minute | second): NativeInputProps = {
      val __obj = js.Dynamic.literal(valueType = valueType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeInputProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeInputProps] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* event */ ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValue(value: String | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueType(value: hour | minute | second): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
