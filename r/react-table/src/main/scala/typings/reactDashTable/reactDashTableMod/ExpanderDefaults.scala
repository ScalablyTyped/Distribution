package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpanderDefaults extends js.Object {
  /** Default: false */
  var filterable: Boolean
  /** Default: false */
  var resizable: Boolean
  /** Default: false */
  var sortable: Boolean
  /** Default: 35 */
  var width: Double
}

object ExpanderDefaults {
  @scala.inline
  def apply(filterable: Boolean, resizable: Boolean, sortable: Boolean, width: Double): ExpanderDefaults = {
    val __obj = js.Dynamic.literal(filterable = filterable.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpanderDefaults]
  }
}

