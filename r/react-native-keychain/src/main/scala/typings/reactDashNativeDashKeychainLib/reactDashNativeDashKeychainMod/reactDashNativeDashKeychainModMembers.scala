package typings
package reactDashNativeDashKeychainLib.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-keychain", JSImport.Namespace)
@js.native
object reactDashNativeDashKeychainModMembers extends js.Object {
  def canImplyAuthentication(): stdLib.Promise[scala.Boolean] = js.native
  def canImplyAuthentication(options: Options): stdLib.Promise[scala.Boolean] = js.native
  def getGenericPassword(): stdLib.Promise[scala.Boolean | reactDashNativeDashKeychainLib.Anon_Username] = js.native
  def getGenericPassword(serviceOrOptions: java.lang.String): stdLib.Promise[scala.Boolean | reactDashNativeDashKeychainLib.Anon_Username] = js.native
  def getGenericPassword(serviceOrOptions: Options): stdLib.Promise[scala.Boolean | reactDashNativeDashKeychainLib.Anon_Username] = js.native
  def getInternetCredentials(server: java.lang.String): stdLib.Promise[UserCredentials] = js.native
  def getSupportedBiometryType(): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def requestSharedWebCredentials(): stdLib.Promise[SharedWebCredentials] = js.native
  def resetGenericPassword(): stdLib.Promise[scala.Boolean] = js.native
  def resetGenericPassword(serviceOrOptions: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def resetGenericPassword(serviceOrOptions: Options): stdLib.Promise[scala.Boolean] = js.native
  def resetInternetCredentials(server: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def setGenericPassword(username: java.lang.String, password: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def setGenericPassword(username: java.lang.String, password: java.lang.String, serviceOrOptions: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def setGenericPassword(username: java.lang.String, password: java.lang.String, serviceOrOptions: Options): stdLib.Promise[scala.Boolean] = js.native
  def setInternetCredentials(server: java.lang.String, username: java.lang.String, password: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def setInternetCredentials(server: java.lang.String, username: java.lang.String, password: java.lang.String, options: Options): stdLib.Promise[scala.Boolean] = js.native
  def setSharedWebCredentials(server: java.lang.String, username: java.lang.String, password: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
}

