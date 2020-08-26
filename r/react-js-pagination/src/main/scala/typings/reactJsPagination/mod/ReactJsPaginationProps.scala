package typings.reactJsPagination.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactJsPaginationProps extends js.Object {
  var activeClass: js.UndefOr[String] = js.native
  var activeLinkClass: js.UndefOr[String] = js.native
  var activePage: Double = js.native
  var disabledClass: js.UndefOr[String] = js.native
  var firstPageText: js.UndefOr[String | ReactElement] = js.native
  var getPageUrl: js.UndefOr[js.Function1[/* pageNumber */ Double, String]] = js.native
  var hideDisabled: js.UndefOr[Boolean] = js.native
  var hideFirstLastPages: js.UndefOr[Boolean] = js.native
  var hideNavigation: js.UndefOr[Boolean] = js.native
  var innerClass: js.UndefOr[String] = js.native
  var itemClass: js.UndefOr[String] = js.native
  var itemClassFirst: js.UndefOr[String] = js.native
  var itemClassLast: js.UndefOr[String] = js.native
  var itemClassNext: js.UndefOr[String] = js.native
  var itemClassPrev: js.UndefOr[String] = js.native
  var itemsCountPerPage: js.UndefOr[Double] = js.native
  var lastPageText: js.UndefOr[String | ReactElement] = js.native
  var linkClass: js.UndefOr[String] = js.native
  var linkClassFirst: js.UndefOr[String] = js.native
  var linkClassLast: js.UndefOr[String] = js.native
  var linkClassNext: js.UndefOr[String] = js.native
  var linkClassPrev: js.UndefOr[String] = js.native
  var nextPageText: js.UndefOr[String | ReactElement] = js.native
  var pageRangeDisplayed: js.UndefOr[Double] = js.native
  var prevPageText: js.UndefOr[String | ReactElement] = js.native
  var totalItemsCount: Double = js.native
  def onChange(pageNumber: Double): Unit = js.native
}

object ReactJsPaginationProps {
  @scala.inline
  def apply(activePage: Double, onChange: Double => Unit, totalItemsCount: Double): ReactJsPaginationProps = {
    val __obj = js.Dynamic.literal(activePage = activePage.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), totalItemsCount = totalItemsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactJsPaginationProps]
  }
  @scala.inline
  implicit class ReactJsPaginationPropsOps[Self <: ReactJsPaginationProps] (val x: Self) extends AnyVal {
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
    def setActivePage(value: Double): Self = this.set("activePage", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setTotalItemsCount(value: Double): Self = this.set("totalItemsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    @scala.inline
    def setActiveLinkClass(value: String): Self = this.set("activeLinkClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveLinkClass: Self = this.set("activeLinkClass", js.undefined)
    @scala.inline
    def setDisabledClass(value: String): Self = this.set("disabledClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledClass: Self = this.set("disabledClass", js.undefined)
    @scala.inline
    def setFirstPageText(value: String | ReactElement): Self = this.set("firstPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageText: Self = this.set("firstPageText", js.undefined)
    @scala.inline
    def setGetPageUrl(value: /* pageNumber */ Double => String): Self = this.set("getPageUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPageUrl: Self = this.set("getPageUrl", js.undefined)
    @scala.inline
    def setHideDisabled(value: Boolean): Self = this.set("hideDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDisabled: Self = this.set("hideDisabled", js.undefined)
    @scala.inline
    def setHideFirstLastPages(value: Boolean): Self = this.set("hideFirstLastPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFirstLastPages: Self = this.set("hideFirstLastPages", js.undefined)
    @scala.inline
    def setHideNavigation(value: Boolean): Self = this.set("hideNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideNavigation: Self = this.set("hideNavigation", js.undefined)
    @scala.inline
    def setInnerClass(value: String): Self = this.set("innerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerClass: Self = this.set("innerClass", js.undefined)
    @scala.inline
    def setItemClass(value: String): Self = this.set("itemClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemClass: Self = this.set("itemClass", js.undefined)
    @scala.inline
    def setItemClassFirst(value: String): Self = this.set("itemClassFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemClassFirst: Self = this.set("itemClassFirst", js.undefined)
    @scala.inline
    def setItemClassLast(value: String): Self = this.set("itemClassLast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemClassLast: Self = this.set("itemClassLast", js.undefined)
    @scala.inline
    def setItemClassNext(value: String): Self = this.set("itemClassNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemClassNext: Self = this.set("itemClassNext", js.undefined)
    @scala.inline
    def setItemClassPrev(value: String): Self = this.set("itemClassPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemClassPrev: Self = this.set("itemClassPrev", js.undefined)
    @scala.inline
    def setItemsCountPerPage(value: Double): Self = this.set("itemsCountPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsCountPerPage: Self = this.set("itemsCountPerPage", js.undefined)
    @scala.inline
    def setLastPageText(value: String | ReactElement): Self = this.set("lastPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPageText: Self = this.set("lastPageText", js.undefined)
    @scala.inline
    def setLinkClass(value: String): Self = this.set("linkClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkClass: Self = this.set("linkClass", js.undefined)
    @scala.inline
    def setLinkClassFirst(value: String): Self = this.set("linkClassFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkClassFirst: Self = this.set("linkClassFirst", js.undefined)
    @scala.inline
    def setLinkClassLast(value: String): Self = this.set("linkClassLast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkClassLast: Self = this.set("linkClassLast", js.undefined)
    @scala.inline
    def setLinkClassNext(value: String): Self = this.set("linkClassNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkClassNext: Self = this.set("linkClassNext", js.undefined)
    @scala.inline
    def setLinkClassPrev(value: String): Self = this.set("linkClassPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkClassPrev: Self = this.set("linkClassPrev", js.undefined)
    @scala.inline
    def setNextPageText(value: String | ReactElement): Self = this.set("nextPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageText: Self = this.set("nextPageText", js.undefined)
    @scala.inline
    def setPageRangeDisplayed(value: Double): Self = this.set("pageRangeDisplayed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageRangeDisplayed: Self = this.set("pageRangeDisplayed", js.undefined)
    @scala.inline
    def setPrevPageText(value: String | ReactElement): Self = this.set("prevPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevPageText: Self = this.set("prevPageText", js.undefined)
  }
  
}

