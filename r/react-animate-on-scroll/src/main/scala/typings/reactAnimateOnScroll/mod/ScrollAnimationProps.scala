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
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    initiallyVisible: js.UndefOr[Boolean] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    scrollableParentSelector: String = null,
    style: js.Object = null
  ): ScrollAnimationProps = {
    val __obj = js.Dynamic.literal()
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn.asInstanceOf[js.Any])
    if (!js.isUndefined(animateOnce)) __obj.updateDynamic("animateOnce")(animateOnce.get.asInstanceOf[js.Any])
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyVisible)) __obj.updateDynamic("initiallyVisible")(initiallyVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (scrollableParentSelector != null) __obj.updateDynamic("scrollableParentSelector")(scrollableParentSelector.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollAnimationProps]
  }
}

