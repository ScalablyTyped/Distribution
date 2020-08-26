package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomFieldsBoolean extends js.Object {
  var customFields: Boolean = js.native
}

object CustomFieldsBoolean {
  @scala.inline
  def apply(customFields: Boolean): CustomFieldsBoolean = {
    val __obj = js.Dynamic.literal(customFields = customFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFieldsBoolean]
  }
  @scala.inline
  implicit class CustomFieldsBooleanOps[Self <: CustomFieldsBoolean] (val x: Self) extends AnyVal {
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
    def setCustomFields(value: Boolean): Self = this.set("customFields", value.asInstanceOf[js.Any])
  }
  
}

