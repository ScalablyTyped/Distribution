package typings.smoothie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeSeriesOptions extends js.Object {
  var resetBounds: js.UndefOr[Boolean] = js.undefined
  var resetBoundsInterval: js.UndefOr[Double] = js.undefined
}

object ITimeSeriesOptions {
  @scala.inline
  def apply(
    resetBounds: js.UndefOr[Boolean] = js.undefined,
    resetBoundsInterval: js.UndefOr[Double] = js.undefined
  ): ITimeSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resetBounds)) __obj.updateDynamic("resetBounds")(resetBounds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetBoundsInterval)) __obj.updateDynamic("resetBoundsInterval")(resetBoundsInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeSeriesOptions]
  }
}

