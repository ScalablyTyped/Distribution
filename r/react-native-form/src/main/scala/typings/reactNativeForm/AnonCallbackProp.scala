package typings.reactNativeForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallbackProp extends js.Object {
  var callbackProp: String
  var controlled: Boolean
  var valueProp: String
}

object AnonCallbackProp {
  @scala.inline
  def apply(callbackProp: String, controlled: Boolean, valueProp: String): AnonCallbackProp = {
    val __obj = js.Dynamic.literal(callbackProp = callbackProp.asInstanceOf[js.Any], controlled = controlled.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallbackProp]
  }
}

