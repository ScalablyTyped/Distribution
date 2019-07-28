package typings.stormDashReactDashDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdSelectedType extends js.Object {
  var id: String
  var selected: Boolean
  var `type`: String
}

object Anon_IdSelectedType {
  @scala.inline
  def apply(id: String, selected: Boolean, `type`: String): Anon_IdSelectedType = {
    val __obj = js.Dynamic.literal(id = id, selected = selected)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdSelectedType]
  }
}

