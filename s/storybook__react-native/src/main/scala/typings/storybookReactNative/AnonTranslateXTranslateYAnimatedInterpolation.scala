package typings.storybookReactNative

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTranslateXTranslateYAnimatedInterpolation extends js.Object {
  var translateX: js.UndefOr[scala.Nothing] = js.undefined
  var translateY: AnimatedInterpolation
}

object AnonTranslateXTranslateYAnimatedInterpolation {
  @scala.inline
  def apply(translateY: AnimatedInterpolation, translateX: js.UndefOr[scala.Nothing] = js.undefined): AnonTranslateXTranslateYAnimatedInterpolation = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslateXTranslateYAnimatedInterpolation]
  }
}

