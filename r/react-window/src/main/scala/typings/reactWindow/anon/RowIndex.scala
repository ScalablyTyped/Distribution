package typings.reactWindow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowIndex extends js.Object {
  var columnIndex: Double = js.native
  var rowIndex: Double = js.native
  var shouldForceUpdate: js.UndefOr[Boolean] = js.native
}

object RowIndex {
  @scala.inline
  def apply(columnIndex: Double, rowIndex: Double): RowIndex = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndex]
  }
  @scala.inline
  implicit class RowIndexOps[Self <: RowIndex] (val x: Self) extends AnyVal {
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldForceUpdate(value: Boolean): Self = this.set("shouldForceUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldForceUpdate: Self = this.set("shouldForceUpdate", js.undefined)
  }
  
}

