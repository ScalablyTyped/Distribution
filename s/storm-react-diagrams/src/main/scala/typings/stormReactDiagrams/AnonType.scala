package typings.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var id: String
  var selected: Boolean
  var `type`: String
}

object AnonType {
  @scala.inline
  def apply(id: String, selected: Boolean, `type`: String): AnonType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

