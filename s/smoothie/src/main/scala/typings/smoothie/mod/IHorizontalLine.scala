package typings.smoothie.mod

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
  def apply(
    color: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): IHorizontalLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHorizontalLine]
  }
}

