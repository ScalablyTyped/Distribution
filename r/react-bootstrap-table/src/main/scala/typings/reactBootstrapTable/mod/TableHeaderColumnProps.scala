package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.react.mod.ReactElement
import typings.reactBootstrapTable.anon.GetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHeaderColumnProps extends Props[TableHeaderColumn] {
  
  /**
    * It only work for enabling insertRow and be assign on rowKey column. If true, the value of rowkey will be
    * generated automatically after a row insertion. If a function given, you can customize the value by yourself and
    * remember to return the value for the cell from the function.
    */
  var autoValue: js.UndefOr[Boolean | js.Function0[_]] = js.native
  
  /**
    * Allow user to render a custom sort caret. You should give a function and should return a JSX.
    * This function takes two arguments: order and fieldName.
    *   `direction`: the current sort order.
    *   `fieldName`: the dataField name of the field currently being sorted.
    */
  var caretRender: js.UndefOr[
    js.Function2[/* direction */ SortOrder | Null, /* fieldName */ String, String | ReactElement]
  ] = js.native
  
  /**
    * Add custom css class on table header column, this attribute only accept String or Function.
    * If Function, it takes four arguments: cell, row, rowIndex, columnIndex.
    * In addition, this function should return a String which is the class name you want to add on.
    */
  var className: js.UndefOr[
    String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ])
  ] = js.native
  
  /**
    * Indicates how many columns this column takes.
    * Default: 1
    */
  var colSpan: js.UndefOr[Double] = js.native
  
  /**
    * Add custom css class on table body column, this attribute only accept String or Function.
    * If Function, it taking four arguments: cell, row, rowIndex, columnIndex.
    * In addition, this function should return a String which is the class name you want to add on.
    */
  var columnClassName: js.UndefOr[
    String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      String
    ])
  ] = js.native
  
  /**
    * Show the title on each column in the data section of the table.
    * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/column/column-title-table.js
    */
  var columnTitle: js.UndefOr[
    Boolean | String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* colIndex */ Double, 
      String
    ])
  ] = js.native
  
  /**
    * Specify the field type to use when exporting this column to CSV. Available types are 'number' and 'string'.
    * Defaults to 'string'.
    */
  var csvFieldType: js.UndefOr[CSVFieldType] = js.native
  
  /**
    * Customize the cell content when exporting to a CSV file. This function takes two argument: cell, row.
    */
  var csvFormat: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, String]] = js.native
  
  /**
    * It's usually used with csvFormat, and it's same as formatExtraData.
    * You can give any additional data you want to be passed to the csvFormat function.
    */
  var csvFormatExtraData: js.UndefOr[js.Any] = js.native
  
  /**
    * Customize the column header text for the column when exporting to a CSV file.
    */
  var csvHeader: js.UndefOr[String] = js.native
  
  /**
    * Give an Object like following to able to customize your own editing component.
    * This Object should contain these two property:
    *   getElement(REQUIRED): Accept a callback function and take two arguments: onUpdate and props.
    *   customEditorParameters: Additional data for custom cell edit component.
    */
  var customEditor: js.UndefOr[CustomEditor[_, _]] = js.native
  
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
  var customInsertEditor: js.UndefOr[GetElement] = js.native
  
  /**
    * Set the text alignment in the column, possible values are 'left', 'center', 'right', 'start' and 'end'.
    */
  var dataAlign: js.UndefOr[DataAlignType] = js.native
  
  /**
    * The field of data you want to show on column. This is used throughout react-bootstrap-table as the column field
    * name.
    */
  var dataField: js.UndefOr[String] = js.native
  
  /**
    * To customize the column. This callback function should return a String or a React Component.
    * In addition, this function taking four argument: cell, row, formatExtraData, rowIdx.
    * The formatExtraData will be the value which you assign it on <TableHeaderColumn>
    */
  var dataFormat: js.UndefOr[
    js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* formatExtraData */ js.Any, 
      /* rowIndex */ Double, 
      String | ReactElement
    ]
  ] = js.native
  
  /**
    * True to enable table sorting on this column. Default is disabled.
    */
  var dataSort: js.UndefOr[Boolean] = js.native
  
  /**
    * Support specifying that the column should start sorting with the 'asc' option.
    */
  var defaultASC: js.UndefOr[Boolean] = js.native
  
  /**
    * Add custom css class on editing cell, if assign a callback function, you are supposed to return a String for class name
    */
  var editColumnClassName: js.UndefOr[String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])] = js.native
  
  /**
    * Specify custom tdAttrs to use for a cell that is being edited within this column.
    */
  var editTdAttr: js.UndefOr[CustomAttrs] = js.native
  
  /**
    * boolean: Add True to set column editable, false is non-editable.
    * function: You have ability to control the editable level on cell instead of column level. For this
    * callback function, you are supposed to be return a bool value to decide this cell editable or not
    * This callback accepts four arguments: cell, row, rowIndex, columnIndex.
    * object: @see Editable interface.
    */
  var editable: js.UndefOr[
    Boolean | (Editable[_, _]) | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      Boolean | String | EditValidatorObject
    ])
  ] = js.native
  
  /**
    * Usually used with Options.expandBy.
    * You can assign which columns will trigger a row expansion or not.
    * If false, clicking on a row inside this column will not cause the row to expand.
    */
  var expandable: js.UndefOr[Boolean] = js.native
  
  /**
    * Used to specify whether a column will be exported to csv.
    *
    * If true, the column will be included in the export. This is usually used with hidden columns, as those are not
    * exported by default.
    *
    * If false, the column will be excluded from the csv export.
    */
  var export: js.UndefOr[Boolean] = js.native
  
  /**
    * To Enable a column filter within header column.
    * This feature support a lots of filter types and conditions.
    */
  var filter: js.UndefOr[Filter] = js.native
  
  /**
    * When true, the column will filter using the value returned by the column's formatter.
    * When false (default), the column will filter using the pre-formatted value.
    */
  var filterFormatted: js.UndefOr[Boolean] = js.native
  
  /**
    * Return the value you want to be filtered on that column.
    * It's useful if your column data is an object.
    * @example: (cell, row) => cell.fieldOne;
    * @see: https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/manipulation/search-format-table.js
    */
  var filterValue: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, _]] = js.native
  
  /**
    * It's useful with dataFormat, you can give any data you want to be passed to the formatter.
    */
  var formatExtraData: js.UndefOr[js.Any] = js.native
  
  /**
    * Alignment of text in the column header.
    * Tip: If you don't set the headerAlign, it will default to the setting for dataAlign.
    */
  var headerAlign: js.UndefOr[DataAlignType] = js.native
  
  /**
    * If the children of TableHeaderColumn is a JSX or Object, we prefer to add this prop to describe this column with
    * a pure text(String). It will be used on the placeholder or tips in the filter, search field or insert field etc.
    */
  var headerText: js.UndefOr[String] = js.native
  
  /**
    * Show the title on each column in the header section of the table, default is true.
    */
  var headerTitle: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to hide the column. Default is false. Often used to hide rowKey columns that are required to
    * identify a row but that do not need to be visible.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Set this to true to hide this column on insert modal. Default is false.
    *
    * This is often used together with autoValue for auto-generated columns like row keys.
    */
  var hiddenOnInsert: js.UndefOr[Boolean] = js.native
  
  /**
    * Add custom css class for invalid editing cell, if assign a callback function, you are supposed to return a String for class name
    */
  var invalidEditColumnClassName: js.UndefOr[String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])] = js.native
  
  /**
    * Use isKey to tell table which column is unique. This is same as the keyField in <BootstrapTable>
    * Tips: You need choose one configuration to set key field: isKey or the keyField in <BootstrapTable>
    */
  var isKey: js.UndefOr[Boolean] = js.native
  
  /**
    * This is always used together with rowSpan and colSpan, to create multi-row/multi-column headers.
    * Row is the header row on which this header column present.
    */
  var row: js.UndefOr[Double] = js.native
  
  /**
    * Indicates how many rows this column takes.
    * Default: 1
    */
  var rowSpan: js.UndefOr[Double] = js.native
  
  /**
    * False to disable search functionality on column, default is true.
    */
  var searchable: js.UndefOr[Boolean] = js.native
  
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
      /* extraData */ js.Any, 
      Double
    ]
  ] = js.native
  
  /**
    * Extra data for the custom sort function. If defined, this data will be passed as fifth argument in sortFunc.
    */
  var sortFuncExtraData: js.UndefOr[js.Any] = js.native
  
  /**
    * Set the column class name for the actively filtered column. Can be either a string, or a function that takes two
    * parameters: order and dataField.
    *   `order`: current sort order for the column.
    *   `dataField`: current column's dataField.
    * This allows you to specify a different className depending on whether the current dataField is being sorted 'asc'
    * or 'desc'.
    * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/sort/sort-style-table.js#L36-L37
    */
  var sortHeaderColumnClassName: js.UndefOr[String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String])] = js.native
  
  /**
    * Allow you to add your custom attributes on TD element.
    * Example: tdAttr={ { 'data-attr': 'test' } }
    */
  var tdAttr: js.UndefOr[CustomAttrs] = js.native
  
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
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ Double, 
      /* columnIndex */ Double, 
      CSSProperties
    ])
  ] = js.native
  
  /**
    * Allow you to add your custom style object on TH element.
    */
  var thStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Set the column width, including the units. e.g. '10%' or '150px'
    */
  var width: js.UndefOr[String] = js.native
}
object TableHeaderColumnProps {
  
