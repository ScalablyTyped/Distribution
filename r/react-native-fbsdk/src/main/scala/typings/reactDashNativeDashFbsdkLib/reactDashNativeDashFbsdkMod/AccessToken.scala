package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "AccessToken")
@js.native
class AccessToken protected () extends js.Object {
  def this(tokenMap: AccessTokenMap) = this()
  /**
    * The access token string.
    */
  var accessToken: java.lang.String = js.native
  /**
    * The source of access token.
    * @platform android
    */
  var accessTokenSource: js.UndefOr[java.lang.String] = js.native
  /**
    * The app ID.
    */
  var applicationID: java.lang.String = js.native
  /**
    * The known declined permissions.
    */
  var declinedPermissions: js.Array[Permissions] = js.native
  /**
    * The expiration time of the access token.
    * The value is the number of milliseconds since Jan. 1, 1970, midnight GMT.
    */
  var expirationTime: scala.Double = js.native
  /**
    * The last refresh time of the access token.
    * The value is the number of milliseconds since Jan. 1, 1970, midnight GMT.
    */
  var lastRefreshTime: scala.Double = js.native
  /**
    * The known granted permissions.
    */
  var permissions: js.Array[Permissions] = js.native
  /**
    * The user ID.
    */
  var userID: java.lang.String = js.native
  /**
    * Gets the ID of the Facebook Application associated with this access token.
    */
  def getApplicationId(): java.lang.String = js.native
  /**
    * Gets the list of permissions declined by the user with this access token. It represents the
    * entire set of permissions that have been requested and declined. Note that the most
    * up-to-date list of permissions is maintained by Facebook, so this list may be outdated if
    * permissions have been granted or declined since the last time an AccessToken object was
    * created. See https://developers.facebook.com/docs/reference/login/#permissions for details.
    */
  def getDeclinedPermissions(): js.Array[Permissions] = js.native
  /**
    * Gets the date at which the access token expires. The value is the number of
    * milliseconds since Jan. 1, 1970, midnight GMT.
    */
  def getExpires(): scala.Double = js.native
  /**
    * Gets the date at which the token was last refreshed. Since tokens expire, the Facebook SDK
    * will attempt to renew them periodically. The value is the number of milliseconds since
    * Jan. 1, 1970, midnight GMT.
    */
  def getLastRefresh(): scala.Double = js.native
  /**
    * Get the list of permissions associated with this access token. Note that the most up-to-date
    * list of permissions is maintained by Facebook, so this list may be outdated if permissions
    * have been added or removed since the time the AccessToken object was created. See
    * https://developers.facebook.com/docs/reference/login/#permissions for details.
    */
  def getPermissions(): js.Array[Permissions] = js.native
  /**
    * Gets user ID associated with this access token.
    */
  def getUserId(): java.lang.String = js.native
}

@JSImport("react-native-fbsdk", "AccessToken")
@js.native
object AccessToken extends js.Object {
  /**
    * Getter for the access token that is current for the application.
    */
  def getCurrentAccessToken(): js.Promise[reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.AccessToken | scala.Null] = js.native
  /**
    * Updates the current access token with up to date permissions,
    * and extends the expiration date, if extension is possible.
    */
  def refreshCurrentAccessTokenAsync(): js.Promise[_] = js.native
  /**
    * Setter for the access token that is current for the application.
    */
  def setCurrentAccessToken(accessToken: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.AccessTokenMap): scala.Unit = js.native
}

