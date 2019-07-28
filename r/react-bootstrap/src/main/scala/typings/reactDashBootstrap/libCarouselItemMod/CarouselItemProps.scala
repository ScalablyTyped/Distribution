package typings.reactDashBootstrap.libCarouselItemMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselItemProps extends HTMLProps[CarouselItem] {
  var active: js.UndefOr[Boolean] = js.undefined
  var animateOut: js.UndefOr[Boolean] = js.undefined
  var animtateIn: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  // TODO: Add more specific type
  var onAnimateOutEnd: js.UndefOr[js.Function] = js.undefined
}

object CarouselItemProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[CarouselItem] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    animateOut: js.UndefOr[Boolean] = js.undefined,
    animtateIn: js.UndefOr[Boolean] = js.undefined,
    direction: String = null,
    index: Int | Double = null,
    onAnimateOutEnd: js.Function = null
  ): CarouselItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(animateOut)) __obj.updateDynamic("animateOut")(animateOut)
    if (!js.isUndefined(animtateIn)) __obj.updateDynamic("animtateIn")(animtateIn)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onAnimateOutEnd != null) __obj.updateDynamic("onAnimateOutEnd")(onAnimateOutEnd)
    __obj.asInstanceOf[CarouselItemProps]
  }
}

