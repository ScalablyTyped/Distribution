package typings.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPorts extends js.Object {
  var extras: js.Any
  var id: String
  var ports: js.Array[AnonLinks]
  var selected: Boolean
  var `type`: String
  var x: Double
  var y: Double
}

object AnonPorts {
  @scala.inline
  def apply(
    extras: js.Any,
    id: String,
    ports: js.Array[AnonLinks],
    selected: Boolean,
    `type`: String,
    x: Double,
    y: Double
  ): AnonPorts = {
    val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPorts]
  }
}

