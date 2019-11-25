package typings.smtpDashServer.smtpDashServerMod

import typings.smtpDashServer.smtpDashServerNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPServerEnvelope extends js.Object {
  /**
    * includes an address object or is set to false
    */
  var mailFrom: SMTPServerAddress | `false`
  /**
    * includes an array of address objects
    */
  var rcptTo: js.Array[SMTPServerAddress]
}

object SMTPServerEnvelope {
  @scala.inline
  def apply(mailFrom: SMTPServerAddress | `false`, rcptTo: js.Array[SMTPServerAddress]): SMTPServerEnvelope = {
    val __obj = js.Dynamic.literal(mailFrom = mailFrom.asInstanceOf[js.Any], rcptTo = rcptTo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SMTPServerEnvelope]
  }
}

