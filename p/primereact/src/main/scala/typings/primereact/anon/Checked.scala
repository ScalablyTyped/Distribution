package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checked extends js.Object {
  var checked: Boolean
  var id: String
  var name: String
  var `type`: String
  var value: js.Any
}

object Checked {
  @scala.inline
  def apply(checked: Boolean, id: String, name: String, `type`: String, value: js.Any): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
}

