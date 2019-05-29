package typings
package sendgridLib.sendgridMod.SendGridNs.HelpersNs.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: java.lang.String
  var name: java.lang.String
}

object Email {
  @scala.inline
  def apply(email: java.lang.String, name: java.lang.String): Email = {
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[Email]
  }
}

