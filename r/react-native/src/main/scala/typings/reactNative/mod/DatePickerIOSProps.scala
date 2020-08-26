package typings.reactNative.mod

import typings.reactNative.reactNativeNumbers.`10`
import typings.reactNative.reactNativeNumbers.`12`
import typings.reactNative.reactNativeNumbers.`15`
import typings.reactNative.reactNativeNumbers.`1`
import typings.reactNative.reactNativeNumbers.`20`
import typings.reactNative.reactNativeNumbers.`2`
import typings.reactNative.reactNativeNumbers.`30`
import typings.reactNative.reactNativeNumbers.`3`
import typings.reactNative.reactNativeNumbers.`4`
import typings.reactNative.reactNativeNumbers.`5`
import typings.reactNative.reactNativeNumbers.`6`
import typings.reactNative.reactNativeStrings.date
import typings.reactNative.reactNativeStrings.datetime
import typings.reactNative.reactNativeStrings.time
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerIOSProps extends ViewProps {
  /**
    * The currently selected date.
    */
  var date: Date = js.native
  /**
    * The date picker locale.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var maximumDate: js.UndefOr[Date] = js.native
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var minimumDate: js.UndefOr[Date] = js.native
  /**
    *  enum(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30)
    *  The interval at which minutes can be selected.
    */
  var minuteInterval: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30`] = js.native
  /**
    *  enum('date', 'time', 'datetime')
    *  The date picker mode.
    */
  var mode: js.UndefOr[date | time | datetime] = js.native
  /**
    * Timezone offset in minutes.
    * By default, the date picker will use the device's timezone. With this parameter, it is possible to force a certain timezone offset.
    * For instance, to show times in Pacific Standard Time, pass -7 * 60.
    */
  var timeZoneOffsetInMinutes: js.UndefOr[Double] = js.native
  /**
    * Date change handler.
    * This is called when the user changes the date or time in the UI.
    * The first and only argument is a Date object representing the new date and time.
    */
  def onDateChange(newDate: Date): Unit = js.native
}

object DatePickerIOSProps {
  @scala.inline
  def apply(date: Date, onDateChange: Date => Unit): DatePickerIOSProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], onDateChange = js.Any.fromFunction1(onDateChange))
    __obj.asInstanceOf[DatePickerIOSProps]
  }
  @scala.inline
  implicit class DatePickerIOSPropsOps[Self <: DatePickerIOSProps] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDateChange(value: Date => Unit): Self = this.set("onDateChange", js.Any.fromFunction1(value))
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaximumDate(value: Date): Self = this.set("maximumDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumDate: Self = this.set("maximumDate", js.undefined)
    @scala.inline
    def setMinimumDate(value: Date): Self = this.set("minimumDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumDate: Self = this.set("minimumDate", js.undefined)
    @scala.inline
    def setMinuteInterval(value: `1` | `2` | `3` | `4` | `5` | `6` | `10` | `12` | `15` | `20` | `30`): Self = this.set("minuteInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteInterval: Self = this.set("minuteInterval", js.undefined)
    @scala.inline
    def setMode(value: date | time | datetime): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setTimeZoneOffsetInMinutes(value: Double): Self = this.set("timeZoneOffsetInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZoneOffsetInMinutes: Self = this.set("timeZoneOffsetInMinutes", js.undefined)
  }
  
}

