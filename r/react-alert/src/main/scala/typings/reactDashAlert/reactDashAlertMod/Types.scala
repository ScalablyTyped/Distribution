package typings.reactDashAlert.reactDashAlertMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashAlert.reactDashAlertStrings.error
import typings.reactDashAlert.reactDashAlertStrings.info
import typings.reactDashAlert.reactDashAlertStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var ERROR: error
  var INFO: info
  var SUCCESS: success
}

object Types {
  @scala.inline
  def apply(ERROR: error, INFO: info, SUCCESS: success): Types = {
    val __obj = js.Dynamic.literal(ERROR = ERROR, INFO = INFO, SUCCESS = SUCCESS)
  
    __obj.asInstanceOf[Types]
  }
}

@JSImport("react-alert", "types")
@js.native
object types extends TopLevel[Types]

