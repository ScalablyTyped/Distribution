package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshTokenParams extends js.Object {
  var refreshToken: String
  var scope: js.UndefOr[String] = js.undefined
}

object RefreshTokenParams {
  @scala.inline
  def apply(refreshToken: String, scope: String = null): RefreshTokenParams = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTokenParams]
  }
}

