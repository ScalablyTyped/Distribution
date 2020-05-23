package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: js.Any
  var enable: Boolean
}

object Email {
  @scala.inline
  def apply(email: js.Any, enable: Boolean): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

