package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import typings.react.mod.LegacyRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactBootstrapTable.anon.GetElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHeaderColumnProps extends StObject {
  
  /**
    * It only work for enabling insertRow and be assign on rowKey column. If true, the value of rowkey will be
    * generated automatically after a row insertion. If a function given, you can customize the value by yourself and
    * remember to return the value for the cell from the function.
    */
  var autoValue: js.UndefOr[Boolean | js.Function0[Any]] = js.undefined
  
  /**
    * Allow user to render a custom sort caret. You should give a function and should return a JSX.
    * This function takes two arguments: order and fieldName.
    *   `direction`: the current sort order.
    *   `fieldName`: the dataField name of the field currently being sorted.
    */
  var caretRender: js.UndefOr[
    js.Function2[/* direction */ SortOrder | Null, /* fieldName */ String, String | ReactElement]
  ] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Add custom css class on table header column, this attribute only accept String or Function.
    * If Function, it takes four arguments: cell, row, rowIndex, columnIndex.
    * In addition, this function should return a String which is the class name you want to add on.
    */
  var className: js.UndefOr[
    String | (js.Function4[/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double, String])
  ] = js.undefined
  
  /**
    * Indicates how many columns this column takes.
    * Default: 1
    */
  var colSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * Add custom css class on table body column, this attribute only accept String or Function.
    * If Function, it taking four arguments: cell, row, rowIndex, columnIndex.
    * In addition, this function should return a String which is the class name you want to add on.
    */
  var columnClassName: js.UndefOr[
    String | (js.Function4[/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double, String])
  ] = js.undefined
  
  /**
    * Show the title on each column in the data section of the table.
    * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/column/column-title-table.js
    */
  var columnTitle: js.UndefOr[
    Boolean | String | (js.Function4[/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* colIndex */ Double, String])
  ] = js.undefined
  
  /**
    * Specify the field type to use when exporting this column to CSV. Available types are 'number' and 'string'.
    * Defaults to 'string'.
    */
  var csvFieldType: js.UndefOr[CSVFieldType] = js.undefined
  
  /**
    * Customize the cell content when exporting to a CSV file. This function takes two argument: cell, row.
    */
  var csvFormat: js.UndefOr[js.Function2[/* cell */ Any, /* row */ Any, String]] = js.undefined
  
  /**
    * It's usually used with csvFormat, and it's same as formatExtraData.
    * You can give any additional data you want to be passed to the csvFormat function.
    */
  var csvFormatExtraData: js.UndefOr[Any] = js.undefined
  
  /**
    * Customize the column header text for the column when exporting to a CSV file.
    */
  var csvHeader: js.UndefOr[String] = js.undefined
  
  /**
    * Give an Object like following to able to customize your own editing component.
    * This Object should contain these two property:
    *   getElement(REQUIRED): Accept a callback function and take two arguments: onUpdate and props.
    *   customEditorParameters: Additional data for custom cell edit component.
    */
  var customEditor: js.UndefOr[CustomEditor[Any, Any]] = js.undefined
  
  /**
    * Custom insert editor element. This is a function to generate a custom edit element to display in the InsertModal
    * form. The function takes five arguments: column, attr, editorClass, ignoreEditable, defaultValue.
    *   `column`: column information given to the insert modal.
    *   `attr`: EditableAttrs from the TableHeader.editable object options.
    *   `editorClass`: className to apply to the editor component.
    *   `ignoreEditable`: boolean flag indicating whether editable fields should be ignored in the insert modal
    *   `defaultValue`: the default value to use for this cell.
    * The function should return either a JSX element for the field, or false to default back to the standard edit
    * element.
    */
  var customInsertEditor: js.UndefOr[GetElement] = js.undefined
  
  /**
    * Set the text alignment in the column, possible values are 'left', 'center', 'right', 'start' and 'end'.
    */
  var dataAlign: js.UndefOr[DataAlignType] = js.undefined
  
  /**
    * The field of data you want to show on column. This is used throughout react-bootstrap-table as the column field
    * name.
    */
  var dataField: js.UndefOr[String] = js.undefined
  
  /**
    * To customize the column. This callback function should return a String or a React Component.
    * In addition, this function taking four argument: cell, row, formatExtraData, rowIdx.
    * The formatExtraData will be the value which you assign it on <TableHeaderColumn>
    */
  var dataFormat: js.UndefOr[
    js.Function4[
      /* cell */ Any, 
      /* row */ Any, 
      /* formatExtraData */ Any, 
      /* rowIndex */ Double, 
      String | ReactElement
    ]
  ] = js.undefined
  
  /**
    * True to enable table sorting on this column. Default is disabled.
    */
  var dataSort: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Support specifying that the column should start sorting with the 'asc' option.
    */
  var defaultASC: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Add custom css class on editing cell, if assign a callback function, you are supposed to return a String for class name
    */
  var editColumnClassName: js.UndefOr[String | (js.Function2[/* cell */ Any, /* row */ Any, String])] = js.undefined
  
  /**
    * Specify custom tdAttrs to use for a cell that is being edited within this column.
    */
  var editTdAttr: js.UndefOr[CustomAttrs] = js.undefined
  
  /**
    * boolean: Add True to set column editable, false is non-editable.
    * function: You have ability to control the editable level on cell instead of column level. For this
    * callback function, you are supposed to be return a bool value to decide this cell editable or not
    * This callback accepts four arguments: cell, row, rowIndex, columnIndex.
    * object: @see Editable interface.
    */
  var editable: js.UndefOr[
    Boolean | (Editable[Any, Any]) | (js.Function4[
      /* cell */ Any, 
      /* row */ Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      Boolean | String | EditValidatorObject
    ])
  ] = js.undefined
  
  /**
    * Usually used with Options.expandBy.
    * You can assign which columns will trigger a row expansion or not.
    * If false, clicking on a row inside this column will not cause the row to expand.
    */
  var expandable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used to specify whether a column will be exported to csv.
    *
    * If true, the column will be included in the export. This is usually used with hidden columns, as those are not
    * exported by default.
    *
    * If false, the column will be excluded from the csv export.
    */
  var `export`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To Enable a column filter within header column.
    * This feature support a lots of filter types and conditions.
    */
  var filter: js.UndefOr[Filter] = js.undefined
  
  /**
    * When true, the column will filter using the value returned by the column's formatter.
    * When false (default), the column will filter using the pre-formatted value.
    */
  var filterFormatted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return the value you want to be filtered on that column.
    * It's useful if your column data is an object.
    * @example (cell, row) => cell.fieldOne;
    * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/manipulation/search-format-table.js
    */
  var filterValue: js.UndefOr[js.Function2[/* cell */ Any, /* row */ Any, Any]] = js.undefined
  
  /**
    * It's useful with dataFormat, you can give any data you want to be passed to the formatter.
    */
  var formatExtraData: js.UndefOr[Any] = js.undefined
  
  /**
    * Alignment of text in the column header.
    * Tip: If you don't set the headerAlign, it will default to the setting for dataAlign.
    */
  var headerAlign: js.UndefOr[DataAlignType] = js.undefined
  
  /**
    * If the children of TableHeaderColumn is a JSX or Object, we prefer to add this prop to describe this column with
    * a pure text(String). It will be used on the placeholder or tips in the filter, search field or insert field etc.
    */
  var headerText: js.UndefOr[String] = js.undefined
  
  /**
    * Show the title on each column in the header section of the table, default is true.
    */
  var headerTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to hide the column. Default is false. Often used to hide rowKey columns that are required to
    * identify a row but that do not need to be visible.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this to true to hide this column on insert modal. Default is false.
    *
    * This is often used together with autoValue for auto-generated columns like row keys.
    */
  var hiddenOnInsert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Add custom css class for invalid editing cell, if assign a callback function, you are supposed to return a String for class name
    */
  var invalidEditColumnClassName: js.UndefOr[String | (js.Function2[/* cell */ Any, /* row */ Any, String])] = js.undefined
  
  /**
    * Use isKey to tell table which column is unique. This is same as the keyField in <BootstrapTable>
    * Tips: You need choose one configuration to set key field: isKey or the keyField in <BootstrapTable>
    */
  var isKey: js.UndefOr[Boolean] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[TableHeaderColumn]] = js.undefined
  
  /**
    * This is always used together with rowSpan and colSpan, to create multi-row/multi-column headers.
    * Row is the header row on which this header column present.
    */
  var row: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates how many rows this column takes.
    * Default: 1
    */
  var rowSpan: js.UndefOr[Double] = js.undefined
  
  /**
    * False to disable search functionality on column, default is true.
    */
  var searchable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Give a custom callback function for data sorting.
    * This function takes five arguments: a, b, order, sortField, extraData
    * The extraData value is the data from the sortFuncExtraData.
    */
  var sortFunc: js.UndefOr[
    js.Function5[
      /* a */ js.Object, 
      /* b */ js.Object, 
      /* order */ SortOrder, 
      /* keyof object */ /* sortField */ String, 
      /* extraData */ Any, 
      Double
    ]
  ] = js.undefined
  
  /**
    * Extra data for the custom sort function. If defined, this data will be passed as fifth argument in sortFunc.
    */
  var sortFuncExtraData: js.UndefOr[Any] = js.undefined
  
  /**
    * Set the column class name for the actively filtered column. Can be either a string, or a function that takes two
    * parameters: order and dataField.
    *   `order`: current sort order for the column.
    *   `dataField`: current column's dataField.
    * This allows you to specify a different className depending on whether the current dataField is being sorted 'asc'
    * or 'desc'.
    * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/sort/sort-style-table.js#L36-L37
    */
  var sortHeaderColumnClassName: js.UndefOr[String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String])] = js.undefined
  
  /**
    * Allow you to add your custom attributes on TD element.
    * Example: tdAttr={ { 'data-attr': 'test' } }
    */
  var tdAttr: js.UndefOr[CustomAttrs] = js.undefined
  
  /**
    * Allow you to add your custom style object on TD element. Accepts either a CSS Properties object, or
    * a function that takes 4 arguments and returns a CSS Properties object. These arguments are:
    *   `cell`: The current cell value
    *   `row`: The current row data
    *   `rowIndex`: Index number for the current row data in the input data array.
    *   `columnIndex`: Index number for the current column that the cell is in.
    */
  var tdStyle: js.UndefOr[
    CSSProperties | (js.Function4[
      /* cell */ Any, 
      /* row */ Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      CSSProperties
    ])
  ] = js.undefined
  
  /**
    * Allow you to add your custom style object on TH element.
    */
  var thStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * Set the column width, including the units. e.g. '10%' or '150px'
    */
  var width: js.UndefOr[String] = js.undefined
}
object TableHeaderColumnProps {
  
