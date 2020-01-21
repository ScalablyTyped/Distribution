package typings.reactTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoResetPage extends js.Object {
  var autoResetPage: js.UndefOr[Boolean] = js.undefined
  var manualPagination: Boolean
  var pageCount: Double
  var paginateExpandedRows: Boolean
}

object AnonAutoResetPage {
  @scala.inline
  def apply(
    manualPagination: Boolean,
    pageCount: Double,
    paginateExpandedRows: Boolean,
    autoResetPage: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoResetPage = {
    val __obj = js.Dynamic.literal(manualPagination = manualPagination.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], paginateExpandedRows = paginateExpandedRows.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetPage)) __obj.updateDynamic("autoResetPage")(autoResetPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoResetPage]
  }
}

