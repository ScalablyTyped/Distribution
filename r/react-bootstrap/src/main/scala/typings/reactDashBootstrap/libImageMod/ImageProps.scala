package typings.reactDashBootstrap.libImageMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends HTMLProps[Image] {
  var circle: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var thumbnail: js.UndefOr[Boolean] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[Image] = null,
    circle: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    rounded: js.UndefOr[Boolean] = js.undefined,
    thumbnail: js.UndefOr[Boolean] = js.undefined
  ): ImageProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded)
    if (!js.isUndefined(thumbnail)) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[ImageProps]
  }
}

