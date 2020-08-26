package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessTokenMap extends js.Object {
  var accessToken: String = js.native
  var accessTokenSource: js.UndefOr[String] = js.native
  var applicationID: String = js.native
  var dataAccessExpirationTime: Double = js.native
  var declinedPermissions: js.Array[Permissions] = js.native
  var expirationTime: Double = js.native
  var expiredPermissions: js.Array[Permissions] = js.native
  var lastRefreshTime: Double = js.native
  var permissions: js.Array[Permissions] = js.native
  var userID: String = js.native
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
    userID: String
  ): AccessTokenMap = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], applicationID = applicationID.asInstanceOf[js.Any], dataAccessExpirationTime = dataAccessExpirationTime.asInstanceOf[js.Any], declinedPermissions = declinedPermissions.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], expiredPermissions = expiredPermissions.asInstanceOf[js.Any], lastRefreshTime = lastRefreshTime.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenMap]
  }
  @scala.inline
  implicit class AccessTokenMapOps[Self <: AccessTokenMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationID(value: String): Self = this.set("applicationID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataAccessExpirationTime(value: Double): Self = this.set("dataAccessExpirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclinedPermissionsVarargs(value: Permissions*): Self = this.set("declinedPermissions", js.Array(value :_*))
    @scala.inline
    def setDeclinedPermissions(value: js.Array[Permissions]): Self = this.set("declinedPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationTime(value: Double): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiredPermissionsVarargs(value: Permissions*): Self = this.set("expiredPermissions", js.Array(value :_*))
    @scala.inline
    def setExpiredPermissions(value: js.Array[Permissions]): Self = this.set("expiredPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastRefreshTime(value: Double): Self = this.set("lastRefreshTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsVarargs(value: Permissions*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[Permissions]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessTokenSource(value: String): Self = this.set("accessTokenSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessTokenSource: Self = this.set("accessTokenSource", js.undefined)
  }
  
}

