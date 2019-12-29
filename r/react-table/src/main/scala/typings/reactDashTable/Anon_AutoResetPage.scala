package typings.reactDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoResetPage extends js.Object {
  var autoResetPage: js.UndefOr[Boolean] = js.undefined
  var manualPagination: Boolean
  var pageCount: Double
  var paginateExpandedRows: Boolean
}

object Anon_AutoResetPage {
  @scala.inline
  def apply(
    manualPagination: Boolean,
    pageCount: Double,
    paginateExpandedRows: Boolean,
    autoResetPage: js.UndefOr[Boolean] = js.undefined
  ): Anon_AutoResetPage = {
    val __obj = js.Dynamic.literal(manualPagination = manualPagination.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], paginateExpandedRows = paginateExpandedRows.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetPage)) __obj.updateDynamic("autoResetPage")(autoResetPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoResetPage]
  }
}

