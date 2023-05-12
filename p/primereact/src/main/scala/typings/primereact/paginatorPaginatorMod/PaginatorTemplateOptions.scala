package typings.primereact.paginatorPaginatorMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom paginator template options
  */
trait PaginatorTemplateOptions extends StObject {
  
  /**
    * The current page report component.
    */
  var CurrentPageReport: js.UndefOr[
    ReactNode | (js.Function1[/* options */ PaginatorCurrentPageReportOptions, ReactNode])
  ] = js.undefined
  
  /**
    * The first page link component.
    */
  var FirstPageLink: js.UndefOr[
    ReactNode | (js.Function1[/* options */ PaginatorFirstPageLinkOptions, ReactNode])
  ] = js.undefined
  
  /**
    * The jump to page input component.
    */
  var JumpToPageInput: js.UndefOr[
    ReactNode | (js.Function1[/* options */ PaginatorJumpToPageInputOptions, ReactNode])
  ] = js.undefined
  
  /**
    * The last page link component.
    */
  var LastPageLink: js.UndefOr[
    ReactNode | (js.Function1[/* options */ PaginatorLastPageLinkOptions, ReactNode])
  ] = js.undefined
  
  /**
    * The next page link component.
    */
  var NextPageLink: js.UndefOr[
    ReactNode | (js.Function1[/* options */ PaginatorNextPageLinkOptions, ReactNode])
  ] = js.undefined
  
  /**
    * The page links component.
    */
  var PageLinks: js.UndefOr[ReactNode | (js.Function1[/* options */ PaginatorPageLinksOptions, ReactNode])] = js.undefined
  
  /**
    * The prev page link component.
    */
  var PrevPageLink: js.UndefOr[
    ReactNode | (js.Function1[/* options */ PaginatorPrevPageLinkOptions, ReactNode])
  ] = js.undefined
  
  /**
    * The rows per page dropdown component.
    */
  var RowsPerPageDropdown: js.UndefOr[
    ReactNode | (js.Function1[/* options */ PaginatorRowsPerPageDropdownOptions, ReactNode])
  ] = js.undefined
  
  /**
    * The layout of the paginator.
    */
  var layout: js.UndefOr[String] = js.undefined
}
object PaginatorTemplateOptions {
  
  inline def apply(): PaginatorTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginatorTemplateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginatorTemplateOptions] (val x: Self) extends AnyVal {
    
    inline def setCurrentPageReport(value: ReactNode | (js.Function1[/* options */ PaginatorCurrentPageReportOptions, ReactNode])): Self = StObject.set(x, "CurrentPageReport", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageReportFunction1(value: /* options */ PaginatorCurrentPageReportOptions => ReactNode): Self = StObject.set(x, "CurrentPageReport", js.Any.fromFunction1(value))
    
    inline def setCurrentPageReportUndefined: Self = StObject.set(x, "CurrentPageReport", js.undefined)
    
    inline def setFirstPageLink(value: ReactNode | (js.Function1[/* options */ PaginatorFirstPageLinkOptions, ReactNode])): Self = StObject.set(x, "FirstPageLink", value.asInstanceOf[js.Any])
    
    inline def setFirstPageLinkFunction1(value: /* options */ PaginatorFirstPageLinkOptions => ReactNode): Self = StObject.set(x, "FirstPageLink", js.Any.fromFunction1(value))
    
    inline def setFirstPageLinkUndefined: Self = StObject.set(x, "FirstPageLink", js.undefined)
    
    inline def setJumpToPageInput(value: ReactNode | (js.Function1[/* options */ PaginatorJumpToPageInputOptions, ReactNode])): Self = StObject.set(x, "JumpToPageInput", value.asInstanceOf[js.Any])
    
    inline def setJumpToPageInputFunction1(value: /* options */ PaginatorJumpToPageInputOptions => ReactNode): Self = StObject.set(x, "JumpToPageInput", js.Any.fromFunction1(value))
    
    inline def setJumpToPageInputUndefined: Self = StObject.set(x, "JumpToPageInput", js.undefined)
    
    inline def setLastPageLink(value: ReactNode | (js.Function1[/* options */ PaginatorLastPageLinkOptions, ReactNode])): Self = StObject.set(x, "LastPageLink", value.asInstanceOf[js.Any])
    
    inline def setLastPageLinkFunction1(value: /* options */ PaginatorLastPageLinkOptions => ReactNode): Self = StObject.set(x, "LastPageLink", js.Any.fromFunction1(value))
    
    inline def setLastPageLinkUndefined: Self = StObject.set(x, "LastPageLink", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setNextPageLink(value: ReactNode | (js.Function1[/* options */ PaginatorNextPageLinkOptions, ReactNode])): Self = StObject.set(x, "NextPageLink", value.asInstanceOf[js.Any])
    
    inline def setNextPageLinkFunction1(value: /* options */ PaginatorNextPageLinkOptions => ReactNode): Self = StObject.set(x, "NextPageLink", js.Any.fromFunction1(value))
    
    inline def setNextPageLinkUndefined: Self = StObject.set(x, "NextPageLink", js.undefined)
    
    inline def setPageLinks(value: ReactNode | (js.Function1[/* options */ PaginatorPageLinksOptions, ReactNode])): Self = StObject.set(x, "PageLinks", value.asInstanceOf[js.Any])
    
    inline def setPageLinksFunction1(value: /* options */ PaginatorPageLinksOptions => ReactNode): Self = StObject.set(x, "PageLinks", js.Any.fromFunction1(value))
    
    inline def setPageLinksUndefined: Self = StObject.set(x, "PageLinks", js.undefined)
    
    inline def setPrevPageLink(value: ReactNode | (js.Function1[/* options */ PaginatorPrevPageLinkOptions, ReactNode])): Self = StObject.set(x, "PrevPageLink", value.asInstanceOf[js.Any])
    
    inline def setPrevPageLinkFunction1(value: /* options */ PaginatorPrevPageLinkOptions => ReactNode): Self = StObject.set(x, "PrevPageLink", js.Any.fromFunction1(value))
    
    inline def setPrevPageLinkUndefined: Self = StObject.set(x, "PrevPageLink", js.undefined)
    
    inline def setRowsPerPageDropdown(value: ReactNode | (js.Function1[/* options */ PaginatorRowsPerPageDropdownOptions, ReactNode])): Self = StObject.set(x, "RowsPerPageDropdown", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageDropdownFunction1(value: /* options */ PaginatorRowsPerPageDropdownOptions => ReactNode): Self = StObject.set(x, "RowsPerPageDropdown", js.Any.fromFunction1(value))
    
    inline def setRowsPerPageDropdownUndefined: Self = StObject.set(x, "RowsPerPageDropdown", js.undefined)
  }
}
