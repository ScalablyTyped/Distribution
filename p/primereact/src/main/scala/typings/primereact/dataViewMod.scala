package typings.primereact

import typings.primereact.anon.OriginalEventEvent
import typings.primereact.anon.Rows
import typings.primereact.primereactStrings.grid
import typings.primereact.primereactStrings.list
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait DataViewLayoutOptionsProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var layout: js.UndefOr[String] = js.native
    
    def onChange(e: OriginalEventEvent): Unit = js.native
    
    var style: js.UndefOr[String] = js.native
  }
  object DataViewLayoutOptionsProps {
    
    @scala.inline
    def apply(onChange: OriginalEventEvent => Unit): DataViewLayoutOptionsProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[DataViewLayoutOptionsProps]
    }
    
    @scala.inline
    implicit class DataViewLayoutOptionsPropsMutableBuilder[Self <: DataViewLayoutOptionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setOnChange(value: OriginalEventEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DataViewProps extends StObject {
    
    var alwaysShowPaginator: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var currentPageReportTemplate: js.UndefOr[String] = js.native
    
    var emptyMessage: js.UndefOr[String] = js.native
    
    var first: js.UndefOr[Double] = js.native
    
    var footer: js.UndefOr[Element | String] = js.native
    
    var header: js.UndefOr[Element | String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var itemTemplate: js.UndefOr[js.Function2[/* item */ js.Any, /* layout */ grid | list, js.UndefOr[Element]]] = js.native
    
    var layout: js.UndefOr[String] = js.native
    
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var loadingIcon: js.UndefOr[String] = js.native
    
    var onPage: js.UndefOr[js.Function1[/* e */ Rows, Unit]] = js.native
    
    var pageLinkSize: js.UndefOr[Double] = js.native
    
    var paginator: js.UndefOr[Boolean] = js.native
    
    var paginatorDropdownAppendTo: js.UndefOr[js.Any] = js.native
    
    var paginatorLeft: js.UndefOr[js.Any] = js.native
    
    var paginatorPosition: js.UndefOr[String] = js.native
    
    var paginatorRight: js.UndefOr[js.Any] = js.native
    
    var paginatorTemplate: js.UndefOr[String] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.native
    
    var sortField: js.UndefOr[String] = js.native
    
    var sortOrder: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[String] = js.native
    
    var totalRecords: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[js.Array[_]] = js.native
  }
  object DataViewProps {
    
    @scala.inline
    def apply(): DataViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataViewProps]
    }
    
    @scala.inline
    implicit class DataViewPropsMutableBuilder[Self <: DataViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowPaginator(value: Boolean): Self = StObject.set(x, "alwaysShowPaginator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowPaginatorUndefined: Self = StObject.set(x, "alwaysShowPaginator", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCurrentPageReportTemplate(value: String): Self = StObject.set(x, "currentPageReportTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageReportTemplateUndefined: Self = StObject.set(x, "currentPageReportTemplate", js.undefined)
      
      @scala.inline
      def setEmptyMessage(value: String): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      @scala.inline
      def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setFooter(value: Element | String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: Element | String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: (/* item */ js.Any, /* layout */ grid | list) => js.UndefOr[Element]): Self = StObject.set(x, "itemTemplate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIcon(value: String): Self = StObject.set(x, "loadingIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnPage(value: /* e */ Rows => Unit): Self = StObject.set(x, "onPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageUndefined: Self = StObject.set(x, "onPage", js.undefined)
      
      @scala.inline
      def setPageLinkSize(value: Double): Self = StObject.set(x, "pageLinkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageLinkSizeUndefined: Self = StObject.set(x, "pageLinkSize", js.undefined)
      
      @scala.inline
      def setPaginator(value: Boolean): Self = StObject.set(x, "paginator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorDropdownAppendTo(value: js.Any): Self = StObject.set(x, "paginatorDropdownAppendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorDropdownAppendToUndefined: Self = StObject.set(x, "paginatorDropdownAppendTo", js.undefined)
      
      @scala.inline
      def setPaginatorLeft(value: js.Any): Self = StObject.set(x, "paginatorLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorLeftUndefined: Self = StObject.set(x, "paginatorLeft", js.undefined)
      
      @scala.inline
      def setPaginatorPosition(value: String): Self = StObject.set(x, "paginatorPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorPositionUndefined: Self = StObject.set(x, "paginatorPosition", js.undefined)
      
      @scala.inline
      def setPaginatorRight(value: js.Any): Self = StObject.set(x, "paginatorRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorRightUndefined: Self = StObject.set(x, "paginatorRight", js.undefined)
      
      @scala.inline
      def setPaginatorTemplate(value: String): Self = StObject.set(x, "paginatorTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginatorTemplateUndefined: Self = StObject.set(x, "paginatorTemplate", js.undefined)
      
      @scala.inline
      def setPaginatorUndefined: Self = StObject.set(x, "paginator", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsPerPageOptions(value: js.Array[Double]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsPerPageOptionsUndefined: Self = StObject.set(x, "rowsPerPageOptions", js.undefined)
      
      @scala.inline
      def setRowsPerPageOptionsVarargs(value: Double*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value :_*))
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
      
      @scala.inline
      def setSortOrder(value: Double): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTotalRecords(value: Double): Self = StObject.set(x, "totalRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalRecordsUndefined: Self = StObject.set(x, "totalRecords", js.undefined)
      
      @scala.inline
      def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
