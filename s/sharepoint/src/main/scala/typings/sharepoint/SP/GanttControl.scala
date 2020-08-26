package typings.sharepoint.SP

import typings.sharepoint.SP.JsGrid.ColumnInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttControl extends js.Object {
  def get_Columns(): js.Array[ColumnInfo] = js.native
}

object GanttControl {
  @scala.inline
  def apply(get_Columns: () => js.Array[ColumnInfo]): GanttControl = {
    val __obj = js.Dynamic.literal(get_Columns = js.Any.fromFunction0(get_Columns))
    __obj.asInstanceOf[GanttControl]
  }
  @scala.inline
  implicit class GanttControlOps[Self <: GanttControl] (val x: Self) extends AnyVal {
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
    def setGet_Columns(value: () => js.Array[ColumnInfo]): Self = this.set("get_Columns", js.Any.fromFunction0(value))
  }
  
}

