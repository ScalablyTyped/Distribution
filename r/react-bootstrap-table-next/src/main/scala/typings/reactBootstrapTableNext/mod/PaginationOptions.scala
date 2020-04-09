package typings.reactBootstrapTableNext.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactBootstrapTableNext.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  custom  :boolean,   page  :number,   sizePerPage  :number,   totalSize  :number,   pageStartIndex  :number,   paginationSize  :number,   showTotal  :boolean,   sizePerPageList  :std.Array<number> | std.Array<{  text  :string,   value  :number}>,   withFirstAndLast  :boolean,   alwaysShowAllBtns  :boolean,   firstPageText  :string,   prePageText  :string,   nextPageText  :string,   lastPageText  :string,   nextPageTitle  :string,   prePageTitle  :string,   firstPageTitle  :string,   lastPageTitle  :string,   hideSizePerPage  :boolean,   hidePageListOnlyOnePage  :boolean, onPageChange (page : number, sizePerPage : number): void, onSizePerPageChange (page : number, sizePerPage : number): void, paginationTotalRenderer (from : number, to : number, size : number): react.react._Global_.JSX.Element}> */
trait PaginationOptions extends js.Object {
  var alwaysShowAllBtns: js.UndefOr[Boolean] = js.undefined
  var custom: js.UndefOr[Boolean] = js.undefined
  var firstPageText: js.UndefOr[String] = js.undefined
  var firstPageTitle: js.UndefOr[String] = js.undefined
  var hidePageListOnlyOnePage: js.UndefOr[Boolean] = js.undefined
  var hideSizePerPage: js.UndefOr[Boolean] = js.undefined
  var lastPageText: js.UndefOr[String] = js.undefined
  var lastPageTitle: js.UndefOr[String] = js.undefined
  var nextPageText: js.UndefOr[String] = js.undefined
  var nextPageTitle: js.UndefOr[String] = js.undefined
  var onPageChange: js.UndefOr[js.Function2[/* page */ Double, /* sizePerPage */ Double, Unit]] = js.undefined
  var onSizePerPageChange: js.UndefOr[js.Function2[/* page */ Double, /* sizePerPage */ Double, Unit]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var pageStartIndex: js.UndefOr[Double] = js.undefined
  var paginationSize: js.UndefOr[Double] = js.undefined
  var paginationTotalRenderer: js.UndefOr[js.Function3[/* from */ Double, /* to */ Double, /* size */ Double, Element]] = js.undefined
  var prePageText: js.UndefOr[String] = js.undefined
  var prePageTitle: js.UndefOr[String] = js.undefined
  var showTotal: js.UndefOr[Boolean] = js.undefined
  var sizePerPage: js.UndefOr[Double] = js.undefined
  var sizePerPageList: js.UndefOr[js.Array[AnonText | Double]] = js.undefined
  var totalSize: js.UndefOr[Double] = js.undefined
  var withFirstAndLast: js.UndefOr[Boolean] = js.undefined
}

object PaginationOptions {
  @scala.inline
  def apply(
    alwaysShowAllBtns: js.UndefOr[Boolean] = js.undefined,
    custom: js.UndefOr[Boolean] = js.undefined,
    firstPageText: String = null,
    firstPageTitle: String = null,
    hidePageListOnlyOnePage: js.UndefOr[Boolean] = js.undefined,
    hideSizePerPage: js.UndefOr[Boolean] = js.undefined,
    lastPageText: String = null,
    lastPageTitle: String = null,
    nextPageText: String = null,
    nextPageTitle: String = null,
    onPageChange: (/* page */ Double, /* sizePerPage */ Double) => Unit = null,
    onSizePerPageChange: (/* page */ Double, /* sizePerPage */ Double) => Unit = null,
    page: Int | Double = null,
    pageStartIndex: Int | Double = null,
    paginationSize: Int | Double = null,
    paginationTotalRenderer: (/* from */ Double, /* to */ Double, /* size */ Double) => Element = null,
    prePageText: String = null,
    prePageTitle: String = null,
    showTotal: js.UndefOr[Boolean] = js.undefined,
    sizePerPage: Int | Double = null,
    sizePerPageList: js.Array[AnonText | Double] = null,
    totalSize: Int | Double = null,
    withFirstAndLast: js.UndefOr[Boolean] = js.undefined
  ): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowAllBtns)) __obj.updateDynamic("alwaysShowAllBtns")(alwaysShowAllBtns.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (firstPageText != null) __obj.updateDynamic("firstPageText")(firstPageText.asInstanceOf[js.Any])
    if (firstPageTitle != null) __obj.updateDynamic("firstPageTitle")(firstPageTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePageListOnlyOnePage)) __obj.updateDynamic("hidePageListOnlyOnePage")(hidePageListOnlyOnePage.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSizePerPage)) __obj.updateDynamic("hideSizePerPage")(hideSizePerPage.asInstanceOf[js.Any])
    if (lastPageText != null) __obj.updateDynamic("lastPageText")(lastPageText.asInstanceOf[js.Any])
    if (lastPageTitle != null) __obj.updateDynamic("lastPageTitle")(lastPageTitle.asInstanceOf[js.Any])
    if (nextPageText != null) __obj.updateDynamic("nextPageText")(nextPageText.asInstanceOf[js.Any])
    if (nextPageTitle != null) __obj.updateDynamic("nextPageTitle")(nextPageTitle.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction2(onPageChange))
    if (onSizePerPageChange != null) __obj.updateDynamic("onSizePerPageChange")(js.Any.fromFunction2(onSizePerPageChange))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageStartIndex != null) __obj.updateDynamic("pageStartIndex")(pageStartIndex.asInstanceOf[js.Any])
    if (paginationSize != null) __obj.updateDynamic("paginationSize")(paginationSize.asInstanceOf[js.Any])
    if (paginationTotalRenderer != null) __obj.updateDynamic("paginationTotalRenderer")(js.Any.fromFunction3(paginationTotalRenderer))
    if (prePageText != null) __obj.updateDynamic("prePageText")(prePageText.asInstanceOf[js.Any])
    if (prePageTitle != null) __obj.updateDynamic("prePageTitle")(prePageTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotal)) __obj.updateDynamic("showTotal")(showTotal.asInstanceOf[js.Any])
    if (sizePerPage != null) __obj.updateDynamic("sizePerPage")(sizePerPage.asInstanceOf[js.Any])
    if (sizePerPageList != null) __obj.updateDynamic("sizePerPageList")(sizePerPageList.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    if (!js.isUndefined(withFirstAndLast)) __obj.updateDynamic("withFirstAndLast")(withFirstAndLast.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

