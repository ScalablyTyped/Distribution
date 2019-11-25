package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.Any
  var enable: Boolean
}

object Anon_Email {
  @scala.inline
  def apply(email: js.Any, enable: Boolean): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Email]
  }
}

