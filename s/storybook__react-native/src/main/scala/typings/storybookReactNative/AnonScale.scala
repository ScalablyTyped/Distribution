package typings.storybookReactNative

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScale extends js.Object {
  var scale: AnimatedInterpolation
}

object AnonScale {
  @scala.inline
  def apply(scale: AnimatedInterpolation): AnonScale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScale]
  }
}

