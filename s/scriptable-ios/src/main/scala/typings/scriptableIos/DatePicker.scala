package typings.scriptableIos

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Presents a date picker._
  *
  * Use the date picker to present a view for selecting a date.
  *
  * The date picker can be configured towards picking a date with or without time, just a time or picking hours and minutes for a timer.
  * @see https://docs.scriptable.app/datepicker/#-new-datepicker
  */
@js.native
trait DatePicker extends StObject {
  
  /**
    * _Countdown duration displayed by the date picker._
    *
    * Use this property to get and set the duration of a countdown when calling the `pickCountDownDuration()` function to present the picker. The default value is zero and the maximum
    * value is 23:59 (86,399 seconds).
    * @see https://docs.scriptable.app/datepicker/#countdownduration
    */
  var countdownDuration: Double = js.native
  
  /**
    * _The initially selected date._
    *
    * Use this property to specify the initially selected date and time when picking a date, a time or both using date picker. If no date is specified, the current date and time will be
    * selected initially.
    *
    * Be aware that this property does not hold the selected date after the date picker has been dismissed. The promises returned by `pickTime()`, `pickDate()` and `PickDateAndTime()`
    * carries the selected date.
    * @see https://docs.scriptable.app/datepicker/#initialdate
    */
  var initialDate: Date = js.native
  
  /**
    * _Maximum date that is selected in the picker._
    *
    * The maximum date, along with the minimum date, specifies the valid date range. The minimum and maximum dates are ignored if the minimum date is greater than the maximum date. The
    * dates are also ignored in countdown-timer mode.
    * @see https://docs.scriptable.app/datepicker/#maximumdate
    */
  var maximumDate: Date = js.native
  
  /**
    * _Minimum date that is selected in the picker._
    *
    * The minimum date, along with the maximum date, specifies the valid date range. The minimum and maximum dates are ignored if the minimum date is greater than the maximum date. The
    * dates are also ignored in countdown-timer mode.
    * @see https://docs.scriptable.app/datepicker/#minimumdate
    */
  var minimumDate: Date = js.native
  
  /**
    * _Interval at which the date picker displays minutes._
    *
    * Use the property to set the interval of the minute wheel. The default and minimum value is 1 and the maximum value is 30.
    * @see https://docs.scriptable.app/datepicker/#minuteinterval
    */
  var minuteInterval: Double = js.native
  
  /**
    * _Presents the date picker for selecting the duration of a countdown._
    *
    * Use the method to pick the duration of a countdown, e.g. a timer. The date picker will display hours and minutes. Use the `countdownDuration` property to set the initially selected
    * duration.
    * @see https://docs.scriptable.app/datepicker/#-pickcountdownduration
    */
  def pickCountdownDuration(): js.Promise[Double] = js.native
  
  /**
    * _Presents the date picker displaying day, month and year._
    *
    * Use the method to pick a date. The date picker will display the day, month and year. Use the `initialDate` property to set the initially selected date.
    * @see https://docs.scriptable.app/datepicker/#-pickdate
    */
  def pickDate(): js.Promise[Date] = js.native
  
  /**
    * _Presents the date picker displaying date and time._
    *
    * Use the method to pick a date and a time. The date picker will display the day, month, year, hour, minutes and, depending on the locale of the device, an AM/PM designation. Use the
    * `initialDate` property to set the initially selected date.
    * @see https://docs.scriptable.app/datepicker/#-pickdateandtime
    */
  def pickDateAndTime(): js.Promise[Date] = js.native
  
  /**
    * _Presents the date picker displaying hours and minutes._
    *
    * Use the method to pick a time. The date picker will display hours and minutes and, depending on the locale of the device, an AM/PM designation.
    *
    * The returned date will be the current date with the hour and minute set to the selected values. Use the `initialDate` property to set the initially selected date.
    * @see https://docs.scriptable.app/datepicker/#-picktime
    */
  def pickTime(): js.Promise[Date] = js.native
}
object DatePicker {
  
  @scala.inline
  def apply(
    countdownDuration: Double,
    initialDate: Date,
    maximumDate: Date,
    minimumDate: Date,
    minuteInterval: Double,
    pickCountdownDuration: () => js.Promise[Double],
    pickDate: () => js.Promise[Date],
    pickDateAndTime: () => js.Promise[Date],
    pickTime: () => js.Promise[Date]
  ): DatePicker = {
    val __obj = js.Dynamic.literal(countdownDuration = countdownDuration.asInstanceOf[js.Any], initialDate = initialDate.asInstanceOf[js.Any], maximumDate = maximumDate.asInstanceOf[js.Any], minimumDate = minimumDate.asInstanceOf[js.Any], minuteInterval = minuteInterval.asInstanceOf[js.Any], pickCountdownDuration = js.Any.fromFunction0(pickCountdownDuration), pickDate = js.Any.fromFunction0(pickDate), pickDateAndTime = js.Any.fromFunction0(pickDateAndTime), pickTime = js.Any.fromFunction0(pickTime))
    __obj.asInstanceOf[DatePicker]
  }
  
  @scala.inline
  implicit class DatePickerMutableBuilder[Self <: DatePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountdownDuration(value: Double): Self = StObject.set(x, "countdownDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialDate(value: Date): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDate(value: Date): Self = StObject.set(x, "maximumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumDate(value: Date): Self = StObject.set(x, "minimumDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteInterval(value: Double): Self = StObject.set(x, "minuteInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickCountdownDuration(value: () => js.Promise[Double]): Self = StObject.set(x, "pickCountdownDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickDate(value: () => js.Promise[Date]): Self = StObject.set(x, "pickDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickDateAndTime(value: () => js.Promise[Date]): Self = StObject.set(x, "pickDateAndTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickTime(value: () => js.Promise[Date]): Self = StObject.set(x, "pickTime", js.Any.fromFunction0(value))
  }
}
