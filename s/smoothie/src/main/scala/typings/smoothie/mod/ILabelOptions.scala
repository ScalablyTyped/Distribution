package typings.smoothie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelOptions extends js.Object {
  /** Enables/disables labels showing the min/max values. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Colour for text of labels. */
  var fillStyle: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var intermediateLabelSameAxis: js.UndefOr[Boolean] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  /** Shows intermediate labels between min and max values along y axis. */
  var showIntermediateLabels: js.UndefOr[Boolean] = js.undefined
}

object ILabelOptions {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    fillStyle: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    intermediateLabelSameAxis: js.UndefOr[Boolean] = js.undefined,
    precision: Int | Double = null,
    showIntermediateLabels: js.UndefOr[Boolean] = js.undefined
  ): ILabelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fillStyle != null) __obj.updateDynamic("fillStyle")(fillStyle.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(intermediateLabelSameAxis)) __obj.updateDynamic("intermediateLabelSameAxis")(intermediateLabelSameAxis.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(showIntermediateLabels)) __obj.updateDynamic("showIntermediateLabels")(showIntermediateLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILabelOptions]
  }
}

