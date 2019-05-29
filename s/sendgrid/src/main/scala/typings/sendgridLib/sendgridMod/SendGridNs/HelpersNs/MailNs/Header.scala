package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var key: java.lang.String
  var value: java.lang.String
}

object Header {
  @scala.inline
  def apply(key: java.lang.String, value: java.lang.String): Header = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[Header]
  }
}

