package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasswordParams extends js.Object {
  var connection: java.lang.String
  var email: java.lang.String
}

object ResetPasswordParams {
  @scala.inline
  def apply(connection: java.lang.String, email: java.lang.String): ResetPasswordParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[ResetPasswordParams]
  }
}

