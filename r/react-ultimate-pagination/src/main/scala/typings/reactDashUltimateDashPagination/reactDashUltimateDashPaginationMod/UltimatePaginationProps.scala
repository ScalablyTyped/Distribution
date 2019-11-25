package typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UltimatePaginationProps extends js.Object {
  /**
    * Number of always visible pages at the beginning and end
    */
  var boundaryPagesRange: js.UndefOr[Double] = js.undefined
  /**
    * Current page number
    */
  var currentPage: Double
  /**
    * Boolean flag to disable all buttons in pagination
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean flag to hide ellipsis
    */
  var hideEllipsis: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean flag to hide first and last page links
    */
  var hideFirstAndLastPageLinks: js.UndefOr[Boolean] = js.undefined
  /**
    * Boolean flag to hide previous and next page links
    */
  var hidePreviousAndNextPageLinks: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback that will be called with new page when it should be changed by user interaction
    */
  var onChange: js.UndefOr[js.Function1[/* newPage */ Double, Unit]] = js.undefined
  /**
    * Number of always visible pages before and after the current one
    */
  var siblingPagesRange: js.UndefOr[Double] = js.undefined
  /**
    * Total number of pages
    */
  var totalPages: Double
}

object UltimatePaginationProps {
  @scala.inline
  def apply(
    currentPage: Double,
    totalPages: Double,
    boundaryPagesRange: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideEllipsis: js.UndefOr[Boolean] = js.undefined,
    hideFirstAndLastPageLinks: js.UndefOr[Boolean] = js.undefined,
    hidePreviousAndNextPageLinks: js.UndefOr[Boolean] = js.undefined,
    onChange: /* newPage */ Double => Unit = null,
    siblingPagesRange: Int | Double = null
  ): UltimatePaginationProps = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    if (boundaryPagesRange != null) __obj.updateDynamic("boundaryPagesRange")(boundaryPagesRange.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hideEllipsis)) __obj.updateDynamic("hideEllipsis")(hideEllipsis.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFirstAndLastPageLinks)) __obj.updateDynamic("hideFirstAndLastPageLinks")(hideFirstAndLastPageLinks.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePreviousAndNextPageLinks)) __obj.updateDynamic("hidePreviousAndNextPageLinks")(hidePreviousAndNextPageLinks.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (siblingPagesRange != null) __obj.updateDynamic("siblingPagesRange")(siblingPagesRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UltimatePaginationProps]
  }
}

