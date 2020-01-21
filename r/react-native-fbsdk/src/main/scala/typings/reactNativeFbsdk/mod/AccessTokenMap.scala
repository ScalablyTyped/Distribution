package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenMap extends js.Object {
  var accessToken: String
  var accessTokenSource: js.UndefOr[String] = js.undefined
  var applicationID: String
  var dataAccessExpirationTime: Double
  var declinedPermissions: js.Array[Permissions]
  var expirationTime: Double
  var expiredPermissions: js.Array[Permissions]
  var lastRefreshTime: Double
  var permissions: js.Array[Permissions]
  var userID: String
}

object AccessTokenMap {
  @scala.inline
  def apply(
    accessToken: String,
    applicationID: String,
    dataAccessExpirationTime: Double,
    declinedPermissions: js.Array[Permissions],
    expirationTime: Double,
    expiredPermissions: js.Array[Permissions],
    lastRefreshTime: Double,
    permissions: js.Array[Permissions],
    userID: String,
    accessTokenSource: String = null
  ): AccessTokenMap = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], applicationID = applicationID.asInstanceOf[js.Any], dataAccessExpirationTime = dataAccessExpirationTime.asInstanceOf[js.Any], declinedPermissions = declinedPermissions.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], expiredPermissions = expiredPermissions.asInstanceOf[js.Any], lastRefreshTime = lastRefreshTime.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    if (accessTokenSource != null) __obj.updateDynamic("accessTokenSource")(accessTokenSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenMap]
  }
}

