package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenGraphValue extends js.Object {
  var `type`: OpenGraphValueType
  var value: js.Any
}

object OpenGraphValue {
  @scala.inline
  def apply(`type`: OpenGraphValueType, value: js.Any): OpenGraphValue = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OpenGraphValue]
  }
}

