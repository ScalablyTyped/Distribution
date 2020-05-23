package typings.reactNativeForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackProp extends js.Object {
  var callbackProp: String
  var controlled: Boolean
  var valueProp: String
}

object CallbackProp {
  @scala.inline
  def apply(callbackProp: String, controlled: Boolean, valueProp: String): CallbackProp = {
    val __obj = js.Dynamic.literal(callbackProp = callbackProp.asInstanceOf[js.Any], controlled = controlled.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackProp]
  }
}

