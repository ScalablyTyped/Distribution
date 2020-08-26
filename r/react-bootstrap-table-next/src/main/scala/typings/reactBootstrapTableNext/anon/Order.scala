package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Order extends js.Object {
  var dataField: js.Any = js.native
  var order: SortOrder = js.native
}

object Order {
  @scala.inline
  def apply(dataField: js.Any, order: SortOrder): Order = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataField(value: js.Any): Self = this.set("dataField", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: SortOrder): Self = this.set("order", value.asInstanceOf[js.Any])
  }
  
}

