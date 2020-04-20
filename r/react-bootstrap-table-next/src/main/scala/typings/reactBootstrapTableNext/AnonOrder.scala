package typings.reactBootstrapTableNext

import typings.reactBootstrapTableNext.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrder extends js.Object {
  var dataField: js.Any
  var order: SortOrder
}

object AnonOrder {
  @scala.inline
  def apply(dataField: js.Any, order: SortOrder): AnonOrder = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrder]
  }
}

