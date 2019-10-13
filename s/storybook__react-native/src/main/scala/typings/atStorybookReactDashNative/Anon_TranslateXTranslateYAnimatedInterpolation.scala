package typings.atStorybookReactDashNative

import typings.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TranslateXTranslateYAnimatedInterpolation extends js.Object {
  var translateX: js.UndefOr[scala.Nothing] = js.undefined
  var translateY: AnimatedInterpolation
}

object Anon_TranslateXTranslateYAnimatedInterpolation {
  @scala.inline
  def apply(translateY: AnimatedInterpolation, translateX: js.UndefOr[scala.Nothing] = js.undefined): Anon_TranslateXTranslateYAnimatedInterpolation = {
    val __obj = js.Dynamic.literal(translateY = translateY)
    if (!js.isUndefined(translateX)) __obj.updateDynamic("translateX")(translateX)
    __obj.asInstanceOf[Anon_TranslateXTranslateYAnimatedInterpolation]
  }
}

