package typings.reactDashNativeDashFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticated extends js.Object {
  var authenticated: Boolean
  var user: js.Object | Null
}

object Anon_Authenticated {
  @scala.inline
  def apply(authenticated: Boolean, user: js.Object = null): Anon_Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Authenticated]
  }
}

