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

