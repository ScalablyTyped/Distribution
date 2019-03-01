package typings
package ravenDashForDashReduxLib.ravenDashForDashReduxMod.createRavenMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenUserContext extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object RavenUserContext {
  @scala.inline
  def apply(email: java.lang.String = null, id: java.lang.String = null, username: java.lang.String = null): RavenUserContext = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[RavenUserContext]
  }
}

