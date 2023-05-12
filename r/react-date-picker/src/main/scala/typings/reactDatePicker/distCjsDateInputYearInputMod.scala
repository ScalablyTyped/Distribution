package typings.reactDatePicker

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactDatePicker.anon.Current
import typings.reactDatePicker.anon.Placeholder
import typings.reactDatePicker.anon.TypeofInput
import typings.reactDatePicker.reactDatePickerStrings.max
import typings.reactDatePicker.reactDatePickerStrings.min
import typings.reactDatePicker.reactDatePickerStrings.name
import typings.std.NonNullable
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsDateInputYearInputMod {
  
  object default {
    
    inline def apply(param0: YearInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.ariaLabel")
      @js.native
      def ariaLabel: Requireable[String] = js.native
      inline def ariaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.className")
      @js.native
      def className: Validator[String] = js.native
      inline def className_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.inputRef")
      @js.native
      def inputRef: Requireable[
            NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
          ] = js.native
      inline def inputRef_=(
        x: Requireable[
              NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.maxDate")
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
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.minDate")
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
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.onKeyDown")
      @js.native
      def onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onKeyDown_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.onKeyUp")
      @js.native
      def onKeyUp: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onKeyUp_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.placeholder")
      @js.native
      def placeholder: Requireable[String] = js.native
      inline def placeholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.value")
      @js.native
      def value: Requireable[String] = js.native
      
      @JSImport("react-date-picker/dist/cjs/DateInput/YearInput", "default.propTypes.valueType")
      @js.native
      def valueType: Requireable[String] = js.native
      inline def valueType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valueType")(x.asInstanceOf[js.Any])
      
      inline def value_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  type YearInputProps = Placeholder & (Omit[ComponentProps[TypeofInput], max | min | name])
}
