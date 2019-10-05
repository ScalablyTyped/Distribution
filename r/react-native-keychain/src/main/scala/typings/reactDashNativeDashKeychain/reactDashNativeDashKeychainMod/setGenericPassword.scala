package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-keychain", "setGenericPassword")
@js.native
object setGenericPassword extends js.Object {
  def apply(username: String, password: String): js.Promise[Boolean] = js.native
  def apply(username: String, password: String, serviceOrOptions: String): js.Promise[Boolean] = js.native
  def apply(username: String, password: String, serviceOrOptions: Options): js.Promise[Boolean] = js.native
}

