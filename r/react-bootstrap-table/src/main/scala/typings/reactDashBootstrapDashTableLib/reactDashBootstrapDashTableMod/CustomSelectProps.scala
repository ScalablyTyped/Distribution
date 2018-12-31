package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomSelectProps extends js.Object {
  /**
  	 * True if the current row being drawn is selected.
  	 */
  var checked: scala.Boolean = js.native
  /**
  	 * True if the current row being drawn is not permitted to be selected.
  	 */
  var disabled: scala.Boolean = js.native
  /**
  	 * The indeterminate flag is used to indicate that there are some rows selected, but it is neither all rows nor
  	 * no rows. As far as the select all checkbox is concerned, it is neither true nor false.
  	 */
  var indeterminate: scala.Boolean = js.native
  /**
  	 * Index for the row currently being rendered.
  	 * If the rowIndex is 'Header', it means this rendering is for header selection column.
  	 */
  var rowIndex: scala.Double | java.lang.String = js.native
  /**
  	 * What type of selection should be used? Values are 'radio' (single) or 'checkbox' (multiple).
  	 */
  var `type`: SelectRowMode = js.native
  /**
  	 * Callback that should be used when someone selects the current row.
  	 *   `event`: the current event target
  	 *   `rowIndex`: the index of the current row being toggled.
  	 */
  def onChange(event: js.Any, rowIndex: java.lang.String): scala.Unit = js.native
  def onChange(event: js.Any, rowIndex: scala.Double): scala.Unit = js.native
}

