package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseResizeColumnsColumnOptions[D /* <: js.Object */] extends js.Object {
  var disableResizing: js.UndefOr[Boolean] = js.native
}

object UseResizeColumnsColumnOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](): UseResizeColumnsColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseResizeColumnsColumnOptions[D]]
  }
  @scala.inline
  implicit class UseResizeColumnsColumnOptionsOps[Self <: UseResizeColumnsColumnOptions[_], /* <: js.Object */ D] (val x: Self with UseResizeColumnsColumnOptions[D]) extends AnyVal {
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
    def setDisableResizing(value: Boolean): Self = this.set("disableResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableResizing: Self = this.set("disableResizing", js.undefined)
  }
  
}

