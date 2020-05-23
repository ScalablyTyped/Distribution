package typings.reactVirtualized.esCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMeasurerCacheParams extends js.Object {
  var defaultHeight: js.UndefOr[Double] = js.undefined
  var defaultWidth: js.UndefOr[Double] = js.undefined
  var fixedHeight: js.UndefOr[Boolean] = js.undefined
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  var keyMapper: js.UndefOr[KeyMapper] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
}

object CellMeasurerCacheParams {
  @scala.inline
  def apply(
    defaultHeight: js.UndefOr[Double] = js.undefined,
    defaultWidth: js.UndefOr[Double] = js.undefined,
    fixedHeight: js.UndefOr[Boolean] = js.undefined,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    keyMapper: (/* rowIndex */ Double, /* columnIndex */ Double) => js.Any = null,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined
  ): CellMeasurerCacheParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultHeight)) __obj.updateDynamic("defaultHeight")(defaultHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultWidth)) __obj.updateDynamic("defaultWidth")(defaultWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeight)) __obj.updateDynamic("fixedHeight")(fixedHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.get.asInstanceOf[js.Any])
    if (keyMapper != null) __obj.updateDynamic("keyMapper")(js.Any.fromFunction2(keyMapper))
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMeasurerCacheParams]
  }
}

