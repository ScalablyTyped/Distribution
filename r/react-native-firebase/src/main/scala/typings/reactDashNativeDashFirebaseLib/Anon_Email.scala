package typings
package reactDashNativeDashFirebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var fromEmail: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Email {
  @scala.inline
  def apply(email: java.lang.String = null, fromEmail: java.lang.String = null): Anon_Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (fromEmail != null) __obj.updateDynamic("fromEmail")(fromEmail)
    __obj.asInstanceOf[Anon_Email]
  }
}

