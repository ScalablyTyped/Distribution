package typings.storybookReactNative.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateXTranslateY extends js.Object {
  var translateX: js.UndefOr[scala.Nothing] = js.undefined
  var translateY: AnimatedInterpolation
}

object TranslateXTranslateY {
  @scala.inline
  def apply(translateY: AnimatedInterpolation): TranslateXTranslateY = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateXTranslateY]
  }
}

