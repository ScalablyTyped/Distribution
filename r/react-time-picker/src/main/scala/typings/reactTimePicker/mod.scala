package typings.reactTimePicker

import typings.reactTimePicker.reactTimePickerStrings.hour
import typings.reactTimePicker.reactTimePickerStrings.minute
import typings.reactTimePicker.reactTimePickerStrings.second
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-time-picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TimePickerProps[TimePickerValue]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* Inlined std.Omit<react-clock.react-clock.ClockProps<react-clock.react-clock.ClockValue>, 'value' | 'className'> */
  trait TimePickerClockProps extends StObject {
    
    var hourHandLength: js.UndefOr[Double] = js.undefined
    
    var hourHandOppositeLength: js.UndefOr[Double] = js.undefined
    
    var hourHandWidth: js.UndefOr[Double] = js.undefined
    
    var hourMarksLength: js.UndefOr[Double] = js.undefined
    
    var hourMarksWidth: js.UndefOr[Double] = js.undefined
    
    var minuteHandLength: js.UndefOr[Double] = js.undefined
    
    var minuteHandOppositeLength: js.UndefOr[Double] = js.undefined
    
    var minuteHandWidth: js.UndefOr[Double] = js.undefined
    
    var minuteMarksLength: js.UndefOr[Double] = js.undefined
    
    var minuteMarksWidth: js.UndefOr[Double] = js.undefined
    
    var renderHourMarks: js.UndefOr[Boolean] = js.undefined
    
    var renderMinuteHand: js.UndefOr[Boolean] = js.undefined
    
    var renderMinuteMarks: js.UndefOr[Boolean] = js.undefined
    
    var renderNumbers: js.UndefOr[Boolean] = js.undefined
    
    var renderSecondHand: js.UndefOr[Boolean] = js.undefined
    
    var secondHandLength: js.UndefOr[Double] = js.undefined
    
    var secondHandOppositeLength: js.UndefOr[Double] = js.undefined
    
    var secondHandWidth: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object TimePickerClockProps {
    
    inline def apply(): TimePickerClockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerClockProps]
    }
    
    extension [Self <: TimePickerClockProps](x: Self) {
      
      inline def setHourHandLength(value: Double): Self = StObject.set(x, "hourHandLength", value.asInstanceOf[js.Any])
      
      inline def setHourHandLengthUndefined: Self = StObject.set(x, "hourHandLength", js.undefined)
      
      inline def setHourHandOppositeLength(value: Double): Self = StObject.set(x, "hourHandOppositeLength", value.asInstanceOf[js.Any])
      
      inline def setHourHandOppositeLengthUndefined: Self = StObject.set(x, "hourHandOppositeLength", js.undefined)
      
      inline def setHourHandWidth(value: Double): Self = StObject.set(x, "hourHandWidth", value.asInstanceOf[js.Any])
      
      inline def setHourHandWidthUndefined: Self = StObject.set(x, "hourHandWidth", js.undefined)
      
      inline def setHourMarksLength(value: Double): Self = StObject.set(x, "hourMarksLength", value.asInstanceOf[js.Any])
      
      inline def setHourMarksLengthUndefined: Self = StObject.set(x, "hourMarksLength", js.undefined)
      
      inline def setHourMarksWidth(value: Double): Self = StObject.set(x, "hourMarksWidth", value.asInstanceOf[js.Any])
      
      inline def setHourMarksWidthUndefined: Self = StObject.set(x, "hourMarksWidth", js.undefined)
      
      inline def setMinuteHandLength(value: Double): Self = StObject.set(x, "minuteHandLength", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandLengthUndefined: Self = StObject.set(x, "minuteHandLength", js.undefined)
      
      inline def setMinuteHandOppositeLength(value: Double): Self = StObject.set(x, "minuteHandOppositeLength", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandOppositeLengthUndefined: Self = StObject.set(x, "minuteHandOppositeLength", js.undefined)
      
      inline def setMinuteHandWidth(value: Double): Self = StObject.set(x, "minuteHandWidth", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandWidthUndefined: Self = StObject.set(x, "minuteHandWidth", js.undefined)
      
      inline def setMinuteMarksLength(value: Double): Self = StObject.set(x, "minuteMarksLength", value.asInstanceOf[js.Any])
      
      inline def setMinuteMarksLengthUndefined: Self = StObject.set(x, "minuteMarksLength", js.undefined)
      
      inline def setMinuteMarksWidth(value: Double): Self = StObject.set(x, "minuteMarksWidth", value.asInstanceOf[js.Any])
      
      inline def setMinuteMarksWidthUndefined: Self = StObject.set(x, "minuteMarksWidth", js.undefined)
      
      inline def setRenderHourMarks(value: Boolean): Self = StObject.set(x, "renderHourMarks", value.asInstanceOf[js.Any])
      
      inline def setRenderHourMarksUndefined: Self = StObject.set(x, "renderHourMarks", js.undefined)
      
      inline def setRenderMinuteHand(value: Boolean): Self = StObject.set(x, "renderMinuteHand", value.asInstanceOf[js.Any])
      
      inline def setRenderMinuteHandUndefined: Self = StObject.set(x, "renderMinuteHand", js.undefined)
      
      inline def setRenderMinuteMarks(value: Boolean): Self = StObject.set(x, "renderMinuteMarks", value.asInstanceOf[js.Any])
      
      inline def setRenderMinuteMarksUndefined: Self = StObject.set(x, "renderMinuteMarks", js.undefined)
      
      inline def setRenderNumbers(value: Boolean): Self = StObject.set(x, "renderNumbers", value.asInstanceOf[js.Any])
      
      inline def setRenderNumbersUndefined: Self = StObject.set(x, "renderNumbers", js.undefined)
      
      inline def setRenderSecondHand(value: Boolean): Self = StObject.set(x, "renderSecondHand", value.asInstanceOf[js.Any])
      
      inline def setRenderSecondHandUndefined: Self = StObject.set(x, "renderSecondHand", js.undefined)
      
      inline def setSecondHandLength(value: Double): Self = StObject.set(x, "secondHandLength", value.asInstanceOf[js.Any])
      
      inline def setSecondHandLengthUndefined: Self = StObject.set(x, "secondHandLength", js.undefined)
      
      inline def setSecondHandOppositeLength(value: Double): Self = StObject.set(x, "secondHandOppositeLength", value.asInstanceOf[js.Any])
      
      inline def setSecondHandOppositeLengthUndefined: Self = StObject.set(x, "secondHandOppositeLength", js.undefined)
      
      inline def setSecondHandWidth(value: Double): Self = StObject.set(x, "secondHandWidth", value.asInstanceOf[js.Any])
      
      inline def setSecondHandWidthUndefined: Self = StObject.set(x, "secondHandWidth", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait TimePickerProps[T]
    extends StObject
       with TimePickerClockProps {
    
    /**
      * aria-label for the AM/PM select input.
      */
    var amPmAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Automatically focuses the input on mount.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Class name(s) that will be added along with "react-time-picker" to the main React-Time-Picker <div> element.
      */
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * aria-label for the clear button.
      */
    var clearAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Content of the clear button. Setting the value explicitly to null will hide the icon.
      */
    var clearIcon: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ] = js.undefined
    
    /**
      * aria-label for the clock button.
      */
    var clockAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Class name(s) that will be added along with "react-clock" to the main React-Clock <time> element.
      */
    var clockClassName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Content of the clock button. Setting the value explicitly to null will hide the icon.
      */
    var clockIcon: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ] = js.undefined
    
    /**
      * Whether to close the clock on value selection.
      * @default true
      */
    var closeClock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to true, will remove the clock and the button toggling its visibility.
      * @default false
      */
    var disableClock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the time picker should be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Input format based on Unicode Technical Standard #35.
      * Supported values are: H, HH, h, hh, m, mm, s, ss, a.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * aria-label for the hour input.
      */
    var hourAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * placeholder for the hour input.
      * @default "--"
      */
    var hourPlaceholder: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the clock should be opened.
      * @default false
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Locale that should be used by the time picker and the clock. Can be any IETF language tag.
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * How detailed time picking shall be. Can be "hour", "minute" or "second".
      * @default "minute"
      */
    var maxDetail: js.UndefOr[hour | minute | second] = js.undefined
    
    /**
      * Maximum time that the user can select.
      */
    var maxTime: js.UndefOr[T] = js.undefined
    
    /**
      * Minimum date that the user can select.
      */
    var minTime: js.UndefOr[T] = js.undefined
    
    /**
      * aria-label for the minute input.
      */
    var minuteAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * placeholder for the minute input.
      * @default "--"
      */
    var minutePlaceholder: js.UndefOr[String] = js.undefined
    
    /**
      * Input name.
      * @default "time"
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * aria-label for the native time input.
      */
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Function called when the user picks a valid time.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
    
    /**
      * Function called when the clock closes.
      */
    var onClockClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Function called when the clock opens.
      */
    var onClockOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Whether date input should be required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * aria-label for the second input.
      */
    var secondAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * placeholder for the second input.
      * @default "--"
      */
    var secondPlaceholder: js.UndefOr[String] = js.undefined
    
    /**
      * Input value.
      */
    var value: T
  }
  object TimePickerProps {
    
    inline def apply[T](value: T): TimePickerProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerProps[T]]
    }
    
    extension [Self <: TimePickerProps[?], T](x: Self & TimePickerProps[T]) {
      
      inline def setAmPmAriaLabel(value: String): Self = StObject.set(x, "amPmAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setAmPmAriaLabelUndefined: Self = StObject.set(x, "amPmAriaLabel", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value :_*))
      
      inline def setClearAriaLabel(value: String): Self = StObject.set(x, "clearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setClearAriaLabelUndefined: Self = StObject.set(x, "clearAriaLabel", js.undefined)
      
      inline def setClearIcon(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClockAriaLabel(value: String): Self = StObject.set(x, "clockAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setClockAriaLabelUndefined: Self = StObject.set(x, "clockAriaLabel", js.undefined)
      
      inline def setClockClassName(value: String | js.Array[String]): Self = StObject.set(x, "clockClassName", value.asInstanceOf[js.Any])
      
      inline def setClockClassNameUndefined: Self = StObject.set(x, "clockClassName", js.undefined)
      
      inline def setClockClassNameVarargs(value: String*): Self = StObject.set(x, "clockClassName", js.Array(value :_*))
      
      inline def setClockIcon(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "clockIcon", value.asInstanceOf[js.Any])
      
      inline def setClockIconUndefined: Self = StObject.set(x, "clockIcon", js.undefined)
      
      inline def setCloseClock(value: Boolean): Self = StObject.set(x, "closeClock", value.asInstanceOf[js.Any])
      
      inline def setCloseClockUndefined: Self = StObject.set(x, "closeClock", js.undefined)
      
      inline def setDisableClock(value: Boolean): Self = StObject.set(x, "disableClock", value.asInstanceOf[js.Any])
      
      inline def setDisableClockUndefined: Self = StObject.set(x, "disableClock", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      inline def setHourPlaceholder(value: String): Self = StObject.set(x, "hourPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setHourPlaceholderUndefined: Self = StObject.set(x, "hourPlaceholder", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDetail(value: hour | minute | second): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMaxTime(value: T): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: T): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      inline def setMinutePlaceholder(value: String): Self = StObject.set(x, "minutePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMinutePlaceholderUndefined: Self = StObject.set(x, "minutePlaceholder", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      inline def setOnChange(value: /* value */ T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClockClose(value: () => Unit): Self = StObject.set(x, "onClockClose", js.Any.fromFunction0(value))
      
      inline def setOnClockCloseUndefined: Self = StObject.set(x, "onClockClose", js.undefined)
      
      inline def setOnClockOpen(value: () => Unit): Self = StObject.set(x, "onClockOpen", js.Any.fromFunction0(value))
      
      inline def setOnClockOpenUndefined: Self = StObject.set(x, "onClockOpen", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSecondAriaLabel(value: String): Self = StObject.set(x, "secondAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondAriaLabelUndefined: Self = StObject.set(x, "secondAriaLabel", js.undefined)
      
      inline def setSecondPlaceholder(value: String): Self = StObject.set(x, "secondPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSecondPlaceholderUndefined: Self = StObject.set(x, "secondPlaceholder", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TimePickerValue = String | Date
}
