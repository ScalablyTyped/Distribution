package typings.reactTable

import typings.reactTable.mod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoResetExpanded[D /* <: js.Object */] extends js.Object {
  var autoResetExpanded: js.UndefOr[Boolean] = js.undefined
  var expandSubRows: Boolean
  var manualExpandedKey: IdType[D]
  var paginateExpandedRows: Boolean
}

object AnonAutoResetExpanded {
  @scala.inline
  def apply[D /* <: js.Object */](
    expandSubRows: Boolean,
    manualExpandedKey: IdType[D],
    paginateExpandedRows: Boolean,
    autoResetExpanded: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoResetExpanded[D] = {
    val __obj = js.Dynamic.literal(expandSubRows = expandSubRows.asInstanceOf[js.Any], manualExpandedKey = manualExpandedKey.asInstanceOf[js.Any], paginateExpandedRows = paginateExpandedRows.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetExpanded)) __obj.updateDynamic("autoResetExpanded")(autoResetExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoResetExpanded[D]]
  }
}

