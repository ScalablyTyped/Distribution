package typings.reactPlaidLink.anon

import typings.reactPlaidLink.reactPlaidLinkStrings.API_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.ASSET_REPORT_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.INSTITUTION_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.INVALID_INPUT
import typings.reactPlaidLink.reactPlaidLinkStrings.INVALID_REQUEST
import typings.reactPlaidLink.reactPlaidLinkStrings.ITEM_ERROR
import typings.reactPlaidLink.reactPlaidLinkStrings.RATE_LIMIT_EXCEEDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Displaymessage extends js.Object {
  var display_message: String | Null = js.native
  var error_code: String = js.native
  var error_message: String = js.native
  var error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR = js.native
}

object Displaymessage {
  @scala.inline
  def apply(
    error_code: String,
    error_message: String,
    error_type: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
  ): Displaymessage = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displaymessage]
  }
  @scala.inline
  implicit class DisplaymessageOps[Self <: Displaymessage] (val x: Self) extends AnyVal {
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
    def setError_code(value: String): Self = this.set("error_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setError_type(
      value: INVALID_REQUEST | INVALID_INPUT | INSTITUTION_ERROR | RATE_LIMIT_EXCEEDED | API_ERROR | ITEM_ERROR | ASSET_REPORT_ERROR
    ): Self = this.set("error_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_message(value: String): Self = this.set("display_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay_messageNull: Self = this.set("display_message", null)
  }
  
}

