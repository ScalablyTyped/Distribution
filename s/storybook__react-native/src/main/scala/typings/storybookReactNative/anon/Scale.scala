package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  var scale: AnimatedInterpolation
}

object Scale {
  @scala.inline
  def apply(scale: AnimatedInterpolation): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

