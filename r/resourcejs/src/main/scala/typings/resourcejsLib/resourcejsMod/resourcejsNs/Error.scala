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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Error]
  }
}

