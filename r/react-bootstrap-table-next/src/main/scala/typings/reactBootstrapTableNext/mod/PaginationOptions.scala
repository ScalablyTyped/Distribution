package typings.reactBootstrapTableNext.mod

import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  custom :boolean,   page :number,   sizePerPage :number,   totalSize :number,   pageStartIndex :number,   paginationSize :number,   showTotal :boolean,   sizePerPageList :std.Array<number> | std.Array<{  text :string,   value :number}>,   withFirstAndLast :boolean,   alwaysShowAllBtns :boolean,   firstPageText :string | react.react.<global>.JSX.Element,   prePageText :string | react.react.<global>.JSX.Element,   nextPageText :string | react.react.<global>.JSX.Element,   lastPageText :string | react.react.<global>.JSX.Element,   nextPageTitle :string,   prePageTitle :string,   firstPageTitle :string,   lastPageTitle :string,   hideSizePerPage :boolean,   hidePageListOnlyOnePage :boolean, pageButtonRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.PageButtonRendererOptions): react.react.<global>.JSX.Element, onPageChange (page : number, sizePerPage : number): void, onSizePerPageChange (page : number, sizePerPage : number): void, pageListRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.PageListRendererOptions): react.react.<global>.JSX.Element, sizePerPageRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.SizePerPageRendererOptions): react.react.<global>.JSX.Element, sizePerPageOptionRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.SizePerPageOptionRendererOptions): react.react.<global>.JSX.Element, paginationTotalRenderer (from : number, to : number, size : number): react.react.<global>.JSX.Element}> */
@js.native
trait PaginationOptions extends js.Object {
  var alwaysShowAllBtns: js.UndefOr[Boolean] = js.native
  var custom: js.UndefOr[Boolean] = js.native
  var firstPageText: js.UndefOr[String | Element] = js.native
  var firstPageTitle: js.UndefOr[String] = js.native
  var hidePageListOnlyOnePage: js.UndefOr[Boolean] = js.native
  var hideSizePerPage: js.UndefOr[Boolean] = js.native
  var lastPageText: js.UndefOr[String | Element] = js.native
  var lastPageTitle: js.UndefOr[String] = js.native
  var nextPageText: js.UndefOr[String | Element] = js.native
  var nextPageTitle: js.UndefOr[String] = js.native
  var onPageChange: js.UndefOr[js.Function2[/* page */ Double, /* sizePerPage */ Double, Unit]] = js.native
  var onSizePerPageChange: js.UndefOr[js.Function2[/* page */ Double, /* sizePerPage */ Double, Unit]] = js.native
  var page: js.UndefOr[Double] = js.native
  var pageButtonRenderer: js.UndefOr[js.Function1[/* options */ PageButtonRendererOptions, Element]] = js.native
  var pageListRenderer: js.UndefOr[js.Function1[/* options */ PageListRendererOptions, Element]] = js.native
  var pageStartIndex: js.UndefOr[Double] = js.native
  var paginationSize: js.UndefOr[Double] = js.native
  var paginationTotalRenderer: js.UndefOr[js.Function3[/* from */ Double, /* to */ Double, /* size */ Double, Element]] = js.native
  var prePageText: js.UndefOr[String | Element] = js.native
  var prePageTitle: js.UndefOr[String] = js.native
  var showTotal: js.UndefOr[Boolean] = js.native
  var sizePerPage: js.UndefOr[Double] = js.native
  var sizePerPageList: js.UndefOr[js.Array[Double | Text]] = js.native
  var sizePerPageOptionRenderer: js.UndefOr[js.Function1[/* options */ SizePerPageOptionRendererOptions, Element]] = js.native
  var sizePerPageRenderer: js.UndefOr[js.Function1[/* options */ SizePerPageRendererOptions, Element]] = js.native
  var totalSize: js.UndefOr[Double] = js.native
  var withFirstAndLast: js.UndefOr[Boolean] = js.native
}

