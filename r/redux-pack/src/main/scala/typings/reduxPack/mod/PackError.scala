package typings.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackError extends js.Object {
  var error: Boolean
  var payload: js.Any
}

object PackError {
  @scala.inline
  def apply(error: Boolean, payload: js.Any): PackError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackError]
  }
}

