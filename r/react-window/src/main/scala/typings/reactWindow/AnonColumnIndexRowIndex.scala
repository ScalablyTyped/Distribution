package typings.reactWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnIndexRowIndex extends js.Object {
  var columnIndex: Double
  var rowIndex: Double
  var shouldForceUpdate: js.UndefOr[Boolean] = js.undefined
}

object AnonColumnIndexRowIndex {
  @scala.inline
  def apply(columnIndex: Double, rowIndex: Double, shouldForceUpdate: js.UndefOr[Boolean] = js.undefined): AnonColumnIndexRowIndex = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldForceUpdate)) __obj.updateDynamic("shouldForceUpdate")(shouldForceUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnIndexRowIndex]
  }
}

