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

