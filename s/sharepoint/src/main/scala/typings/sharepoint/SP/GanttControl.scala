package typings.sharepoint.SP

import typings.sharepoint.SP.JsGrid.ColumnInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttControl extends js.Object {
  def get_Columns(): js.Array[ColumnInfo]
}

object GanttControl {
  @scala.inline
  def apply(get_Columns: () => js.Array[ColumnInfo]): GanttControl = {
    val __obj = js.Dynamic.literal(get_Columns = js.Any.fromFunction0(get_Columns))
    __obj.asInstanceOf[GanttControl]
  }
}

