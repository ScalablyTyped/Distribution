package typings.reactDaterangePicker.mod

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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateDefinition]
  }
}

