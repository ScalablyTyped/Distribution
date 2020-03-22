package typings.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelected extends js.Object {
  var id: String
  var selected: Boolean
  var `type`: String
  var x: Double
  var y: Double
}

object AnonSelected {
  @scala.inline
  def apply(id: String, selected: Boolean, `type`: String, x: Double, y: Double): AnonSelected = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelected]
  }
}

