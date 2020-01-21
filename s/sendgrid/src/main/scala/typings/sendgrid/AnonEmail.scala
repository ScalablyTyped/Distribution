package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: js.Any
  var enable: Boolean
}

object AnonEmail {
  @scala.inline
  def apply(email: js.Any, enable: Boolean): AnonEmail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEmail]
  }
}

