package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radio extends js.Object {
  var checkbox: Boolean
  var radio: Boolean
  var select: Boolean
  var selectPos: js.Any
  var switch: Boolean
  var vcode: Boolean
  var warn: Boolean
}

object Radio {
  @scala.inline
  def apply(
    checkbox: Boolean,
    radio: Boolean,
    select: Boolean,
    selectPos: js.Any,
    switch: Boolean,
    vcode: Boolean,
    warn: Boolean
  ): Radio = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectPos = selectPos.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], vcode = vcode.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radio]
  }
}