  @scala.inline
  def apply(): TableHeaderColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaderColumnProps]
  }
  
  @scala.inline
  implicit class TableHeaderColumnPropsOps[Self <: TableHeaderColumnProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoValueFunction0(value: () => _): Self = this.set("autoValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutoValue(value: Boolean | js.Function0[_]): Self = this.set("autoValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoValue: Self = this.set("autoValue", js.undefined)
    
    @scala.inline
    def setCaretRender(value: (/* direction */ SortOrder | Null, /* fieldName */ String) => String | ReactElement): Self = this.set("caretRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCaretRender: Self = this.set("caretRender", js.undefined)
    
    @scala.inline
    def setClassNameFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => String
    ): Self = this.set("className", js.Any.fromFunction4(value))
    
    @scala.inline
    def setClassName(
      value: String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          String
        ])
    ): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    
    @scala.inline
    def setColumnClassNameFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => String
    ): Self = this.set("columnClassName", js.Any.fromFunction4(value))
    
    @scala.inline
    def setColumnClassName(
      value: String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          String
        ])
    ): Self = this.set("columnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnClassName: Self = this.set("columnClassName", js.undefined)
    
    @scala.inline
    def setColumnTitleFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* colIndex */ Double) => String
    ): Self = this.set("columnTitle", js.Any.fromFunction4(value))
    
    @scala.inline
    def setColumnTitle(
      value: Boolean | String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* colIndex */ Double, 
          String
        ])
    ): Self = this.set("columnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnTitle: Self = this.set("columnTitle", js.undefined)
    
    @scala.inline
    def setCsvFieldType(value: CSVFieldType): Self = this.set("csvFieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvFieldType: Self = this.set("csvFieldType", js.undefined)
    
    @scala.inline
    def setCsvFormat(value: (/* cell */ js.Any, /* row */ js.Any) => String): Self = this.set("csvFormat", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCsvFormat: Self = this.set("csvFormat", js.undefined)
    
    @scala.inline
    def setCsvFormatExtraData(value: js.Any): Self = this.set("csvFormatExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvFormatExtraData: Self = this.set("csvFormatExtraData", js.undefined)
    
    @scala.inline
    def setCsvHeader(value: String): Self = this.set("csvHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvHeader: Self = this.set("csvHeader", js.undefined)
    
    @scala.inline
    def setCustomEditor(value: CustomEditor[_, _]): Self = this.set("customEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEditor: Self = this.set("customEditor", js.undefined)
    
    @scala.inline
    def setCustomInsertEditor(value: GetElement): Self = this.set("customInsertEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomInsertEditor: Self = this.set("customInsertEditor", js.undefined)
    
    @scala.inline
    def setDataAlign(value: DataAlignType): Self = this.set("dataAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAlign: Self = this.set("dataAlign", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = this.set("dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    
    @scala.inline
    def setDataFormat(
      value: (/* cell */ js.Any, /* row */ js.Any, /* formatExtraData */ js.Any, /* rowIndex */ Double) => String | ReactElement
    ): Self = this.set("dataFormat", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteDataFormat: Self = this.set("dataFormat", js.undefined)
    
    @scala.inline
    def setDataSort(value: Boolean): Self = this.set("dataSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSort: Self = this.set("dataSort", js.undefined)
    
    @scala.inline
    def setDefaultASC(value: Boolean): Self = this.set("defaultASC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultASC: Self = this.set("defaultASC", js.undefined)
    
    @scala.inline
    def setEditColumnClassNameFunction2(value: (/* cell */ js.Any, /* row */ js.Any) => String): Self = this.set("editColumnClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditColumnClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])): Self = this.set("editColumnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditColumnClassName: Self = this.set("editColumnClassName", js.undefined)
    
    @scala.inline
    def setEditTdAttr(value: CustomAttrs): Self = this.set("editTdAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditTdAttr: Self = this.set("editTdAttr", js.undefined)
    
    @scala.inline
    def setEditableFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => Boolean | String | EditValidatorObject
    ): Self = this.set("editable", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEditable(
      value: Boolean | (Editable[_, _]) | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          Boolean | String | EditValidatorObject
        ])
    ): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    
    @scala.inline
    def setExport(value: Boolean): Self = this.set("export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExport: Self = this.set("export", js.undefined)
    
    @scala.inline
    def setFilter(value: Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterFormatted(value: Boolean): Self = this.set("filterFormatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterFormatted: Self = this.set("filterFormatted", js.undefined)
    
    @scala.inline
    def setFilterValue(value: (/* cell */ js.Any, /* row */ js.Any) => _): Self = this.set("filterValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterValue: Self = this.set("filterValue", js.undefined)
    
    @scala.inline
    def setFormatExtraData(value: js.Any): Self = this.set("formatExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatExtraData: Self = this.set("formatExtraData", js.undefined)
    
    @scala.inline
    def setHeaderAlign(value: DataAlignType): Self = this.set("headerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderAlign: Self = this.set("headerAlign", js.undefined)
    
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    
    @scala.inline
    def setHeaderTitle(value: Boolean): Self = this.set("headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTitle: Self = this.set("headerTitle", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHiddenOnInsert(value: Boolean): Self = this.set("hiddenOnInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenOnInsert: Self = this.set("hiddenOnInsert", js.undefined)
    
    @scala.inline
    def setInvalidEditColumnClassNameFunction2(value: (/* cell */ js.Any, /* row */ js.Any) => String): Self = this.set("invalidEditColumnClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInvalidEditColumnClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])): Self = this.set("invalidEditColumnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidEditColumnClassName: Self = this.set("invalidEditColumnClassName", js.undefined)
    
    @scala.inline
    def setIsKey(value: Boolean): Self = this.set("isKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsKey: Self = this.set("isKey", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchable: Self = this.set("searchable", js.undefined)
    
    @scala.inline
    def setSortFunc(
      value: (/* a */ js.Object, /* b */ js.Object, /* order */ SortOrder, /* keyof object */ /* sortField */ String, /* extraData */ js.Any) => Double
    ): Self = this.set("sortFunc", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteSortFunc: Self = this.set("sortFunc", js.undefined)
    
    @scala.inline
    def setSortFuncExtraData(value: js.Any): Self = this.set("sortFuncExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortFuncExtraData: Self = this.set("sortFuncExtraData", js.undefined)
    
    @scala.inline
    def setSortHeaderColumnClassNameFunction2(value: (/* order */ SortOrder, /* dataField */ String) => String): Self = this.set("sortHeaderColumnClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortHeaderColumnClassName(value: String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String])): Self = this.set("sortHeaderColumnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortHeaderColumnClassName: Self = this.set("sortHeaderColumnClassName", js.undefined)
    
    @scala.inline
    def setTdAttr(value: CustomAttrs): Self = this.set("tdAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdAttr: Self = this.set("tdAttr", js.undefined)
    
    @scala.inline
    def setTdStyleFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => CSSProperties
    ): Self = this.set("tdStyle", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTdStyle(
      value: CSSProperties | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          CSSProperties
        ])
    ): Self = this.set("tdStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdStyle: Self = this.set("tdStyle", js.undefined)
    
    @scala.inline
    def setThStyle(value: CSSProperties): Self = this.set("thStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThStyle: Self = this.set("thStyle", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
