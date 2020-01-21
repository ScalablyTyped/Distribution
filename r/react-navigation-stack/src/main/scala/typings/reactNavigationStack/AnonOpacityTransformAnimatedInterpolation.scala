package typings.reactNavigationStack

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacityTransformAnimatedInterpolation extends js.Object {
  var opacity: AnimatedInterpolation
  var transform: js.Array[AnonTranslateXAnimatedInterpolation]
}

object AnonOpacityTransformAnimatedInterpolation {
  @scala.inline
  def apply(opacity: AnimatedInterpolation, transform: js.Array[AnonTranslateXAnimatedInterpolation]): AnonOpacityTransformAnimatedInterpolation = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOpacityTransformAnimatedInterpolation]
  }
}

