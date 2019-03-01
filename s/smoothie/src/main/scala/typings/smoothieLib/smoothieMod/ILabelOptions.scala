package typings
package smoothieLib.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelOptions extends js.Object {
  /** Enables/disables labels showing the min/max values. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Colour for text of labels. */
  var fillStyle: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var intermediateLabelSameAxis: js.UndefOr[scala.Boolean] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  /** Shows intermediate labels between min and max values along y axis. */
  var showIntermediateLabels: js.UndefOr[scala.Boolean] = js.undefined
}

object ILabelOptions {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fillStyle: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    intermediateLabelSameAxis: js.UndefOr[scala.Boolean] = js.undefined,
    precision: scala.Int | scala.Double = null,
    showIntermediateLabels: js.UndefOr[scala.Boolean] = js.undefined
  ): ILabelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(intermediateLabelSameAxis)) __obj.updateDynamic("intermediateLabelSameAxis")(intermediateLabelSameAxis)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(showIntermediateLabels)) __obj.updateDynamic("showIntermediateLabels")(showIntermediateLabels)
    __obj.asInstanceOf[ILabelOptions]
  }
}

