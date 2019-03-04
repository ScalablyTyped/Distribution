package typings
package reactDashSortableDashPaneLib.reactDashSortableDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProperty extends js.Object {
  var height: scala.Double | java.lang.String
  var id: PaneId
  var order: scala.Double
  var width: scala.Double | java.lang.String
}

object PaneProperty {
  @scala.inline
  def apply(
    height: scala.Double | java.lang.String,
    id: PaneId,
    order: scala.Double,
    width: scala.Double | java.lang.String
  ): PaneProperty = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], order = order, width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaneProperty]
  }
}

