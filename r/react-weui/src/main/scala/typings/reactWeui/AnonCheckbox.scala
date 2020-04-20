package typings.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckbox extends js.Object {
  var checkbox: Boolean
  var radio: Boolean
}

object AnonCheckbox {
  @scala.inline
  def apply(checkbox: Boolean, radio: Boolean): AnonCheckbox = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckbox]
  }
}

