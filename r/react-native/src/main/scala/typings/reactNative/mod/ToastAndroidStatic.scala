package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastAndroidStatic extends js.Object {
  var BOTTOM: Double = js.native
  var CENTER: Double = js.native
  var LONG: Double = js.native
  // Toast duration constants
  var SHORT: Double = js.native
  // Toast gravity constants
  var TOP: Double = js.native
  /**
    * String message: A string with the text to toast
    * int duration: The duration of the toast.
    * May be ToastAndroid.SHORT or ToastAndroid.LONG
    */
  def show(message: String, duration: Double): Unit = js.native
  /** `gravity` may be ToastAndroid.TOP, ToastAndroid.BOTTOM, ToastAndroid.CENTER */
  def showWithGravity(message: String, duration: Double, gravity: Double): Unit = js.native
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
  @scala.inline
  implicit class ToastAndroidStaticOps[Self <: ToastAndroidStatic] (val x: Self) extends AnyVal {
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
    def setBOTTOM(value: Double): Self = this.set("BOTTOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setCENTER(value: Double): Self = this.set("CENTER", value.asInstanceOf[js.Any])
    @scala.inline
    def setLONG(value: Double): Self = this.set("LONG", value.asInstanceOf[js.Any])
    @scala.inline
    def setSHORT(value: Double): Self = this.set("SHORT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOP(value: Double): Self = this.set("TOP", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: (String, Double) => Unit): Self = this.set("show", js.Any.fromFunction2(value))
    @scala.inline
    def setShowWithGravity(value: (String, Double, Double) => Unit): Self = this.set("showWithGravity", js.Any.fromFunction3(value))
  }
  
}

