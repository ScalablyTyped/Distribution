package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLabel extends js.Object {
  var id: java.lang.String
  var label: java.lang.String
  var offsetX: scala.Double
  var offsetY: scala.Double
  var selected: scala.Boolean
  var `type`: java.lang.String
}

object Anon_IdLabel {
  @scala.inline
  def apply(
    id: java.lang.String,
    label: java.lang.String,
    offsetX: scala.Double,
    offsetY: scala.Double,
    selected: scala.Boolean,
    `type`: java.lang.String
  ): Anon_IdLabel = {
    val __obj = js.Dynamic.literal(id = id, label = label, offsetX = offsetX, offsetY = offsetY, selected = selected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdLabel]
  }
}

