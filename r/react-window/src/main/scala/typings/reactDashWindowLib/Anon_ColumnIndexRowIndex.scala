package typings
package reactDashWindowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnIndexRowIndex extends js.Object {
  var columnIndex: scala.Double
  var rowIndex: scala.Double
  var shouldForceUpdate: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ColumnIndexRowIndex {
  @scala.inline
  def apply(
    columnIndex: scala.Double,
    rowIndex: scala.Double,
    shouldForceUpdate: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ColumnIndexRowIndex = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex, rowIndex = rowIndex)
    if (!js.isUndefined(shouldForceUpdate)) __obj.updateDynamic("shouldForceUpdate")(shouldForceUpdate)
    __obj.asInstanceOf[Anon_ColumnIndexRowIndex]
  }
}

