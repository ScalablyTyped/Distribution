package typings.simplebar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoHide: js.UndefOr[Boolean] = js.undefined
  var classNames: js.UndefOr[ClassNamesOptions] = js.undefined
  var scrollbarMinSize: js.UndefOr[Double] = js.undefined
  var wrapContent: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoHide: js.UndefOr[Boolean] = js.undefined,
    classNames: ClassNamesOptions = null,
    scrollbarMinSize: Int | Double = null,
    wrapContent: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (scrollbarMinSize != null) __obj.updateDynamic("scrollbarMinSize")(scrollbarMinSize.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapContent)) __obj.updateDynamic("wrapContent")(wrapContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

