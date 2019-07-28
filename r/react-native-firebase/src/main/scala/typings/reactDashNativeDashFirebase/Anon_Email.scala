package typings.reactDashNativeDashFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var fromEmail: js.UndefOr[String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(email: String = null, fromEmail: String = null): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (fromEmail != null) __obj.updateDynamic("fromEmail")(fromEmail)
    __obj.asInstanceOf[Anon_Email]
  }
}

