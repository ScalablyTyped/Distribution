package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerAndroidStatic extends js.Object {
  /**
    * The dialog has been dismissed.
    */
  var dismissedAction: reactDashNativeLib.reactDashNativeLibStrings.dismissedAction
  /**
    * A time has been selected.
    */
  var timeSetAction: reactDashNativeLib.reactDashNativeLibStrings.timeSetAction
  /**
    * Opens the standard Android time picker dialog.
    *
    * The available keys for the `options` object are:
    *   * `hour` (0-23) - the hour to show, defaults to the current time
    *   * `minute` (0-59) - the minute to show, defaults to the current time
    *   * `is24Hour` (boolean) - If `true`, the picker uses the 24-hour format. If `false`,
    *     the picker shows an AM/PM chooser. If undefined, the default for the current locale
    *     is used.
    *   * `mode` (enum('clock', 'spinner', 'default')) - set the time picker mode
    *     * 'clock': Show a time picker in clock mode.
    *     * 'spinner': Show a time picker in spinner mode.
    *     * 'default': Show a default time picker based on Android versions.
    *
    * Returns a Promise which will be invoked an object containing `action`, `hour` (0-23),
    * `minute` (0-59) if the user picked a time. If the user dismissed the dialog, the Promise will
    * still be resolved with action being `TimePickerAndroid.dismissedAction` and all the other keys
    * being undefined. **Always** check whether the `action` before reading the values.
    */
  def open(options: TimePickerAndroidOpenOptions): js.Promise[TimePickerAndroidOpenReturn]
}

object TimePickerAndroidStatic {
  @scala.inline
  def apply(
    dismissedAction: reactDashNativeLib.reactDashNativeLibStrings.dismissedAction,
    open: js.Function1[TimePickerAndroidOpenOptions, js.Promise[TimePickerAndroidOpenReturn]],
    timeSetAction: reactDashNativeLib.reactDashNativeLibStrings.timeSetAction
  ): TimePickerAndroidStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dismissedAction")(dismissedAction)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("timeSetAction")(timeSetAction)
    __obj.asInstanceOf[TimePickerAndroidStatic]
  }
}

