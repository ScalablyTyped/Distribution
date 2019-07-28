package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdSelected extends js.Object {
  var id: String
  var selected: Boolean
  var `type`: String
  var x: Double
  var y: Double
}

object Anon_IdSelected {
  @scala.inline
  def apply(id: String, selected: Boolean, `type`: String, x: Double, y: Double): Anon_IdSelected = {
    val __obj = js.Dynamic.literal(id = id, selected = selected, x = x, y = y)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdSelected]
  }
}

