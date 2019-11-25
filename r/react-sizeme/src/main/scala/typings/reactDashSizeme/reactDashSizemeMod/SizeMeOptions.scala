package typings.reactDashSizeme.reactDashSizemeMod

import typings.reactDashSizeme.reactDashSizemeStrings.debounce
import typings.reactDashSizeme.reactDashSizemeStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeMeOptions extends js.Object {
  var monitorHeight: js.UndefOr[Boolean] = js.undefined
  var monitorPosition: js.UndefOr[Boolean] = js.undefined
  var monitorWidth: js.UndefOr[Boolean] = js.undefined
  var noPlaceholder: js.UndefOr[Boolean] = js.undefined
  var refreshMode: js.UndefOr[throttle | debounce] = js.undefined
  var refreshRate: js.UndefOr[Double] = js.undefined
}

object SizeMeOptions {
  @scala.inline
  def apply(
    monitorHeight: js.UndefOr[Boolean] = js.undefined,
    monitorPosition: js.UndefOr[Boolean] = js.undefined,
    monitorWidth: js.UndefOr[Boolean] = js.undefined,
    noPlaceholder: js.UndefOr[Boolean] = js.undefined,
    refreshMode: throttle | debounce = null,
    refreshRate: Int | Double = null
  ): SizeMeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(monitorHeight)) __obj.updateDynamic("monitorHeight")(monitorHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorPosition)) __obj.updateDynamic("monitorPosition")(monitorPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWidth)) __obj.updateDynamic("monitorWidth")(monitorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlaceholder)) __obj.updateDynamic("noPlaceholder")(noPlaceholder.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeMeOptions]
  }
}

