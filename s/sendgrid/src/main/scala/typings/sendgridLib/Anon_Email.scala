package typings
package sendgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.Any
  var enable: scala.Boolean
}

object Anon_Email {
  @scala.inline
  def apply(email: js.Any, enable: scala.Boolean): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email, enable = enable)
  
    __obj.asInstanceOf[Anon_Email]
  }
}

