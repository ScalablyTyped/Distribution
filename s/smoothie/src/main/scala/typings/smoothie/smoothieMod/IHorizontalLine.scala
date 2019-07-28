package typings.smoothie.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHorizontalLine extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object IHorizontalLine {
  @scala.inline
  def apply(color: String = null, lineWidth: Int | Double = null, value: Int | Double = null): IHorizontalLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHorizontalLine]
  }
}

