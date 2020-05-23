package typings.reactForm.anon

import typings.reactForm.mod.FormValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var label: String
  var value: FormValue
}

object Label {
  @scala.inline
  def apply(label: String, value: FormValue): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

