package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastAndroidStatic extends js.Object {
  var BOTTOM: Double
  var CENTER: Double
  var LONG: Double
  // Toast duration constants
  var SHORT: Double
  // Toast gravity constants
  var TOP: Double
  /**
    * String message: A string with the text to toast
    * int duration: The duration of the toast.
    * May be ToastAndroid.SHORT or ToastAndroid.LONG
    */
  def show(message: String, duration: Double): Unit
  /** `gravity` may be ToastAndroid.TOP, ToastAndroid.BOTTOM, ToastAndroid.CENTER */
  def showWithGravity(message: String, duration: Double, gravity: Double): Unit
}

object ToastAndroidStatic {
  @scala.inline
  def apply(
    BOTTOM: Double,
    CENTER: Double,
    LONG: Double,
    SHORT: Double,
    TOP: Double,
    show: (String, Double) => Unit,
    showWithGravity: (String, Double, Double) => Unit
  ): ToastAndroidStatic = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], CENTER = CENTER.asInstanceOf[js.Any], LONG = LONG.asInstanceOf[js.Any], SHORT = SHORT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], show = js.Any.fromFunction2(show), showWithGravity = js.Any.fromFunction3(showWithGravity))
  
    __obj.asInstanceOf[ToastAndroidStatic]
  }
}

