package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Filtering related column props */
trait FilterProps[D] extends js.Object {
  /** Default: ... */
  var Filter: reactDashTableLib.reactDashTableMod.FilterRender[D]
  /** Default: false */
  var filterAll: scala.Boolean
  /**
    * A function returning a boolean that specifies the filtering logic for the column
    * 'filter' == an object specifying which filter is being applied. Format: {id: [the filter column's id], value: [the value the user typed in the filter field],
    * pivotId: [if filtering on a pivot column, the pivotId will be set to the pivot column's id and the `id` field will be set to the top level pivoting column]}
    * 'row' || 'rows' == the row (or rows, if filterAll is set to true) of data supplied to the table
    * 'column' == the column that the filter is on
    */
  var filterMethod: reactDashTableLib.reactDashTableMod.FilterFunction | reactDashTableLib.reactDashTableMod.DefaultFilterFunction
  /** Default: false */
  var hideFilter: scala.Boolean
}

object FilterProps {
  @scala.inline
  def apply[D](
    Filter: reactDashTableLib.reactDashTableMod.FilterRender[D],
    filterAll: scala.Boolean,
    filterMethod: reactDashTableLib.reactDashTableMod.FilterFunction | reactDashTableLib.reactDashTableMod.DefaultFilterFunction,
    hideFilter: scala.Boolean
  ): FilterProps[D] = {
    val __obj = js.Dynamic.literal(Filter = Filter, filterAll = filterAll, filterMethod = filterMethod.asInstanceOf[js.Any], hideFilter = hideFilter)
  
    __obj.asInstanceOf[FilterProps[D]]
  }
}

