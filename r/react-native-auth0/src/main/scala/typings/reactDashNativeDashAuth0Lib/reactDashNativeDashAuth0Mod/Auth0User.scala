package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0User[T] extends js.Object {
  var created_at: java.lang.String
  var email: java.lang.String
  var emailVerified: scala.Boolean
  var identities: js.Array[_]
  var last_ip: js.UndefOr[java.lang.String] = js.undefined
  var last_login: js.UndefOr[java.lang.String] = js.undefined
  var logins_count: scala.Double
  var name: java.lang.String
  var nickname: java.lang.String
  var picture: js.UndefOr[java.lang.String] = js.undefined
  var updated_at: java.lang.String
  var userId: java.lang.String
  var userMetadata: js.UndefOr[T] = js.undefined
}

object Auth0User {
  @scala.inline
  def apply[T](
    created_at: java.lang.String,
    email: java.lang.String,
    emailVerified: scala.Boolean,
    identities: js.Array[_],
    logins_count: scala.Double,
    name: java.lang.String,
    nickname: java.lang.String,
    updated_at: java.lang.String,
    userId: java.lang.String,
    last_ip: java.lang.String = null,
    last_login: java.lang.String = null,
    picture: java.lang.String = null,
    userMetadata: T = null
  ): Auth0User[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created_at")(created_at)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("emailVerified")(emailVerified)
    __obj.updateDynamic("identities")(identities)
    __obj.updateDynamic("logins_count")(logins_count)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nickname")(nickname)
    __obj.updateDynamic("updated_at")(updated_at)
    __obj.updateDynamic("userId")(userId)
    if (last_ip != null) __obj.updateDynamic("last_ip")(last_ip)
    if (last_login != null) __obj.updateDynamic("last_login")(last_login)
    if (picture != null) __obj.updateDynamic("picture")(picture)
    if (userMetadata != null) __obj.updateDynamic("userMetadata")(userMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0User[T]]
  }
}

