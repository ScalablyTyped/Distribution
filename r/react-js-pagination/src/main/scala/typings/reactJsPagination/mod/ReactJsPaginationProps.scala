package typings.reactJsPagination.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactJsPaginationProps extends js.Object {
  var activeClass: js.UndefOr[String] = js.undefined
  var activeLinkClass: js.UndefOr[String] = js.undefined
  var activePage: Double
  var disabledClass: js.UndefOr[String] = js.undefined
  var firstPageText: js.UndefOr[String | ReactElement] = js.undefined
  var getPageUrl: js.UndefOr[js.Function1[/* pageNumber */ Double, String]] = js.undefined
  var hideDisabled: js.UndefOr[Boolean] = js.undefined
  var hideFirstLastPages: js.UndefOr[Boolean] = js.undefined
  var hideNavigation: js.UndefOr[Boolean] = js.undefined
  var innerClass: js.UndefOr[String] = js.undefined
  var itemClass: js.UndefOr[String] = js.undefined
  var itemClassFirst: js.UndefOr[String] = js.undefined
  var itemClassLast: js.UndefOr[String] = js.undefined
  var itemClassNext: js.UndefOr[String] = js.undefined
  var itemClassPrev: js.UndefOr[String] = js.undefined
  var itemsCountPerPage: js.UndefOr[Double] = js.undefined
  var lastPageText: js.UndefOr[String | ReactElement] = js.undefined
  var linkClass: js.UndefOr[String] = js.undefined
  var linkClassFirst: js.UndefOr[String] = js.undefined
  var linkClassLast: js.UndefOr[String] = js.undefined
  var linkClassNext: js.UndefOr[String] = js.undefined
  var linkClassPrev: js.UndefOr[String] = js.undefined
  var nextPageText: js.UndefOr[String | ReactElement] = js.undefined
  var pageRangeDisplayed: js.UndefOr[Double] = js.undefined
  var prevPageText: js.UndefOr[String | ReactElement] = js.undefined
  var totalItemsCount: Double
  def onChange(pageNumber: Double): Unit
}

object ReactJsPaginationProps {
  @scala.inline
  def apply(
    activePage: Double,
    onChange: Double => Unit,
    totalItemsCount: Double,
    activeClass: String = null,
    activeLinkClass: String = null,
    disabledClass: String = null,
    firstPageText: String | ReactElement = null,
    getPageUrl: /* pageNumber */ Double => String = null,
    hideDisabled: js.UndefOr[Boolean] = js.undefined,
    hideFirstLastPages: js.UndefOr[Boolean] = js.undefined,
    hideNavigation: js.UndefOr[Boolean] = js.undefined,
    innerClass: String = null,
    itemClass: String = null,
    itemClassFirst: String = null,
    itemClassLast: String = null,
    itemClassNext: String = null,
    itemClassPrev: String = null,
    itemsCountPerPage: js.UndefOr[Double] = js.undefined,
    lastPageText: String | ReactElement = null,
    linkClass: String = null,
    linkClassFirst: String = null,
    linkClassLast: String = null,
    linkClassNext: String = null,
    linkClassPrev: String = null,
    nextPageText: String | ReactElement = null,
    pageRangeDisplayed: js.UndefOr[Double] = js.undefined,
    prevPageText: String | ReactElement = null
  ): ReactJsPaginationProps = {
    val __obj = js.Dynamic.literal(activePage = activePage.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), totalItemsCount = totalItemsCount.asInstanceOf[js.Any])
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (activeLinkClass != null) __obj.updateDynamic("activeLinkClass")(activeLinkClass.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass.asInstanceOf[js.Any])
    if (firstPageText != null) __obj.updateDynamic("firstPageText")(firstPageText.asInstanceOf[js.Any])
    if (getPageUrl != null) __obj.updateDynamic("getPageUrl")(js.Any.fromFunction1(getPageUrl))
    if (!js.isUndefined(hideDisabled)) __obj.updateDynamic("hideDisabled")(hideDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFirstLastPages)) __obj.updateDynamic("hideFirstLastPages")(hideFirstLastPages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNavigation)) __obj.updateDynamic("hideNavigation")(hideNavigation.get.asInstanceOf[js.Any])
    if (innerClass != null) __obj.updateDynamic("innerClass")(innerClass.asInstanceOf[js.Any])
    if (itemClass != null) __obj.updateDynamic("itemClass")(itemClass.asInstanceOf[js.Any])
    if (itemClassFirst != null) __obj.updateDynamic("itemClassFirst")(itemClassFirst.asInstanceOf[js.Any])
    if (itemClassLast != null) __obj.updateDynamic("itemClassLast")(itemClassLast.asInstanceOf[js.Any])
    if (itemClassNext != null) __obj.updateDynamic("itemClassNext")(itemClassNext.asInstanceOf[js.Any])
    if (itemClassPrev != null) __obj.updateDynamic("itemClassPrev")(itemClassPrev.asInstanceOf[js.Any])
    if (!js.isUndefined(itemsCountPerPage)) __obj.updateDynamic("itemsCountPerPage")(itemsCountPerPage.get.asInstanceOf[js.Any])
    if (lastPageText != null) __obj.updateDynamic("lastPageText")(lastPageText.asInstanceOf[js.Any])
    if (linkClass != null) __obj.updateDynamic("linkClass")(linkClass.asInstanceOf[js.Any])
    if (linkClassFirst != null) __obj.updateDynamic("linkClassFirst")(linkClassFirst.asInstanceOf[js.Any])
    if (linkClassLast != null) __obj.updateDynamic("linkClassLast")(linkClassLast.asInstanceOf[js.Any])
    if (linkClassNext != null) __obj.updateDynamic("linkClassNext")(linkClassNext.asInstanceOf[js.Any])
    if (linkClassPrev != null) __obj.updateDynamic("linkClassPrev")(linkClassPrev.asInstanceOf[js.Any])
    if (nextPageText != null) __obj.updateDynamic("nextPageText")(nextPageText.asInstanceOf[js.Any])
    if (!js.isUndefined(pageRangeDisplayed)) __obj.updateDynamic("pageRangeDisplayed")(pageRangeDisplayed.get.asInstanceOf[js.Any])
    if (prevPageText != null) __obj.updateDynamic("prevPageText")(prevPageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactJsPaginationProps]
  }
}

