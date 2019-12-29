package typings.reactDashInspector.reactDashInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectorNodeParams extends js.Object {
  var data: js.Any
  var depth: Double
  var expanded: Boolean
  var isNonenumerable: Boolean
  var name: String
}

object InspectorNodeParams {
  @scala.inline
  def apply(data: js.Any, depth: Double, expanded: Boolean, isNonenumerable: Boolean, name: String): InspectorNodeParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isNonenumerable = isNonenumerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InspectorNodeParams]
  }
}

