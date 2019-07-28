package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenMap extends js.Object {
  var accessToken: String
  var accessTokenSource: js.UndefOr[String] = js.undefined
  var applicationID: String
  var declinedPermissions: js.Array[Permissions]
  var expirationTime: Double
  var lastRefreshTime: Double
  var permissions: js.Array[Permissions]
  var userID: String
}

object AccessTokenMap {
  @scala.inline
  def apply(
    accessToken: String,
    applicationID: String,
    declinedPermissions: js.Array[Permissions],
    expirationTime: Double,
    lastRefreshTime: Double,
    permissions: js.Array[Permissions],
    userID: String,
    accessTokenSource: String = null
  ): AccessTokenMap = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, applicationID = applicationID, declinedPermissions = declinedPermissions, expirationTime = expirationTime, lastRefreshTime = lastRefreshTime, permissions = permissions, userID = userID)
    if (accessTokenSource != null) __obj.updateDynamic("accessTokenSource")(accessTokenSource)
    __obj.asInstanceOf[AccessTokenMap]
  }
}

