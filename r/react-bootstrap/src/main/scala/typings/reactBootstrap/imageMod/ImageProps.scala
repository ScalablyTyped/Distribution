package typings.reactBootstrap.imageMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnail)) __obj.updateDynamic("thumbnail")(thumbnail.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

