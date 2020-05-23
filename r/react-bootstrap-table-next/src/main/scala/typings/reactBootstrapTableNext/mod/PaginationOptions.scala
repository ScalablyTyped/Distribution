package typings.reactBootstrapTableNext.mod

import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  custom  :boolean,   page  :number,   sizePerPage  :number,   totalSize  :number,   pageStartIndex  :number,   paginationSize  :number,   showTotal  :boolean,   sizePerPageList  :std.Array<number> | std.Array<{  text  :string,   value  :number}>,   withFirstAndLast  :boolean,   alwaysShowAllBtns  :boolean,   firstPageText  :string,   prePageText  :string,   nextPageText  :string,   lastPageText  :string,   nextPageTitle  :string,   prePageTitle  :string,   firstPageTitle  :string,   lastPageTitle  :string,   hideSizePerPage  :boolean,   hidePageListOnlyOnePage  :boolean, pageButtonRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.PageButtonRendererOptions): react.react.<global>.JSX.Element, onPageChange (page : number, sizePerPage : number): void, onSizePerPageChange (page : number, sizePerPage : number): void, pageListRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.PageListRendererOptions): react.react.<global>.JSX.Element, sizePerPageRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.SizePerPageRendererOptions): react.react.<global>.JSX.Element, sizePerPageOptionRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.SizePerPageOptionRendererOptions): react.react.<global>.JSX.Element, paginationTotalRenderer (from : number, to : number, size : number): react.react.<global>.JSX.Element}> */
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
  var pageButtonRenderer: js.UndefOr[js.Function1[/* options */ PageButtonRendererOptions, Element]] = js.undefined
  var pageListRenderer: js.UndefOr[js.Function1[/* options */ PageListRendererOptions, Element]] = js.undefined
  var pageStartIndex: js.UndefOr[Double] = js.undefined
  var paginationSize: js.UndefOr[Double] = js.undefined
  var paginationTotalRenderer: js.UndefOr[js.Function3[/* from */ Double, /* to */ Double, /* size */ Double, Element]] = js.undefined
  var prePageText: js.UndefOr[String] = js.undefined
  var prePageTitle: js.UndefOr[String] = js.undefined
  var showTotal: js.UndefOr[Boolean] = js.undefined
  var sizePerPage: js.UndefOr[Double] = js.undefined
  var sizePerPageList: js.UndefOr[js.Array[Double | Text]] = js.undefined
  var sizePerPageOptionRenderer: js.UndefOr[js.Function1[/* options */ SizePerPageOptionRendererOptions, Element]] = js.undefined
  var sizePerPageRenderer: js.UndefOr[js.Function1[/* options */ SizePerPageRendererOptions, Element]] = js.undefined
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
    page: js.UndefOr[Double] = js.undefined,
    pageButtonRenderer: /* options */ PageButtonRendererOptions => Element = null,
    pageListRenderer: /* options */ PageListRendererOptions => Element = null,
    pageStartIndex: js.UndefOr[Double] = js.undefined,
    paginationSize: js.UndefOr[Double] = js.undefined,
    paginationTotalRenderer: (/* from */ Double, /* to */ Double, /* size */ Double) => Element = null,
    prePageText: String = null,
    prePageTitle: String = null,
    showTotal: js.UndefOr[Boolean] = js.undefined,
    sizePerPage: js.UndefOr[Double] = js.undefined,
    sizePerPageList: js.Array[Double | Text] = null,
    sizePerPageOptionRenderer: /* options */ SizePerPageOptionRendererOptions => Element = null,
    sizePerPageRenderer: /* options */ SizePerPageRendererOptions => Element = null,
    totalSize: js.UndefOr[Double] = js.undefined,
    withFirstAndLast: js.UndefOr[Boolean] = js.undefined
  ): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysShowAllBtns)) __obj.updateDynamic("alwaysShowAllBtns")(alwaysShowAllBtns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.get.asInstanceOf[js.Any])
    if (firstPageText != null) __obj.updateDynamic("firstPageText")(firstPageText.asInstanceOf[js.Any])
    if (firstPageTitle != null) __obj.updateDynamic("firstPageTitle")(firstPageTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePageListOnlyOnePage)) __obj.updateDynamic("hidePageListOnlyOnePage")(hidePageListOnlyOnePage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSizePerPage)) __obj.updateDynamic("hideSizePerPage")(hideSizePerPage.get.asInstanceOf[js.Any])
    if (lastPageText != null) __obj.updateDynamic("lastPageText")(lastPageText.asInstanceOf[js.Any])
    if (lastPageTitle != null) __obj.updateDynamic("lastPageTitle")(lastPageTitle.asInstanceOf[js.Any])
    if (nextPageText != null) __obj.updateDynamic("nextPageText")(nextPageText.asInstanceOf[js.Any])
    if (nextPageTitle != null) __obj.updateDynamic("nextPageTitle")(nextPageTitle.asInstanceOf[js.Any])
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction2(onPageChange))
    if (onSizePerPageChange != null) __obj.updateDynamic("onSizePerPageChange")(js.Any.fromFunction2(onSizePerPageChange))
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (pageButtonRenderer != null) __obj.updateDynamic("pageButtonRenderer")(js.Any.fromFunction1(pageButtonRenderer))
    if (pageListRenderer != null) __obj.updateDynamic("pageListRenderer")(js.Any.fromFunction1(pageListRenderer))
    if (!js.isUndefined(pageStartIndex)) __obj.updateDynamic("pageStartIndex")(pageStartIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paginationSize)) __obj.updateDynamic("paginationSize")(paginationSize.get.asInstanceOf[js.Any])
    if (paginationTotalRenderer != null) __obj.updateDynamic("paginationTotalRenderer")(js.Any.fromFunction3(paginationTotalRenderer))
    if (prePageText != null) __obj.updateDynamic("prePageText")(prePageText.asInstanceOf[js.Any])
    if (prePageTitle != null) __obj.updateDynamic("prePageTitle")(prePageTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotal)) __obj.updateDynamic("showTotal")(showTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sizePerPage)) __obj.updateDynamic("sizePerPage")(sizePerPage.get.asInstanceOf[js.Any])
    if (sizePerPageList != null) __obj.updateDynamic("sizePerPageList")(sizePerPageList.asInstanceOf[js.Any])
    if (sizePerPageOptionRenderer != null) __obj.updateDynamic("sizePerPageOptionRenderer")(js.Any.fromFunction1(sizePerPageOptionRenderer))
    if (sizePerPageRenderer != null) __obj.updateDynamic("sizePerPageRenderer")(js.Any.fromFunction1(sizePerPageRenderer))
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withFirstAndLast)) __obj.updateDynamic("withFirstAndLast")(withFirstAndLast.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
}

