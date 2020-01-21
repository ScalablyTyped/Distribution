package typings.reactNative

import typings.reactNative.mod.Animated.AnimatedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXY extends js.Object {
  var x: Double | AnimatedValue
  var y: Double | AnimatedValue
}

object AnonXY {
  @scala.inline
  def apply(x: Double | AnimatedValue, y: Double | AnimatedValue): AnonXY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonXY]
  }
}

