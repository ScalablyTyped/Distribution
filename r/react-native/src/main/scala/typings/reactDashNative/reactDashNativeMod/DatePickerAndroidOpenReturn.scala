package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.dateSetAction
import typings.reactDashNative.reactDashNativeStrings.dismissedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeMod.DatePickerAndroidDateSetAction
  - typings.reactDashNative.reactDashNativeMod.DatePickerAndroidDismissedAction
*/
trait DatePickerAndroidOpenReturn extends js.Object

object DatePickerAndroidOpenReturn {
  @scala.inline
  def DatePickerAndroidDateSetAction(action: dateSetAction, day: Double, month: Double, year: Double): DatePickerAndroidOpenReturn = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatePickerAndroidOpenReturn]
  }
  @scala.inline
  def DatePickerAndroidDismissedAction(action: dismissedAction): DatePickerAndroidOpenReturn = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatePickerAndroidOpenReturn]
  }
}

