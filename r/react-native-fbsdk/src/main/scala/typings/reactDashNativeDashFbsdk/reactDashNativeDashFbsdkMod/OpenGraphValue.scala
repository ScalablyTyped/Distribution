package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

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
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenGraphValue]
  }
}

