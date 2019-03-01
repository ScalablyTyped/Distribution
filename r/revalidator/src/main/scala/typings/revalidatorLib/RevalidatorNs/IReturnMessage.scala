package typings
package revalidatorLib.RevalidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IReturnMessage extends js.Object {
  var errors: js.Array[IErrrorProperty]
  var valid: scala.Boolean
}

object IReturnMessage {
  @scala.inline
  def apply(errors: js.Array[IErrrorProperty], valid: scala.Boolean): IReturnMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[IReturnMessage]
  }
}

