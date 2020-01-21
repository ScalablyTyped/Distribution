package typings.reactNativeChartsWrapper

import typings.reactNativeChartsWrapper.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonColor {
  @scala.inline
  def apply(color: Int | Double = null, size: Int | Double = null, text: String = null): AnonColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

