package typings.reactDashTable

import typings.reactDashTable.reactDashTableMod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoResetExpanded[D /* <: js.Object */] extends js.Object {
  var autoResetExpanded: js.UndefOr[Boolean] = js.undefined
  var expandSubRows: Boolean
  var manualExpandedKey: IdType[D]
  var paginateExpandedRows: Boolean
}

object Anon_AutoResetExpanded {
  @scala.inline
  def apply[D /* <: js.Object */](
    expandSubRows: Boolean,
    manualExpandedKey: IdType[D],
    paginateExpandedRows: Boolean,
    autoResetExpanded: js.UndefOr[Boolean] = js.undefined
  ): Anon_AutoResetExpanded[D] = {
    val __obj = js.Dynamic.literal(expandSubRows = expandSubRows.asInstanceOf[js.Any], manualExpandedKey = manualExpandedKey.asInstanceOf[js.Any], paginateExpandedRows = paginateExpandedRows.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetExpanded)) __obj.updateDynamic("autoResetExpanded")(autoResetExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoResetExpanded[D]]
  }
}

