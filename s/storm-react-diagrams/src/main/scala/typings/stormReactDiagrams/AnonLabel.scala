package typings.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var id: String
  var label: String
  var offsetX: Double
  var offsetY: Double
  var selected: Boolean
  var `type`: String
}

object AnonLabel {
  @scala.inline
  def apply(id: String, label: String, offsetX: Double, offsetY: Double, selected: Boolean, `type`: String): AnonLabel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

