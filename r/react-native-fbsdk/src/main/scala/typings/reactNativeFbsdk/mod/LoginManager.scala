package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginManager {
  
  /**
    * Getter for the default audience.
    */
  @JSImport("react-native-fbsdk", "LoginManager.getDefaultAudience")
  @js.native
  def getDefaultAudience(): js.Promise[DefaultAudience] = js.native
  
  /**
    * Getter for the login behavior.
    */
  @JSImport("react-native-fbsdk", "LoginManager.getLoginBehavior")
  @js.native
  def getLoginBehavior(): js.Promise[LoginBehavior] = js.native
  
  /**
    * Logs the user in with the requested permissions.
    */
  @JSImport("react-native-fbsdk", "LoginManager.logInWithPermissions")
  @js.native
  def logInWithPermissions(permissions: js.Array[Permissions]): js.Promise[LoginResult] = js.native
  
  /**
    * Logs out the user.
    */
  @JSImport("react-native-fbsdk", "LoginManager.logOut")
  @js.native
  def logOut(): Unit = js.native
  
  /**
    * Setter for the default audience.
    */
  @JSImport("react-native-fbsdk", "LoginManager.setDefaultAudience")
  @js.native
  def setDefaultAudience(defaultAudience: DefaultAudience): Unit = js.native
  
  /**
    * Setter for the login behavior.
    */
  @JSImport("react-native-fbsdk", "LoginManager.setLoginBehavior")
  @js.native
  def setLoginBehavior(loginBehavior: LoginBehavior): Unit = js.native
}
