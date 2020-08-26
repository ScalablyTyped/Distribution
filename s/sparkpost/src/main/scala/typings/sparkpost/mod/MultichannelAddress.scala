package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultichannelAddress extends js.Object {
  /** SparkPost Enterprise API only. Required if channel is “gcm” or “apns” */
  var app_id: String = js.native
  /** The communication channel used to reach recipient. Valid values are “email”, “gcm”, “apns”. */
  var channel: String = js.native
  /** Valid email address. Required if channel is “email”. */
  var email: String = js.native
  /** Email address to display in the “To” header instead of address.email (for BCC). Used when channel is “email” */
  var header_to: String = js.native
  /** User-friendly name for the email address. Used when channel is “email” */
  var name: String = js.native
  /** SparkPost Enterprise API only. Required if channel is “gcm” or “apns” */
  var token: String = js.native
}

object MultichannelAddress {
  @scala.inline
  def apply(app_id: String, channel: String, email: String, header_to: String, name: String, token: String): MultichannelAddress = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], header_to = header_to.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultichannelAddress]
  }
  @scala.inline
  implicit class MultichannelAddressOps[Self <: MultichannelAddress] (val x: Self) extends AnyVal {
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
    def setApp_id(value: String): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader_to(value: String): Self = this.set("header_to", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

