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
    val __obj = js.Dynamic.literal(aggregated = aggregated.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnProps = columnProps.asInstanceOf[js.Any], expander = expander.asInstanceOf[js.Any], groupedByPivot = groupedByPivot.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], nestingPath = nestingPath.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pivoted = pivoted.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowValues = rowValues.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any], tdProps = tdProps.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], viewIndex = viewIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellInfo]
  }
}

