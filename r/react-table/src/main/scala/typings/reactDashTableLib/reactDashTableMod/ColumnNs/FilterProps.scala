package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Filtering related column props */
@js.native
trait FilterProps extends js.Object {
  /** Default: ... */
  @JSName("Filter")
  var Filter_Original: reactDashTableLib.reactDashTableMod.FilterRender = js.native
  /** Default: false */
  var filterAll: scala.Boolean = js.native
  /**
    * A function returning a boolean that specifies the filtering logic for the column
    * 'filter' == an object specifying which filter is being applied. Format: {id: [the filter column's id], value: [the value the user typed in the filter field],
    * pivotId: [if filtering on a pivot column, the pivotId will be set to the pivot column's id and the `id` field will be set to the top level pivoting column]}
    * 'row' || 'rows' == the row (or rows, if filterAll is set to true) of data supplied to the table
    * 'column' == the column that the filter is on
    */
  var filterMethod: reactDashTableLib.reactDashTableMod.FilterFunction | reactDashTableLib.reactDashTableMod.DefaultFilterFunction = js.native
  /** Default: false */
  var hideFilter: scala.Boolean = js.native
  /** Default: ... */
  def Filter(params: reactDashTableLib.Anon_Column): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
}

