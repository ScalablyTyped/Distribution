package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAnimationTypes extends js.Object {
  var easeIn: String
  var easeInEaseOut: String
  var easeOut: String
  var keyboard: String
  var linear: String
  var spring: String
}

object LayoutAnimationTypes {
  @scala.inline
  def apply(
    easeIn: String,
    easeInEaseOut: String,
    easeOut: String,
    keyboard: String,
    linear: String,
    spring: String
  ): LayoutAnimationTypes = {
    val __obj = js.Dynamic.literal(easeIn = easeIn.asInstanceOf[js.Any], easeInEaseOut = easeInEaseOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], keyboard = keyboard.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], spring = spring.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LayoutAnimationTypes]
  }
}

