package typings.reactTimePicker

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.reactTimePicker.distCjsTimePickerMod.TimePickerProps
import typings.reactTimePicker.reactTimePickerStrings.hour
import typings.reactTimePicker.reactTimePickerStrings.minute
import typings.reactTimePicker.reactTimePickerStrings.second
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(props: TimePickerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-time-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-time-picker", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-time-picker", "default.propTypes.amPmAriaLabel")
      @js.native
      def amPmAriaLabel: Requireable[String] = js.native
      inline def amPmAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amPmAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.className")
      @js.native
      def className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def className_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.clearAriaLabel")
      @js.native
      def clearAriaLabel: Requireable[String] = js.native
      inline def clearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.clearIcon")
      @js.native
      def clearIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def clearIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.clockAriaLabel")
      @js.native
      def clockAriaLabel: Requireable[String] = js.native
      inline def clockAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clockAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.clockClassName")
      @js.native
      def clockClassName: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def clockClassName_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clockClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.clockIcon")
      @js.native
      def clockIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def clockIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clockIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.closeClock")
      @js.native
      def closeClock: Requireable[Boolean] = js.native
      inline def closeClock_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeClock")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.data-testid")
      @js.native
      def dataTestid: Requireable[String] = js.native
      
      inline def dataTestid_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-testid")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.disableClock")
      @js.native
      def disableClock: Requireable[Boolean] = js.native
      inline def disableClock_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableClock")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.format")
      @js.native
      def format: Requireable[String] = js.native
      inline def format_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.hourAriaLabel")
      @js.native
      def hourAriaLabel: Requireable[String] = js.native
      inline def hourAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.hourPlaceholder")
      @js.native
      def hourPlaceholder: Requireable[String] = js.native
      inline def hourPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.isOpen")
      @js.native
      def isOpen: Requireable[Boolean] = js.native
      inline def isOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.maxDetail")
      @js.native
      def maxDetail: Requireable[hour | minute | second] = js.native
      inline def maxDetail_=(x: Requireable[hour | minute | second]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.maxTime")
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
      
      @JSImport("react-time-picker", "default.propTypes.minTime")
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
      
      @JSImport("react-time-picker", "default.propTypes.minuteAriaLabel")
      @js.native
      def minuteAriaLabel: Requireable[String] = js.native
      inline def minuteAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.minutePlaceholder")
      @js.native
      def minutePlaceholder: Requireable[String] = js.native
      inline def minutePlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minutePlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.nativeInputAriaLabel")
      @js.native
      def nativeInputAriaLabel: Requireable[String] = js.native
      inline def nativeInputAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeInputAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.onClockClose")
      @js.native
      def onClockClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClockClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClockClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.onClockOpen")
      @js.native
      def onClockOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClockOpen_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClockOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.onFocus")
      @js.native
      def onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onFocus_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.openClockOnFocus")
      @js.native
      def openClockOnFocus: Requireable[Boolean] = js.native
      inline def openClockOnFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openClockOnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.portalContainer")
      @js.native
      def portalContainer: Requireable[js.Object] = js.native
      inline def portalContainer_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.secondAriaLabel")
      @js.native
      def secondAriaLabel: Requireable[String] = js.native
      inline def secondAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.secondPlaceholder")
      @js.native
      def secondPlaceholder: Requireable[String] = js.native
      inline def secondPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "default.propTypes.value")
      @js.native
      def value: Requireable[js.Object] = js.native
      inline def value_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  object TimePicker {
    
    inline def apply(props: TimePickerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-time-picker", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-time-picker", "TimePicker.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-time-picker", "TimePicker.propTypes.amPmAriaLabel")
      @js.native
      def amPmAriaLabel: Requireable[String] = js.native
      inline def amPmAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amPmAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.className")
      @js.native
      def className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def className_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.clearAriaLabel")
      @js.native
      def clearAriaLabel: Requireable[String] = js.native
      inline def clearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.clearIcon")
      @js.native
      def clearIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def clearIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.clockAriaLabel")
      @js.native
      def clockAriaLabel: Requireable[String] = js.native
      inline def clockAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clockAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.clockClassName")
      @js.native
      def clockClassName: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def clockClassName_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clockClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.clockIcon")
      @js.native
      def clockIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def clockIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clockIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.closeClock")
      @js.native
      def closeClock: Requireable[Boolean] = js.native
      inline def closeClock_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeClock")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.data-testid")
      @js.native
      def dataTestid: Requireable[String] = js.native
      
      inline def dataTestid_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-testid")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.disableClock")
      @js.native
      def disableClock: Requireable[Boolean] = js.native
      inline def disableClock_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableClock")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.format")
      @js.native
      def format: Requireable[String] = js.native
      inline def format_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.hourAriaLabel")
      @js.native
      def hourAriaLabel: Requireable[String] = js.native
      inline def hourAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.hourPlaceholder")
      @js.native
      def hourPlaceholder: Requireable[String] = js.native
      inline def hourPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.isOpen")
      @js.native
      def isOpen: Requireable[Boolean] = js.native
      inline def isOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.maxDetail")
      @js.native
      def maxDetail: Requireable[hour | minute | second] = js.native
      inline def maxDetail_=(x: Requireable[hour | minute | second]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.maxTime")
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
      
      @JSImport("react-time-picker", "TimePicker.propTypes.minTime")
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
      
      @JSImport("react-time-picker", "TimePicker.propTypes.minuteAriaLabel")
      @js.native
      def minuteAriaLabel: Requireable[String] = js.native
      inline def minuteAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.minutePlaceholder")
      @js.native
      def minutePlaceholder: Requireable[String] = js.native
      inline def minutePlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minutePlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.nativeInputAriaLabel")
      @js.native
      def nativeInputAriaLabel: Requireable[String] = js.native
      inline def nativeInputAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeInputAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.onClockClose")
      @js.native
      def onClockClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClockClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClockClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.onClockOpen")
      @js.native
      def onClockOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClockOpen_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClockOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.onFocus")
      @js.native
      def onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onFocus_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.openClockOnFocus")
      @js.native
      def openClockOnFocus: Requireable[Boolean] = js.native
      inline def openClockOnFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openClockOnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.portalContainer")
      @js.native
      def portalContainer: Requireable[js.Object] = js.native
      inline def portalContainer_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.secondAriaLabel")
      @js.native
      def secondAriaLabel: Requireable[String] = js.native
      inline def secondAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.secondPlaceholder")
      @js.native
      def secondPlaceholder: Requireable[String] = js.native
      inline def secondPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-time-picker", "TimePicker.propTypes.value")
      @js.native
      def value: Requireable[js.Object] = js.native
      inline def value_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
}
