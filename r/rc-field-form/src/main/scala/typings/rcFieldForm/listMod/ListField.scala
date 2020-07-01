package typings.rcFieldForm.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListField extends js.Object {
  var isListField: Boolean
  var key: Double
  var name: Double
}

object ListField {
  @scala.inline
  def apply(isListField: Boolean, key: Double, name: Double): ListField = {
    val __obj = js.Dynamic.literal(isListField = isListField.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListField]
  }
}

