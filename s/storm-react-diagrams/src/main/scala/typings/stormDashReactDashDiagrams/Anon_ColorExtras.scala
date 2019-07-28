package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorExtras extends js.Object {
  var color: String
  var extras: js.Any
  var id: String
  var name: String
  var ports: js.Array[Anon_IdLinks]
  var selected: Boolean
  var `type`: String
  var x: Double
  var y: Double
}

object Anon_ColorExtras {
  @scala.inline
  def apply(
    color: String,
    extras: js.Any,
    id: String,
    name: String,
    ports: js.Array[Anon_IdLinks],
    selected: Boolean,
    `type`: String,
    x: Double,
    y: Double
  ): Anon_ColorExtras = {
    val __obj = js.Dynamic.literal(color = color, extras = extras, id = id, name = name, ports = ports, selected = selected, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ColorExtras]
  }
}

