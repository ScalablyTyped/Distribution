package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderColumnProps
  extends reactLib.reactMod.ReactNs.Props[TableHeaderColumn] {
  /**
  	 * It only work for enabling insertRow and be assign on rowKey column. If true, the value of rowkey will be
  	 * generated automatically after a row insertion. If a function given, you can customize the value by yourself and
  	 * remember to return the value for the cell from the function.
  	 */
  var autovalue: js.UndefOr[scala.Boolean | js.Function0[_]] = js.undefined
  /**
  	 * Allow user to render a custom sort caret. You should give a function and should return a JSX.
  	 * This function takes two arguments: order and fieldName.
  	 *   `direction`: the current sort order.
  	 *   `fieldName`: the dataField name of the field currently being sorted.
  	 */
  var caretRender: js.UndefOr[
    js.Function2[
      /* direction */ SortOrder | scala.Null, 
      /* fieldName */ java.lang.String, 
      java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Add custom css class on table header column, this attribute only accept String or Function.
  	 * If Function, it takes four arguments: cell, row, rowIndex, columnIndex.
  	 * In addition, this function should return a String which is the class name you want to add on.
  	 */
  var className: js.UndefOr[
    java.lang.String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ scala.Double, 
      /* columnIndex */ scala.Double, 
      java.lang.String
    ])
  ] = js.undefined
  /**
  	 * Indicates how many columns this column takes.
  	 * Default: 1
  	 */
  var colSpan: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Add custom css class on table body column, this attribute only accept String or Function.
  	 * If Function, it taking four arguments: cell, row, rowIndex, columnIndex.
  	 * In addition, this function should return a String which is the class name you want to add on.
  	 */
  var columnClassName: js.UndefOr[
    java.lang.String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ scala.Double, 
      /* columnIndex */ scala.Double, 
      java.lang.String
    ])
  ] = js.undefined
  /**
  	 * Show the title on each column in the data section of the table.
  	 * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/column/column-title-table.js
  	 */
  var columnTitle: js.UndefOr[
    scala.Boolean | java.lang.String | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ scala.Double, 
      /* colIndex */ scala.Double, 
      java.lang.String
    ])
  ] = js.undefined
  /**
  	 * Specify the field type to use when exporting this column to CSV. Available types are 'number' and 'string'.
  	 * Defaults to 'string'.
  	 */
  var csvFieldType: js.UndefOr[CSVFieldType] = js.undefined
  /**
  	 * Customize the cell content when exporting to a CSV file. This function takes two argument: cell, row.
  	 */
  var csvFormat: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, java.lang.String]] = js.undefined
  /**
  	 * It's usually used with csvFormat, and it's same as formatExtraData.
  	 * You can give any additional data you want to be passed to the csvFormat function.
  	 */
  var csvFormatExtraData: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Customize the column header text for the column when exporting to a CSV file.
  	 */
  var csvHeader: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Give an Object like following to able to customize your own editing component.
  	 * This Object should contain these two property:
  	 *   getElement(REQUIRED): Accept a callback function and take two arguments: onUpdate and props.
  	 *   customEditorParameters: Additional data for custom cell edit component.
  	 */
  var customEditor: js.UndefOr[CustomEditor[_, _]] = js.undefined
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
  var customInsertEditor: js.UndefOr[reactDashBootstrapDashTableLib.Anon_GetElement] = js.undefined
  /**
  	 * Set the text alignment in the column, possible values are 'left', 'center', 'right', 'start' and 'end'.
  	 */
  var dataAlign: js.UndefOr[DataAlignType] = js.undefined
  /**
  	 * The field of data you want to show on column. This is used throughout react-bootstrap-table as the column field
  	 * name.
  	 */
  var dataField: js.UndefOr[java.lang.String] = js.undefined
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
      /* rowIndex */ scala.Double, 
      java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * True to enable table sorting on this column. Default is disabled.
  	 */
  var dataSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Support specifying that the column should start sorting with the 'asc' option.
  	 */
  var defaultASC: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Add custom css class on editing cell, if assign a callback function, you are supposed to return a String for class name
  	 */
  var editColumnClassName: js.UndefOr[
    java.lang.String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, java.lang.String])
  ] = js.undefined
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
    scala.Boolean | (Editable[_, _]) | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ scala.Double, 
      /* columnIndex */ scala.Double, 
      scala.Boolean | java.lang.String | EditValidatorObject
    ])
  ] = js.undefined
  /**
  	 * Usually used with Options.expandBy.
  	 * You can assign which columns will trigger a row expansion or not.
  	 * If false, clicking on a row inside this column will not cause the row to expand.
  	 */
  var expandable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Used to specify whether a column will be exported to csv.
  	 *
  	 * If true, the column will be included in the export. This is usually used with hidden columns, as those are not
  	 * exported by default.
  	 *
  	 * If false, the column will be excluded from the csv export.
  	 */
  var export: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * To Enable a column filter within header column.
  	 * This feature support a lots of filter types and conditions.
  	 */
  var filter: js.UndefOr[Filter] = js.undefined
  /**
  	 * When true, the column will filter using the value returned by the column's formatter.
  	 * When false (default), the column will filter using the pre-formatted value.
  	 */
  var filterFormatted: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Return the value you want to be filtered on that column.
  	 * It's useful if your column data is an object.
  	 * @example: (cell, row) => cell.fieldOne;
  	 * @see: https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/manipulation/search-format-table.js
  	 */
  var filterValue: js.UndefOr[js.Function2[/* cell */ js.Any, /* row */ js.Any, _]] = js.undefined
  /**
  	 * It's useful with dataFormat, you can give any data you want to be passed to the formatter.
  	 */
  var formatExtraData: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Alignment of text in the column header.
  	 * Tip: If you don't set the headerAlign, it will default to the setting for dataAlign.
  	 */
  var headerAlign: js.UndefOr[DataAlignType] = js.undefined
  /**
  	 * If the children of TableHeaderColumn is a JSX or Object, we prefer to add this prop to describe this column with
  	 * a pure text(String). It will be used on the placeholder or tips in the filter, search field or insert field etc.
  	 */
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Show the title on each column in the header section of the table, default is true.
  	 */
  var headerTitle: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set to true to hide the column. Default is false. Often used to hide rowKey columns that are required to
  	 * identify a row but that do not need to be visible.
  	 */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Set this to true to hide this column on insert modal. Default is false.
  	 *
  	 * This is often used together with autoValue for auto-generated columns like row keys.
  	 */
  var hiddenOnInsert: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Add custom css class for invalid editing cell, if assign a callback function, you are supposed to return a String for class name
  	 */
  var invalidEditColumnClassName: js.UndefOr[
    java.lang.String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, java.lang.String])
  ] = js.undefined
  /**
  	 * Use isKey to tell table which column is unique. This is same as the keyField in <BootstrapTable>
  	 * Tips: You need choose one configuration to set key field: isKey or the keyField in <BootstrapTable>
  	 */
  var isKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This is always used together with rowSpan and colSpan, to create multi-row/multi-column headers.
  	 * Row is the header row on which this header column present.
  	 */
  var row: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates how many rows this column takes.
  	 * Default: 1
  	 */
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * False to disable search functionality on column, default is true.
  	 */
  var searchable: js.UndefOr[scala.Boolean] = js.undefined
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
      /* sortField */ java.lang.String, 
      /* extraData */ js.Any, 
      scala.Double
    ]
  ] = js.undefined
  /**
  	 * Extra data for the custom sort function. If defined, this data will be passed as fifth argument in sortFunc.
  	 */
  var sortFuncExtraData: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Set the column class name for the actively filtered column. Can be either a string, or a function that takes two
  	 * parameters: order and dataField.
  	 *   `order`: current sort order for the column.
  	 *   `dataField`: current column's dataField.
  	 * This allows you to specify a different className depending on whether the current dataField is being sorted 'asc'
  	 * or 'desc'.
  	 * @see https://github.com/AllenFang/react-bootstrap-table/blob/master/examples/js/sort/sort-style-table.js#L36-L37
  	 */
  var sortHeaderColumnClassName: js.UndefOr[
    java.lang.String | (js.Function2[/* order */ SortOrder, /* dataField */ java.lang.String, java.lang.String])
  ] = js.undefined
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
    reactLib.reactMod.ReactNs.CSSProperties | (js.Function4[
      /* cell */ js.Any, 
      /* row */ js.Any, 
      /* rowIndex */ scala.Double, 
      /* columnIndex */ scala.Double, 
      reactLib.reactMod.ReactNs.CSSProperties
    ])
  ] = js.undefined
  /**
  	 * Allow you to add your custom style object on TH element.
  	 */
  var thStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
  	 * Set the column width, including the units. e.g. '10%' or '150px'
  	 */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

