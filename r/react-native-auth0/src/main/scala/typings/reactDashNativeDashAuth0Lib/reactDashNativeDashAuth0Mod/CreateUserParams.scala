package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserParams[T] extends js.Object {
  var connection: java.lang.String
  var email: java.lang.String
  var metadata: js.UndefOr[T] = js.undefined
  var password: java.lang.String
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object CreateUserParams {
  @scala.inline
  def apply[T](
    connection: java.lang.String,
    email: java.lang.String,
    password: java.lang.String,
    metadata: T = null,
    username: java.lang.String = null
  ): CreateUserParams[T] = {
    val __obj = js.Dynamic.literal(connection = connection, email = email, password = password)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[CreateUserParams[T]]
  }
}

