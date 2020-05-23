package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animatable extends js.Object {
  var animationBegin: js.UndefOr[Double] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationEasing: js.UndefOr[AnimationEasingType] = js.undefined
  var animationId: js.UndefOr[Double] = js.undefined
  var isAnimationActive: js.UndefOr[Boolean] = js.undefined
  var isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined
  var onAnimationEnd: js.UndefOr[RechartsFunction] = js.undefined
  var onAnimationStart: js.UndefOr[RechartsFunction] = js.undefined
}

object Animatable {
  @scala.inline
  def apply(
    animationBegin: js.UndefOr[Double] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: AnimationEasingType = null,
    animationId: js.UndefOr[Double] = js.undefined,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    onAnimationEnd: /* repeated */ js.Any => Unit = null,
    onAnimationStart: /* repeated */ js.Any => Unit = null
  ): Animatable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationBegin)) __obj.updateDynamic("animationBegin")(animationBegin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(animationId)) __obj.updateDynamic("animationId")(animationId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive.get.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    __obj.asInstanceOf[Animatable]
  }
}