  inline def apply(): TableHeaderColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaderColumnProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableHeaderColumnProps] (val x: Self) extends AnyVal {
    
    inline def setAutoValue(value: Boolean | js.Function0[Any]): Self = StObject.set(x, "autoValue", value.asInstanceOf[js.Any])
    
    inline def setAutoValueFunction0(value: () => Any): Self = StObject.set(x, "autoValue", js.Any.fromFunction0(value))
    
    inline def setAutoValueUndefined: Self = StObject.set(x, "autoValue", js.undefined)
    
    inline def setCaretRender(value: (/* direction */ SortOrder | Null, /* fieldName */ String) => String | ReactElement): Self = StObject.set(x, "caretRender", js.Any.fromFunction2(value))
    
    inline def setCaretRenderUndefined: Self = StObject.set(x, "caretRender", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(
      value: String | (js.Function4[/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double, String])
    ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameFunction4(value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double) => String): Self = StObject.set(x, "className", js.Any.fromFunction4(value))
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setColumnClassName(
      value: String | (js.Function4[/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double, String])
    ): Self = StObject.set(x, "columnClassName", value.asInstanceOf[js.Any])
    
    inline def setColumnClassNameFunction4(value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double) => String): Self = StObject.set(x, "columnClassName", js.Any.fromFunction4(value))
    
    inline def setColumnClassNameUndefined: Self = StObject.set(x, "columnClassName", js.undefined)
    
    inline def setColumnTitle(
      value: Boolean | String | (js.Function4[/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* colIndex */ Double, String])
    ): Self = StObject.set(x, "columnTitle", value.asInstanceOf[js.Any])
    
    inline def setColumnTitleFunction4(value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* colIndex */ Double) => String): Self = StObject.set(x, "columnTitle", js.Any.fromFunction4(value))
    
    inline def setColumnTitleUndefined: Self = StObject.set(x, "columnTitle", js.undefined)
    
    inline def setCsvFieldType(value: CSVFieldType): Self = StObject.set(x, "csvFieldType", value.asInstanceOf[js.Any])
    
    inline def setCsvFieldTypeUndefined: Self = StObject.set(x, "csvFieldType", js.undefined)
    
    inline def setCsvFormat(value: (/* cell */ Any, /* row */ Any) => String): Self = StObject.set(x, "csvFormat", js.Any.fromFunction2(value))
    
    inline def setCsvFormatExtraData(value: Any): Self = StObject.set(x, "csvFormatExtraData", value.asInstanceOf[js.Any])
    
    inline def setCsvFormatExtraDataUndefined: Self = StObject.set(x, "csvFormatExtraData", js.undefined)
    
    inline def setCsvFormatUndefined: Self = StObject.set(x, "csvFormat", js.undefined)
    
    inline def setCsvHeader(value: String): Self = StObject.set(x, "csvHeader", value.asInstanceOf[js.Any])
    
    inline def setCsvHeaderUndefined: Self = StObject.set(x, "csvHeader", js.undefined)
    
    inline def setCustomEditor(value: CustomEditor[Any, Any]): Self = StObject.set(x, "customEditor", value.asInstanceOf[js.Any])
    
    inline def setCustomEditorUndefined: Self = StObject.set(x, "customEditor", js.undefined)
    
    inline def setCustomInsertEditor(value: GetElement): Self = StObject.set(x, "customInsertEditor", value.asInstanceOf[js.Any])
    
    inline def setCustomInsertEditorUndefined: Self = StObject.set(x, "customInsertEditor", js.undefined)
    
    inline def setDataAlign(value: DataAlignType): Self = StObject.set(x, "dataAlign", value.asInstanceOf[js.Any])
    
    inline def setDataAlignUndefined: Self = StObject.set(x, "dataAlign", js.undefined)
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setDataFormat(
      value: (/* cell */ Any, /* row */ Any, /* formatExtraData */ Any, /* rowIndex */ Double) => String | ReactElement
    ): Self = StObject.set(x, "dataFormat", js.Any.fromFunction4(value))
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    inline def setDataSort(value: Boolean): Self = StObject.set(x, "dataSort", value.asInstanceOf[js.Any])
    
    inline def setDataSortUndefined: Self = StObject.set(x, "dataSort", js.undefined)
    
    inline def setDefaultASC(value: Boolean): Self = StObject.set(x, "defaultASC", value.asInstanceOf[js.Any])
    
    inline def setDefaultASCUndefined: Self = StObject.set(x, "defaultASC", js.undefined)
    
    inline def setEditColumnClassName(value: String | (js.Function2[/* cell */ Any, /* row */ Any, String])): Self = StObject.set(x, "editColumnClassName", value.asInstanceOf[js.Any])
    
    inline def setEditColumnClassNameFunction2(value: (/* cell */ Any, /* row */ Any) => String): Self = StObject.set(x, "editColumnClassName", js.Any.fromFunction2(value))
    
    inline def setEditColumnClassNameUndefined: Self = StObject.set(x, "editColumnClassName", js.undefined)
    
    inline def setEditTdAttr(value: CustomAttrs): Self = StObject.set(x, "editTdAttr", value.asInstanceOf[js.Any])
    
    inline def setEditTdAttrUndefined: Self = StObject.set(x, "editTdAttr", js.undefined)
    
    inline def setEditable(
      value: Boolean | (Editable[Any, Any]) | (js.Function4[
          /* cell */ Any, 
          /* row */ Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          Boolean | String | EditValidatorObject
        ])
    ): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableFunction4(
      value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double) => Boolean | String | EditValidatorObject
    ): Self = StObject.set(x, "editable", js.Any.fromFunction4(value))
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    inline def setExport(value: Boolean): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFormatted(value: Boolean): Self = StObject.set(x, "filterFormatted", value.asInstanceOf[js.Any])
    
    inline def setFilterFormattedUndefined: Self = StObject.set(x, "filterFormatted", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterValue(value: (/* cell */ Any, /* row */ Any) => Any): Self = StObject.set(x, "filterValue", js.Any.fromFunction2(value))
    
    inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
    
    inline def setFormatExtraData(value: Any): Self = StObject.set(x, "formatExtraData", value.asInstanceOf[js.Any])
    
    inline def setFormatExtraDataUndefined: Self = StObject.set(x, "formatExtraData", js.undefined)
    
    inline def setHeaderAlign(value: DataAlignType): Self = StObject.set(x, "headerAlign", value.asInstanceOf[js.Any])
    
    inline def setHeaderAlignUndefined: Self = StObject.set(x, "headerAlign", js.undefined)
    
    inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    
    inline def setHeaderTitle(value: Boolean): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
    
    inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenOnInsert(value: Boolean): Self = StObject.set(x, "hiddenOnInsert", value.asInstanceOf[js.Any])
    
    inline def setHiddenOnInsertUndefined: Self = StObject.set(x, "hiddenOnInsert", js.undefined)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setInvalidEditColumnClassName(value: String | (js.Function2[/* cell */ Any, /* row */ Any, String])): Self = StObject.set(x, "invalidEditColumnClassName", value.asInstanceOf[js.Any])
    
    inline def setInvalidEditColumnClassNameFunction2(value: (/* cell */ Any, /* row */ Any) => String): Self = StObject.set(x, "invalidEditColumnClassName", js.Any.fromFunction2(value))
    
    inline def setInvalidEditColumnClassNameUndefined: Self = StObject.set(x, "invalidEditColumnClassName", js.undefined)
    
    inline def setIsKey(value: Boolean): Self = StObject.set(x, "isKey", value.asInstanceOf[js.Any])
    
    inline def setIsKeyUndefined: Self = StObject.set(x, "isKey", js.undefined)
    
    inline def setRef(value: LegacyRef[TableHeaderColumn]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ TableHeaderColumn | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    
    inline def setSortFunc(
      value: (/* a */ js.Object, /* b */ js.Object, /* order */ SortOrder, /* keyof object */ /* sortField */ String, /* extraData */ Any) => Double
    ): Self = StObject.set(x, "sortFunc", js.Any.fromFunction5(value))
    
    inline def setSortFuncExtraData(value: Any): Self = StObject.set(x, "sortFuncExtraData", value.asInstanceOf[js.Any])
    
    inline def setSortFuncExtraDataUndefined: Self = StObject.set(x, "sortFuncExtraData", js.undefined)
    
    inline def setSortFuncUndefined: Self = StObject.set(x, "sortFunc", js.undefined)
    
    inline def setSortHeaderColumnClassName(value: String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String])): Self = StObject.set(x, "sortHeaderColumnClassName", value.asInstanceOf[js.Any])
    
    inline def setSortHeaderColumnClassNameFunction2(value: (/* order */ SortOrder, /* dataField */ String) => String): Self = StObject.set(x, "sortHeaderColumnClassName", js.Any.fromFunction2(value))
    
    inline def setSortHeaderColumnClassNameUndefined: Self = StObject.set(x, "sortHeaderColumnClassName", js.undefined)
    
    inline def setTdAttr(value: CustomAttrs): Self = StObject.set(x, "tdAttr", value.asInstanceOf[js.Any])
    
    inline def setTdAttrUndefined: Self = StObject.set(x, "tdAttr", js.undefined)
    
    inline def setTdStyle(
      value: CSSProperties | (js.Function4[
          /* cell */ Any, 
          /* row */ Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          CSSProperties
        ])
    ): Self = StObject.set(x, "tdStyle", value.asInstanceOf[js.Any])
    
    inline def setTdStyleFunction4(
      value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double) => CSSProperties
    ): Self = StObject.set(x, "tdStyle", js.Any.fromFunction4(value))
    
    inline def setTdStyleUndefined: Self = StObject.set(x, "tdStyle", js.undefined)
    
    inline def setThStyle(value: CSSProperties): Self = StObject.set(x, "thStyle", value.asInstanceOf[js.Any])
    
    inline def setThStyleUndefined: Self = StObject.set(x, "thStyle", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
