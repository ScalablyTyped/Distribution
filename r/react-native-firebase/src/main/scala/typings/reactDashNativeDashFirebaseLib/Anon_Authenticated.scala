package typings
package reactDashNativeDashFirebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticated extends js.Object {
  var authenticated: scala.Boolean
  var user: js.Object | scala.Null
}

object Anon_Authenticated {
  @scala.inline
  def apply(authenticated: scala.Boolean, user: js.Object = null): Anon_Authenticated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticated")(authenticated)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Authenticated]
  }
}

