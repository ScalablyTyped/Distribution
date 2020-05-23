package typings.stormReactDiagrams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var id: String
  var selected: Boolean
  var `type`: String
}

object Type {
  @scala.inline
  def apply(id: String, selected: Boolean, `type`: String): Type = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

