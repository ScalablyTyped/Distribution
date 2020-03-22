package typings.reactNative

import typings.reactNative.mod.Animated.AnimatedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonY extends js.Object {
  var x: Double | AnimatedValue
  var y: Double | AnimatedValue
}

object AnonY {
  @scala.inline
  def apply(x: Double | AnimatedValue, y: Double | AnimatedValue): AnonY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonY]
  }
}

