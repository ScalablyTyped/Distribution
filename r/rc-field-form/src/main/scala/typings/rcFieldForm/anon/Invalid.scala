package typings.rcFieldForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invalid extends js.Object {
  var format: String
  var invalid: String
  var parse: String
}

object Invalid {
  @scala.inline
  def apply(format: String, invalid: String, parse: String): Invalid = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalid]
  }
}

