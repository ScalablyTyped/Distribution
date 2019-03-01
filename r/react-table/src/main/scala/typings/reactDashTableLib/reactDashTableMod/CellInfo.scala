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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregated")(aggregated)
    __obj.updateDynamic("classes")(classes)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("columnProps")(columnProps)
    __obj.updateDynamic("expander")(expander)
    __obj.updateDynamic("groupedByPivot")(groupedByPivot)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isExpanded")(isExpanded)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("maxWidth")(maxWidth)
    __obj.updateDynamic("nestingPath")(nestingPath)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("pageSize")(pageSize)
    __obj.updateDynamic("pivoted")(pivoted)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("rowValues")(rowValues)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("styles")(styles)
    __obj.updateDynamic("subRows")(subRows)
    __obj.updateDynamic("tdProps")(tdProps)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("viewIndex")(viewIndex)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[CellInfo]
  }
}

