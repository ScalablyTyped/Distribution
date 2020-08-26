package typings.pulumiAws.inputMod.alb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleActionFixedResponse extends js.Object {
  /**
    * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
    */
  var contentType: Input[String] = js.native
  /**
    * The message body.
    */
  var messageBody: js.UndefOr[Input[String]] = js.native
  /**
    * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
    */
  var statusCode: js.UndefOr[Input[String]] = js.native
}

object ListenerRuleActionFixedResponse {
  @scala.inline
  def apply(contentType: Input[String]): ListenerRuleActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionFixedResponse]
  }
  @scala.inline
  implicit class ListenerRuleActionFixedResponseOps[Self <: ListenerRuleActionFixedResponse] (val x: Self) extends AnyVal {
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
    def setContentType(value: Input[String]): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageBody(value: Input[String]): Self = this.set("messageBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageBody: Self = this.set("messageBody", js.undefined)
    @scala.inline
    def setStatusCode(value: Input[String]): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

