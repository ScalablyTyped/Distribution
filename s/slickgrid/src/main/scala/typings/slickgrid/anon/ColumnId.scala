package typings.slickgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnId extends js.Object {
  var columnId: String = js.native
  var sortAsc: Boolean = js.native
}

object ColumnId {
  @scala.inline
  def apply(columnId: String, sortAsc: Boolean): ColumnId = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnId]
  }
  @scala.inline
  implicit class ColumnIdOps[Self <: ColumnId] (val x: Self) extends AnyVal {
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
    def setColumnId(value: String): Self = this.set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortAsc(value: Boolean): Self = this.set("sortAsc", value.asInstanceOf[js.Any])
  }
  
}

