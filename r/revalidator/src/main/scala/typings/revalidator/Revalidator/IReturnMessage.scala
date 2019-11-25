package typings.revalidator.Revalidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReturnMessage extends js.Object {
  var errors: js.Array[IErrrorProperty]
  var valid: Boolean
}

object IReturnMessage {
  @scala.inline
  def apply(errors: js.Array[IErrrorProperty], valid: Boolean): IReturnMessage = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IReturnMessage]
  }
}

