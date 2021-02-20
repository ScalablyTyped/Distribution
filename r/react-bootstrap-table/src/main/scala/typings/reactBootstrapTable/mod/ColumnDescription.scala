package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDescription[TRow /* <: js.Object */] extends StObject {
  
  /**
    * Column text alignment setting
    * Comes from TableHeader.dataAlign property.
    */
  var align: DataAlignType = js.native
  
  /**
    * Custom attributes (e.g. {'data-attr': 'test'}) to be applied to cells in this column.
    * Comes from TableHeader.tdAttr property.
    */
  var attrs: CustomAttrs = js.native
  
  /**
    * Custom className setting for this column.
    * Comes from TableHeader.columnClassName property.
    */
  var className: String | (js.Function4[
    /* cell */ js.Any, 
    /* row */ TRow, 
    /* rowIndex */ Double, 
    /* columnIndex */ Double, 
    String
  ]) = js.native
  
  /**
    * Custom title to display for this column.
    * Comes from TableHeader.columnTitle property.
    */
  var columnTitle: Boolean = js.native
  
  /**
    * Custom editor settings to use when editing the data in this column.
    * Comes from TableHeader.customEditor property.
    */
  var customEditor: CustomEditor[TRow, _] = js.native
  
  /**
    * Custom attributes (e.g. {'data-attr': 'test'}) to use for cells that are being edited in this column.
    * Comes from TableHeader.editTdAttr property.
    */
  var editAttrs: CustomAttrs = js.native
  
  /**
    * Custom className setting for this column when a cell in the column is being edited.
    * Comes from TableHeader.editColumnClassName property.
    */
  var editClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String]) = js.native
  
  /**
    * Setting for whether the data in this column can be edited.
    * Comes from TableHeader.editable property.
    */
  var editable: Boolean | (Editable[TRow, _]) | (js.Function4[
    /* cell */ js.Any, 
    /* row */ TRow, 
    /* rowIndex */ Double, 
    /* columnIndex */ Double, 
    Boolean | String | EditValidatorObject
  ]) = js.native
  
  /**
    * Flag to indicate whether this column is expandable.
    * Comes from TableHeader.expandable property.
    */
  var expandable: Boolean = js.native
  
  /**
    * Flag to indicate whether this column should be included in a CSV export.
    * Comes from TableHeader.export property.
    */
  var export: Boolean = js.native
  
  /**
    * Whether data should be filtered based on the formatted value, or the raw data value.
    * Comes from TableHeader.filterFormatted property.
    */
  var filterFormatted: Boolean = js.native
  
  /**
    * Filter function for the column.
    * Comes from TableHeader.filterValue property.
    */
  def filterValue(cell: js.Any, row: TRow): js.Any = js.native
  
  /**
    * Column data format function.
    * Comes from TableHeader.dataFormat property.
    */
  def format(cell: js.Any, row: TRow, formatExtraData: js.Any, rowIndex: Double): String | ReactElement = js.native
  
  /**
    * The formatExtraData setting for the column.
    * Comes from TableHeader.formatExtraData property.
    */
  var formatExtraData: js.Any = js.native
  
  /**
    * Flag to indicate whether this column should be visible or not.
    * Comes from TableHeader.hidden property.
    */
  var hidden: Boolean = js.native
  
  /**
    * Flag to indicate whether this column should be hidden on the insert modal.
    * Comes from TableHeader.hiddenOnInsert property.
    */
  var hiddenOnInsert: Boolean = js.native
  
  /**
    * Custom className setting for this column when a cell in the column contains invalid data.
    * Comes from TableHeader.invalidEditColumnClassName property.
    */
  var invalidEditColumnClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String]) = js.native
  
  /**
    * Name of the column.
    * Comes from TableHeader.dataField property.
    */
  var name: /* keyof TRow */ String = js.native
  
  /**
    * Flag to indicate whether the data in this column should be included in a search.
    * Comes from TableHeader.searchable property.
    */
  var searchable: Boolean = js.native
  
  /**
    * Column sorting setting. If true, the column can be used to sort the data.
    * Comes from TableHeader.dataSort property.
    */
  var sort: Boolean = js.native
  
  /**
    * Custom sort function to use for this column.
    * Comes from TableHeader.sortFunc property.
    */
  def sortFunc(a: TRow, b: TRow, order: SortOrder, sortField: /* keyof TRow */ String, extraData: js.Any): Double = js.native
  
  /**
    * Extra data to be provided to the search function for this column.
    * Comes from TableHeader.sortFuncExtraData property.
    */
  var sortFuncExtraData: js.Any = js.native
  
  /**
    * CSS style properties to use for cells in this column.
    * Comes from TableHeader.tdStyle property.
    */
  var style: CSSProperties = js.native
  
  /**
    * Custom header value/component/children to use for this column.
    * Comes from TableHeader.headerText || TableHeader.children properties.
    */
  var text: String | Double | Boolean | ReactElement = js.native
  
  /**
    * Width setting for this column.
    * Comes from TableHeader.width property.
    */
  var width: String = js.native
}
object ColumnDescription {
  
