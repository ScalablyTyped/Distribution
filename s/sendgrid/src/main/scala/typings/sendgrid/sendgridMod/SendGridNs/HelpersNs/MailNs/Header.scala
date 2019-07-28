package typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var key: String
  var value: String
}

object Header {
  @scala.inline
  def apply(key: String, value: String): Header = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[Header]
  }
}

