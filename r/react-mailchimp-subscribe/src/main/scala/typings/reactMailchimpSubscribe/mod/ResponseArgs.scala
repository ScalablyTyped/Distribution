package typings.reactMailchimpSubscribe.mod

import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.error
import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseArgs extends js.Object {
  var message: String = js.native
  var status: success | error = js.native
}

object ResponseArgs {
  @scala.inline
  def apply(message: String, status: success | error): ResponseArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseArgs]
  }
  @scala.inline
  implicit class ResponseArgsOps[Self <: ResponseArgs] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: success | error): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

