package typings.reactDashVirtualized.distEsCellMeasurerMod

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
    defaultHeight: Int | Double = null,
    defaultWidth: Int | Double = null,
    fixedHeight: js.UndefOr[Boolean] = js.undefined,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    keyMapper: KeyMapper = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null
  ): CellMeasurerCacheParams = {
    val __obj = js.Dynamic.literal()
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeight)) __obj.updateDynamic("fixedHeight")(fixedHeight)
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth)
    if (keyMapper != null) __obj.updateDynamic("keyMapper")(keyMapper)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMeasurerCacheParams]
  }
}

