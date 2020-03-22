package typings.storybookReactNative

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTranslateY extends js.Object {
  var translateX: AnimatedInterpolation
  var translateY: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonTranslateY {
  @scala.inline
  def apply(translateX: AnimatedInterpolation, translateY: js.UndefOr[scala.Nothing] = js.undefined): AnonTranslateY = {
    val __obj = js.Dynamic.literal(translateX = translateX.asInstanceOf[js.Any])
    if (!js.isUndefined(translateY)) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTranslateY]
  }
}

