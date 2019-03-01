package typings
package smoothieLib.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /** Whether the grid lines trace the border of the chart or not. */
  var borderVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** The background colour of the chart. */
  var fillStyle: js.UndefOr[java.lang.String] = js.undefined
  /** The pixel width of grid lines. */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /** Distance between vertical grid lines. */
  var millisPerLine: js.UndefOr[scala.Double] = js.undefined
  /** Controls whether grid lines are 1px sharp, or softened. */
  var sharpLines: js.UndefOr[scala.Boolean] = js.undefined
  /** Colour of grid lines. */
  var strokeStyle: js.UndefOr[java.lang.String] = js.undefined
  /** Number of vertical sections marked out by horizontal grid lines. */
  var verticalSections: js.UndefOr[scala.Double] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(
    borderVisible: js.UndefOr[scala.Boolean] = js.undefined,
    fillStyle: java.lang.String = null,
    lineWidth: scala.Int | scala.Double = null,
    millisPerLine: scala.Int | scala.Double = null,
    sharpLines: js.UndefOr[scala.Boolean] = js.undefined,
    strokeStyle: java.lang.String = null,
    verticalSections: scala.Int | scala.Double = null
  ): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderVisible)) __obj.updateDynamic("borderVisible")(borderVisible)
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (millisPerLine != null) __obj.updateDynamic("millisPerLine")(millisPerLine.asInstanceOf[js.Any])
    if (!js.isUndefined(sharpLines)) __obj.updateDynamic("sharpLines")(sharpLines)
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle)
    if (verticalSections != null) __obj.updateDynamic("verticalSections")(verticalSections.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

