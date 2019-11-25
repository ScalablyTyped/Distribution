package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdOffsetX extends js.Object {
  var id: String
  var offsetX: Double
  var offsetY: Double
  var selected: Boolean
  var `type`: String
}

object Anon_IdOffsetX {
  @scala.inline
  def apply(id: String, offsetX: Double, offsetY: Double, selected: Boolean, `type`: String): Anon_IdOffsetX = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdOffsetX]
  }
}

