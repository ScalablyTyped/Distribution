package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasswordParams extends js.Object {
  var connection: String
  var email: String
}

object ResetPasswordParams {
  @scala.inline
  def apply(connection: String, email: String): ResetPasswordParams = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetPasswordParams]
  }
}

