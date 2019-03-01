package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAnimationTypes extends js.Object {
  var easeIn: java.lang.String
  var easeInEaseOut: java.lang.String
  var easeOut: java.lang.String
  var keyboard: java.lang.String
  var linear: java.lang.String
  var spring: java.lang.String
}

object LayoutAnimationTypes {
  @scala.inline
  def apply(
    easeIn: java.lang.String,
    easeInEaseOut: java.lang.String,
    easeOut: java.lang.String,
    keyboard: java.lang.String,
    linear: java.lang.String,
    spring: java.lang.String
  ): LayoutAnimationTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("easeIn")(easeIn)
    __obj.updateDynamic("easeInEaseOut")(easeInEaseOut)
    __obj.updateDynamic("easeOut")(easeOut)
    __obj.updateDynamic("keyboard")(keyboard)
    __obj.updateDynamic("linear")(linear)
    __obj.updateDynamic("spring")(spring)
    __obj.asInstanceOf[LayoutAnimationTypes]
  }
}

