package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersOptions extends js.Object {
  var baseUrl: String
  var token: String
}

object UsersOptions {
  @scala.inline
  def apply(baseUrl: String, token: String): UsersOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl, token = token)
  
    __obj.asInstanceOf[UsersOptions]
  }
}

