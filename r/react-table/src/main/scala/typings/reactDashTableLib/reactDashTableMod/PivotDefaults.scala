package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDefaults[D] extends js.Object {
  /** Will be overriden in methods.js to display ExpanderComponent */
  var render: TableCellRenderer[D]
}

object PivotDefaults {
  @scala.inline
  def apply[D](render: TableCellRenderer[D]): PivotDefaults[D] = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PivotDefaults[D]]
  }
}

