package typings
package smoothieLib.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeSeriesOptions extends js.Object {
  var resetBounds: js.UndefOr[scala.Boolean] = js.undefined
  var resetBoundsInterval: js.UndefOr[scala.Double] = js.undefined
}

object ITimeSeriesOptions {
  @scala.inline
  def apply(
    resetBounds: js.UndefOr[scala.Boolean] = js.undefined,
    resetBoundsInterval: scala.Int | scala.Double = null
  ): ITimeSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resetBounds)) __obj.updateDynamic("resetBounds")(resetBounds)
    if (resetBoundsInterval != null) __obj.updateDynamic("resetBoundsInterval")(resetBoundsInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeSeriesOptions]
  }
}

