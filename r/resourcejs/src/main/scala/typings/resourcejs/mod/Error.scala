package typings.resourcejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var errors: js.Array[Error]
  var message: String
  var name: String
  var path: String
}

object Error {
  @scala.inline
  def apply(errors: js.Array[Error], message: String, name: String, path: String): Error = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Error]
  }
}

