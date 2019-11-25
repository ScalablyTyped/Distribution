package typings.smoothie.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /** Whether the grid lines trace the border of the chart or not. */
  var borderVisible: js.UndefOr[Boolean] = js.undefined
  /** The background colour of the chart. */
  var fillStyle: js.UndefOr[String] = js.undefined
  /** The pixel width of grid lines. */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /** Distance between vertical grid lines. */
  var millisPerLine: js.UndefOr[Double] = js.undefined
  /** Controls whether grid lines are 1px sharp, or softened. */
  var sharpLines: js.UndefOr[Boolean] = js.undefined
  /** Colour of grid lines. */
  var strokeStyle: js.UndefOr[String] = js.undefined
  /** Number of vertical sections marked out by horizontal grid lines. */
  var verticalSections: js.UndefOr[Double] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(
    borderVisible: js.UndefOr[Boolean] = js.undefined,
    fillStyle: String = null,
    lineWidth: Int | Double = null,
    millisPerLine: Int | Double = null,
    sharpLines: js.UndefOr[Boolean] = js.undefined,
    strokeStyle: String = null,
    verticalSections: Int | Double = null
  ): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderVisible)) __obj.updateDynamic("borderVisible")(borderVisible.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (millisPerLine != null) __obj.updateDynamic("millisPerLine")(millisPerLine.asInstanceOf[js.Any])
    if (!js.isUndefined(sharpLines)) __obj.updateDynamic("sharpLines")(sharpLines.asInstanceOf[js.Any])
    if (strokeStyle != null) __obj.updateDynamic("strokeStyle")(strokeStyle.asInstanceOf[js.Any])
    if (verticalSections != null) __obj.updateDynamic("verticalSections")(verticalSections.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

