package typings.reactDashVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnIndexRowIndex extends js.Object {
  var columnIndex: js.UndefOr[Double] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
}

object Anon_ColumnIndexRowIndex {
  @scala.inline
  def apply(columnIndex: Int | Double = null, rowIndex: Int | Double = null): Anon_ColumnIndexRowIndex = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnIndexRowIndex]
  }
}

