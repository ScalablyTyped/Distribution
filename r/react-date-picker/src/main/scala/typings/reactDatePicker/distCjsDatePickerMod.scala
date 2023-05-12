package typings.reactDatePicker

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactDatePicker.anon.AutoFocus
import typings.reactDatePicker.anon.TypeofCalendar
import typings.reactDatePicker.reactDatePickerStrings.century
import typings.reactDatePicker.reactDatePickerStrings.className
import typings.reactDatePicker.reactDatePickerStrings.decade
import typings.reactDatePicker.reactDatePickerStrings.maxDetail
import typings.reactDatePicker.reactDatePickerStrings.month
import typings.reactDatePicker.reactDatePickerStrings.onChange
import typings.reactDatePicker.reactDatePickerStrings.year
import typings.std.NonNullable
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsDatePickerMod {
  
  object default {
    
    inline def apply(props: DatePickerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-date-picker/dist/cjs/DatePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.calendarAriaLabel")
      @js.native
      def calendarAriaLabel: Requireable[String] = js.native
      inline def calendarAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.calendarClassName")
      @js.native
      def calendarClassName: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def calendarClassName_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.calendarIcon")
      @js.native
      def calendarIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def calendarIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendarIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.className")
      @js.native
      def className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]] = js.native
      inline def className_=(x: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.clearAriaLabel")
      @js.native
      def clearAriaLabel: Requireable[String] = js.native
      inline def clearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.clearIcon")
      @js.native
      def clearIcon: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]] = js.native
      inline def clearIcon_=(x: Requireable[NonNullable[ReactNodeLike | (js.Function1[/* repeated */ Any, Any])]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.closeCalendar")
      @js.native
      def closeCalendar: Requireable[Boolean] = js.native
      inline def closeCalendar_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeCalendar")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.data-testid")
      @js.native
      def dataTestid: Requireable[String] = js.native
      
      inline def dataTestid_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data-testid")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.dayAriaLabel")
      @js.native
      def dayAriaLabel: Requireable[String] = js.native
      inline def dayAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.dayPlaceholder")
      @js.native
      def dayPlaceholder: Requireable[String] = js.native
      inline def dayPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.disableCalendar")
      @js.native
      def disableCalendar: Requireable[Boolean] = js.native
      inline def disableCalendar_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCalendar")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.format")
      @js.native
      def format: Requireable[String] = js.native
      inline def format_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.isOpen")
      @js.native
      def isOpen: Requireable[Boolean] = js.native
      inline def isOpen_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.maxDate")
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
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.maxDetail")
      @js.native
      def maxDetail: Requireable[month | year | century | decade] = js.native
      inline def maxDetail_=(x: Requireable[month | year | century | decade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDetail")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.minDate")
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
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.monthAriaLabel")
      @js.native
      def monthAriaLabel: Requireable[String] = js.native
      inline def monthAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.monthPlaceholder")
      @js.native
      def monthPlaceholder: Requireable[String] = js.native
      inline def monthPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthPlaceholder")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.name")
      @js.native
      def name: Requireable[String] = js.native
      inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.nativeInputAriaLabel")
      @js.native
      def nativeInputAriaLabel: Requireable[String] = js.native
      inline def nativeInputAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nativeInputAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.onCalendarClose")
      @js.native
      def onCalendarClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCalendarClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCalendarClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.onCalendarOpen")
      @js.native
      def onCalendarOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCalendarOpen_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCalendarOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.onFocus")
      @js.native
      def onFocus: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onFocus_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.openCalendarOnFocus")
      @js.native
      def openCalendarOnFocus: Requireable[Boolean] = js.native
      inline def openCalendarOnFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openCalendarOnFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.portalContainer")
      @js.native
      def portalContainer: Requireable[js.Object] = js.native
      inline def portalContainer_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.returnValue")
      @js.native
      def returnValue: Requireable[String] = js.native
      inline def returnValue_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnValue")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.showLeadingZeros")
      @js.native
      def showLeadingZeros: Requireable[Boolean] = js.native
      inline def showLeadingZeros_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLeadingZeros")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.value")
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
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.yearAriaLabel")
      @js.native
      def yearAriaLabel: Requireable[String] = js.native
      inline def yearAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-date-picker/dist/cjs/DatePicker", "default.propTypes.yearPlaceholder")
      @js.native
      def yearPlaceholder: Requireable[String] = js.native
      inline def yearPlaceholder_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yearPlaceholder")(x.asInstanceOf[js.Any])
    }
  }
  
  type DatePickerProps = AutoFocus & (Omit[ComponentPropsWithoutRef[TypeofCalendar], className | maxDetail | onChange])
  
  type Icon = ReactElement | String
  
  type IconOrRenderFunction = Icon | ComponentType[js.Object] | ReactElement
}
