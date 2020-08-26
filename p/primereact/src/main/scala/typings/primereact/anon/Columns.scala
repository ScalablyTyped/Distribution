package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  var columns: js.Any = js.native
  var dragIndex: Double = js.native
  var dropIndex: Double = js.native
  var originalEvent: typings.std.Event = js.native
}

object Columns {
  @scala.inline
  def apply(columns: js.Any, dragIndex: Double, dropIndex: Double, originalEvent: typings.std.Event): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dragIndex = dragIndex.asInstanceOf[js.Any], dropIndex = dropIndex.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
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
    def setColumns(value: js.Any): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragIndex(value: Double): Self = this.set("dragIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropIndex(value: Double): Self = this.set("dropIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
  }
  
}

