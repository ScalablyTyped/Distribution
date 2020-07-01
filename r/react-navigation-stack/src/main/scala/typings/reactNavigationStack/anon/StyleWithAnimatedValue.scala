package typings.reactNavigationStack.anon

import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleWithAnimatedValue extends js.Object {
  var style: WithAnimatedValue[StyleProp[ViewStyle]]
}

object StyleWithAnimatedValue {
  @scala.inline
  def apply(style: WithAnimatedValue[StyleProp[ViewStyle]]): StyleWithAnimatedValue = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleWithAnimatedValue]
  }
}

