package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithParam extends js.Object {
  var message: String
  var param: String
  var value: String | Null
}

object ErrorWithParam {
  @scala.inline
  def apply(message: String, param: String, value: String = null): ErrorWithParam = {
    val __obj = js.Dynamic.literal(message = message, param = param)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ErrorWithParam]
  }
}

