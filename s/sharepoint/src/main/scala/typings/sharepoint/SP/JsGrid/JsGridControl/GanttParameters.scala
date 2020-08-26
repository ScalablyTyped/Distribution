package typings.sharepoint.SP.JsGrid.JsGridControl

import typings.sharepoint.SP.JsGrid.ColumnInfoCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttParameters extends js.Object {
  var columns: ColumnInfoCollection = js.native
}

object GanttParameters {
  @scala.inline
  def apply(columns: ColumnInfoCollection): GanttParameters = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttParameters]
  }
  @scala.inline
  implicit class GanttParametersOps[Self <: GanttParameters] (val x: Self) extends AnyVal {
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
    def setColumns(value: ColumnInfoCollection): Self = this.set("columns", value.asInstanceOf[js.Any])
  }
  
}

