package typings.reactWindow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowIndex extends js.Object {
  var columnIndex: Double
  var rowIndex: Double
  var shouldForceUpdate: js.UndefOr[Boolean] = js.undefined
}

object RowIndex {
  @scala.inline
  def apply(columnIndex: Double, rowIndex: Double, shouldForceUpdate: js.UndefOr[Boolean] = js.undefined): RowIndex = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldForceUpdate)) __obj.updateDynamic("shouldForceUpdate")(shouldForceUpdate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndex]
  }
}

