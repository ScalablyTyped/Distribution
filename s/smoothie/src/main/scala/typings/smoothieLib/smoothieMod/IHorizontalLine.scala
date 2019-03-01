package typings
package smoothieLib.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHorizontalLine extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object IHorizontalLine {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): IHorizontalLine = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHorizontalLine]
  }
}

