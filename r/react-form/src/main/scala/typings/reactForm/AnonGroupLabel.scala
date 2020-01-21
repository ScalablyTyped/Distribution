package typings.reactForm

import typings.reactForm.mod.FieldApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupLabel extends js.Object {
  var group: FieldApi
  var label: String
}

object AnonGroupLabel {
  @scala.inline
  def apply(group: FieldApi, label: String): AnonGroupLabel = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGroupLabel]
  }
}

