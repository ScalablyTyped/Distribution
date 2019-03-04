package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshTokenParams extends js.Object {
  var refreshToken: java.lang.String
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object RefreshTokenParams {
  @scala.inline
  def apply(refreshToken: java.lang.String, scope: java.lang.String = null): RefreshTokenParams = {
    val __obj = js.Dynamic.literal(refreshToken = refreshToken)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[RefreshTokenParams]
  }
}