object PaginationOptions {
  @scala.inline
  def apply(): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationOptions]
  }
  @scala.inline
  implicit class PaginationOptionsOps[Self <: PaginationOptions] (val x: Self) extends AnyVal {
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
    def setAlwaysShowAllBtns(value: Boolean): Self = this.set("alwaysShowAllBtns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysShowAllBtns: Self = this.set("alwaysShowAllBtns", js.undefined)
    @scala.inline
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setFirstPageText(value: String | Element): Self = this.set("firstPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageText: Self = this.set("firstPageText", js.undefined)
    @scala.inline
    def setFirstPageTitle(value: String): Self = this.set("firstPageTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPageTitle: Self = this.set("firstPageTitle", js.undefined)
    @scala.inline
    def setHidePageListOnlyOnePage(value: Boolean): Self = this.set("hidePageListOnlyOnePage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePageListOnlyOnePage: Self = this.set("hidePageListOnlyOnePage", js.undefined)
    @scala.inline
    def setHideSizePerPage(value: Boolean): Self = this.set("hideSizePerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSizePerPage: Self = this.set("hideSizePerPage", js.undefined)
    @scala.inline
    def setLastPageText(value: String | Element): Self = this.set("lastPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPageText: Self = this.set("lastPageText", js.undefined)
    @scala.inline
    def setLastPageTitle(value: String): Self = this.set("lastPageTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPageTitle: Self = this.set("lastPageTitle", js.undefined)
    @scala.inline
    def setNextPageText(value: String | Element): Self = this.set("nextPageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageText: Self = this.set("nextPageText", js.undefined)
    @scala.inline
    def setNextPageTitle(value: String): Self = this.set("nextPageTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageTitle: Self = this.set("nextPageTitle", js.undefined)
    @scala.inline
    def setOnPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): Self = this.set("onPageChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    @scala.inline
    def setOnSizePerPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): Self = this.set("onSizePerPageChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSizePerPageChange: Self = this.set("onSizePerPageChange", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPageButtonRenderer(value: /* options */ PageButtonRendererOptions => Element): Self = this.set("pageButtonRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deletePageButtonRenderer: Self = this.set("pageButtonRenderer", js.undefined)
    @scala.inline
    def setPageListRenderer(value: /* options */ PageListRendererOptions => Element): Self = this.set("pageListRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deletePageListRenderer: Self = this.set("pageListRenderer", js.undefined)
    @scala.inline
    def setPageStartIndex(value: Double): Self = this.set("pageStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageStartIndex: Self = this.set("pageStartIndex", js.undefined)
    @scala.inline
    def setPaginationSize(value: Double): Self = this.set("paginationSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationSize: Self = this.set("paginationSize", js.undefined)
    @scala.inline
    def setPaginationTotalRenderer(value: (/* from */ Double, /* to */ Double, /* size */ Double) => Element): Self = this.set("paginationTotalRenderer", js.Any.fromFunction3(value))
    @scala.inline
    def deletePaginationTotalRenderer: Self = this.set("paginationTotalRenderer", js.undefined)
    @scala.inline
    def setPrePageText(value: String | Element): Self = this.set("prePageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrePageText: Self = this.set("prePageText", js.undefined)
    @scala.inline
    def setPrePageTitle(value: String): Self = this.set("prePageTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrePageTitle: Self = this.set("prePageTitle", js.undefined)
    @scala.inline
    def setShowTotal(value: Boolean): Self = this.set("showTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTotal: Self = this.set("showTotal", js.undefined)
    @scala.inline
    def setSizePerPage(value: Double): Self = this.set("sizePerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizePerPage: Self = this.set("sizePerPage", js.undefined)
    @scala.inline
    def setSizePerPageListVarargs(value: (Double | Text)*): Self = this.set("sizePerPageList", js.Array(value :_*))
    @scala.inline
    def setSizePerPageList(value: js.Array[Double | Text]): Self = this.set("sizePerPageList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizePerPageList: Self = this.set("sizePerPageList", js.undefined)
    @scala.inline
    def setSizePerPageOptionRenderer(value: /* options */ SizePerPageOptionRendererOptions => Element): Self = this.set("sizePerPageOptionRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSizePerPageOptionRenderer: Self = this.set("sizePerPageOptionRenderer", js.undefined)
    @scala.inline
    def setSizePerPageRenderer(value: /* options */ SizePerPageRendererOptions => Element): Self = this.set("sizePerPageRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSizePerPageRenderer: Self = this.set("sizePerPageRenderer", js.undefined)
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
    @scala.inline
    def setWithFirstAndLast(value: Boolean): Self = this.set("withFirstAndLast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithFirstAndLast: Self = this.set("withFirstAndLast", js.undefined)
  }
  
}

