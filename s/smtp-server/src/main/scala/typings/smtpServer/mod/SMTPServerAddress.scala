package typings.smtpServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerAddress extends js.Object {
  /**
    * the address provided with the MAIL FROM or RCPT TO command
    */
  var address: String = js.native
  /**
    * an object with additional arguments (all key names are uppercase)
    */
  var args: js.Object = js.native
}

object SMTPServerAddress {
  @scala.inline
  def apply(address: String, args: js.Object): SMTPServerAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPServerAddress]
  }
  @scala.inline
  implicit class SMTPServerAddressOps[Self <: SMTPServerAddress] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: js.Object): Self = this.set("args", value.asInstanceOf[js.Any])
  }
  
}

