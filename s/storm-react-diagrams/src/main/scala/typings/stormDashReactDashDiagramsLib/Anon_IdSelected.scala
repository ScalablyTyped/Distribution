package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdSelected extends js.Object {
  var id: java.lang.String
  var selected: scala.Boolean
  var `type`: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

object Anon_IdSelected {
  @scala.inline
  def apply(
    id: java.lang.String,
    selected: scala.Boolean,
    `type`: java.lang.String,
    x: scala.Double,
    y: scala.Double
  ): Anon_IdSelected = {
    val __obj = js.Dynamic.literal(id = id, selected = selected, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdSelected]
  }
}

