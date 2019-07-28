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
    val __obj = js.Dynamic.literal(extras = extras, id = id, ports = ports, selected = selected, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ExtrasId]
  }
}

