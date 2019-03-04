package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpanderDefaults extends js.Object {
  /** Default: false */
  var filterable: scala.Boolean
  /** Default: false */
  var resizable: scala.Boolean
  /** Default: false */
  var sortable: scala.Boolean
  /** Default: 35 */
  var width: scala.Double
}

object ExpanderDefaults {
  @scala.inline
  def apply(filterable: scala.Boolean, resizable: scala.Boolean, sortable: scala.Boolean, width: scala.Double): ExpanderDefaults = {
    val __obj = js.Dynamic.literal(filterable = filterable, resizable = resizable, sortable = sortable, width = width)
  
    __obj.asInstanceOf[ExpanderDefaults]
  }
}

