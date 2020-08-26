package typings.prosemirrorTables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableEditingOptions extends js.Object {
  var allowTableNodeSelection: js.UndefOr[Boolean] = js.native
}

object TableEditingOptions {
  @scala.inline
  def apply(): TableEditingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableEditingOptions]
  }
  @scala.inline
  implicit class TableEditingOptionsOps[Self <: TableEditingOptions] (val x: Self) extends AnyVal {
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
    def setAllowTableNodeSelection(value: Boolean): Self = this.set("allowTableNodeSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTableNodeSelection: Self = this.set("allowTableNodeSelection", js.undefined)
  }
  
}

