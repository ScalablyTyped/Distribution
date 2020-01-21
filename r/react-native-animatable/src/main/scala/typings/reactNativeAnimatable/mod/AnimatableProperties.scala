package typings.reactNativeAnimatable.mod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeAnimatable.reactNativeAnimatableStrings.infinite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatableProperties[S /* <: js.Object */] extends js.Object {
  var animation: js.UndefOr[Animation | String | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[Direction] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  var iterationCount: js.UndefOr[Double | infinite] = js.undefined
  var iterationDelay: js.UndefOr[Double] = js.undefined
  var onAnimationBegin: js.UndefOr[js.Function] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function] = js.undefined
  var onTransitionBegin: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.undefined
  var transition: js.UndefOr[String | js.Array[String]] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object AnimatableProperties {
  @scala.inline
  def apply[S /* <: js.Object */](
    animation: Animation | String | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    delay: Int | Double = null,
    direction: Direction = null,
    duration: Int | Double = null,
    easing: Easing = null,
    iterationCount: Double | infinite = null,
    iterationDelay: Int | Double = null,
    onAnimationBegin: js.Function = null,
    onAnimationEnd: js.Function = null,
    onTransitionBegin: /* property */ String => Unit = null,
    onTransitionEnd: /* property */ String => Unit = null,
    transition: String | js.Array[String] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): AnimatableProperties[S] = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (iterationCount != null) __obj.updateDynamic("iterationCount")(iterationCount.asInstanceOf[js.Any])
    if (iterationDelay != null) __obj.updateDynamic("iterationDelay")(iterationDelay.asInstanceOf[js.Any])
    if (onAnimationBegin != null) __obj.updateDynamic("onAnimationBegin")(onAnimationBegin.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd.asInstanceOf[js.Any])
    if (onTransitionBegin != null) __obj.updateDynamic("onTransitionBegin")(js.Any.fromFunction1(onTransitionBegin))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatableProperties[S]]
  }
}

