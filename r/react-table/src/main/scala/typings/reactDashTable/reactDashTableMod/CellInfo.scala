package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'resized' ]: react-table.react-table.ControlledStateOverrideProps[P]} */ trait CellInfo extends RowInfo {
  /* resolved array of classes for the cell */
  var classes: js.Array[String]
  /* the cell's column */
  var column: Column[_]
  /* resolved column props from 'getProps' for this cell's column */
  var columnProps: js.Any
  /* true if this column is an expander */
  var expander: Boolean
  /* true if this row is expanded */
  var isExpanded: Boolean
  /* resolved maxWidth of the cell */
  var maxWidth: Double
  /* true if the column is pivoted */
  var pivoted: Boolean
  /* true if the column is visible */
  var show: Boolean
  /* resolved styles for this cell */
  var styles: js.Object
  /* resolved tdProps from `getTdProps` for this cell */
  var tdProps: js.Any
  /* materialized value of the cell */
  var value: js.Any
  /* resolved width of the cell */
  var width: Double
}

object CellInfo {
  @scala.inline
  def apply(
    aggregated: Boolean,
    classes: js.Array[String],
    column: Column[_],
    columnProps: js.Any,
    expander: Boolean,
    groupedByPivot: Boolean,
    index: Double,
    isExpanded: Boolean,
    level: Double,
    maxWidth: Double,
    nestingPath: js.Array[Double],
    original: js.Any,
    page: Double,
    pageSize: Double,
    pivoted: Boolean,
    row: js.Any,
    rowValues: js.Any,
    show: Boolean,
    styles: js.Object,
    subRows: js.Array[_],
    tdProps: js.Any,
    value: js.Any,
    viewIndex: Double,
    width: Double
  ): CellInfo = {
    val __obj = js.Dynamic.literal(aggregated = aggregated, classes = classes, column = column, columnProps = columnProps, expander = expander, groupedByPivot = groupedByPivot, index = index, isExpanded = isExpanded, level = level, maxWidth = maxWidth, nestingPath = nestingPath, original = original, page = page, pageSize = pageSize, pivoted = pivoted, row = row, rowValues = rowValues, show = show, styles = styles, subRows = subRows, tdProps = tdProps, value = value, viewIndex = viewIndex, width = width)
  
    __obj.asInstanceOf[CellInfo]
  }
}

