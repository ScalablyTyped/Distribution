package typings.sendcloud.mod

import typings.sendcloud.anon.Description
import typings.sendcloud.sendcloudStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailListUpdateResponse extends js.Object {
  var list: Description = js.native
  var message: success = js.native
}

object EmailListUpdateResponse {
  @scala.inline
  def apply(list: Description, message: success): EmailListUpdateResponse = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailListUpdateResponse]
  }
  @scala.inline
  implicit class EmailListUpdateResponseOps[Self <: EmailListUpdateResponse] (val x: Self) extends AnyVal {
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
    def setList(value: Description): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: success): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

