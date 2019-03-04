package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'resized' ]: react-table.react-table.ControlledStateOverrideProps[P]} */ trait CellInfo extends RowInfo {
  /* resolved array of classes for the cell */
  var classes: js.Array[java.lang.String]
  /* the cell's column */
  var column: Column[_]
  /* resolved column props from 'getProps' for this cell's column */
  var columnProps: js.Any
  /* true if this column is an expander */
  var expander: scala.Boolean
  /* true if this row is expanded */
  var isExpanded: scala.Boolean
  /* resolved maxWidth of the cell */
  var maxWidth: scala.Double
  /* true if the column is pivoted */
  var pivoted: scala.Boolean
  /* true if the column is visible */
  var show: scala.Boolean
  /* resolved styles for this cell */
  var styles: js.Object
  /* resolved tdProps from `getTdProps` for this cell */
  var tdProps: js.Any
  /* materialized value of the cell */
  var value: js.Any
  /* resolved width of the cell */
  var width: scala.Double
}

object CellInfo {
  @scala.inline
  def apply(
    aggregated: scala.Boolean,
    classes: js.Array[java.lang.String],
    column: Column[_],
    columnProps: js.Any,
    expander: scala.Boolean,
    groupedByPivot: scala.Boolean,
    index: scala.Double,
    isExpanded: scala.Boolean,
    level: scala.Double,
    maxWidth: scala.Double,
    nestingPath: js.Array[scala.Double],
    original: js.Any,
    page: scala.Double,
    pageSize: scala.Double,
    pivoted: scala.Boolean,
    row: js.Any,
    rowValues: js.Any,
    show: scala.Boolean,
    styles: js.Object,
    subRows: js.Array[_],
    tdProps: js.Any,
    value: js.Any,
    viewIndex: scala.Double,
    width: scala.Double
  ): CellInfo = {
    val __obj = js.Dynamic.literal(aggregated = aggregated, classes = classes, column = column, columnProps = columnProps, expander = expander, groupedByPivot = groupedByPivot, index = index, isExpanded = isExpanded, level = level, maxWidth = maxWidth, nestingPath = nestingPath, original = original, page = page, pageSize = pageSize, pivoted = pivoted, row = row, rowValues = rowValues, show = show, styles = styles, subRows = subRows, tdProps = tdProps, value = value, viewIndex = viewIndex, width = width)
  
    __obj.asInstanceOf[CellInfo]
  }
}

