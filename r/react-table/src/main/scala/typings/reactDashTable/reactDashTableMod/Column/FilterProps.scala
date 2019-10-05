package typings.reactDashTable.reactDashTableMod.Column

import typings.react.reactMod.ReactElement
import typings.reactDashTable.Anon_Column
import typings.reactDashTable.reactDashTableMod.DefaultFilterFunction
import typings.reactDashTable.reactDashTableMod.Filter
import typings.reactDashTable.reactDashTableMod.FilterFunction
import typings.reactDashTable.reactDashTableMod.FilterRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Filtering related column props */
trait FilterProps extends js.Object {
  /** Default: ... */
  var Filter: FilterRender
  /** Default: false */
  var filterAll: Boolean
  /**
    * A function returning a boolean that specifies the filtering logic for the column
    * 'filter' == an object specifying which filter is being applied. Format: {id: [the filter column's id], value: [the value the user typed in the filter field],
    * pivotId: [if filtering on a pivot column, the pivotId will be set to the pivot column's id and the `id` field will be set to the top level pivoting column]}
    * 'row' || 'rows' == the row (or rows, if filterAll is set to true) of data supplied to the table
    * 'column' == the column that the filter is on
    */
  var filterMethod: FilterFunction | DefaultFilterFunction
  /** Default: false */
  var hideFilter: Boolean
}

object FilterProps {
  @scala.inline
  def apply(
    Filter: /* params */ Anon_Column => ReactElement,
    filterAll: Boolean,
    filterMethod: (/* filter */ Filter, (/* row */ js.Any) | (/* rows */ js.Array[js.Any]), /* column */ js.Any) => js.Array[js.Any] | Boolean,
    hideFilter: Boolean
  ): FilterProps = {
    val __obj = js.Dynamic.literal(Filter = js.Any.fromFunction1(Filter), filterAll = filterAll, filterMethod = js.Any.fromFunction3(filterMethod), hideFilter = hideFilter)
  
    __obj.asInstanceOf[FilterProps]
  }
}

