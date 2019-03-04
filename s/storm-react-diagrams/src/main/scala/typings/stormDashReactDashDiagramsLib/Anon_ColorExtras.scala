package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorExtras extends js.Object {
  var color: java.lang.String
  var extras: js.Any
  var id: java.lang.String
  var name: java.lang.String
  var ports: js.Array[Anon_IdLinks]
  var selected: scala.Boolean
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object Anon_ColorExtras {
  @scala.inline
  def apply(
    color: java.lang.String,
    extras: js.Any,
    id: java.lang.String,
    name: java.lang.String,
    ports: js.Array[Anon_IdLinks],
    selected: scala.Boolean,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): Anon_ColorExtras = {
    val __obj = js.Dynamic.literal(color = color, extras = extras, id = id, name = name, ports = ports, selected = selected, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ColorExtras]
  }
}

