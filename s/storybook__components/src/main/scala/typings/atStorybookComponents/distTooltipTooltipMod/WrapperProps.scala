package typings.atStorybookComponents.distTooltipTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperProps extends js.Object {
  var color: String
  var hasChrome: Boolean
  var hidden: js.UndefOr[Boolean] = js.undefined
  var placement: String
}

object WrapperProps {
  @scala.inline
  def apply(color: String, hasChrome: Boolean, placement: String, hidden: js.UndefOr[Boolean] = js.undefined): WrapperProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hasChrome = hasChrome.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps]
  }
}

