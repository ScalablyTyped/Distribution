package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenMap extends js.Object {
  var accessToken: java.lang.String
  var accessTokenSource: js.UndefOr[java.lang.String] = js.undefined
  var applicationID: java.lang.String
  var declinedPermissions: js.Array[Permissions]
  var expirationTime: scala.Double
  var lastRefreshTime: scala.Double
  var permissions: js.Array[Permissions]
  var userID: java.lang.String
}

object AccessTokenMap {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    applicationID: java.lang.String,
    declinedPermissions: js.Array[Permissions],
    expirationTime: scala.Double,
    lastRefreshTime: scala.Double,
    permissions: js.Array[Permissions],
    userID: java.lang.String,
    accessTokenSource: java.lang.String = null
  ): AccessTokenMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("applicationID")(applicationID)
    __obj.updateDynamic("declinedPermissions")(declinedPermissions)
    __obj.updateDynamic("expirationTime")(expirationTime)
    __obj.updateDynamic("lastRefreshTime")(lastRefreshTime)
    __obj.updateDynamic("permissions")(permissions)
    __obj.updateDynamic("userID")(userID)
    if (accessTokenSource != null) __obj.updateDynamic("accessTokenSource")(accessTokenSource)
    __obj.asInstanceOf[AccessTokenMap]
  }
}

