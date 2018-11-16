package typings
package reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-google-signin", "GoogleSignin")
@js.native
object GoogleSigninNs extends js.Object {
  /**
       * Configures the library for login. MUST be called before attempting login
       */
  def configure(): scala.Unit = js.native
  /**
       * Configures the library for login. MUST be called before attempting login
       */
  def configure(
    params: reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.ConfigureParams
  ): scala.Unit = js.native
  /**
       * Check if the device has Google Play Services installed. Always resolves
       * true on iOS
       */
  def hasPlayServices(): stdLib.Promise[scala.Boolean] = js.native
  /**
       * Check if the device has Google Play Services installed. Always resolves
       * true on iOS
       */
  def hasPlayServices(
    params: reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.HasPlayServicesParams
  ): stdLib.Promise[scala.Boolean] = js.native
  /**
       * Returns whether the user is currently signed in
       */
  def isSignedIn(): stdLib.Promise[scala.Boolean] = js.native
  /**
       * Removes your application from the user's authorized applications
       */
  def revokeAccess(): stdLib.Promise[scala.Unit] = js.native
  /**
       * Prompts the user to sign in with their Google account. Resolves with the
       * user if successful.
       */
  def signIn(): stdLib.Promise[
    reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.User
  ] = js.native
  /**
       * Returns a Promise that resolves with the current signed in user or rejects
       * if not signed in.
       */
  def signInSilently(): stdLib.Promise[
    reactDashNativeDashGoogleDashSigninLib.reactDashNativeDashGoogleDashSigninMod.User
  ] = js.native
  /**
       * Signs the user out.
       */
  def signOut(): stdLib.Promise[scala.Unit] = js.native
}

