package typings.reactDashTable

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnWidth extends js.Object {
  var columnWidth: Double
  var columnWidths: js.Any
  var headerIdWidths: Record[String, Double]
  var isResizingColumn: js.UndefOr[String] = js.undefined
  var startX: js.UndefOr[Double] = js.undefined
}

object Anon_ColumnWidth {
  @scala.inline
  def apply(
    columnWidth: Double,
    columnWidths: js.Any,
    headerIdWidths: Record[String, Double],
    isResizingColumn: String = null,
    startX: Int | Double = null
  ): Anon_ColumnWidth = {
    val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], headerIdWidths = headerIdWidths.asInstanceOf[js.Any])
    if (isResizingColumn != null) __obj.updateDynamic("isResizingColumn")(isResizingColumn.asInstanceOf[js.Any])
    if (startX != null) __obj.updateDynamic("startX")(startX.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnWidth]
  }
}

