package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Presents a date picker._
  *
  * Use the date picker to present a view for selecting a date.
  *
  * The date picker can be configured towards picking a date with or without time, just a time or picking hours and minutes for a timer.
  * @see https://docs.scriptable.app/datepicker/#-new-datepicker
  */
@JSGlobal("DatePicker")
@js.native
/**
  * _Presents a date picker._
  *
  * Use the date picker to present a view for selecting a date.
  *
  * The date picker can be configured towards picking a date with or without time, just a time or picking hours and minutes for a timer.
  * @see https://docs.scriptable.app/datepicker/#-new-datepicker
  */
open class DatePicker ()
  extends StObject
     with typings.scriptableIos.DatePicker {
  
  /**
    * _Countdown duration displayed by the date picker._
    *
    * Use this property to get and set the duration of a countdown when calling the `pickCountDownDuration()` function to present the picker. The default value is zero and the maximum
    * value is 23:59 (86,399 seconds).
    * @see https://docs.scriptable.app/datepicker/#countdownduration
    */
  /* CompleteClass */
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
  /* CompleteClass */
  var initialDate: js.Date = js.native
  
  /**
    * _Maximum date that is selected in the picker._
    *
    * The maximum date, along with the minimum date, specifies the valid date range. The minimum and maximum dates are ignored if the minimum date is greater than the maximum date. The
    * dates are also ignored in countdown-timer mode.
    * @see https://docs.scriptable.app/datepicker/#maximumdate
    */
  /* CompleteClass */
  var maximumDate: js.Date = js.native
  
  /**
    * _Minimum date that is selected in the picker._
    *
    * The minimum date, along with the maximum date, specifies the valid date range. The minimum and maximum dates are ignored if the minimum date is greater than the maximum date. The
    * dates are also ignored in countdown-timer mode.
    * @see https://docs.scriptable.app/datepicker/#minimumdate
    */
  /* CompleteClass */
  var minimumDate: js.Date = js.native
  
  /**
    * _Interval at which the date picker displays minutes._
    *
    * Use the property to set the interval of the minute wheel. The default and minimum value is 1 and the maximum value is 30.
    * @see https://docs.scriptable.app/datepicker/#minuteinterval
    */
  /* CompleteClass */
  var minuteInterval: Double = js.native
  
  /**
    * _Presents the date picker for selecting the duration of a countdown._
    *
    * Use the method to pick the duration of a countdown, e.g. a timer. The date picker will display hours and minutes. Use the `countdownDuration` property to set the initially selected
    * duration.
    * @see https://docs.scriptable.app/datepicker/#-pickcountdownduration
    */
  /* CompleteClass */
  override def pickCountdownDuration(): js.Promise[Double] = js.native
  
  /**
    * _Presents the date picker displaying day, month and year._
    *
    * Use the method to pick a date. The date picker will display the day, month and year. Use the `initialDate` property to set the initially selected date.
    * @see https://docs.scriptable.app/datepicker/#-pickdate
    */
  /* CompleteClass */
  override def pickDate(): js.Promise[js.Date] = js.native
  
  /**
    * _Presents the date picker displaying date and time._
    *
    * Use the method to pick a date and a time. The date picker will display the day, month, year, hour, minutes and, depending on the locale of the device, an AM/PM designation. Use the
    * `initialDate` property to set the initially selected date.
    * @see https://docs.scriptable.app/datepicker/#-pickdateandtime
    */
  /* CompleteClass */
  override def pickDateAndTime(): js.Promise[js.Date] = js.native
  
  /**
    * _Presents the date picker displaying hours and minutes._
    *
    * Use the method to pick a time. The date picker will display hours and minutes and, depending on the locale of the device, an AM/PM designation.
    *
    * The returned date will be the current date with the hour and minute set to the selected values. Use the `initialDate` property to set the initially selected date.
    * @see https://docs.scriptable.app/datepicker/#-picktime
    */
  /* CompleteClass */
  override def pickTime(): js.Promise[js.Date] = js.native
}
