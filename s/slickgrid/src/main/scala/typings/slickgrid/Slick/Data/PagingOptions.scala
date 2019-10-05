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
    pageNum: Int | Double = null,
    pageSize: Int | Double = null,
    totalPages: Int | Double = null,
    totalRows: Int | Double = null
  ): PagingOptions = {
    val __obj = js.Dynamic.literal()
    if (pageNum != null) __obj.updateDynamic("pageNum")(pageNum.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    if (totalRows != null) __obj.updateDynamic("totalRows")(totalRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagingOptions]
  }
}

