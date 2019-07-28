package typings.reactDashNative.reactDashNativeMod

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
    val __obj = js.Dynamic.literal(easeIn = easeIn, easeInEaseOut = easeInEaseOut, easeOut = easeOut, keyboard = keyboard, linear = linear, spring = spring)
  
    __obj.asInstanceOf[LayoutAnimationTypes]
  }
}

