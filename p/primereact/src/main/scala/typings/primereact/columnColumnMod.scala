package typings.primereact

import typings.primereact.anon.Field
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait ColumnProps extends StObject {
    
    var body: js.UndefOr[js.Any] = js.undefined
    
    var bodyClassName: js.UndefOr[String] = js.undefined
    
    var bodyStyle: js.UndefOr[js.Object] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var columnKey: js.UndefOr[String] = js.undefined
    
    var editor: js.UndefOr[js.Function1[/* props */ js.Any, js.UndefOr[Element]]] = js.undefined
    
    var editorValidator: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.undefined
    
    var editorValidatorEvent: js.UndefOr[String] = js.undefined
    
    var excludeGlobalFilter: js.UndefOr[Boolean] = js.undefined
    
    var expander: js.UndefOr[Boolean] = js.undefined
    
    var exportable: js.UndefOr[Boolean] = js.undefined
    
    var field: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[Boolean] = js.undefined
    
    var filterElement: js.UndefOr[js.Object] = js.undefined
    
    var filterField: js.UndefOr[String] = js.undefined
    
    var filterFunction: js.UndefOr[js.Function2[/* value */ js.Any, /* filter */ js.Any, Unit]] = js.undefined
    
    var filterHeaderClassName: js.UndefOr[String] = js.undefined
    
    var filterHeaderStyle: js.UndefOr[js.Object] = js.undefined
    
    var filterMatchMode: js.UndefOr[String] = js.undefined
    
    var filterMaxLength: js.UndefOr[Double] = js.undefined
    
    var filterPlaceholder: js.UndefOr[String] = js.undefined
    
    var filterType: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[js.Any] = js.undefined
    
    var footerClassName: js.UndefOr[String] = js.undefined
    
    var footerStyle: js.UndefOr[js.Object] = js.undefined
    
    var frozen: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[js.Any] = js.undefined
    
    var headerClassName: js.UndefOr[String] = js.undefined
    
    var headerStyle: js.UndefOr[js.Object] = js.undefined
    
    var loadingBody: js.UndefOr[js.Any] = js.undefined
    
    var onEditorCancel: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.undefined
    
    var onEditorInit: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.undefined
    
    var onEditorSubmit: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.undefined
    
    var reorderable: js.UndefOr[Boolean] = js.undefined
    
    var rowEditor: js.UndefOr[Boolean] = js.undefined
    
    var rowReorder: js.UndefOr[Boolean] = js.undefined
    
    var rowReorderIcon: js.UndefOr[String] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var selectionMode: js.UndefOr[String] = js.undefined
    
    var sortField: js.UndefOr[String] = js.undefined
    
    var sortFunction: js.UndefOr[js.Function1[/* e */ Field, Unit]] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object ColumnProps {
    
    inline def apply(): ColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnProps]
    }
    
    extension [Self <: ColumnProps](x: Self) {
      
      inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyClassName(value: String): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
      
      inline def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
      
      inline def setBodyStyle(value: js.Object): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      inline def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
      
      inline def setEditor(value: /* props */ js.Any => js.UndefOr[Element]): Self = StObject.set(x, "editor", js.Any.fromFunction1(value))
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def setEditorValidator(value: /* props */ js.Any => Boolean): Self = StObject.set(x, "editorValidator", js.Any.fromFunction1(value))
      
      inline def setEditorValidatorEvent(value: String): Self = StObject.set(x, "editorValidatorEvent", value.asInstanceOf[js.Any])
      
      inline def setEditorValidatorEventUndefined: Self = StObject.set(x, "editorValidatorEvent", js.undefined)
      
      inline def setEditorValidatorUndefined: Self = StObject.set(x, "editorValidator", js.undefined)
      
      inline def setExcludeGlobalFilter(value: Boolean): Self = StObject.set(x, "excludeGlobalFilter", value.asInstanceOf[js.Any])
      
      inline def setExcludeGlobalFilterUndefined: Self = StObject.set(x, "excludeGlobalFilter", js.undefined)
      
      inline def setExpander(value: Boolean): Self = StObject.set(x, "expander", value.asInstanceOf[js.Any])
      
      inline def setExpanderUndefined: Self = StObject.set(x, "expander", js.undefined)
      
      inline def setExportable(value: Boolean): Self = StObject.set(x, "exportable", value.asInstanceOf[js.Any])
      
      inline def setExportableUndefined: Self = StObject.set(x, "exportable", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterElement(value: js.Object): Self = StObject.set(x, "filterElement", value.asInstanceOf[js.Any])
      
      inline def setFilterElementUndefined: Self = StObject.set(x, "filterElement", js.undefined)
      
      inline def setFilterField(value: String): Self = StObject.set(x, "filterField", value.asInstanceOf[js.Any])
      
      inline def setFilterFieldUndefined: Self = StObject.set(x, "filterField", js.undefined)
      
      inline def setFilterFunction(value: (/* value */ js.Any, /* filter */ js.Any) => Unit): Self = StObject.set(x, "filterFunction", js.Any.fromFunction2(value))
      
      inline def setFilterFunctionUndefined: Self = StObject.set(x, "filterFunction", js.undefined)
      
      inline def setFilterHeaderClassName(value: String): Self = StObject.set(x, "filterHeaderClassName", value.asInstanceOf[js.Any])
      
      inline def setFilterHeaderClassNameUndefined: Self = StObject.set(x, "filterHeaderClassName", js.undefined)
      
      inline def setFilterHeaderStyle(value: js.Object): Self = StObject.set(x, "filterHeaderStyle", value.asInstanceOf[js.Any])
      
      inline def setFilterHeaderStyleUndefined: Self = StObject.set(x, "filterHeaderStyle", js.undefined)
      
      inline def setFilterMatchMode(value: String): Self = StObject.set(x, "filterMatchMode", value.asInstanceOf[js.Any])
      
      inline def setFilterMatchModeUndefined: Self = StObject.set(x, "filterMatchMode", js.undefined)
      
      inline def setFilterMaxLength(value: Double): Self = StObject.set(x, "filterMaxLength", value.asInstanceOf[js.Any])
      
      inline def setFilterMaxLengthUndefined: Self = StObject.set(x, "filterMaxLength", js.undefined)
      
      inline def setFilterPlaceholder(value: String): Self = StObject.set(x, "filterPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFilterPlaceholderUndefined: Self = StObject.set(x, "filterPlaceholder", js.undefined)
      
      inline def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFooter(value: js.Any): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterClassName(value: String): Self = StObject.set(x, "footerClassName", value.asInstanceOf[js.Any])
      
      inline def setFooterClassNameUndefined: Self = StObject.set(x, "footerClassName", js.undefined)
      
      inline def setFooterStyle(value: js.Object): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
      
      inline def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      inline def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
      
      inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassName(value: String): Self = StObject.set(x, "headerClassName", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassNameUndefined: Self = StObject.set(x, "headerClassName", js.undefined)
      
      inline def setHeaderStyle(value: js.Object): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLoadingBody(value: js.Any): Self = StObject.set(x, "loadingBody", value.asInstanceOf[js.Any])
      
      inline def setLoadingBodyUndefined: Self = StObject.set(x, "loadingBody", js.undefined)
      
      inline def setOnEditorCancel(value: /* props */ js.Any => Unit): Self = StObject.set(x, "onEditorCancel", js.Any.fromFunction1(value))
      
      inline def setOnEditorCancelUndefined: Self = StObject.set(x, "onEditorCancel", js.undefined)
      
      inline def setOnEditorInit(value: /* props */ js.Any => Unit): Self = StObject.set(x, "onEditorInit", js.Any.fromFunction1(value))
      
      inline def setOnEditorInitUndefined: Self = StObject.set(x, "onEditorInit", js.undefined)
      
      inline def setOnEditorSubmit(value: /* props */ js.Any => Unit): Self = StObject.set(x, "onEditorSubmit", js.Any.fromFunction1(value))
      
      inline def setOnEditorSubmitUndefined: Self = StObject.set(x, "onEditorSubmit", js.undefined)
      
      inline def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
      
      inline def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
      
      inline def setRowEditor(value: Boolean): Self = StObject.set(x, "rowEditor", value.asInstanceOf[js.Any])
      
      inline def setRowEditorUndefined: Self = StObject.set(x, "rowEditor", js.undefined)
      
      inline def setRowReorder(value: Boolean): Self = StObject.set(x, "rowReorder", value.asInstanceOf[js.Any])
      
      inline def setRowReorderIcon(value: String): Self = StObject.set(x, "rowReorderIcon", value.asInstanceOf[js.Any])
      
      inline def setRowReorderIconUndefined: Self = StObject.set(x, "rowReorderIcon", js.undefined)
      
      inline def setRowReorderUndefined: Self = StObject.set(x, "rowReorder", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
      
      inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
      
      inline def setSortFunction(value: /* e */ Field => Unit): Self = StObject.set(x, "sortFunction", js.Any.fromFunction1(value))
      
      inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
