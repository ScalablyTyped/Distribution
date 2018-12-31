package typings
package reactDashTableLib.reactDashTableMod.ColumnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Basic column props */
trait Basics extends js.Object {
  /** Used to render aggregated cells. Defaults to a comma separated list of values. */
  var Aggregated: reactDashTableLib.reactDashTableMod.TableCellRenderer
  /** Used to render the expander in both Pivot and Expander cells */
  var Expander: reactDashTableLib.reactDashTableMod.TableCellRenderer
  /** Used to render a pivoted cell  */
  var Pivot: reactDashTableLib.reactDashTableMod.PivotRenderer
  /**  Used to render the value inside of a Pivot cell */
  var PivotValue: reactDashTableLib.reactDashTableMod.TableCellRenderer
  /** Default: false */
  var defaultSortDesc: js.UndefOr[scala.Boolean]
  /** Default: undefined, use table default */
  var filterable: js.UndefOr[scala.Boolean]
  /** Default: 100 */
  var minWidth: scala.Double
  /** Default: undefined, use table default */
  var resizable: js.UndefOr[scala.Boolean]
  /** Default: true */
  var show: scala.Boolean
  /** Default: ... */
  var sortMethod: js.UndefOr[reactDashTableLib.reactDashTableMod.SortFunction]
  /** Default: undefined, use table default */
  var sortable: js.UndefOr[scala.Boolean]
}

