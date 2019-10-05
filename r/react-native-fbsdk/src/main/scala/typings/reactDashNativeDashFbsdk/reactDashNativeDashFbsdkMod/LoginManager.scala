package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "LoginManager")
@js.native
object LoginManager extends js.Object {
  /**
    * Getter for the default audience.
    */
  def getDefaultAudience(): js.Promise[DefaultAudience] = js.native
  /**
    * Getter for the login behavior.
    */
  def getLoginBehavior(): js.Promise[LoginBehavior] = js.native
  /**
    * Logs the user in with the requested permissions.
    */
  def logInWithPermissions(permissions: js.Array[Permissions]): js.Promise[LoginResult] = js.native
  /**
    * Logs out the user.
    */
  def logOut(): Unit = js.native
  /**
    * Setter for the default audience.
    */
  def setDefaultAudience(defaultAudience: DefaultAudience): Unit = js.native
  /**
    * Setter for the login behavior.
    */
  def setLoginBehavior(loginBehavior: LoginBehavior): Unit = js.native
}

