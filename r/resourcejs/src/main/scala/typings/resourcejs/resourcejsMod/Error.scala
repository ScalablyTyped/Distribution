package typings.resourcejs.resourcejsMod

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
    val __obj = js.Dynamic.literal(errors = errors, message = message, name = name, path = path)
  
    __obj.asInstanceOf[Error]
  }
}

