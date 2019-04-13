package typings
package reactDashBootstrapLib.libImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps
  extends reactLib.reactMod.HTMLProps[Image] {
  var circle: js.UndefOr[scala.Boolean] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var rounded: js.UndefOr[scala.Boolean] = js.undefined
  var thumbnail: js.UndefOr[scala.Boolean] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[Image] = null,
    circle: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    rounded: js.UndefOr[scala.Boolean] = js.undefined,
    thumbnail: js.UndefOr[scala.Boolean] = js.undefined
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