  @scala.inline
  def apply[TRow /* <: js.Object */](
    align: DataAlignType,
    attrs: CustomAttrs,
    className: String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ TRow, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ]),
    columnTitle: Boolean,
    customEditor: CustomEditor[TRow, _],
    editAttrs: CustomAttrs,
    editClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String]),
    editable: Boolean | (Editable[TRow, _]) | (js.Function4[
      /* cell */ js.Any, 
      /* row */ TRow, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      Boolean | String | EditValidatorObject
    ]),
    expandable: Boolean,
    export: Boolean,
    filterFormatted: Boolean,
    filterValue: (js.Any, TRow) => js.Any,
    format: (js.Any, TRow, js.Any, Double) => String | ReactElement,
    formatExtraData: js.Any,
    hidden: Boolean,
    hiddenOnInsert: Boolean,
    invalidEditColumnClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String]),
    name: /* keyof TRow */ String,
    searchable: Boolean,
    sort: Boolean,
    sortFunc: (TRow, TRow, SortOrder, /* keyof TRow */ String, js.Any) => Double,
    sortFuncExtraData: js.Any,
    style: CSSProperties,
    text: String | Double | Boolean | ReactElement,
    width: String
  ): ColumnDescription[TRow] = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], columnTitle = columnTitle.asInstanceOf[js.Any], customEditor = customEditor.asInstanceOf[js.Any], editAttrs = editAttrs.asInstanceOf[js.Any], editClassName = editClassName.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], export = export.asInstanceOf[js.Any], filterFormatted = filterFormatted.asInstanceOf[js.Any], filterValue = js.Any.fromFunction2(filterValue), format = js.Any.fromFunction4(format), formatExtraData = formatExtraData.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hiddenOnInsert = hiddenOnInsert.asInstanceOf[js.Any], invalidEditColumnClassName = invalidEditColumnClassName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], sortFunc = js.Any.fromFunction5(sortFunc), sortFuncExtraData = sortFuncExtraData.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDescription[TRow]]
  }
  
  @scala.inline
  implicit class ColumnDescriptionMutableBuilder[Self <: ColumnDescription[_], TRow /* <: js.Object */] (val x: Self with ColumnDescription[TRow]) extends AnyVal {
    
    @scala.inline
    def setAlign(value: DataAlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrs(value: CustomAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(
      value: String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ TRow, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          String
        ])
    ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameFunction4(
      value: (/* cell */ js.Any, /* row */ TRow, /* rowIndex */ Double, /* columnIndex */ Double) => String
    ): Self = StObject.set(x, "className", js.Any.fromFunction4(value))
    
    @scala.inline
    def setColumnTitle(value: Boolean): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEditor(value: CustomEditor[TRow, _]): Self = StObject.set(x, "customEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditAttrs(value: CustomAttrs): Self = StObject.set(x, "editAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String])): Self = StObject.set(x, "editClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditClassNameFunction2(value: (/* cell */ js.Any, /* row */ TRow) => String): Self = StObject.set(x, "editClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditable(
      value: Boolean | (Editable[TRow, _]) | (js.Function4[
          /* cell */ js.Any, 
          /* row */ TRow, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          Boolean | String | EditValidatorObject
        ])
    ): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableFunction4(
      value: (/* cell */ js.Any, /* row */ TRow, /* rowIndex */ Double, /* columnIndex */ Double) => Boolean | String | EditValidatorObject
    ): Self = StObject.set(x, "editable", js.Any.fromFunction4(value))
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExport(value: Boolean): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFormatted(value: Boolean): Self = StObject.set(x, "filterFormatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterValue(value: (js.Any, TRow) => js.Any): Self = StObject.set(x, "filterValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormat(value: (js.Any, TRow, js.Any, Double) => String | ReactElement): Self = StObject.set(x, "format", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFormatExtraData(value: js.Any): Self = StObject.set(x, "formatExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenOnInsert(value: Boolean): Self = StObject.set(x, "hiddenOnInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidEditColumnClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String])): Self = StObject.set(x, "invalidEditColumnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidEditColumnClassNameFunction2(value: (/* cell */ js.Any, /* row */ TRow) => String): Self = StObject.set(x, "invalidEditColumnClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: /* keyof TRow */ String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFunc(value: (TRow, TRow, SortOrder, /* keyof TRow */ String, js.Any) => Double): Self = StObject.set(x, "sortFunc", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSortFuncExtraData(value: js.Any): Self = StObject.set(x, "sortFuncExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String | Double | Boolean | ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
