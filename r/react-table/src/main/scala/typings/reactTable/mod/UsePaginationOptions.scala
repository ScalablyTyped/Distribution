package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  pageCount  :number,   manualPagination  :boolean,   autoResetPage ? :boolean,   paginateExpandedRows  :boolean}> */
trait UsePaginationOptions[D /* <: js.Object */] extends js.Object {
  var autoResetPage: js.UndefOr[Boolean] = js.undefined
  var manualPagination: js.UndefOr[Boolean] = js.undefined
  var pageCount: js.UndefOr[Double] = js.undefined
  var paginateExpandedRows: js.UndefOr[Boolean] = js.undefined
}

object UsePaginationOptions {
  @scala.inline
  def apply[/* <: js.Object */ D](
    autoResetPage: js.UndefOr[Boolean] = js.undefined,
    manualPagination: js.UndefOr[Boolean] = js.undefined,
    pageCount: js.UndefOr[Double] = js.undefined,
    paginateExpandedRows: js.UndefOr[Boolean] = js.undefined
  ): UsePaginationOptions[D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResetPage)) __obj.updateDynamic("autoResetPage")(autoResetPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manualPagination)) __obj.updateDynamic("manualPagination")(manualPagination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageCount)) __obj.updateDynamic("pageCount")(pageCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paginateExpandedRows)) __obj.updateDynamic("paginateExpandedRows")(paginateExpandedRows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsePaginationOptions[D]]
  }
}

