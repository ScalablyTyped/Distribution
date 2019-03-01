package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationUrlParams extends js.Object {
  var redirectUri: java.lang.String
  var responseType: java.lang.String
  var state: java.lang.String
}

object AuthorizationUrlParams {
  @scala.inline
  def apply(redirectUri: java.lang.String, responseType: java.lang.String, state: java.lang.String): AuthorizationUrlParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redirectUri")(redirectUri)
    __obj.updateDynamic("responseType")(responseType)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[AuthorizationUrlParams]
  }
}

