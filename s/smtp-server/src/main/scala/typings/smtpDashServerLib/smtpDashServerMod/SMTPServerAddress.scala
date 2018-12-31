package typings
package smtpDashServerLib.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPServerAddress extends js.Object {
  /**
    * the address provided with the MAIL FROM or RCPT TO command
    */
  var address: java.lang.String
  /**
    * an object with additional arguments (all key names are uppercase)
    */
  var args: js.Object
}

