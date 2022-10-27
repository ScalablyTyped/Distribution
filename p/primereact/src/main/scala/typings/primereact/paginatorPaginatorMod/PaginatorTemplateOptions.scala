package typings.primereact.paginatorPaginatorMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatorTemplateOptions extends StObject {
  
  var CurrentPageReport: js.UndefOr[PaginatorCurrentPageReportType] = js.undefined
  
  var FirstPageLink: js.UndefOr[PaginatorFirstPageLinkType] = js.undefined
  
  var JumpToPageInput: js.UndefOr[PaginatorJumpToPageInputType] = js.undefined
  
  var LastPageLink: js.UndefOr[PaginatorLastPageLinkType] = js.undefined
  
  var NextPageLink: js.UndefOr[PaginatorNextPageLinkType] = js.undefined
  
  var PageLinks: js.UndefOr[PaginatorPageLinksType] = js.undefined
  
  var PrevPageLink: js.UndefOr[PaginatorPrevPageLinkType] = js.undefined
  
  var RowsPerPageDropdown: js.UndefOr[PaginatorRowsPerPageDropdownType] = js.undefined
  
  var layout: js.UndefOr[String] = js.undefined
}
object PaginatorTemplateOptions {
  
  inline def apply(): PaginatorTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginatorTemplateOptions]
  }
  
  extension [Self <: PaginatorTemplateOptions](x: Self) {
    
    inline def setCurrentPageReport(value: PaginatorCurrentPageReportType): Self = StObject.set(x, "CurrentPageReport", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageReportFunction1(value: /* options */ PaginatorCurrentPageReportOptions => ReactNode): Self = StObject.set(x, "CurrentPageReport", js.Any.fromFunction1(value))
    
    inline def setCurrentPageReportUndefined: Self = StObject.set(x, "CurrentPageReport", js.undefined)
    
    inline def setFirstPageLink(value: PaginatorFirstPageLinkType): Self = StObject.set(x, "FirstPageLink", value.asInstanceOf[js.Any])
    
    inline def setFirstPageLinkFunction1(value: /* options */ PaginatorFirstPageLinkOptions => ReactNode): Self = StObject.set(x, "FirstPageLink", js.Any.fromFunction1(value))
    
    inline def setFirstPageLinkUndefined: Self = StObject.set(x, "FirstPageLink", js.undefined)
    
    inline def setJumpToPageInput(value: PaginatorJumpToPageInputType): Self = StObject.set(x, "JumpToPageInput", value.asInstanceOf[js.Any])
    
    inline def setJumpToPageInputFunction1(value: /* options */ PaginatorJumpToPageInputOptions => ReactNode): Self = StObject.set(x, "JumpToPageInput", js.Any.fromFunction1(value))
    
    inline def setJumpToPageInputUndefined: Self = StObject.set(x, "JumpToPageInput", js.undefined)
    
    inline def setLastPageLink(value: PaginatorLastPageLinkType): Self = StObject.set(x, "LastPageLink", value.asInstanceOf[js.Any])
    
    inline def setLastPageLinkFunction1(value: /* options */ PaginatorLastPageLinkOptions => ReactNode): Self = StObject.set(x, "LastPageLink", js.Any.fromFunction1(value))
    
    inline def setLastPageLinkUndefined: Self = StObject.set(x, "LastPageLink", js.undefined)
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setNextPageLink(value: PaginatorNextPageLinkType): Self = StObject.set(x, "NextPageLink", value.asInstanceOf[js.Any])
    
    inline def setNextPageLinkFunction1(value: /* options */ PaginatorNextPageLinkOptions => ReactNode): Self = StObject.set(x, "NextPageLink", js.Any.fromFunction1(value))
    
    inline def setNextPageLinkUndefined: Self = StObject.set(x, "NextPageLink", js.undefined)
    
    inline def setPageLinks(value: PaginatorPageLinksType): Self = StObject.set(x, "PageLinks", value.asInstanceOf[js.Any])
    
    inline def setPageLinksFunction1(value: /* options */ PaginatorPageLinksOptions => ReactNode): Self = StObject.set(x, "PageLinks", js.Any.fromFunction1(value))
    
    inline def setPageLinksUndefined: Self = StObject.set(x, "PageLinks", js.undefined)
    
    inline def setPrevPageLink(value: PaginatorPrevPageLinkType): Self = StObject.set(x, "PrevPageLink", value.asInstanceOf[js.Any])
    
    inline def setPrevPageLinkFunction1(value: /* options */ PaginatorPrevPageLinkOptions => ReactNode): Self = StObject.set(x, "PrevPageLink", js.Any.fromFunction1(value))
    
    inline def setPrevPageLinkUndefined: Self = StObject.set(x, "PrevPageLink", js.undefined)
    
    inline def setRowsPerPageDropdown(value: PaginatorRowsPerPageDropdownType): Self = StObject.set(x, "RowsPerPageDropdown", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageDropdownFunction1(value: /* options */ PaginatorRowsPerPageDropdownOptions => ReactNode): Self = StObject.set(x, "RowsPerPageDropdown", js.Any.fromFunction1(value))
    
    inline def setRowsPerPageDropdownUndefined: Self = StObject.set(x, "RowsPerPageDropdown", js.undefined)
  }
}
