package typings.reactTable.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnWidth extends js.Object {
  var columnWidth: Double = js.native
  var columnWidths: js.Any = js.native
  var headerIdWidths: Record[String, Double] = js.native
  var isResizingColumn: js.UndefOr[String] = js.native
  var startX: js.UndefOr[Double] = js.native
}

object ColumnWidth {
  @scala.inline
  def apply(columnWidth: Double, columnWidths: js.Any, headerIdWidths: Record[String, Double]): ColumnWidth = {
    val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], headerIdWidths = headerIdWidths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnWidth]
  }
  @scala.inline
  implicit class ColumnWidthOps[Self <: ColumnWidth] (val x: Self) extends AnyVal {
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
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnWidths(value: js.Any): Self = this.set("columnWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderIdWidths(value: Record[String, Double]): Self = this.set("headerIdWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsResizingColumn(value: String): Self = this.set("isResizingColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResizingColumn: Self = this.set("isResizingColumn", js.undefined)
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartX: Self = this.set("startX", js.undefined)
  }
  
}

