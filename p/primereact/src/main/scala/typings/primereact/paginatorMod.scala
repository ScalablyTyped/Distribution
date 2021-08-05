package typings.primereact

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginatorMod {
  
  @JSImport("primereact/components/paginator/Paginator", "Paginator")
  @js.native
  class Paginator protected ()
    extends Component[PaginatorProps, js.Any, js.Any] {
    def this(props: PaginatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaginatorProps, context: js.Any) = this()
  }
  
  trait PageState extends StObject {
    
    var first: Double
    
    var page: Double
    
    var pageCount: Double
    
    var rows: Double
  }
  object PageState {
    
    inline def apply(first: Double, page: Double, pageCount: Double, rows: Double): PageState = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageCount = pageCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageState]
    }
    
    extension [Self <: PageState](x: Self) {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginatorProps extends StObject {
    
    var alwaysShow: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var currentPageReportTemplate: js.UndefOr[String] = js.undefined
    
    var dropdownAppendTo: js.UndefOr[js.Any] = js.undefined
    
    var first: js.UndefOr[Double] = js.undefined
    
    var leftContent: js.UndefOr[Element] = js.undefined
    
    var onPageChange: js.UndefOr[js.Function1[/* event */ PageState, Unit]] = js.undefined
    
    var pageLinkSize: js.UndefOr[Double] = js.undefined
    
    var rightContent: js.UndefOr[Element] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var rowsPerPageOptions: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var totalRecords: js.UndefOr[Double] = js.undefined
  }
  object PaginatorProps {
    
    inline def apply(): PaginatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginatorProps]
    }
    
    extension [Self <: PaginatorProps](x: Self) {
      
      inline def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowUndefined: Self = StObject.set(x, "alwaysShow", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrentPageReportTemplate(value: String): Self = StObject.set(x, "currentPageReportTemplate", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageReportTemplateUndefined: Self = StObject.set(x, "currentPageReportTemplate", js.undefined)
      
      inline def setDropdownAppendTo(value: js.Any): Self = StObject.set(x, "dropdownAppendTo", value.asInstanceOf[js.Any])
      
      inline def setDropdownAppendToUndefined: Self = StObject.set(x, "dropdownAppendTo", js.undefined)
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setLeftContent(value: Element): Self = StObject.set(x, "leftContent", value.asInstanceOf[js.Any])
      
      inline def setLeftContentUndefined: Self = StObject.set(x, "leftContent", js.undefined)
      
      inline def setOnPageChange(value: /* event */ PageState => Unit): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      inline def setPageLinkSize(value: Double): Self = StObject.set(x, "pageLinkSize", value.asInstanceOf[js.Any])
      
      inline def setPageLinkSizeUndefined: Self = StObject.set(x, "pageLinkSize", js.undefined)
      
      inline def setRightContent(value: Element): Self = StObject.set(x, "rightContent", value.asInstanceOf[js.Any])
      
      inline def setRightContentUndefined: Self = StObject.set(x, "rightContent", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsPerPageOptions(value: js.Array[js.Any]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
      
      inline def setRowsPerPageOptionsUndefined: Self = StObject.set(x, "rowsPerPageOptions", js.undefined)
      
      inline def setRowsPerPageOptionsVarargs(value: js.Any*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value :_*))
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      inline def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
    }
  }
}
