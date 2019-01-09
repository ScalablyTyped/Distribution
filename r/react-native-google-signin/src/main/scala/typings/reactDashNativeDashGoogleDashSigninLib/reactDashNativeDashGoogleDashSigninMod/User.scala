package typings
package reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var accessToken: java.lang.String | scala.Null
  /**
    * Deprecated
    */
  var accessTokenExpirationDate: scala.Double | scala.Null
  var idToken: java.lang.String | scala.Null
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Not null only if a valid webClientId and offlineAccess: true was
    * specified in configure().
    */
  var serverAuthCode: java.lang.String | scala.Null
  var user: reactDashNativeDashGoogleDashSigninLib.Anon_Email
}

