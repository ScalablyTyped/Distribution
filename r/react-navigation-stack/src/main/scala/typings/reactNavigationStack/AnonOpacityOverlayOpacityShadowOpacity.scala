package typings.reactNavigationStack

import typings.reactNative.mod.Animated.AnimatedInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacityOverlayOpacityShadowOpacity extends js.Object {
  var opacity: js.UndefOr[scala.Nothing] = js.undefined
  var overlayOpacity: AnimatedInterpolation | Null
  var shadowOpacity: AnimatedInterpolation | Null
  var transform: js.Array[AnonTranslateXAnimatedInterpolation]
}

object AnonOpacityOverlayOpacityShadowOpacity {
  @scala.inline
  def apply(
    transform: js.Array[AnonTranslateXAnimatedInterpolation],
    opacity: js.UndefOr[scala.Nothing] = js.undefined,
    overlayOpacity: AnimatedInterpolation = null,
    shadowOpacity: AnimatedInterpolation = null
  ): AnonOpacityOverlayOpacityShadowOpacity = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overlayOpacity != null) __obj.updateDynamic("overlayOpacity")(overlayOpacity.asInstanceOf[js.Any])
    if (shadowOpacity != null) __obj.updateDynamic("shadowOpacity")(shadowOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacityOverlayOpacityShadowOpacity]
  }
}

