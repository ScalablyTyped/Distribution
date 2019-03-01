package typings
package reactDashAnimateDashOnDashScrollLib.reactDashAnimateDashOnDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollAnimationProps extends js.Object {
  var animateIn: js.UndefOr[java.lang.String] = js.undefined
  var animateOnce: js.UndefOr[scala.Boolean] = js.undefined
  var animateOut: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var initiallyVisible: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var scrollableParentSelector: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ScrollAnimationProps {
  @scala.inline
  def apply(
    animateIn: java.lang.String = null,
    animateOnce: js.UndefOr[scala.Boolean] = js.undefined,
    animateOut: java.lang.String = null,
    className: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    initiallyVisible: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Int | scala.Double = null,
    scrollableParentSelector: java.lang.String = null,
    style: js.Object = null
  ): ScrollAnimationProps = {
    val __obj = js.Dynamic.literal()
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn)
    if (!js.isUndefined(animateOnce)) __obj.updateDynamic("animateOnce")(animateOnce)
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut)
    if (className != null) __obj.updateDynamic("className")(className)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyVisible)) __obj.updateDynamic("initiallyVisible")(initiallyVisible)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scrollableParentSelector != null) __obj.updateDynamic("scrollableParentSelector")(scrollableParentSelector)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ScrollAnimationProps]
  }
}

