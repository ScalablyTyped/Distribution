package typings
package reactDashVirtualizedLib.distEsCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMeasurerCacheParams extends js.Object {
  var defaultHeight: js.UndefOr[scala.Double] = js.undefined
  var defaultWidth: js.UndefOr[scala.Double] = js.undefined
  var fixedHeight: js.UndefOr[scala.Boolean] = js.undefined
  var fixedWidth: js.UndefOr[scala.Boolean] = js.undefined
  var keyMapper: js.UndefOr[KeyMapper] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
}

object CellMeasurerCacheParams {
  @scala.inline
  def apply(
    defaultHeight: scala.Int | scala.Double = null,
    defaultWidth: scala.Int | scala.Double = null,
    fixedHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fixedWidth: js.UndefOr[scala.Boolean] = js.undefined,
    keyMapper: KeyMapper = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null
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

