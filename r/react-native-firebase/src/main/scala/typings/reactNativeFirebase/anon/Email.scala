package typings.reactNativeFirebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var fromEmail: js.UndefOr[String] = js.undefined
}

object Email {
  @scala.inline
  def apply(email: String = null, fromEmail: String = null): Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (fromEmail != null) __obj.updateDynamic("fromEmail")(fromEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

