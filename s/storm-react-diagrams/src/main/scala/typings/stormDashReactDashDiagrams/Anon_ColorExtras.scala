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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorExtras]
  }
}

