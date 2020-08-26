package typings.reactUltimatePagination.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UltimatePaginationProps extends js.Object {
  /**
    * Number of always visible pages at the beginning and end
    */
  var boundaryPagesRange: js.UndefOr[Double] = js.native
  /**
    * Current page number
    */
  var currentPage: Double = js.native
  /**
    * Boolean flag to disable all buttons in pagination
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Boolean flag to hide ellipsis
    */
  var hideEllipsis: js.UndefOr[Boolean] = js.native
  /**
    * Boolean flag to hide first and last page links
    */
  var hideFirstAndLastPageLinks: js.UndefOr[Boolean] = js.native
  /**
    * Boolean flag to hide previous and next page links
    */
  var hidePreviousAndNextPageLinks: js.UndefOr[Boolean] = js.native
  /**
    * Callback that will be called with new page when it should be changed by user interaction
    */
  var onChange: js.UndefOr[js.Function1[/* newPage */ Double, Unit]] = js.native
  /**
    * Number of always visible pages before and after the current one
    */
  var siblingPagesRange: js.UndefOr[Double] = js.native
  /**
    * Total number of pages
    */
  var totalPages: Double = js.native
}

object UltimatePaginationProps {
  @scala.inline
  def apply(currentPage: Double, totalPages: Double): UltimatePaginationProps = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[UltimatePaginationProps]
  }
  @scala.inline
  implicit class UltimatePaginationPropsOps[Self <: UltimatePaginationProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundaryPagesRange(value: Double): Self = this.set("boundaryPagesRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundaryPagesRange: Self = this.set("boundaryPagesRange", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHideEllipsis(value: Boolean): Self = this.set("hideEllipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideEllipsis: Self = this.set("hideEllipsis", js.undefined)
    @scala.inline
    def setHideFirstAndLastPageLinks(value: Boolean): Self = this.set("hideFirstAndLastPageLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFirstAndLastPageLinks: Self = this.set("hideFirstAndLastPageLinks", js.undefined)
    @scala.inline
    def setHidePreviousAndNextPageLinks(value: Boolean): Self = this.set("hidePreviousAndNextPageLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePreviousAndNextPageLinks: Self = this.set("hidePreviousAndNextPageLinks", js.undefined)
    @scala.inline
    def setOnChange(value: /* newPage */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setSiblingPagesRange(value: Double): Self = this.set("siblingPagesRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiblingPagesRange: Self = this.set("siblingPagesRange", js.undefined)
  }
  
}

