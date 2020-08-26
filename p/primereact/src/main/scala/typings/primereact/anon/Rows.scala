package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rows extends js.Object {
  var first: Double = js.native
  var originalEvent: typings.std.Event = js.native
  var rows: Double = js.native
}

object Rows {
  @scala.inline
  def apply(first: Double, originalEvent: typings.std.Event, rows: Double): Rows = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows]
  }
  @scala.inline
  implicit class RowsOps[Self <: Rows] (val x: Self) extends AnyVal {
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
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

