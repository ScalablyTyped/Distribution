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

object SMTPServerAddress {
  @scala.inline
  def apply(address: java.lang.String, args: js.Object): SMTPServerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[SMTPServerAddress]
  }
}

