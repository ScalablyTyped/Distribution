package typings.reactBootstrapTableNext.mod

import typings.react.mod.global.JSX.Element
import typings.reactBootstrapTableNext.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  custom :boolean,   page :number,   sizePerPage :number,   totalSize :number,   pageStartIndex :number,   paginationSize :number,   showTotal :boolean,   sizePerPageList :std.Array<number> | std.Array<{  text :string,   value :number}>,   withFirstAndLast :boolean,   alwaysShowAllBtns :boolean,   firstPageText :string | react.react.<global>.JSX.Element,   prePageText :string | react.react.<global>.JSX.Element,   nextPageText :string | react.react.<global>.JSX.Element,   lastPageText :string | react.react.<global>.JSX.Element,   nextPageTitle :string,   prePageTitle :string,   firstPageTitle :string,   lastPageTitle :string,   hideSizePerPage :boolean,   hidePageListOnlyOnePage :boolean, pageButtonRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.PageButtonRendererOptions): react.react.<global>.JSX.Element, onPageChange (page : number, sizePerPage : number): void, onSizePerPageChange (page : number, sizePerPage : number): void, pageListRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.PageListRendererOptions): react.react.<global>.JSX.Element, sizePerPageRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.SizePerPageRendererOptions): react.react.<global>.JSX.Element, sizePerPageOptionRenderer (options : react-bootstrap-table-next.react-bootstrap-table-next.SizePerPageOptionRendererOptions): react.react.<global>.JSX.Element, paginationTotalRenderer (from : number, to : number, size : number): react.react.<global>.JSX.Element}> */
@js.native
trait PaginationOptions extends StObject {
  
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
  implicit class PaginationOptionsMutableBuilder[Self <: PaginationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysShowAllBtns(value: Boolean): Self = StObject.set(x, "alwaysShowAllBtns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysShowAllBtnsUndefined: Self = StObject.set(x, "alwaysShowAllBtns", js.undefined)
    
    @scala.inline
    def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setFirstPageText(value: String | Element): Self = StObject.set(x, "firstPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageTextUndefined: Self = StObject.set(x, "firstPageText", js.undefined)
    
    @scala.inline
    def setFirstPageTitle(value: String): Self = StObject.set(x, "firstPageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPageTitleUndefined: Self = StObject.set(x, "firstPageTitle", js.undefined)
    
    @scala.inline
    def setHidePageListOnlyOnePage(value: Boolean): Self = StObject.set(x, "hidePageListOnlyOnePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidePageListOnlyOnePageUndefined: Self = StObject.set(x, "hidePageListOnlyOnePage", js.undefined)
    
    @scala.inline
    def setHideSizePerPage(value: Boolean): Self = StObject.set(x, "hideSizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSizePerPageUndefined: Self = StObject.set(x, "hideSizePerPage", js.undefined)
    
    @scala.inline
    def setLastPageText(value: String | Element): Self = StObject.set(x, "lastPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPageTextUndefined: Self = StObject.set(x, "lastPageText", js.undefined)
    
    @scala.inline
    def setLastPageTitle(value: String): Self = StObject.set(x, "lastPageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPageTitleUndefined: Self = StObject.set(x, "lastPageTitle", js.undefined)
    
    @scala.inline
    def setNextPageText(value: String | Element): Self = StObject.set(x, "nextPageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTextUndefined: Self = StObject.set(x, "nextPageText", js.undefined)
    
    @scala.inline
    def setNextPageTitle(value: String): Self = StObject.set(x, "nextPageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTitleUndefined: Self = StObject.set(x, "nextPageTitle", js.undefined)
    
    @scala.inline
    def setOnPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
    
    @scala.inline
    def setOnSizePerPageChange(value: (/* page */ Double, /* sizePerPage */ Double) => Unit): Self = StObject.set(x, "onSizePerPageChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSizePerPageChangeUndefined: Self = StObject.set(x, "onSizePerPageChange", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageButtonRenderer(value: /* options */ PageButtonRendererOptions => Element): Self = StObject.set(x, "pageButtonRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPageButtonRendererUndefined: Self = StObject.set(x, "pageButtonRenderer", js.undefined)
    
    @scala.inline
    def setPageListRenderer(value: /* options */ PageListRendererOptions => Element): Self = StObject.set(x, "pageListRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPageListRendererUndefined: Self = StObject.set(x, "pageListRenderer", js.undefined)
    
    @scala.inline
    def setPageStartIndex(value: Double): Self = StObject.set(x, "pageStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStartIndexUndefined: Self = StObject.set(x, "pageStartIndex", js.undefined)
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPaginationSize(value: Double): Self = StObject.set(x, "paginationSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationSizeUndefined: Self = StObject.set(x, "paginationSize", js.undefined)
    
    @scala.inline
    def setPaginationTotalRenderer(value: (/* from */ Double, /* to */ Double, /* size */ Double) => Element): Self = StObject.set(x, "paginationTotalRenderer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPaginationTotalRendererUndefined: Self = StObject.set(x, "paginationTotalRenderer", js.undefined)
    
    @scala.inline
    def setPrePageText(value: String | Element): Self = StObject.set(x, "prePageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrePageTextUndefined: Self = StObject.set(x, "prePageText", js.undefined)
    
    @scala.inline
    def setPrePageTitle(value: String): Self = StObject.set(x, "prePageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrePageTitleUndefined: Self = StObject.set(x, "prePageTitle", js.undefined)
    
    @scala.inline
    def setShowTotal(value: Boolean): Self = StObject.set(x, "showTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTotalUndefined: Self = StObject.set(x, "showTotal", js.undefined)
    
    @scala.inline
    def setSizePerPage(value: Double): Self = StObject.set(x, "sizePerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPageList(value: js.Array[Double | Text]): Self = StObject.set(x, "sizePerPageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizePerPageListUndefined: Self = StObject.set(x, "sizePerPageList", js.undefined)
    
    @scala.inline
    def setSizePerPageListVarargs(value: (Double | Text)*): Self = StObject.set(x, "sizePerPageList", js.Array(value :_*))
    
    @scala.inline
    def setSizePerPageOptionRenderer(value: /* options */ SizePerPageOptionRendererOptions => Element): Self = StObject.set(x, "sizePerPageOptionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSizePerPageOptionRendererUndefined: Self = StObject.set(x, "sizePerPageOptionRenderer", js.undefined)
    
    @scala.inline
    def setSizePerPageRenderer(value: /* options */ SizePerPageRendererOptions => Element): Self = StObject.set(x, "sizePerPageRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSizePerPageRendererUndefined: Self = StObject.set(x, "sizePerPageRenderer", js.undefined)
    
    @scala.inline
    def setSizePerPageUndefined: Self = StObject.set(x, "sizePerPage", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
    
    @scala.inline
    def setWithFirstAndLast(value: Boolean): Self = StObject.set(x, "withFirstAndLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFirstAndLastUndefined: Self = StObject.set(x, "withFirstAndLast", js.undefined)
  }
}
