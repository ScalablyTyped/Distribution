package typings.reactAnimateOnScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollAnimationProps extends js.Object {
  var animateIn: js.UndefOr[String] = js.undefined
  var animateOnce: js.UndefOr[Boolean] = js.undefined
  var animateOut: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var initiallyVisible: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var scrollableParentSelector: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ScrollAnimationProps {
  @scala.inline
  def apply(
    animateIn: String = null,
    animateOnce: js.UndefOr[Boolean] = js.undefined,
    animateOut: String = null,
    className: String = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    initiallyVisible: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    scrollableParentSelector: String = null,
    style: js.Object = null
  ): ScrollAnimationProps = {
    val __obj = js.Dynamic.literal()
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOnce)) __obj.updateDynamic("animateOnce")(animateOnce.asInstanceOf[js.Any])
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyVisible)) __obj.updateDynamic("initiallyVisible")(initiallyVisible.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (scrollableParentSelector != null) __obj.updateDynamic("scrollableParentSelector")(scrollableParentSelector.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollAnimationProps]
  }
}

