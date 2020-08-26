package typings.smtpServer.mod

import typings.smtpServer.smtpServerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerEnvelope extends js.Object {
  /**
    * includes an address object or is set to false
    */
  var mailFrom: SMTPServerAddress | `false` = js.native
  /**
    * includes an array of address objects
    */
  var rcptTo: js.Array[SMTPServerAddress] = js.native
}

object SMTPServerEnvelope {
  @scala.inline
  def apply(mailFrom: SMTPServerAddress | `false`, rcptTo: js.Array[SMTPServerAddress]): SMTPServerEnvelope = {
    val __obj = js.Dynamic.literal(mailFrom = mailFrom.asInstanceOf[js.Any], rcptTo = rcptTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMTPServerEnvelope]
  }
  @scala.inline
  implicit class SMTPServerEnvelopeOps[Self <: SMTPServerEnvelope] (val x: Self) extends AnyVal {
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
    def setMailFrom(value: SMTPServerAddress | `false`): Self = this.set("mailFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setRcptToVarargs(value: SMTPServerAddress*): Self = this.set("rcptTo", js.Array(value :_*))
    @scala.inline
    def setRcptTo(value: js.Array[SMTPServerAddress]): Self = this.set("rcptTo", value.asInstanceOf[js.Any])
  }
  
}

