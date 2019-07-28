package typings.ravenDashForDashRedux.ravenDashForDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenUserContext extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object RavenUserContext {
  @scala.inline
  def apply(email: String = null, id: String = null, username: String = null): RavenUserContext = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[RavenUserContext]
  }
}

