package typings.reactNative.anon

import typings.reactNative.mod.LayoutAnimationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EaseInEaseOut extends js.Object {
  var easeInEaseOut: LayoutAnimationConfig
  var linear: LayoutAnimationConfig
  var spring: LayoutAnimationConfig
}

object EaseInEaseOut {
  @scala.inline
  def apply(easeInEaseOut: LayoutAnimationConfig, linear: LayoutAnimationConfig, spring: LayoutAnimationConfig): EaseInEaseOut = {
    val __obj = js.Dynamic.literal(easeInEaseOut = easeInEaseOut.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], spring = spring.asInstanceOf[js.Any])
    __obj.asInstanceOf[EaseInEaseOut]
  }
}

