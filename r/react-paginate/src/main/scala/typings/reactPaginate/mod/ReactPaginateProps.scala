package typings.reactPaginate.mod

import typings.react.mod.ReactNode
import typings.reactPaginate.anon.Selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactPaginateProps extends js.Object {
  /**
    * The classname for the active page.
    */
  var activeClassName: js.UndefOr[String] = js.native
  /**
    * The classname for the active link.
    */
  var activeLinkClassName: js.UndefOr[String] = js.native
  /**
    * The classname on tag `li` of the ellipsis element.
    */
  var breakClassName: js.UndefOr[String] = js.native
  /**
    * Label for ellipsis.
    */
  var breakLabel: js.UndefOr[String | ReactNode] = js.native
  /**
    * The classname on tag `a` of the ellipsis element.
    */
  var breakLinkClassName: js.UndefOr[String] = js.native
  /**
    * The classname of the pagination container.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Disable onPageChange callback with initial page. Default: false
    */
  var disableInitialCallback: js.UndefOr[Boolean] = js.native
  /**
    * The classname for disabled `previous` and `next` buttons.
    */
  var disabledClassName: js.UndefOr[String] = js.native
  /**
    * Extra context to add to the aria-label HTML attribute.
    */
  var extraAriaContext: js.UndefOr[String] = js.native
  /**
    * To override selected page with parent prop.
    */
  var forcePage: js.UndefOr[Double] = js.native
  /**
    * The method is called to generate the href attribute value on tag a of each page element.
    */
  var hrefBuilder: js.UndefOr[js.Function1[/* pageIndex */ Double, Unit]] = js.native
  /**
    * The initial page selected.
    */
  var initialPage: js.UndefOr[Double] = js.native
  /**
    * The number of pages to display for margins.
    */
  var marginPagesDisplayed: Double = js.native
  /**
    * The classname on tag `li` of the `next` button.
    */
  var nextClassName: js.UndefOr[String] = js.native
  /**
    * Label for the `next` button.
    */
  var nextLabel: js.UndefOr[ReactNode] = js.native
  /**
    * The classname on tag `a` of the `next` button.
    */
  var nextLinkClassName: js.UndefOr[String] = js.native
  /**
    * The method to call when a page is clicked. Exposes the current page object as an argument.
    */
  var onPageChange: js.UndefOr[js.Function1[/* selectedItem */ Selected, Unit]] = js.native
  /**
    * The classname on tag `li` of each page element.
    */
  var pageClassName: js.UndefOr[String] = js.native
  /**
    * The total number of pages.
    */
  var pageCount: Double = js.native
  /**
    * The classname on tag `a` of each page element.
    */
  var pageLinkClassName: js.UndefOr[String] = js.native
  /**
    * The range of pages displayed.
    */
  var pageRangeDisplayed: Double = js.native
  /**
    * The classname on tag `li` of the `previous` button.
    */
  var previousClassName: js.UndefOr[String] = js.native
  /**
    * Label for the `previous` button.
    */
  var previousLabel: js.UndefOr[ReactNode] = js.native
  /**
    * The classname on tag `a` of the `previous` button.
    */
  var previousLinkClassName: js.UndefOr[String] = js.native
}

object ReactPaginateProps {
  @scala.inline
  def apply(marginPagesDisplayed: Double, pageCount: Double, pageRangeDisplayed: Double): ReactPaginateProps = {
    val __obj = js.Dynamic.literal(marginPagesDisplayed = marginPagesDisplayed.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], pageRangeDisplayed = pageRangeDisplayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPaginateProps]
  }
  @scala.inline
  implicit class ReactPaginatePropsOps[Self <: ReactPaginateProps] (val x: Self) extends AnyVal {
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
    def setMarginPagesDisplayed(value: Double): Self = this.set("marginPagesDisplayed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageRangeDisplayed(value: Double): Self = this.set("pageRangeDisplayed", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveClassName(value: String): Self = this.set("activeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClassName: Self = this.set("activeClassName", js.undefined)
    @scala.inline
    def setActiveLinkClassName(value: String): Self = this.set("activeLinkClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveLinkClassName: Self = this.set("activeLinkClassName", js.undefined)
    @scala.inline
    def setBreakClassName(value: String): Self = this.set("breakClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakClassName: Self = this.set("breakClassName", js.undefined)
    @scala.inline
    def setBreakLabel(value: String | ReactNode): Self = this.set("breakLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakLabel: Self = this.set("breakLabel", js.undefined)
    @scala.inline
    def setBreakLinkClassName(value: String): Self = this.set("breakLinkClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakLinkClassName: Self = this.set("breakLinkClassName", js.undefined)
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setDisableInitialCallback(value: Boolean): Self = this.set("disableInitialCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableInitialCallback: Self = this.set("disableInitialCallback", js.undefined)
    @scala.inline
    def setDisabledClassName(value: String): Self = this.set("disabledClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledClassName: Self = this.set("disabledClassName", js.undefined)
    @scala.inline
    def setExtraAriaContext(value: String): Self = this.set("extraAriaContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraAriaContext: Self = this.set("extraAriaContext", js.undefined)
    @scala.inline
    def setForcePage(value: Double): Self = this.set("forcePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcePage: Self = this.set("forcePage", js.undefined)
    @scala.inline
    def setHrefBuilder(value: /* pageIndex */ Double => Unit): Self = this.set("hrefBuilder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHrefBuilder: Self = this.set("hrefBuilder", js.undefined)
    @scala.inline
    def setInitialPage(value: Double): Self = this.set("initialPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPage: Self = this.set("initialPage", js.undefined)
    @scala.inline
    def setNextClassName(value: String): Self = this.set("nextClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextClassName: Self = this.set("nextClassName", js.undefined)
    @scala.inline
    def setNextLabel(value: ReactNode): Self = this.set("nextLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextLabel: Self = this.set("nextLabel", js.undefined)
    @scala.inline
    def setNextLinkClassName(value: String): Self = this.set("nextLinkClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextLinkClassName: Self = this.set("nextLinkClassName", js.undefined)
    @scala.inline
    def setOnPageChange(value: /* selectedItem */ Selected => Unit): Self = this.set("onPageChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    @scala.inline
    def setPageClassName(value: String): Self = this.set("pageClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageClassName: Self = this.set("pageClassName", js.undefined)
    @scala.inline
    def setPageLinkClassName(value: String): Self = this.set("pageLinkClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLinkClassName: Self = this.set("pageLinkClassName", js.undefined)
    @scala.inline
    def setPreviousClassName(value: String): Self = this.set("previousClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousClassName: Self = this.set("previousClassName", js.undefined)
    @scala.inline
    def setPreviousLabel(value: ReactNode): Self = this.set("previousLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousLabel: Self = this.set("previousLabel", js.undefined)
    @scala.inline
    def setPreviousLinkClassName(value: String): Self = this.set("previousLinkClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousLinkClassName: Self = this.set("previousLinkClassName", js.undefined)
  }
  
}

