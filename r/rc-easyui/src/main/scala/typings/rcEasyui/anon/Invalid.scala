package typings.rcEasyui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invalid extends js.Object {
  var invalid: Boolean
  var validateOnBlur: Boolean
  var validateOnChange: Boolean
  var validateOnCreate: Boolean
}

object Invalid {
  @scala.inline
  def apply(invalid: Boolean, validateOnBlur: Boolean, validateOnChange: Boolean, validateOnCreate: Boolean): Invalid = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validateOnChange = validateOnChange.asInstanceOf[js.Any], validateOnCreate = validateOnCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalid]
  }
}

