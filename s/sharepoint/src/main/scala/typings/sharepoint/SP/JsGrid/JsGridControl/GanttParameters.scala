package typings.sharepoint.SP.JsGrid.JsGridControl

import typings.sharepoint.SP.JsGrid.ColumnInfoCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttParameters extends js.Object {
  var columns: ColumnInfoCollection
}

object GanttParameters {
  @scala.inline
  def apply(columns: ColumnInfoCollection): GanttParameters = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttParameters]
  }
}

