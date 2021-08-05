package typings.primereact

import typings.primereact.anon.OriginalEventEvent
import typings.primereact.anon.Rows
import typings.primereact.primereactStrings.grid
import typings.primereact.primereactStrings.list
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataViewMod {
  
  @JSImport("primereact/components/dataview/DataView", "DataView")
  @js.native
  class DataView protected ()
    extends Component[DataViewProps, js.Any, js.Any] {
    def this(props: DataViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DataViewProps, context: js.Any) = this()
  }
  
  @JSImport("primereact/components/dataview/DataView", "DataViewLayoutOptions")
  @js.native
  class DataViewLayoutOptions protected ()
    extends Component[DataViewLayoutOptionsProps, js.Any, js.Any] {
    def this(props: DataViewLayoutOptionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DataViewLayoutOptionsProps, context: js.Any) = this()
  }
  
  trait DataViewLayoutOptionsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[String] = js.undefined
    
    def onChange(e: OriginalEventEvent): Unit
    
    var style: js.UndefOr[String] = js.undefined
  }
  object DataViewLayoutOptionsProps {
    
    inline def apply(onChange: OriginalEventEvent => Unit): DataViewLayoutOptionsProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[DataViewLayoutOptionsProps]
    }
    
    extension [Self <: DataViewLayoutOptionsProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setOnChange(value: OriginalEventEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait DataViewProps extends StObject {
    
    var alwaysShowPaginator: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var currentPageReportTemplate: js.UndefOr[String] = js.undefined
    
    var emptyMessage: js.UndefOr[String] = js.undefined
    
    var first: js.UndefOr[Double] = js.undefined
    
    var footer: js.UndefOr[Element | String] = js.undefined
    
    var header: js.UndefOr[Element | String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var itemTemplate: js.UndefOr[js.Function2[/* item */ js.Any, /* layout */ grid | list, js.UndefOr[Element]]] = js.undefined
    
    var layout: js.UndefOr[String] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var loadingIcon: js.UndefOr[String] = js.undefined
    
    var onPage: js.UndefOr[js.Function1[/* e */ Rows, Unit]] = js.undefined
    
    var pageLinkSize: js.UndefOr[Double] = js.undefined
    
    var paginator: js.UndefOr[Boolean] = js.undefined
    
    var paginatorDropdownAppendTo: js.UndefOr[js.Any] = js.undefined
    
    var paginatorLeft: js.UndefOr[js.Any] = js.undefined
    
    var paginatorPosition: js.UndefOr[String] = js.undefined
    
    var paginatorRight: js.UndefOr[js.Any] = js.undefined
    
    var paginatorTemplate: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
    
    var sortField: js.UndefOr[String] = js.undefined
    
    var sortOrder: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
    
    var totalRecords: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object DataViewProps {
    
    inline def apply(): DataViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataViewProps]
    }
    
    extension [Self <: DataViewProps](x: Self) {
      
      inline def setAlwaysShowPaginator(value: Boolean): Self = StObject.set(x, "alwaysShowPaginator", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowPaginatorUndefined: Self = StObject.set(x, "alwaysShowPaginator", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrentPageReportTemplate(value: String): Self = StObject.set(x, "currentPageReportTemplate", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageReportTemplateUndefined: Self = StObject.set(x, "currentPageReportTemplate", js.undefined)
      
      inline def setEmptyMessage(value: String): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      inline def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setFooter(value: Element | String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: Element | String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemTemplate(value: (/* item */ js.Any, /* layout */ grid | list) => js.UndefOr[Element]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction2(value))
      
      inline def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingIcon(value: String): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      inline def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnPage(value: /* e */ Rows => Unit): Self = StObject.set(x, "onPage", js.Any.fromFunction1(value))
      
      inline def setOnPageUndefined: Self = StObject.set(x, "onPage", js.undefined)
      
      inline def setPageLinkSize(value: Double): Self = StObject.set(x, "pageLinkSize", value.asInstanceOf[js.Any])
      
      inline def setPageLinkSizeUndefined: Self = StObject.set(x, "pageLinkSize", js.undefined)
      
      inline def setPaginator(value: Boolean): Self = StObject.set(x, "paginator", value.asInstanceOf[js.Any])
      
      inline def setPaginatorDropdownAppendTo(value: js.Any): Self = StObject.set(x, "paginatorDropdownAppendTo", value.asInstanceOf[js.Any])
      
      inline def setPaginatorDropdownAppendToUndefined: Self = StObject.set(x, "paginatorDropdownAppendTo", js.undefined)
      
      inline def setPaginatorLeft(value: js.Any): Self = StObject.set(x, "paginatorLeft", value.asInstanceOf[js.Any])
      
      inline def setPaginatorLeftUndefined: Self = StObject.set(x, "paginatorLeft", js.undefined)
      
      inline def setPaginatorPosition(value: String): Self = StObject.set(x, "paginatorPosition", value.asInstanceOf[js.Any])
      
      inline def setPaginatorPositionUndefined: Self = StObject.set(x, "paginatorPosition", js.undefined)
      
      inline def setPaginatorRight(value: js.Any): Self = StObject.set(x, "paginatorRight", value.asInstanceOf[js.Any])
      
      inline def setPaginatorRightUndefined: Self = StObject.set(x, "paginatorRight", js.undefined)
      
      inline def setPaginatorTemplate(value: String): Self = StObject.set(x, "paginatorTemplate", value.asInstanceOf[js.Any])
      
      inline def setPaginatorTemplateUndefined: Self = StObject.set(x, "paginatorTemplate", js.undefined)
      
      inline def setPaginatorUndefined: Self = StObject.set(x, "paginator", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsPerPageOptions(value: js.Array[Double]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
      
      inline def setRowsPerPageOptionsUndefined: Self = StObject.set(x, "rowsPerPageOptions", js.undefined)
      
      inline def setRowsPerPageOptionsVarargs(value: Double*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value :_*))
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
      
      inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
      
      inline def setSortOrder(value: Double): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      inline def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
      
      inline def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
