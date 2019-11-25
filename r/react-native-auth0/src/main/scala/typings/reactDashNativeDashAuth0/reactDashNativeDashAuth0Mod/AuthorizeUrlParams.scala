package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeUrlParams extends js.Object {
  var redirectUri: String
  var responseType: String
  var state: String
}

object AuthorizeUrlParams {
  @scala.inline
  def apply(redirectUri: String, responseType: String, state: String): AuthorizeUrlParams = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthorizeUrlParams]
  }
}

