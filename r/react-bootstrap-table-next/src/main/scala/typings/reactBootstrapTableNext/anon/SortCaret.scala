package typings.reactBootstrapTableNext.anon

import typings.reactBootstrapTableNext.mod.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCaret extends js.Object {
  var dataField: js.UndefOr[js.Any] = js.native
  var order: SortOrder = js.native
  var sortCaret: js.UndefOr[js.Any] = js.native
  var sortFunc: js.UndefOr[js.Any] = js.native
}

object SortCaret {
  @scala.inline
  def apply(order: SortOrder): SortCaret = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCaret]
  }
  @scala.inline
  implicit class SortCaretOps[Self <: SortCaret] (val x: Self) extends AnyVal {
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
    def setOrder(value: SortOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataField(value: js.Any): Self = this.set("dataField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    @scala.inline
    def setSortCaret(value: js.Any): Self = this.set("sortCaret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortCaret: Self = this.set("sortCaret", js.undefined)
    @scala.inline
    def setSortFunc(value: js.Any): Self = this.set("sortFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortFunc: Self = this.set("sortFunc", js.undefined)
  }
  
}

