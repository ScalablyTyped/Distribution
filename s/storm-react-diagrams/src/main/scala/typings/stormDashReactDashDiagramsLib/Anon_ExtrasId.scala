package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtrasId extends js.Object {
  var extras: js.Any
  var id: java.lang.String
  var ports: js.Array[Anon_IdLinks]
  var selected: scala.Boolean
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object Anon_ExtrasId {
  @scala.inline
  def apply(
    extras: js.Any,
    id: java.lang.String,
    ports: js.Array[Anon_IdLinks],
    selected: scala.Boolean,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): Anon_ExtrasId = {
    val __obj = js.Dynamic.literal(extras = extras, id = id, ports = ports, selected = selected, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ExtrasId]
  }
}

