package typings.reactDashSortableDashPane.reactDashSortableDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaneProperty extends js.Object {
  var height: Double | String
  var id: PaneId
  var order: Double
  var width: Double | String
}

object PaneProperty {
  @scala.inline
  def apply(height: Double | String, id: PaneId, order: Double, width: Double | String): PaneProperty = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], order = order, width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaneProperty]
  }
}

