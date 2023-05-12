package typings.reactTimePicker

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.reactTimePicker.anon.AmPm
import typings.reactTimePicker.anon.Current
import typings.reactTimePicker.anon.TypeofInput
import typings.reactTimePicker.reactTimePickerStrings.max
import typings.reactTimePicker.reactTimePickerStrings.min
import typings.reactTimePicker.reactTimePickerStrings.name
import typings.reactTimePicker.reactTimePickerStrings.nameForClass
import typings.std.NonNullable
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTimeInputHour12InputMod {
  
  object default {
    
    inline def apply(param0: Hour12InputProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.amPm")
      @js.native
      def amPm: Requireable[String] = js.native
      inline def amPm_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amPm")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.ariaLabel")
      @js.native
      def ariaLabel: Requireable[String] = js.native
      inline def ariaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.className")
      @js.native
      def className: Validator[String] = js.native
      inline def className_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.hour")
      @js.native
      def hour: Requireable[String] = js.native
      inline def hour_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hour")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.inputRef")
      @js.native
      def inputRef: Requireable[
            NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
          ] = js.native
      inline def inputRef_=(
        x: Requireable[
              NonNullable[js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | InferProps[Current] | Null]]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputRef")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.maxTime")
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
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.minTime")
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
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.onKeyDown")
      @js.native
      def onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onKeyDown_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.onKeyUp")
      @js.native
      def onKeyUp: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onKeyUp_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.placeholder")
      @js.native
      def placeholder: Requireable[String] = js.native
      inline def placeholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.showLeadingZeros")
      @js.native
      def showLeadingZeros: Requireable[Boolean] = js.native
      inline def showLeadingZeros_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLeadingZeros")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker/dist/cjs/TimeInput/Hour12Input", "default.propTypes.value")
      @js.native
      def value: Requireable[String] = js.native
      inline def value_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  type Hour12InputProps = AmPm & (Omit[ComponentProps[TypeofInput], max | min | name | nameForClass])
}
