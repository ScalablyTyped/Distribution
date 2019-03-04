package typings
package reactDashUltimateDashPaginationLib.reactDashUltimateDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UltimatePaginationProps extends js.Object {
  /**
    * Number of always visible pages at the beginning and end
    */
  var boundaryPagesRange: js.UndefOr[scala.Double] = js.undefined
  /**
    * Current page number
    */
  var currentPage: scala.Double
  /**
    * Boolean flag to disable all buttons in pagination
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Boolean flag to hide ellipsis
    */
  var hideEllipsis: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Boolean flag to hide first and last page links
    */
  var hideFirstAndLastPageLinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Boolean flag to hide previous and next page links
    */
  var hidePreviousAndNextPageLinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback that will be called with new page when it should be changed by user interaction
    */
  var onChange: js.UndefOr[js.Function1[/* newPage */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Number of always visible pages before and after the current one
    */
  var siblingPagesRange: js.UndefOr[scala.Double] = js.undefined
  /**
    * Total number of pages
    */
  var totalPages: scala.Double
}

object UltimatePaginationProps {
  @scala.inline
  def apply(
    currentPage: scala.Double,
    totalPages: scala.Double,
    boundaryPagesRange: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hideEllipsis: js.UndefOr[scala.Boolean] = js.undefined,
    hideFirstAndLastPageLinks: js.UndefOr[scala.Boolean] = js.undefined,
    hidePreviousAndNextPageLinks: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function1[/* newPage */ scala.Double, scala.Unit] = null,
    siblingPagesRange: scala.Int | scala.Double = null
  ): UltimatePaginationProps = {
    val __obj = js.Dynamic.literal(currentPage = currentPage, totalPages = totalPages)
    if (boundaryPagesRange != null) __obj.updateDynamic("boundaryPagesRange")(boundaryPagesRange.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hideEllipsis)) __obj.updateDynamic("hideEllipsis")(hideEllipsis)
    if (!js.isUndefined(hideFirstAndLastPageLinks)) __obj.updateDynamic("hideFirstAndLastPageLinks")(hideFirstAndLastPageLinks)
    if (!js.isUndefined(hidePreviousAndNextPageLinks)) __obj.updateDynamic("hidePreviousAndNextPageLinks")(hidePreviousAndNextPageLinks)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (siblingPagesRange != null) __obj.updateDynamic("siblingPagesRange")(siblingPagesRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UltimatePaginationProps]
  }
}

