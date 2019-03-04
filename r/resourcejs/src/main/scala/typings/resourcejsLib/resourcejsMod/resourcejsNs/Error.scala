package typings
package resourcejsLib.resourcejsMod.resourcejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var errors: js.Array[Error]
  var message: java.lang.String
  var name: java.lang.String
  var path: java.lang.String
}

object Error {
  @scala.inline
  def apply(errors: js.Array[Error], message: java.lang.String, name: java.lang.String, path: java.lang.String): Error = {
    val __obj = js.Dynamic.literal(errors = errors, message = message, name = name, path = path)
  
    __obj.asInstanceOf[Error]
  }
}

