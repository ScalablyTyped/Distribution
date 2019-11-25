package typings.smtpDashServer.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPServerAddress extends js.Object {
  /**
    * the address provided with the MAIL FROM or RCPT TO command
    */
  var address: String
  /**
    * an object with additional arguments (all key names are uppercase)
    */
  var args: js.Object
}

object SMTPServerAddress {
  @scala.inline
  def apply(address: String, args: js.Object): SMTPServerAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SMTPServerAddress]
  }
}

