package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLabel extends js.Object {
  var id: String
  var label: String
  var offsetX: Double
  var offsetY: Double
  var selected: Boolean
  var `type`: String
}

object Anon_IdLabel {
  @scala.inline
  def apply(id: String, label: String, offsetX: Double, offsetY: Double, selected: Boolean, `type`: String): Anon_IdLabel = {
    val __obj = js.Dynamic.literal(id = id, label = label, offsetX = offsetX, offsetY = offsetY, selected = selected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdLabel]
  }
}

