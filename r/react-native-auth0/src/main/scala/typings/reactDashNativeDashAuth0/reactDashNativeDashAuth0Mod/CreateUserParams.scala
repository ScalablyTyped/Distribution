package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserParams[T] extends js.Object {
  var connection: String
  var email: String
  var metadata: js.UndefOr[T] = js.undefined
  var password: String
  var username: js.UndefOr[String] = js.undefined
}

object CreateUserParams {
  @scala.inline
  def apply[T](connection: String, email: String, password: String, metadata: T = null, username: String = null): CreateUserParams[T] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserParams[T]]
  }
}

