package typings.slickgrid.Slick.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagingOptions extends js.Object {
  var pageNum: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var totalPages: js.UndefOr[Double] = js.undefined
  var totalRows: js.UndefOr[Double] = js.undefined
}

object PagingOptions {
  @scala.inline
  def apply(
    pageNum: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    totalPages: js.UndefOr[Double] = js.undefined,
    totalRows: js.UndefOr[Double] = js.undefined
  ): PagingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageNum)) __obj.updateDynamic("pageNum")(pageNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalPages)) __obj.updateDynamic("totalPages")(totalPages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRows)) __obj.updateDynamic("totalRows")(totalRows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagingOptions]
  }
}

