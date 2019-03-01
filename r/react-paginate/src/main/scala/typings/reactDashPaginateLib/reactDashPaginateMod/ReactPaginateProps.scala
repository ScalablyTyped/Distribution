package typings
package reactDashPaginateLib.reactDashPaginateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPaginateProps extends js.Object {
  /**
    * The classname for the active page.
    */
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname for the active link.
    */
  var activeLinkClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname on tag `li` of the ellipsis element.
    */
  var breakClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for ellipsis.
    */
  var breakLabel: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * The classname on tag `a` of the ellipsis element.
    */
  var breakLinkClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The classname of the pagination container.
    */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Disable onPageChange callback with initial page. Default: false
    */
  var disableInitialCallback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The classname for disabled `previous` and `next` buttons.
    */
  var disabledClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra context to add to the aria-label HTML attribute.
    */
  var extraAriaContext: js.UndefOr[java.lang.String] = js.undefined
  /**
    * To override selected page with parent prop.
    */
  var forcePage: js.UndefOr[scala.Double] = js.undefined
  /**
    * The method is called to generate the href attribute value on tag a of each page element.
    */
  var hrefBuilder: js.UndefOr[js.Function1[/* pageIndex */ scala.Double, scala.Unit]] = js.undefined
  /**
    * The initial page selected.
    */
  var initialPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of pages to display for margins.
    */
  var marginPagesDisplayed: scala.Double
  /**
    * The classname on tag `li` of the `next` button.
    */
  var nextClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for the `next` button.
    */
  var nextLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * The classname on tag `a` of the `next` button.
    */
  var nextLinkClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The method to call when a page is clicked. Exposes the current page object as an argument.
    */
  var onPageChange: js.UndefOr[js.Function1[/* selectedItem */ reactDashPaginateLib.Anon_Selected, scala.Unit]] = js.undefined
  /**
    * The classname on tag `li` of each page element.
    */
  var pageClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The total number of pages.
    */
  var pageCount: scala.Double
  /**
    * The classname on tag `a` of each page element.
    */
  var pageLinkClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The range of pages displayed.
    */
  var pageRangeDisplayed: scala.Double
  /**
    * The classname on tag `li` of the `previous` button.
    */
  var previousClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label for the `previous` button.
    */
  var previousLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * The classname on tag `a` of the `previous` button.
    */
  var previousLinkClassName: js.UndefOr[java.lang.String] = js.undefined
}

object ReactPaginateProps {
  @scala.inline
  def apply(
    marginPagesDisplayed: scala.Double,
    pageCount: scala.Double,
    pageRangeDisplayed: scala.Double,
    activeClassName: java.lang.String = null,
    activeLinkClassName: java.lang.String = null,
    breakClassName: java.lang.String = null,
    breakLabel: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null,
    breakLinkClassName: java.lang.String = null,
    containerClassName: java.lang.String = null,
    disableInitialCallback: js.UndefOr[scala.Boolean] = js.undefined,
    disabledClassName: java.lang.String = null,
    extraAriaContext: java.lang.String = null,
    forcePage: scala.Int | scala.Double = null,
    hrefBuilder: js.Function1[/* pageIndex */ scala.Double, scala.Unit] = null,
    initialPage: scala.Int | scala.Double = null,
    nextClassName: java.lang.String = null,
    nextLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    nextLinkClassName: java.lang.String = null,
    onPageChange: js.Function1[/* selectedItem */ reactDashPaginateLib.Anon_Selected, scala.Unit] = null,
    pageClassName: java.lang.String = null,
    pageLinkClassName: java.lang.String = null,
    previousClassName: java.lang.String = null,
    previousLabel: reactLib.reactMod.ReactNs.ReactNode = null,
    previousLinkClassName: java.lang.String = null
  ): ReactPaginateProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("marginPagesDisplayed")(marginPagesDisplayed)
    __obj.updateDynamic("pageCount")(pageCount)
    __obj.updateDynamic("pageRangeDisplayed")(pageRangeDisplayed)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeLinkClassName != null) __obj.updateDynamic("activeLinkClassName")(activeLinkClassName)
    if (breakClassName != null) __obj.updateDynamic("breakClassName")(breakClassName)
    if (breakLabel != null) __obj.updateDynamic("breakLabel")(breakLabel.asInstanceOf[js.Any])
    if (breakLinkClassName != null) __obj.updateDynamic("breakLinkClassName")(breakLinkClassName)
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (!js.isUndefined(disableInitialCallback)) __obj.updateDynamic("disableInitialCallback")(disableInitialCallback)
    if (disabledClassName != null) __obj.updateDynamic("disabledClassName")(disabledClassName)
    if (extraAriaContext != null) __obj.updateDynamic("extraAriaContext")(extraAriaContext)
    if (forcePage != null) __obj.updateDynamic("forcePage")(forcePage.asInstanceOf[js.Any])
    if (hrefBuilder != null) __obj.updateDynamic("hrefBuilder")(hrefBuilder)
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (nextClassName != null) __obj.updateDynamic("nextClassName")(nextClassName)
    if (nextLabel != null) __obj.updateDynamic("nextLabel")(nextLabel.asInstanceOf[js.Any])
    if (nextLinkClassName != null) __obj.updateDynamic("nextLinkClassName")(nextLinkClassName)
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(onPageChange)
    if (pageClassName != null) __obj.updateDynamic("pageClassName")(pageClassName)
    if (pageLinkClassName != null) __obj.updateDynamic("pageLinkClassName")(pageLinkClassName)
    if (previousClassName != null) __obj.updateDynamic("previousClassName")(previousClassName)
    if (previousLabel != null) __obj.updateDynamic("previousLabel")(previousLabel.asInstanceOf[js.Any])
    if (previousLinkClassName != null) __obj.updateDynamic("previousLinkClassName")(previousLinkClassName)
    __obj.asInstanceOf[ReactPaginateProps]
  }
}

