package typings
package reactDashGaLib.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventArgs extends js.Object {
  var action: java.lang.String
  var category: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var nonInteraction: js.UndefOr[scala.Boolean] = js.undefined
  var transport: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object EventArgs {
  @scala.inline
  def apply(
    action: java.lang.String,
    category: java.lang.String,
    label: java.lang.String = null,
    nonInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    transport: java.lang.String = null,
    value: scala.Int | scala.Double = null
  ): EventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("category")(category)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(nonInteraction)) __obj.updateDynamic("nonInteraction")(nonInteraction)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArgs]
  }
}

