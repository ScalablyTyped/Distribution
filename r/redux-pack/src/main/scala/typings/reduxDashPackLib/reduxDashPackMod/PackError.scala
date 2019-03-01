package typings
package reduxDashPackLib.reduxDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackError extends js.Object {
  var error: scala.Boolean
  var payload: js.Any
}

object PackError {
  @scala.inline
  def apply(error: scala.Boolean, payload: js.Any): PackError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[PackError]
  }
}

