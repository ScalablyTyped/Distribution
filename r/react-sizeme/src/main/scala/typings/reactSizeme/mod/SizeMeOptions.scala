package typings.reactSizeme.mod

import typings.reactSizeme.reactSizemeStrings.debounce
import typings.reactSizeme.reactSizemeStrings.throttle
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
    refreshRate: js.UndefOr[Double] = js.undefined
  ): SizeMeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(monitorHeight)) __obj.updateDynamic("monitorHeight")(monitorHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorPosition)) __obj.updateDynamic("monitorPosition")(monitorPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWidth)) __obj.updateDynamic("monitorWidth")(monitorWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlaceholder)) __obj.updateDynamic("noPlaceholder")(noPlaceholder.get.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshRate)) __obj.updateDynamic("refreshRate")(refreshRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeMeOptions]
  }
}

