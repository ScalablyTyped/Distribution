package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checkbox extends js.Object {
  var checkbox: Boolean
  var radio: Boolean
}

object Checkbox {
  @scala.inline
  def apply(checkbox: Boolean, radio: Boolean): Checkbox = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkbox]
  }
}

