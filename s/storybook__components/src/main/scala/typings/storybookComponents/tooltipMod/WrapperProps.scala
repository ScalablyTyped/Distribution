package typings.storybookComponents.tooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperProps extends js.Object {
  var color: String = js.native
  var hasChrome: Boolean = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var placement: String = js.native
}

object WrapperProps {
  @scala.inline
  def apply(color: String, hasChrome: Boolean, placement: String, hidden: js.UndefOr[Boolean] = js.undefined): WrapperProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hasChrome = hasChrome.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps]
  }
}

