package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastAndroidStatic extends js.Object {
  var BOTTOM: scala.Double
  var CENTER: scala.Double
  var LONG: scala.Double
  // Toast duration constants
  var SHORT: scala.Double
  // Toast gravity constants
  var TOP: scala.Double
  /**
    * String message: A string with the text to toast
    * int duration: The duration of the toast.
    * May be ToastAndroid.SHORT or ToastAndroid.LONG
    */
  def show(message: java.lang.String, duration: scala.Double): scala.Unit
  /** `gravity` may be ToastAndroid.TOP, ToastAndroid.BOTTOM, ToastAndroid.CENTER */
  def showWithGravity(message: java.lang.String, duration: scala.Double, gravity: scala.Double): scala.Unit
}

