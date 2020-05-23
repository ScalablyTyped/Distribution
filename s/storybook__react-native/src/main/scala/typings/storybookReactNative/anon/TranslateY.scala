package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateY extends js.Object {
  var translateX: AnimatedInterpolation
  var translateY: js.UndefOr[scala.Nothing] = js.undefined
}

object TranslateY {
  @scala.inline
  def apply(translateX: AnimatedInterpolation): TranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateY]
  }
}

