package typings.reactDatetimePicker

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.reactDatetimePicker.distCjsDateTimePickerMod.DateTimePickerProps
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(props: DateTimePickerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-datetime-picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-datetime-picker", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-datetime-picker", "default.propTypes.amPmAriaLabel")
      @js.native
      def amPmAriaLabel: Requireable[String] = js.native
      inline def amPmAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amPmAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.calendarAriaLabel")
      @js.native
      def calendarAriaLabel: Requireable[String] = js.native
      inline def calendarAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.calendarClassName")
      @js.native
      def calendarClassName: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def calendarClassName_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.calendarIcon")
      @js.native
      def calendarIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def calendarIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.className")
      @js.native
      def className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def className_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.clearAriaLabel")
      @js.native
      def clearAriaLabel: Requireable[String] = js.native
      inline def clearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.clearIcon")
      @js.native
      def clearIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def clearIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.clockClassName")
      @js.native
      def clockClassName: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def clockClassName_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clockClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.closeWidgets")
      @js.native
      def closeWidgets: Requireable[Boolean] = js.native
      inline def closeWidgets_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeWidgets")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.data-testid")
      @js.native
      def dataTestid: Requireable[String] = js.native
      
      inline def dataTestid_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-testid")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.dayAriaLabel")
      @js.native
      def dayAriaLabel: Requireable[String] = js.native
      inline def dayAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.dayPlaceholder")
      @js.native
      def dayPlaceholder: Requireable[String] = js.native
      inline def dayPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.disableCalendar")
      @js.native
      def disableCalendar: Requireable[Boolean] = js.native
      inline def disableCalendar_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCalendar")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.disableClock")
      @js.native
      def disableClock: Requireable[Boolean] = js.native
      inline def disableClock_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableClock")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.format")
      @js.native
      def format: Requireable[String] = js.native
      inline def format_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.hourAriaLabel")
      @js.native
      def hourAriaLabel: Requireable[String] = js.native
      inline def hourAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.hourPlaceholder")
      @js.native
      def hourPlaceholder: Requireable[String] = js.native
      inline def hourPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.isCalendarOpen")
      @js.native
      def isCalendarOpen: Requireable[Boolean] = js.native
      inline def isCalendarOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCalendarOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.isClockOpen")
      @js.native
      def isClockOpen: Requireable[Boolean] = js.native
      inline def isClockOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClockOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.maxDate")
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
      
      @JSImport("react-datetime-picker", "default.propTypes.maxDetail")
      @js.native
      def maxDetail: Requireable[String] = js.native
      inline def maxDetail_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.minDate")
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
      
      @JSImport("react-datetime-picker", "default.propTypes.minuteAriaLabel")
      @js.native
      def minuteAriaLabel: Requireable[String] = js.native
      inline def minuteAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.minutePlaceholder")
      @js.native
      def minutePlaceholder: Requireable[String] = js.native
      inline def minutePlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minutePlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.monthAriaLabel")
      @js.native
      def monthAriaLabel: Requireable[String] = js.native
      inline def monthAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.monthPlaceholder")
      @js.native
      def monthPlaceholder: Requireable[String] = js.native
      inline def monthPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.nativeInputAriaLabel")
      @js.native
      def nativeInputAriaLabel: Requireable[String] = js.native
      inline def nativeInputAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeInputAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.onCalendarClose")
      @js.native
      def onCalendarClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCalendarClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCalendarClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.onCalendarOpen")
      @js.native
      def onCalendarOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCalendarOpen_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCalendarOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.onClockClose")
      @js.native
      def onClockClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClockClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClockClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.onClockOpen")
      @js.native
      def onClockOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClockOpen_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClockOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.onFocus")
      @js.native
      def onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onFocus_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.openWidgetsOnFocus")
      @js.native
      def openWidgetsOnFocus: Requireable[Boolean] = js.native
      inline def openWidgetsOnFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openWidgetsOnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.portalContainer")
      @js.native
      def portalContainer: Requireable[js.Object] = js.native
      inline def portalContainer_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.secondAriaLabel")
      @js.native
      def secondAriaLabel: Requireable[String] = js.native
      inline def secondAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.secondPlaceholder")
      @js.native
      def secondPlaceholder: Requireable[String] = js.native
      inline def secondPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.showLeadingZeros")
      @js.native
      def showLeadingZeros: Requireable[Boolean] = js.native
      inline def showLeadingZeros_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLeadingZeros")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.value")
      @js.native
      def value: Requireable[
            NonNullable[
              js.UndefOr[
                (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
              ]
            ]
          ] = js.native
      inline def value_=(
        x: Requireable[
              NonNullable[
                js.UndefOr[
                  (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
                ]
              ]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.yearAriaLabel")
      @js.native
      def yearAriaLabel: Requireable[String] = js.native
      inline def yearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "default.propTypes.yearPlaceholder")
      @js.native
      def yearPlaceholder: Requireable[String] = js.native
      inline def yearPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearPlaceholder")(x.asInstanceOf[js.Any])
    }
  }
  
  object DateTimePicker {
    
    inline def apply(props: DateTimePickerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-datetime-picker", "DateTimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.amPmAriaLabel")
      @js.native
      def amPmAriaLabel: Requireable[String] = js.native
      inline def amPmAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("amPmAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.calendarAriaLabel")
      @js.native
      def calendarAriaLabel: Requireable[String] = js.native
      inline def calendarAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.calendarClassName")
      @js.native
      def calendarClassName: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def calendarClassName_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.calendarIcon")
      @js.native
      def calendarIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def calendarIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.className")
      @js.native
      def className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def className_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.clearAriaLabel")
      @js.native
      def clearAriaLabel: Requireable[String] = js.native
      inline def clearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.clearIcon")
      @js.native
      def clearIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def clearIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.clockClassName")
      @js.native
      def clockClassName: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def clockClassName_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clockClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.closeWidgets")
      @js.native
      def closeWidgets: Requireable[Boolean] = js.native
      inline def closeWidgets_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeWidgets")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.data-testid")
      @js.native
      def dataTestid: Requireable[String] = js.native
      
      inline def dataTestid_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-testid")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.dayAriaLabel")
      @js.native
      def dayAriaLabel: Requireable[String] = js.native
      inline def dayAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.dayPlaceholder")
      @js.native
      def dayPlaceholder: Requireable[String] = js.native
      inline def dayPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.disableCalendar")
      @js.native
      def disableCalendar: Requireable[Boolean] = js.native
      inline def disableCalendar_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCalendar")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.disableClock")
      @js.native
      def disableClock: Requireable[Boolean] = js.native
      inline def disableClock_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableClock")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.format")
      @js.native
      def format: Requireable[String] = js.native
      inline def format_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.hourAriaLabel")
      @js.native
      def hourAriaLabel: Requireable[String] = js.native
      inline def hourAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.hourPlaceholder")
      @js.native
      def hourPlaceholder: Requireable[String] = js.native
      inline def hourPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.isCalendarOpen")
      @js.native
      def isCalendarOpen: Requireable[Boolean] = js.native
      inline def isCalendarOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCalendarOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.isClockOpen")
      @js.native
      def isClockOpen: Requireable[Boolean] = js.native
      inline def isClockOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClockOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.maxDate")
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
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.maxDetail")
      @js.native
      def maxDetail: Requireable[String] = js.native
      inline def maxDetail_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.minDate")
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
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.minuteAriaLabel")
      @js.native
      def minuteAriaLabel: Requireable[String] = js.native
      inline def minuteAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.minutePlaceholder")
      @js.native
      def minutePlaceholder: Requireable[String] = js.native
      inline def minutePlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minutePlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.monthAriaLabel")
      @js.native
      def monthAriaLabel: Requireable[String] = js.native
      inline def monthAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.monthPlaceholder")
      @js.native
      def monthPlaceholder: Requireable[String] = js.native
      inline def monthPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.nativeInputAriaLabel")
      @js.native
      def nativeInputAriaLabel: Requireable[String] = js.native
      inline def nativeInputAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeInputAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.onCalendarClose")
      @js.native
      def onCalendarClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCalendarClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCalendarClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.onCalendarOpen")
      @js.native
      def onCalendarOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCalendarOpen_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCalendarOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.onClockClose")
      @js.native
      def onClockClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClockClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClockClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.onClockOpen")
      @js.native
      def onClockOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClockOpen_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClockOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.onFocus")
      @js.native
      def onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onFocus_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.openWidgetsOnFocus")
      @js.native
      def openWidgetsOnFocus: Requireable[Boolean] = js.native
      inline def openWidgetsOnFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openWidgetsOnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.portalContainer")
      @js.native
      def portalContainer: Requireable[js.Object] = js.native
      inline def portalContainer_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.secondAriaLabel")
      @js.native
      def secondAriaLabel: Requireable[String] = js.native
      inline def secondAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.secondPlaceholder")
      @js.native
      def secondPlaceholder: Requireable[String] = js.native
      inline def secondPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.showLeadingZeros")
      @js.native
      def showLeadingZeros: Requireable[Boolean] = js.native
      inline def showLeadingZeros_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLeadingZeros")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.value")
      @js.native
      def value: Requireable[
            NonNullable[
              js.UndefOr[
                (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
              ]
            ]
          ] = js.native
      inline def value_=(
        x: Requireable[
              NonNullable[
                js.UndefOr[
                  (NonNullable[js.UndefOr[String | js.Date | Null]]) | (js.Array[js.UndefOr[(NonNullable[js.UndefOr[String | js.Date | Null]]) | Null]]) | Null
                ]
              ]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.yearAriaLabel")
      @js.native
      def yearAriaLabel: Requireable[String] = js.native
      inline def yearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-datetime-picker", "DateTimePicker.propTypes.yearPlaceholder")
      @js.native
      def yearPlaceholder: Requireable[String] = js.native
      inline def yearPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearPlaceholder")(x.asInstanceOf[js.Any])
    }
  }
}
