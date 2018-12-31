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

