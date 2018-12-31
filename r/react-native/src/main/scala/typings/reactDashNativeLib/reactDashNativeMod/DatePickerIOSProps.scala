package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerIOSProps extends ViewProps {
  /**
    * The currently selected date.
    */
  var date: stdLib.Date
  /**
    * The date picker locale.
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var maximumDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Maximum date.
    * Restricts the range of possible date/time values.
    */
  var minimumDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *  enum(1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30)
    *  The interval at which minutes can be selected.
    */
  var minuteInterval: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibNumbers.`1` | reactDashNativeLib.reactDashNativeLibNumbers.`2` | reactDashNativeLib.reactDashNativeLibNumbers.`3` | reactDashNativeLib.reactDashNativeLibNumbers.`4` | reactDashNativeLib.reactDashNativeLibNumbers.`5` | reactDashNativeLib.reactDashNativeLibNumbers.`6` | reactDashNativeLib.reactDashNativeLibNumbers.`10` | reactDashNativeLib.reactDashNativeLibNumbers.`12` | reactDashNativeLib.reactDashNativeLibNumbers.`15` | reactDashNativeLib.reactDashNativeLibNumbers.`20` | reactDashNativeLib.reactDashNativeLibNumbers.`30`
  ] = js.undefined
  /**
    *  enum('date', 'time', 'datetime')
    *  The date picker mode.
    */
  var mode: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.date | reactDashNativeLib.reactDashNativeLibStrings.time | reactDashNativeLib.reactDashNativeLibStrings.datetime
  ] = js.undefined
  /**
    * Timezone offset in minutes.
    * By default, the date picker will use the device's timezone. With this parameter, it is possible to force a certain timezone offset.
    * For instance, to show times in Pacific Standard Time, pass -7 * 60.
    */
  var timeZoneOffsetInMinutes: js.UndefOr[scala.Double] = js.undefined
  /**
    * Date change handler.
    * This is called when the user changes the date or time in the UI.
    * The first and only argument is a Date object representing the new date and time.
    */
  def onDateChange(newDate: stdLib.Date): scala.Unit
}

