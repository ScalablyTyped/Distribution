package typings.reactNativeFirebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authenticated extends js.Object {
  var authenticated: Boolean
  var user: js.Object | Null
}

object Authenticated {
  @scala.inline
  def apply(authenticated: Boolean, user: js.Object = null): Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticated]
  }
}

