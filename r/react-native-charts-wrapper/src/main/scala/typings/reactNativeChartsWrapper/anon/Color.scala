package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Color {
  @scala.inline
  def apply(
    color: js.UndefOr[typings.reactNativeChartsWrapper.mod.Color] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    text: String = null
  ): Color = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

