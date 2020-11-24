package typings.reactTimePicker.mod

import typings.reactTimePicker.reactTimePickerStrings.hour
import typings.reactTimePicker.reactTimePickerStrings.minute
import typings.reactTimePicker.reactTimePickerStrings.second
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerProps[T] extends TimePickerClockProps {
  
  /**
    * aria-label for the AM/PM select input.
    */
  var amPmAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Automatically focuses the input on mount.
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Class name(s) that will be added along with "react-time-picker" to the main React-Time-Picker <div> element.
    */
  var className: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * aria-label for the clear button.
    */
  var clearAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Content of the clear button. Setting the value explicitly to null will hide the icon.
    */
  var clearIcon: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
  ] = js.native
  
  /**
    * aria-label for the clock button.
    */
  var clockAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Class name(s) that will be added along with "react-clock" to the main React-Clock <time> element.
    */
  var clockClassName: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Content of the clock button. Setting the value explicitly to null will hide the icon.
    */
  var clockIcon: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
  ] = js.native
  
  /**
    * Whether to close the clock on value selection.
    * @default true
    */
  var closeClock: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to true, will remove the clock and the button toggling its visibility.
    * @default false
    */
  var disableClock: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the time picker should be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Input format based on Unicode Technical Standard #35.
    * Supported values are: H, HH, h, hh, m, mm, s, ss, a.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * aria-label for the hour input.
    */
  var hourAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * placeholder for the hour input.
    * @default "--"
    */
  var hourPlaceholder: js.UndefOr[String] = js.native
  
  /**
    * Whether the clock should be opened.
    * @default false
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Locale that should be used by the time picker and the clock. Can be any IETF language tag.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * How detailed time picking shall be. Can be "hour", "minute" or "second".
    * @default "minute"
    */
  var maxDetail: js.UndefOr[hour | minute | second] = js.native
  
  /**
    * Maximum time that the user can select.
    */
  var maxTime: js.UndefOr[T] = js.native
  
  /**
    * Minimum date that the user can select.
    */
  var minTime: js.UndefOr[T] = js.native
  
  /**
    * aria-label for the minute input.
    */
  var minuteAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * placeholder for the minute input.
    * @default "--"
    */
  var minutePlaceholder: js.UndefOr[String] = js.native
  
  /**
    * Input name.
    * @default "time"
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * aria-label for the native time input.
    */
  var nativeInputAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Function called when the user picks a valid time.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  
  /**
    * Function called when the clock closes.
    */
  var onClockClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Function called when the clock opens.
    */
  var onClockOpen: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Whether date input should be required.
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * aria-label for the second input.
    */
  var secondAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * placeholder for the second input.
    * @default "--"
    */
  var secondPlaceholder: js.UndefOr[String] = js.native
  
  /**
    * Input value.
    */
  var value: T = js.native
}
object TimePickerProps {
  
  @scala.inline
  def apply[T](value: T): TimePickerProps[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerProps[T]]
  }
  
  @scala.inline
  implicit class TimePickerPropsOps[Self <: TimePickerProps[_], T] (val x: Self with TimePickerProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmPmAriaLabel(value: String): Self = this.set("amPmAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmPmAriaLabel: Self = this.set("amPmAriaLabel", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setClassNameVarargs(value: String*): Self = this.set("className", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String | js.Array[String]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearAriaLabel(value: String): Self = this.set("clearAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearAriaLabel: Self = this.set("clearAriaLabel", js.undefined)
    
    @scala.inline
    def setClearIcon(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = this.set("clearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIcon: Self = this.set("clearIcon", js.undefined)
    
    @scala.inline
    def setClockAriaLabel(value: String): Self = this.set("clockAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockAriaLabel: Self = this.set("clockAriaLabel", js.undefined)
    
    @scala.inline
    def setClockClassNameVarargs(value: String*): Self = this.set("clockClassName", js.Array(value :_*))
    
    @scala.inline
    def setClockClassName(value: String | js.Array[String]): Self = this.set("clockClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockClassName: Self = this.set("clockClassName", js.undefined)
    
    @scala.inline
    def setClockIcon(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = this.set("clockIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockIcon: Self = this.set("clockIcon", js.undefined)
    
    @scala.inline
    def setCloseClock(value: Boolean): Self = this.set("closeClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseClock: Self = this.set("closeClock", js.undefined)
    
    @scala.inline
    def setDisableClock(value: Boolean): Self = this.set("disableClock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableClock: Self = this.set("disableClock", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHourAriaLabel(value: String): Self = this.set("hourAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourAriaLabel: Self = this.set("hourAriaLabel", js.undefined)
    
    @scala.inline
    def setHourPlaceholder(value: String): Self = this.set("hourPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourPlaceholder: Self = this.set("hourPlaceholder", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDetail(value: hour | minute | second): Self = this.set("maxDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDetail: Self = this.set("maxDetail", js.undefined)
    
    @scala.inline
    def setMaxTime(value: T): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    
    @scala.inline
    def setMinTime(value: T): Self = this.set("minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    
    @scala.inline
    def setMinuteAriaLabel(value: String): Self = this.set("minuteAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteAriaLabel: Self = this.set("minuteAriaLabel", js.undefined)
    
    @scala.inline
    def setMinutePlaceholder(value: String): Self = this.set("minutePlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutePlaceholder: Self = this.set("minutePlaceholder", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNativeInputAriaLabel(value: String): Self = this.set("nativeInputAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeInputAriaLabel: Self = this.set("nativeInputAriaLabel", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ T => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClockClose(value: () => Unit): Self = this.set("onClockClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClockClose: Self = this.set("onClockClose", js.undefined)
    
    @scala.inline
    def setOnClockOpen(value: () => Unit): Self = this.set("onClockOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClockOpen: Self = this.set("onClockOpen", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSecondAriaLabel(value: String): Self = this.set("secondAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondAriaLabel: Self = this.set("secondAriaLabel", js.undefined)
    
    @scala.inline
    def setSecondPlaceholder(value: String): Self = this.set("secondPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondPlaceholder: Self = this.set("secondPlaceholder", js.undefined)
  }
}
