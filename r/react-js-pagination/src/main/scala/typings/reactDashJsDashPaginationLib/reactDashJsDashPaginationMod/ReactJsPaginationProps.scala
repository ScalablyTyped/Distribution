package typings
package reactDashJsDashPaginationLib.reactDashJsDashPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactJsPaginationProps extends js.Object {
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  var activeLinkClass: js.UndefOr[java.lang.String] = js.undefined
  var activePage: scala.Double
  var disabledClass: js.UndefOr[java.lang.String] = js.undefined
  var firstPageText: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var getPageUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var hideDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var hideFirstLastPages: js.UndefOr[scala.Boolean] = js.undefined
  var hideNavigation: js.UndefOr[scala.Boolean] = js.undefined
  var innerClass: js.UndefOr[java.lang.String] = js.undefined
  var itemClass: js.UndefOr[java.lang.String] = js.undefined
  var itemClassFirst: js.UndefOr[java.lang.String] = js.undefined
  var itemClassLast: js.UndefOr[java.lang.String] = js.undefined
  var itemClassNext: js.UndefOr[java.lang.String] = js.undefined
  var itemClassPrev: js.UndefOr[java.lang.String] = js.undefined
  var itemsCountPerPage: js.UndefOr[scala.Double] = js.undefined
  var lastPageText: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var linkClass: js.UndefOr[java.lang.String] = js.undefined
  var linkClassFirst: js.UndefOr[java.lang.String] = js.undefined
  var linkClassLast: js.UndefOr[java.lang.String] = js.undefined
  var linkClassNext: js.UndefOr[java.lang.String] = js.undefined
  var linkClassPrev: js.UndefOr[java.lang.String] = js.undefined
  var nextPageText: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var pageRangeDisplayed: js.UndefOr[scala.Double] = js.undefined
  var prevPageText: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var totalItemsCount: scala.Double
  def onChange(pageNumber: scala.Double): scala.Unit
}

object ReactJsPaginationProps {
  @scala.inline
  def apply(
    activePage: scala.Double,
    onChange: js.Function1[scala.Double, scala.Unit],
    totalItemsCount: scala.Double,
    activeClass: java.lang.String = null,
    activeLinkClass: java.lang.String = null,
    disabledClass: java.lang.String = null,
    firstPageText: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    getPageUrl: js.Function0[java.lang.String] = null,
    hideDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    hideFirstLastPages: js.UndefOr[scala.Boolean] = js.undefined,
    hideNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    innerClass: java.lang.String = null,
    itemClass: java.lang.String = null,
    itemClassFirst: java.lang.String = null,
    itemClassLast: java.lang.String = null,
    itemClassNext: java.lang.String = null,
    itemClassPrev: java.lang.String = null,
    itemsCountPerPage: scala.Int | scala.Double = null,
    lastPageText: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    linkClass: java.lang.String = null,
    linkClassFirst: java.lang.String = null,
    linkClassLast: java.lang.String = null,
    linkClassNext: java.lang.String = null,
    linkClassPrev: java.lang.String = null,
    nextPageText: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null,
    pageRangeDisplayed: scala.Int | scala.Double = null,
    prevPageText: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] = null
  ): ReactJsPaginationProps = {
    val __obj = js.Dynamic.literal(activePage = activePage, onChange = onChange, totalItemsCount = totalItemsCount)
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (activeLinkClass != null) __obj.updateDynamic("activeLinkClass")(activeLinkClass)
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass)
    if (firstPageText != null) __obj.updateDynamic("firstPageText")(firstPageText.asInstanceOf[js.Any])
    if (getPageUrl != null) __obj.updateDynamic("getPageUrl")(getPageUrl)
    if (!js.isUndefined(hideDisabled)) __obj.updateDynamic("hideDisabled")(hideDisabled)
    if (!js.isUndefined(hideFirstLastPages)) __obj.updateDynamic("hideFirstLastPages")(hideFirstLastPages)
    if (!js.isUndefined(hideNavigation)) __obj.updateDynamic("hideNavigation")(hideNavigation)
    if (innerClass != null) __obj.updateDynamic("innerClass")(innerClass)
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass)
    if (itemClassFirst != null) __obj.updateDynamic("itemClassFirst")(itemClassFirst)
    if (itemClassLast != null) __obj.updateDynamic("itemClassLast")(itemClassLast)
    if (itemClassNext != null) __obj.updateDynamic("itemClassNext")(itemClassNext)
    if (itemClassPrev != null) __obj.updateDynamic("itemClassPrev")(itemClassPrev)
    if (itemsCountPerPage != null) __obj.updateDynamic("itemsCountPerPage")(itemsCountPerPage.asInstanceOf[js.Any])
    if (lastPageText != null) __obj.updateDynamic("lastPageText")(lastPageText.asInstanceOf[js.Any])
    if (linkClass != null) __obj.updateDynamic("linkClass")(linkClass)
    if (linkClassFirst != null) __obj.updateDynamic("linkClassFirst")(linkClassFirst)
    if (linkClassLast != null) __obj.updateDynamic("linkClassLast")(linkClassLast)
    if (linkClassNext != null) __obj.updateDynamic("linkClassNext")(linkClassNext)
    if (linkClassPrev != null) __obj.updateDynamic("linkClassPrev")(linkClassPrev)
    if (nextPageText != null) __obj.updateDynamic("nextPageText")(nextPageText.asInstanceOf[js.Any])
    if (pageRangeDisplayed != null) __obj.updateDynamic("pageRangeDisplayed")(pageRangeDisplayed.asInstanceOf[js.Any])
    if (prevPageText != null) __obj.updateDynamic("prevPageText")(prevPageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactJsPaginationProps]
  }
}

