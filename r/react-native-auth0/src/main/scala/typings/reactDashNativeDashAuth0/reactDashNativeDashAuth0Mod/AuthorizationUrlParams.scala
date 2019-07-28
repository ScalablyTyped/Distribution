package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationUrlParams extends js.Object {
  var redirectUri: String
  var responseType: String
  var state: String
}

object AuthorizationUrlParams {
  @scala.inline
  def apply(redirectUri: String, responseType: String, state: String): AuthorizationUrlParams = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri, responseType = responseType, state = state)
  
    __obj.asInstanceOf[AuthorizationUrlParams]
  }
}

