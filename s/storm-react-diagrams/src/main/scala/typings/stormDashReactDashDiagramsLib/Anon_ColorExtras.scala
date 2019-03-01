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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("extras")(extras)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ports")(ports)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_ColorExtras]
  }
}

