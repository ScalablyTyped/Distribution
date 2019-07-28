package typings.reactDashGa.reactDashGaMod

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
    value: Int | Double = null
  ): EventArgs = {
    val __obj = js.Dynamic.literal(action = action, category = category)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(nonInteraction)) __obj.updateDynamic("nonInteraction")(nonInteraction)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArgs]
  }
}

