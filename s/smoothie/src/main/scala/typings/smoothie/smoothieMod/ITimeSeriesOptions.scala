package typings.smoothie.smoothieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeSeriesOptions extends js.Object {
  var resetBounds: js.UndefOr[Boolean] = js.undefined
  var resetBoundsInterval: js.UndefOr[Double] = js.undefined
}

object ITimeSeriesOptions {
  @scala.inline
  def apply(resetBounds: js.UndefOr[Boolean] = js.undefined, resetBoundsInterval: Int | Double = null): ITimeSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resetBounds)) __obj.updateDynamic("resetBounds")(resetBounds.asInstanceOf[js.Any])
    if (resetBoundsInterval != null) __obj.updateDynamic("resetBoundsInterval")(resetBoundsInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeSeriesOptions]
  }
}

