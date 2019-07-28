package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDefaults extends js.Object {
  /** Will be overriden in methods.js to display ExpanderComponent */
  var render: TableCellRenderer
}

object PivotDefaults {
  @scala.inline
  def apply(render: TableCellRenderer): PivotDefaults = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PivotDefaults]
  }
}

