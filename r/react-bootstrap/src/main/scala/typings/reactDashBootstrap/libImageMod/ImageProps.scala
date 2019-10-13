package typings.reactDashBootstrap.libImageMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps
  extends AllHTMLAttributes[Image]
     with ClassAttributes[Image] {
  var circle: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var thumbnail: js.UndefOr[Boolean] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Image] = null,
    ClassAttributes: ClassAttributes[Image] = null,
    circle: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    rounded: js.UndefOr[Boolean] = js.undefined,
    thumbnail: js.UndefOr[Boolean] = js.undefined
  ): ImageProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded)
    if (!js.isUndefined(thumbnail)) __obj.updateDynamic("thumbnail")(thumbnail)
    __obj.asInstanceOf[ImageProps]
  }
}

