package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginManager {
  
  @JSImport("react-native-fbsdk", "LoginManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Getter for the default audience.
    */
  inline def getDefaultAudience(): js.Promise[DefaultAudience] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAudience")().asInstanceOf[js.Promise[DefaultAudience]]
  
  /**
    * Getter for the login behavior.
    */
  inline def getLoginBehavior(): js.Promise[LoginBehavior] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoginBehavior")().asInstanceOf[js.Promise[LoginBehavior]]
  
  /**
    * Logs the user in with the requested permissions.
    */
  inline def logInWithPermissions(permissions: js.Array[Permissions]): js.Promise[LoginResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("logInWithPermissions")(permissions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LoginResult]]
  
  /**
    * Logs out the user.
    */
  inline def logOut(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logOut")().asInstanceOf[Unit]
  
  /**
    * Setter for the default audience.
    */
  inline def setDefaultAudience(defaultAudience: DefaultAudience): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultAudience")(defaultAudience.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Setter for the login behavior.
    */
  inline def setLoginBehavior(loginBehavior: LoginBehavior): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLoginBehavior")(loginBehavior.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
