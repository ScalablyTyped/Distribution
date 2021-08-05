package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-fbsdk", "AccessToken")
@js.native
class AccessToken protected () extends StObject {
  def this(tokenMap: AccessTokenMap) = this()
  
  /**
    * The access token string.
    */
  var accessToken: String = js.native
  
  /**
    * The source of access token.
    * @platform android
    */
  var accessTokenSource: js.UndefOr[String] = js.native
  
  /**
    * The app ID.
    */
  var applicationID: String = js.native
  
  /**
    * The known declined permissions.
    */
  var declinedPermissions: js.Array[Permissions] = js.native
  
  /**
    * The expiration time of the access token.
    * The value is the number of milliseconds since Jan. 1, 1970, midnight GMT.
    */
  var expirationTime: Double = js.native
  
  /**
    * Gets the ID of the Facebook Application associated with this access token.
    */
  def getApplicationId(): String = js.native
  
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
  def getExpires(): Double = js.native
  
  /**
    * Gets the date at which the token was last refreshed. Since tokens expire, the Facebook SDK
    * will attempt to renew them periodically. The value is the number of milliseconds since
    * Jan. 1, 1970, midnight GMT.
    */
  def getLastRefresh(): Double = js.native
  
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
  def getUserId(): String = js.native
  
  /**
    * The last refresh time of the access token.
    * The value is the number of milliseconds since Jan. 1, 1970, midnight GMT.
    */
  var lastRefreshTime: Double = js.native
  
  /**
    * The known granted permissions.
    */
  var permissions: js.Array[Permissions] = js.native
  
  /**
    * The user ID.
    */
  var userID: String = js.native
}
/* static members */
object AccessToken {
  
  @JSImport("react-native-fbsdk", "AccessToken")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Getter for the access token that is current for the application.
    */
  inline def getCurrentAccessToken(): js.Promise[AccessToken | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentAccessToken")().asInstanceOf[js.Promise[AccessToken | Null]]
  
  /**
    * Updates the current access token with up to date permissions,
    * and extends the expiration date, if extension is possible.
    */
  inline def refreshCurrentAccessTokenAsync(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshCurrentAccessTokenAsync")().asInstanceOf[js.Promise[js.Any]]
  
  /**
    * Setter for the access token that is current for the application.
    */
  inline def setCurrentAccessToken(accessToken: AccessTokenMap): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentAccessToken")(accessToken.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
