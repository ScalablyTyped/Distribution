package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDescription[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * Column text alignment setting
  	 * Comes from TableHeader.dataAlign property.
  	 */
  var align: DataAlignType
  /**
  	 * Custom attributes (e.g. {'data-attr': 'test'}) to be applied to cells in this column.
  	 * Comes from TableHeader.tdAttr property.
  	 */
  var attrs: CustomAttrs
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
  ])
  /**
  	 * Custom title to display for this column.
  	 * Comes from TableHeader.columnTitle property.
  	 */
  var columnTitle: Boolean
  /**
  	 * Custom editor settings to use when editing the data in this column.
  	 * Comes from TableHeader.customEditor property.
  	 */
  var customEditor: CustomEditor[TRow, _]
  /**
  	 * Custom attributes (e.g. {'data-attr': 'test'}) to use for cells that are being edited in this column.
  	 * Comes from TableHeader.editTdAttr property.
  	 */
  var editAttrs: CustomAttrs
  /**
  	 * Custom className setting for this column when a cell in the column is being edited.
  	 * Comes from TableHeader.editColumnClassName property.
  	 */
  var editClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String])
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
  ])
  /**
  	 * Flag to indicate whether this column is expandable.
  	 * Comes from TableHeader.expandable property.
  	 */
  var expandable: Boolean
  /**
  	 * Flag to indicate whether this column should be included in a CSV export.
  	 * Comes from TableHeader.export property.
  	 */
  var export: Boolean
  /**
  	 * Whether data should be filtered based on the formatted value, or the raw data value.
  	 * Comes from TableHeader.filterFormatted property.
  	 */
  var filterFormatted: Boolean
  /**
  	 * The formatExtraData setting for the column.
  	 * Comes from TableHeader.formatExtraData property.
  	 */
  var formatExtraData: js.Any
  /**
  	 * Flag to indicate whether this column should be visible or not.
  	 * Comes from TableHeader.hidden property.
  	 */
  var hidden: Boolean
  /**
  	 * Flag to indicate whether this column should be hidden on the insert modal.
  	 * Comes from TableHeader.hiddenOnInsert property.
  	 */
  var hiddenOnInsert: Boolean
  /**
  	 * Custom className setting for this column when a cell in the column contains invalid data.
  	 * Comes from TableHeader.invalidEditColumnClassName property.
  	 */
  var invalidEditColumnClassName: String | (js.Function2[/* cell */ js.Any, /* row */ TRow, String])
  /**
  	 * Name of the column.
  	 * Comes from TableHeader.dataField property.
  	 */
  var name: String
  /**
  	 * Flag to indicate whether the data in this column should be included in a search.
  	 * Comes from TableHeader.searchable property.
  	 */
  var searchable: Boolean
  /**
  	 * Column sorting setting. If true, the column can be used to sort the data.
  	 * Comes from TableHeader.dataSort property.
  	 */
  var sort: Boolean
  /**
  	 * Extra data to be provided to the search function for this column.
  	 * Comes from TableHeader.sortFuncExtraData property.
  	 */
  var sortFuncExtraData: js.Any
  /**
  	 * CSS style properties to use for cells in this column.
  	 * Comes from TableHeader.tdStyle property.
  	 */
  var style: CSSProperties
  /**
  	 * Custom header value/component/children to use for this column.
  	 * Comes from TableHeader.headerText || TableHeader.children properties.
  	 */
  var text: String | Double | Boolean | ReactElement
  /**
  	 * Width setting for this column.
  	 * Comes from TableHeader.width property.
  	 */
  var width: String
  /**
  	 * Filter function for the column.
  	 * Comes from TableHeader.filterValue property.
  	 */
  def filterValue(cell: js.Any, row: TRow): js.Any
  /**
  	 * Column data format function.
  	 * Comes from TableHeader.dataFormat property.
  	 */
  def format(cell: js.Any, row: TRow, formatExtraData: js.Any, rowIndex: Double): String | ReactElement
  /**
  	 * Custom sort function to use for this column.
  	 * Comes from TableHeader.sortFunc property.
  	 */
  def sortFunc(a: TRow, b: TRow, order: SortOrder, sortField: String, extraData: js.Any): Double
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
    name: String,
    searchable: Boolean,
    sort: Boolean,
    sortFunc: (TRow, TRow, SortOrder, String, js.Any) => Double,
    sortFuncExtraData: js.Any,
    style: CSSProperties,
    text: String | Double | Boolean | ReactElement,
    width: String
  ): ColumnDescription[TRow] = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], columnTitle = columnTitle.asInstanceOf[js.Any], customEditor = customEditor.asInstanceOf[js.Any], editAttrs = editAttrs.asInstanceOf[js.Any], editClassName = editClassName.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], expandable = expandable.asInstanceOf[js.Any], export = export.asInstanceOf[js.Any], filterFormatted = filterFormatted.asInstanceOf[js.Any], filterValue = js.Any.fromFunction2(filterValue), format = js.Any.fromFunction4(format), formatExtraData = formatExtraData.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hiddenOnInsert = hiddenOnInsert.asInstanceOf[js.Any], invalidEditColumnClassName = invalidEditColumnClassName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], sortFunc = js.Any.fromFunction5(sortFunc), sortFuncExtraData = sortFuncExtraData.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnDescription[TRow]]
  }
}

