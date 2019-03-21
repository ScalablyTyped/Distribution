package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var ERROR: reactDashAlertLib.reactDashAlertLibStrings.error
  var INFO: reactDashAlertLib.reactDashAlertLibStrings.info
  var SUCCESS: reactDashAlertLib.reactDashAlertLibStrings.success
}

object Types {
  @scala.inline
  def apply(
    ERROR: reactDashAlertLib.reactDashAlertLibStrings.error,
    INFO: reactDashAlertLib.reactDashAlertLibStrings.info,
    SUCCESS: reactDashAlertLib.reactDashAlertLibStrings.success
  ): Types = {
    val __obj = js.Dynamic.literal(ERROR = ERROR, INFO = INFO, SUCCESS = SUCCESS)
  
    __obj.asInstanceOf[Types]
  }
}

