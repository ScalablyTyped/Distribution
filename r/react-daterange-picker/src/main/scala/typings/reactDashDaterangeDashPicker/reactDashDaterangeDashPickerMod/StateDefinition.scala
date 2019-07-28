package typings.reactDashDaterangeDashPicker.reactDashDaterangeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateDefinition extends js.Object {
  var color: String
  var label: String
  var selectable: js.UndefOr[Boolean] = js.undefined
}

object StateDefinition {
  @scala.inline
  def apply(color: String, label: String, selectable: js.UndefOr[Boolean] = js.undefined): StateDefinition = {
    val __obj = js.Dynamic.literal(color = color, label = label)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    __obj.asInstanceOf[StateDefinition]
  }
}

