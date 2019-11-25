package typings.reactDashWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnIndexRowIndex extends js.Object {
  var columnIndex: Double
  var rowIndex: Double
  var shouldForceUpdate: js.UndefOr[Boolean] = js.undefined
}

object Anon_ColumnIndexRowIndex {
  @scala.inline
  def apply(columnIndex: Double, rowIndex: Double, shouldForceUpdate: js.UndefOr[Boolean] = js.undefined): Anon_ColumnIndexRowIndex = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldForceUpdate)) __obj.updateDynamic("shouldForceUpdate")(shouldForceUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnIndexRowIndex]
  }
}

