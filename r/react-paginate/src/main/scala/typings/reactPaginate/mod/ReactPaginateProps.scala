package typings.reactPaginate.mod

import typings.react.mod.ReactNode
import typings.reactPaginate.AnonSelected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPaginateProps extends js.Object {
  /**
    * The classname for the active page.
    */
  var activeClassName: js.UndefOr[String] = js.undefined
  /**
    * The classname for the active link.
    */
  var activeLinkClassName: js.UndefOr[String] = js.undefined
  /**
    * The classname on tag `li` of the ellipsis element.
    */
  var breakClassName: js.UndefOr[String] = js.undefined
  /**
    * Label for ellipsis.
    */
  var breakLabel: js.UndefOr[String | ReactNode] = js.undefined
  /**
    * The classname on tag `a` of the ellipsis element.
    */
  var breakLinkClassName: js.UndefOr[String] = js.undefined
  /**
    * The classname of the pagination container.
    */
  var containerClassName: js.UndefOr[String] = js.undefined
  /**
    * Disable onPageChange callback with initial page. Default: false
    */
  var disableInitialCallback: js.UndefOr[Boolean] = js.undefined
  /**
    * The classname for disabled `previous` and `next` buttons.
    */
  var disabledClassName: js.UndefOr[String] = js.undefined
  /**
    * Extra context to add to the aria-label HTML attribute.
    */
  var extraAriaContext: js.UndefOr[String] = js.undefined
  /**
    * To override selected page with parent prop.
    */
  var forcePage: js.UndefOr[Double] = js.undefined
  /**
    * The method is called to generate the href attribute value on tag a of each page element.
    */
  var hrefBuilder: js.UndefOr[js.Function1[/* pageIndex */ Double, Unit]] = js.undefined
  /**
    * The initial page selected.
    */
  var initialPage: js.UndefOr[Double] = js.undefined
  /**
    * The number of pages to display for margins.
    */
  var marginPagesDisplayed: Double
  /**
    * The classname on tag `li` of the `next` button.
    */
  var nextClassName: js.UndefOr[String] = js.undefined
  /**
    * Label for the `next` button.
    */
  var nextLabel: js.UndefOr[ReactNode] = js.undefined
  /**
    * The classname on tag `a` of the `next` button.
    */
  var nextLinkClassName: js.UndefOr[String] = js.undefined
  /**
    * The method to call when a page is clicked. Exposes the current page object as an argument.
    */
  var onPageChange: js.UndefOr[js.Function1[/* selectedItem */ AnonSelected, Unit]] = js.undefined
  /**
    * The classname on tag `li` of each page element.
    */
  var pageClassName: js.UndefOr[String] = js.undefined
  /**
    * The total number of pages.
    */
  var pageCount: Double
  /**
    * The classname on tag `a` of each page element.
    */
  var pageLinkClassName: js.UndefOr[String] = js.undefined
  /**
    * The range of pages displayed.
    */
  var pageRangeDisplayed: Double
  /**
    * The classname on tag `li` of the `previous` button.
    */
  var previousClassName: js.UndefOr[String] = js.undefined
  /**
    * Label for the `previous` button.
    */
  var previousLabel: js.UndefOr[ReactNode] = js.undefined
  /**
    * The classname on tag `a` of the `previous` button.
    */
  var previousLinkClassName: js.UndefOr[String] = js.undefined
}

object ReactPaginateProps {
  @scala.inline
  def apply(
    marginPagesDisplayed: Double,
    pageCount: Double,
    pageRangeDisplayed: Double,
    activeClassName: String = null,
    activeLinkClassName: String = null,
    breakClassName: String = null,
    breakLabel: String | ReactNode = null,
    breakLinkClassName: String = null,
    containerClassName: String = null,
    disableInitialCallback: js.UndefOr[Boolean] = js.undefined,
    disabledClassName: String = null,
    extraAriaContext: String = null,
    forcePage: Int | Double = null,
    hrefBuilder: /* pageIndex */ Double => Unit = null,
    initialPage: Int | Double = null,
    nextClassName: String = null,
    nextLabel: ReactNode = null,
    nextLinkClassName: String = null,
    onPageChange: /* selectedItem */ AnonSelected => Unit = null,
    pageClassName: String = null,
    pageLinkClassName: String = null,
    previousClassName: String = null,
    previousLabel: ReactNode = null,
    previousLinkClassName: String = null
  ): ReactPaginateProps = {
    val __obj = js.Dynamic.literal(marginPagesDisplayed = marginPagesDisplayed.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], pageRangeDisplayed = pageRangeDisplayed.asInstanceOf[js.Any])
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeLinkClassName != null) __obj.updateDynamic("activeLinkClassName")(activeLinkClassName.asInstanceOf[js.Any])
    if (breakClassName != null) __obj.updateDynamic("breakClassName")(breakClassName.asInstanceOf[js.Any])
    if (breakLabel != null) __obj.updateDynamic("breakLabel")(breakLabel.asInstanceOf[js.Any])
    if (breakLinkClassName != null) __obj.updateDynamic("breakLinkClassName")(breakLinkClassName.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInitialCallback)) __obj.updateDynamic("disableInitialCallback")(disableInitialCallback.asInstanceOf[js.Any])
    if (disabledClassName != null) __obj.updateDynamic("disabledClassName")(disabledClassName.asInstanceOf[js.Any])
    if (extraAriaContext != null) __obj.updateDynamic("extraAriaContext")(extraAriaContext.asInstanceOf[js.Any])
    if (forcePage != null) __obj.updateDynamic("forcePage")(forcePage.asInstanceOf[js.Any])
    if (hrefBuilder != null) __obj.updateDynamic("hrefBuilder")(js.Any.fromFunction1(hrefBuilder))
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (nextClassName != null) __obj.updateDynamic("nextClassName")(nextClassName.asInstanceOf[js.Any])
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel.asInstanceOf[js.Any])
    if (nextLinkClassName != null) __obj.updateDynamic("nextLinkClassName")(nextLinkClassName.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1(onPageChange))
    if (pageClassName != null) __obj.updateDynamic("pageClassName")(pageClassName.asInstanceOf[js.Any])
    if (pageLinkClassName != null) __obj.updateDynamic("pageLinkClassName")(pageLinkClassName.asInstanceOf[js.Any])
    if (previousClassName != null) __obj.updateDynamic("previousClassName")(previousClassName.asInstanceOf[js.Any])
    if (previousLabel != null) __obj.updateDynamic("previousLabel")(previousLabel.asInstanceOf[js.Any])
    if (previousLinkClassName != null) __obj.updateDynamic("previousLinkClassName")(previousLinkClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPaginateProps]
  }
}

