package typings
package reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-keychain", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canImplyAuthentication(): js.Promise[scala.Boolean] = js.native
  def canImplyAuthentication(options: reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod.Options): js.Promise[scala.Boolean] = js.native
  def getGenericPassword(): js.Promise[scala.Boolean | reactDashNativeDashKeychainLib.Anon_Password] = js.native
  def getGenericPassword(serviceOrOptions: java.lang.String): js.Promise[scala.Boolean | reactDashNativeDashKeychainLib.Anon_Password] = js.native
  def getGenericPassword(serviceOrOptions: reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod.Options): js.Promise[scala.Boolean | reactDashNativeDashKeychainLib.Anon_Password] = js.native
  def getInternetCredentials(server: java.lang.String): js.Promise[reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod.UserCredentials] = js.native
  def getSupportedBiometryType(): js.Promise[java.lang.String | scala.Null] = js.native
  def requestSharedWebCredentials(): js.Promise[
    reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod.SharedWebCredentials
  ] = js.native
  def resetGenericPassword(): js.Promise[scala.Boolean] = js.native
  def resetGenericPassword(serviceOrOptions: java.lang.String): js.Promise[scala.Boolean] = js.native
  def resetGenericPassword(serviceOrOptions: reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod.Options): js.Promise[scala.Boolean] = js.native
  def resetInternetCredentials(server: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setGenericPassword(username: java.lang.String, password: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setGenericPassword(username: java.lang.String, password: java.lang.String, serviceOrOptions: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setGenericPassword(
    username: java.lang.String,
    password: java.lang.String,
    serviceOrOptions: reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod.Options
  ): js.Promise[scala.Boolean] = js.native
  def setInternetCredentials(server: java.lang.String, username: java.lang.String, password: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setInternetCredentials(
    server: java.lang.String,
    username: java.lang.String,
    password: java.lang.String,
    options: reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod.Options
  ): js.Promise[scala.Boolean] = js.native
  def setSharedWebCredentials(server: java.lang.String, username: java.lang.String, password: java.lang.String): js.Promise[scala.Boolean] = js.native
}

