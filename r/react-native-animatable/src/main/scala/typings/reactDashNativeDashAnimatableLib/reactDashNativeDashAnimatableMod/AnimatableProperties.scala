package typings
package reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimatableProperties[S /* <: js.Object */] extends js.Object {
  var animation: js.UndefOr[Animation | java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[
    reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.normal | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.reverse | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.alternate | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.`alternate-reverse`
  ] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  var iterationCount: js.UndefOr[
    scala.Double | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.infinite
  ] = js.undefined
  var iterationDelay: js.UndefOr[scala.Double] = js.undefined
  var onAnimationBegin: js.UndefOr[js.Function] = js.undefined
  var onAnimationEnd: js.UndefOr[js.Function] = js.undefined
  var onTransitionBegin: js.UndefOr[js.Function1[/* property */ java.lang.String, scala.Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* property */ java.lang.String, scala.Unit]] = js.undefined
  var transition: js.UndefOr[java.lang.String] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
}

object AnimatableProperties {
  @scala.inline
  def apply[S /* <: js.Object */](
    animation: Animation | java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    direction: reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.normal | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.reverse | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.alternate | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.`alternate-reverse` = null,
    duration: scala.Int | scala.Double = null,
    easing: Easing = null,
    iterationCount: scala.Double | reactDashNativeDashAnimatableLib.reactDashNativeDashAnimatableLibStrings.infinite = null,
    iterationDelay: scala.Int | scala.Double = null,
    onAnimationBegin: js.Function = null,
    onAnimationEnd: js.Function = null,
    onTransitionBegin: /* property */ java.lang.String => scala.Unit = null,
    onTransitionEnd: /* property */ java.lang.String => scala.Unit = null,
    transition: java.lang.String = null,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  ): AnimatableProperties[S] = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (iterationCount != null) __obj.updateDynamic("iterationCount")(iterationCount.asInstanceOf[js.Any])
    if (iterationDelay != null) __obj.updateDynamic("iterationDelay")(iterationDelay.asInstanceOf[js.Any])
    if (onAnimationBegin != null) __obj.updateDynamic("onAnimationBegin")(onAnimationBegin)
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    if (onTransitionBegin != null) __obj.updateDynamic("onTransitionBegin")(js.Any.fromFunction1(onTransitionBegin))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[AnimatableProperties[S]]
  }
}

