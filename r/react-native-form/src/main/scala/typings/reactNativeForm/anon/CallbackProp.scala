package typings.reactNativeForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackProp extends js.Object {
  var callbackProp: String = js.native
  var controlled: Boolean = js.native
  var valueProp: String = js.native
}

object CallbackProp {
  @scala.inline
  def apply(callbackProp: String, controlled: Boolean, valueProp: String): CallbackProp = {
    val __obj = js.Dynamic.literal(callbackProp = callbackProp.asInstanceOf[js.Any], controlled = controlled.asInstanceOf[js.Any], valueProp = valueProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackProp]
  }
  @scala.inline
  implicit class CallbackPropOps[Self <: CallbackProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallbackProp(value: String): Self = this.set("callbackProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlled(value: Boolean): Self = this.set("controlled", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueProp(value: String): Self = this.set("valueProp", value.asInstanceOf[js.Any])
  }
  
}

