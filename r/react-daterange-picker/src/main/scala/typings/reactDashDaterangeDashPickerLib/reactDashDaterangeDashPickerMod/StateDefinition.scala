package typings
package reactDashDaterangeDashPickerLib.reactDashDaterangeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateDefinition extends js.Object {
  var color: java.lang.String
  var label: java.lang.String
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
}

object StateDefinition {
  @scala.inline
  def apply(
    color: java.lang.String,
    label: java.lang.String,
    selectable: js.UndefOr[scala.Boolean] = js.undefined
  ): StateDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("label")(label)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    __obj.asInstanceOf[StateDefinition]
  }
}

