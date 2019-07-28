package typings.primereact.componentsTooltipTooltipOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  var event: js.UndefOr[String] = js.undefined
  var hideDelay: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var showDelay: js.UndefOr[Double] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    event: String = null,
    hideDelay: Int | Double = null,
    position: String = null,
    showDelay: Int | Double = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (showDelay != null) __obj.updateDynamic("showDelay")(showDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

