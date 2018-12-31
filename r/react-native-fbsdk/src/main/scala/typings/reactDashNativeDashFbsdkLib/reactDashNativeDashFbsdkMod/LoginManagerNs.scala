package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "LoginManager")
@js.native
object LoginManagerNs extends js.Object {
  /**
    * Getter for the default audience.
    */
  def getDefaultAudience(): js.Promise[reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.DefaultAudience] = js.native
  /**
    * Getter for the login behavior.
    */
  def getLoginBehavior(): js.Promise[reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.LoginBehavior] = js.native
  /**
    * Logs the user in with the requested publish permissions.
    */
  def logInWithPublishPermissions(permissions: js.Array[reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.Permissions]): js.Promise[reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.LoginResult] = js.native
  /**
    * Logs the user in with the requested read permissions.
    */
  def logInWithReadPermissions(permissions: js.Array[reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.Permissions]): js.Promise[reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.LoginResult] = js.native
  /**
    * Logs out the user.
    */
  def logOut(): scala.Unit = js.native
  /**
    * Setter for the default audience.
    */
  def setDefaultAudience(defaultAudience: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.DefaultAudience): scala.Unit = js.native
  /**
    * Setter for the login behavior.
    */
  def setLoginBehavior(loginBehavior: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.LoginBehavior): scala.Unit = js.native
}

