package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnIndexRowIndex extends js.Object {
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColumnIndexRowIndex {
  @scala.inline
  def apply(columnIndex: scala.Int | scala.Double = null, rowIndex: scala.Int | scala.Double = null): Anon_ColumnIndexRowIndex = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnIndexRowIndex]
  }
}

