package typings
package smtpDashServerLib.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPServerEnvelope extends js.Object {
  /**
    * includes an address object or is set to false
    */
  var mailFrom: SMTPServerAddress | smtpDashServerLib.smtpDashServerLibNumbers.`false`
  /**
    * includes an array of address objects
    */
  var rcptTo: js.Array[SMTPServerAddress]
}

object SMTPServerEnvelope {
  @scala.inline
  def apply(
    mailFrom: SMTPServerAddress | smtpDashServerLib.smtpDashServerLibNumbers.`false`,
    rcptTo: js.Array[SMTPServerAddress]
  ): SMTPServerEnvelope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mailFrom")(mailFrom.asInstanceOf[js.Any])
    __obj.updateDynamic("rcptTo")(rcptTo)
    __obj.asInstanceOf[SMTPServerEnvelope]
  }
}

