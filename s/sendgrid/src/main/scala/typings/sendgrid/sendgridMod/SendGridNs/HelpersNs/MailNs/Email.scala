package typings.sendgrid.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: String
  var name: String
}

object Email {
  @scala.inline
  def apply(email: String, name: String): Email = {
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[Email]
  }
}

