package typings.sparkpost.sparkpostMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorWithDescription extends js.Object {
  var code: String
  var description: String
  var message: String
}

object ErrorWithDescription {
  @scala.inline
  def apply(code: String, description: String, message: String): ErrorWithDescription = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorWithDescription]
  }
}

