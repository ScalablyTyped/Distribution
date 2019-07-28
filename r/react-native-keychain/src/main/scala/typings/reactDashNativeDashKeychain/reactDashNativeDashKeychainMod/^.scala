package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import typings.reactDashNativeDashKeychain.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-keychain", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canImplyAuthentication(): js.Promise[Boolean] = js.native
  def canImplyAuthentication(options: Options): js.Promise[Boolean] = js.native
  def getGenericPassword(): js.Promise[Boolean | Anon_Password] = js.native
  def getGenericPassword(serviceOrOptions: String): js.Promise[Boolean | Anon_Password] = js.native
  def getGenericPassword(serviceOrOptions: Options): js.Promise[Boolean | Anon_Password] = js.native
  def getInternetCredentials(server: String): js.Promise[UserCredentials] = js.native
  def getSupportedBiometryType(): js.Promise[String | Null] = js.native
  def requestSharedWebCredentials(): js.Promise[SharedWebCredentials] = js.native
  def resetGenericPassword(): js.Promise[Boolean] = js.native
  def resetGenericPassword(serviceOrOptions: String): js.Promise[Boolean] = js.native
  def resetGenericPassword(serviceOrOptions: Options): js.Promise[Boolean] = js.native
  def resetInternetCredentials(server: String): js.Promise[Boolean] = js.native
  def setGenericPassword(username: String, password: String): js.Promise[Boolean] = js.native
  def setGenericPassword(username: String, password: String, serviceOrOptions: String): js.Promise[Boolean] = js.native
  def setGenericPassword(username: String, password: String, serviceOrOptions: Options): js.Promise[Boolean] = js.native
  def setInternetCredentials(server: String, username: String, password: String): js.Promise[Boolean] = js.native
  def setInternetCredentials(server: String, username: String, password: String, options: Options): js.Promise[Boolean] = js.native
  def setSharedWebCredentials(server: String, username: String, password: String): js.Promise[Boolean] = js.native
}

