package typings.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventArgs extends js.Object {
  var action: String
  var category: String
  var label: js.UndefOr[String] = js.undefined
  var nonInteraction: js.UndefOr[Boolean] = js.undefined
  var transport: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object EventArgs {
  @scala.inline
  def apply(
    action: String,
    category: String,
    label: String = null,
    nonInteraction: js.UndefOr[Boolean] = js.undefined,
    transport: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): EventArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(nonInteraction)) __obj.updateDynamic("nonInteraction")(nonInteraction.get.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArgs]
  }
}

