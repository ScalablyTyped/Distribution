package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtrasId extends js.Object {
  var extras: js.Any
  var id: String
  var ports: js.Array[Anon_IdLinks]
  var selected: Boolean
  var `type`: String
  var x: Double
  var y: Double
}

object Anon_ExtrasId {
  @scala.inline
  def apply(
    extras: js.Any,
    id: String,
    ports: js.Array[Anon_IdLinks],
    selected: Boolean,
    `type`: String,
    x: Double,
    y: Double
  ): Anon_ExtrasId = {
    val __obj = js.Dynamic.literal(extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtrasId]
  }
}

