package typings.simplebar.mod

import typings.simplebar.simplebarStrings.ltr
import typings.simplebar.simplebarStrings.rtl
import typings.simplebar.simplebarStrings.x
import typings.simplebar.simplebarStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var classNames: js.UndefOr[ClassNamesOptions] = js.undefined
  var clickOnTrack: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[rtl | ltr] = js.undefined
  var forceVisible: js.UndefOr[Boolean | x | y] = js.undefined
  var scrollbarMaxSize: js.UndefOr[Double] = js.undefined
  var scrollbarMinSize: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[Boolean] = js.undefined,
    classNames: ClassNamesOptions = null,
    clickOnTrack: js.UndefOr[Boolean] = js.undefined,
    direction: rtl | ltr = null,
    forceVisible: Boolean | x | y = null,
    scrollbarMaxSize: js.UndefOr[Double] = js.undefined,
    scrollbarMinSize: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.get.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(clickOnTrack)) __obj.updateDynamic("clickOnTrack")(clickOnTrack.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (forceVisible != null) __obj.updateDynamic("forceVisible")(forceVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollbarMaxSize)) __obj.updateDynamic("scrollbarMaxSize")(scrollbarMaxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollbarMinSize)) __obj.updateDynamic("scrollbarMinSize")(scrollbarMinSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

