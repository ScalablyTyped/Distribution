package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animatable extends js.Object {
  var animationBegin: js.UndefOr[scala.Double] = js.undefined
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var animationEasing: js.UndefOr[AnimationEasingType] = js.undefined
  var animationId: js.UndefOr[scala.Double] = js.undefined
  var isAnimationActive: js.UndefOr[scala.Boolean] = js.undefined
  var isUpdateAnimationActive: js.UndefOr[scala.Boolean] = js.undefined
  var onAnimationEnd: js.UndefOr[RechartsFunction] = js.undefined
  var onAnimationStart: js.UndefOr[RechartsFunction] = js.undefined
}

object Animatable {
  @scala.inline
  def apply(
    animationBegin: scala.Int | scala.Double = null,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: scala.Int | scala.Double = null,
    isAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    onAnimationEnd: RechartsFunction = null,
    onAnimationStart: RechartsFunction = null
  ): Animatable = {
    val __obj = js.Dynamic.literal()
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart)
    __obj.asInstanceOf[Animatable]
  }
}

