package typings.reactToolbox.libTooltipMod

import typings.reactToolbox.reactToolboxStrings.bottom
import typings.reactToolbox.reactToolboxStrings.horizontal
import typings.reactToolbox.reactToolboxStrings.left
import typings.reactToolbox.reactToolboxStrings.right
import typings.reactToolbox.reactToolboxStrings.top
import typings.reactToolbox.reactToolboxStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var hideOnClick: js.UndefOr[Boolean] = js.undefined
  var passthrough: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[bottom | horizontal | left | right | top | vertical] = js.undefined
  var showOnClick: js.UndefOr[Boolean] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    className: String = null,
    delay: Int | Double = null,
    hideOnClick: js.UndefOr[Boolean] = js.undefined,
    passthrough: js.UndefOr[Boolean] = js.undefined,
    position: bottom | horizontal | left | right | top | vertical = null,
    showOnClick: js.UndefOr[Boolean] = js.undefined
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(passthrough)) __obj.updateDynamic("passthrough")(passthrough.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnClick)) __obj.updateDynamic("showOnClick")(showOnClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

