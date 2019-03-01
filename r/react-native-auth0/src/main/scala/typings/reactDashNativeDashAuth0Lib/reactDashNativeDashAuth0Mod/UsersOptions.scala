package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersOptions extends js.Object {
  var baseUrl: java.lang.String
  var token: java.lang.String
}

object UsersOptions {
  @scala.inline
  def apply(baseUrl: java.lang.String, token: java.lang.String): UsersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseUrl")(baseUrl)
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[UsersOptions]
  }
}

