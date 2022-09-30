package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerAndroidStatic extends StObject {
  
  /**
    * A date has been selected.
    */
  var dateSetAction: typings.reactNativeWindows.reactNativeWindowsStrings.dateSetAction = js.native
  
  /**
    * The dialog has been dismissed.
    */
  var dismissedAction: typings.reactNativeWindows.reactNativeWindowsStrings.dismissedAction = js.native
  
  /**
    * Opens the standard Android date picker dialog.
    *
    * The available keys for the options object are:
    * - date (Date object or timestamp in milliseconds) - date to show by default
    * - minDate (Date or timestamp in milliseconds) - minimum date that can be selected
    * - maxDate (Date object or timestamp in milliseconds) - maximum date that can be selected
    * - mode (enum('calendar', 'spinner', 'default')) - To set the date-picker mode to calendar/spinner/default
    *  - 'calendar': Show a date picker in calendar mode.
    *  - 'spinner': Show a date picker in spinner mode.
    *  - 'default': Show a default native date picker(spinner/calendar) based on android versions.
    *
    * Returns a Promise which will be invoked an object containing action, year, month (0-11), day if the user picked a date.
    * If the user dismissed the dialog, the Promise will still be resolved with action being DatePickerAndroid.dismissedAction and all the other keys being undefined.
    * Always check whether the action before reading the values.
    *
    * Note the native date picker dialog has some UI glitches on Android 4 and lower when using the minDate and maxDate options.
    */
  def open(): js.Promise[DatePickerAndroidOpenReturn] = js.native
  def open(options: DatePickerAndroidOpenOptions): js.Promise[DatePickerAndroidOpenReturn] = js.native
}
