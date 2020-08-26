package typings.pulumiAws.outputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetListenerDefaultActionFixedResponse extends js.Object {
  var contentType: String = js.native
  var messageBody: String = js.native
  var statusCode: String = js.native
}

object GetListenerDefaultActionFixedResponse {
  @scala.inline
  def apply(contentType: String, messageBody: String, statusCode: String): GetListenerDefaultActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], messageBody = messageBody.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultActionFixedResponse]
  }
  @scala.inline
  implicit class GetListenerDefaultActionFixedResponseOps[Self <: GetListenerDefaultActionFixedResponse] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageBody(value: String): Self = this.set("messageBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

