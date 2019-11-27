package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OpacityTransformAnonTranslateXAnimatedInterpolation extends js.Object {
  var opacity: js.UndefOr[scala.Nothing] = js.undefined
  var transform: js.Array[Anon_TranslateXAnimatedInterpolation]
}

object Anon_OpacityTransformAnonTranslateXAnimatedInterpolation {
  @scala.inline
  def apply(
    transform: js.Array[Anon_TranslateXAnimatedInterpolation],
    opacity: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_OpacityTransformAnonTranslateXAnimatedInterpolation = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OpacityTransformAnonTranslateXAnimatedInterpolation]
  }
}

