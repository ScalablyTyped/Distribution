package typings.primereact

import typings.primereact.anon.Field
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnColumnMod {
  
  @JSImport("primereact/components/column/Column", "Column")
  @js.native
  class Column protected ()
    extends Component[ColumnProps, js.Any, js.Any] {
    def this(props: ColumnProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnProps, context: js.Any) = this()
  }
  
  @js.native
  trait ColumnProps extends StObject {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var bodyClassName: js.UndefOr[String] = js.native
    
    var bodyStyle: js.UndefOr[js.Object] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var columnKey: js.UndefOr[String] = js.native
    
    var editor: js.UndefOr[js.Function1[/* props */ js.Any, js.UndefOr[Element]]] = js.native
    
    var editorValidator: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.native
    
    var editorValidatorEvent: js.UndefOr[String] = js.native
    
    var excludeGlobalFilter: js.UndefOr[Boolean] = js.native
    
    var expander: js.UndefOr[Boolean] = js.native
    
    var exportable: js.UndefOr[Boolean] = js.native
    
    var field: js.UndefOr[String] = js.native
    
    var filter: js.UndefOr[Boolean] = js.native
    
    var filterElement: js.UndefOr[js.Object] = js.native
    
    var filterField: js.UndefOr[String] = js.native
    
    var filterFunction: js.UndefOr[js.Function2[/* value */ js.Any, /* filter */ js.Any, Unit]] = js.native
    
    var filterHeaderClassName: js.UndefOr[String] = js.native
    
    var filterHeaderStyle: js.UndefOr[js.Object] = js.native
    
    var filterMatchMode: js.UndefOr[String] = js.native
    
    var filterMaxLength: js.UndefOr[Double] = js.native
    
    var filterPlaceholder: js.UndefOr[String] = js.native
    
    var filterType: js.UndefOr[String] = js.native
    
    var footer: js.UndefOr[js.Any] = js.native
    
    var footerClassName: js.UndefOr[String] = js.native
    
    var footerStyle: js.UndefOr[js.Object] = js.native
    
    var frozen: js.UndefOr[Boolean] = js.native
    
    var header: js.UndefOr[js.Any] = js.native
    
    var headerClassName: js.UndefOr[String] = js.native
    
    var headerStyle: js.UndefOr[js.Object] = js.native
    
    var loadingBody: js.UndefOr[js.Any] = js.native
    
    var onEditorCancel: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
    
    var onEditorInit: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
    
    var onEditorSubmit: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
    
    var reorderable: js.UndefOr[Boolean] = js.native
    
    var rowEditor: js.UndefOr[Boolean] = js.native
    
    var rowReorder: js.UndefOr[Boolean] = js.native
    
    var rowReorderIcon: js.UndefOr[String] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var selectionMode: js.UndefOr[String] = js.native
    
    var sortField: js.UndefOr[String] = js.native
    
    var sortFunction: js.UndefOr[js.Function1[/* e */ Field, Unit]] = js.native
    
    var sortable: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object ColumnProps {
    
    @scala.inline
    def apply(): ColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnProps]
    }
    
    @scala.inline
    implicit class ColumnPropsMutableBuilder[Self <: ColumnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyClassName(value: String): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
      
      @scala.inline
      def setBodyStyle(value: js.Object): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      @scala.inline
      def setEditor(value: /* props */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "editor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      @scala.inline
      def setEditorValidator(value: /* props */ js.Any => Boolean): Self = StObject.set(x, "editorValidator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditorValidatorEvent(value: String): Self = StObject.set(x, "editorValidatorEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorValidatorEventUndefined: Self = StObject.set(x, "editorValidatorEvent", js.undefined)
      
      @scala.inline
      def setEditorValidatorUndefined: Self = StObject.set(x, "editorValidator", js.undefined)
      
      @scala.inline
      def setExcludeGlobalFilter(value: Boolean): Self = StObject.set(x, "excludeGlobalFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeGlobalFilterUndefined: Self = StObject.set(x, "excludeGlobalFilter", js.undefined)
      
      @scala.inline
      def setExpander(value: Boolean): Self = StObject.set(x, "expander", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanderUndefined: Self = StObject.set(x, "expander", js.undefined)
      
      @scala.inline
      def setExportable(value: Boolean): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterElement(value: js.Object): Self = StObject.set(x, "filterElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterElementUndefined: Self = StObject.set(x, "filterElement", js.undefined)
      
      @scala.inline
      def setFilterField(value: String): Self = StObject.set(x, "filterField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFieldUndefined: Self = StObject.set(x, "filterField", js.undefined)
      
      @scala.inline
      def setFilterFunction(value: (/* value */ js.Any, /* filter */ js.Any) => Unit): Self = StObject.set(x, "filterFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterFunctionUndefined: Self = StObject.set(x, "filterFunction", js.undefined)
      
      @scala.inline
      def setFilterHeaderClassName(value: String): Self = StObject.set(x, "filterHeaderClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterHeaderClassNameUndefined: Self = StObject.set(x, "filterHeaderClassName", js.undefined)
      
      @scala.inline
      def setFilterHeaderStyle(value: js.Object): Self = StObject.set(x, "filterHeaderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterHeaderStyleUndefined: Self = StObject.set(x, "filterHeaderStyle", js.undefined)
      
      @scala.inline
      def setFilterMatchMode(value: String): Self = StObject.set(x, "filterMatchMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterMatchModeUndefined: Self = StObject.set(x, "filterMatchMode", js.undefined)
      
      @scala.inline
      def setFilterMaxLength(value: Double): Self = StObject.set(x, "filterMaxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterMaxLengthUndefined: Self = StObject.set(x, "filterMaxLength", js.undefined)
      
      @scala.inline
      def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      @scala.inline
      def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterClassName(value: String): Self = StObject.set(x, "footerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterClassNameUndefined: Self = StObject.set(x, "footerClassName", js.undefined)
      
      @scala.inline
      def setFooterStyle(value: js.Object): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      @scala.inline
      def setHeaderStyle(value: js.Object): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setLoadingBody(value: js.Any): Self = StObject.set(x, "loadingBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingBodyUndefined: Self = StObject.set(x, "loadingBody", js.undefined)
      
      @scala.inline
      def setOnEditorCancel(value: /* props */ js.Any => Unit): Self = StObject.set(x, "onEditorCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEditorCancelUndefined: Self = StObject.set(x, "onEditorCancel", js.undefined)
      
      @scala.inline
      def setOnEditorInit(value: /* props */ js.Any => Unit): Self = StObject.set(x, "onEditorInit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEditorInitUndefined: Self = StObject.set(x, "onEditorInit", js.undefined)
      
      @scala.inline
      def setOnEditorSubmit(value: /* props */ js.Any => Unit): Self = StObject.set(x, "onEditorSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEditorSubmitUndefined: Self = StObject.set(x, "onEditorSubmit", js.undefined)
      
      @scala.inline
      def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
      
      @scala.inline
      def setRowEditor(value: Boolean): Self = StObject.set(x, "rowEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowEditorUndefined: Self = StObject.set(x, "rowEditor", js.undefined)
      
      @scala.inline
      def setRowReorder(value: Boolean): Self = StObject.set(x, "rowReorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowReorderIcon(value: String): Self = StObject.set(x, "rowReorderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowReorderIconUndefined: Self = StObject.set(x, "rowReorderIcon", js.undefined)
      
      @scala.inline
      def setRowReorderUndefined: Self = StObject.set(x, "rowReorder", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
      
      @scala.inline
      def setSortFunction(value: /* e */ Field => Unit): Self = StObject.set(x, "sortFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
