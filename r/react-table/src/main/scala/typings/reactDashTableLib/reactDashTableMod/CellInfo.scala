package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick<react-table.react-table.ControlledStateOverrideProps, 'resized'>) */ trait CellInfo extends RowInfo {
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

