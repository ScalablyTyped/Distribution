package typings.reactForm

import typings.reactForm.mod.FormValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String
  var value: FormValue
}

object AnonLabel {
  @scala.inline
  def apply(label: String, value: FormValue): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

