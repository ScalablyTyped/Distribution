package typings
package primereactLib.componentsTooltipTooltipOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var event: js.UndefOr[java.lang.String] = js.undefined
  var hideDelay: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var showDelay: js.UndefOr[scala.Double] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    event: java.lang.String = null,
    hideDelay: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    showDelay: scala.Int | scala.Double = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (showDelay != null) __obj.updateDynamic("showDelay")(showDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

