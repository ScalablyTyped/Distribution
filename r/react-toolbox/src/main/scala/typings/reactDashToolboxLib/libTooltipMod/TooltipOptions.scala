package typings
package reactDashToolboxLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var hideOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var passthrough: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.bottom | reactDashToolboxLib.reactDashToolboxLibStrings.horizontal | reactDashToolboxLib.reactDashToolboxLibStrings.left | reactDashToolboxLib.reactDashToolboxLibStrings.right | reactDashToolboxLib.reactDashToolboxLibStrings.top | reactDashToolboxLib.reactDashToolboxLibStrings.vertical
  ] = js.undefined
  var showOnClick: js.UndefOr[scala.Boolean] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    hideOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    passthrough: js.UndefOr[scala.Boolean] = js.undefined,
    position: reactDashToolboxLib.reactDashToolboxLibStrings.bottom | reactDashToolboxLib.reactDashToolboxLibStrings.horizontal | reactDashToolboxLib.reactDashToolboxLibStrings.left | reactDashToolboxLib.reactDashToolboxLibStrings.right | reactDashToolboxLib.reactDashToolboxLibStrings.top | reactDashToolboxLib.reactDashToolboxLibStrings.vertical = null,
    showOnClick: js.UndefOr[scala.Boolean] = js.undefined
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnClick)) __obj.updateDynamic("hideOnClick")(hideOnClick)
    if (!js.isUndefined(passthrough)) __obj.updateDynamic("passthrough")(passthrough)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnClick)) __obj.updateDynamic("showOnClick")(showOnClick)
    __obj.asInstanceOf[TooltipOptions]
  }
}

