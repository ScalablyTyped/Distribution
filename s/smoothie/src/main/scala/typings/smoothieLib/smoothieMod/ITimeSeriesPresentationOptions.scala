package typings
package smoothieLib.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeSeriesPresentationOptions extends js.Object {
  var fillStyle: js.UndefOr[java.lang.String] = js.undefined
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  var strokeStyle: js.UndefOr[java.lang.String] = js.undefined
}

object ITimeSeriesPresentationOptions {
  @scala.inline
  def apply(
    fillStyle: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    strokeStyle: java.lang.String = null
  ): ITimeSeriesPresentationOptions = {
    val __obj = js.Dynamic.literal()
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    __obj.asInstanceOf[ITimeSeriesPresentationOptions]
  }
}

