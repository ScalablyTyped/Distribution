package typings.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalid extends js.Object {
  var format: String
  var invalid: String
  var parse: String
}

object AnonInvalid {
  @scala.inline
  def apply(format: String, invalid: String, parse: String): AnonInvalid = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInvalid]
  }
}

