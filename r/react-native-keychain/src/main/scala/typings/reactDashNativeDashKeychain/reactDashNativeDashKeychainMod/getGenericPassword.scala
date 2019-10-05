package typings.reactDashNativeDashKeychain.reactDashNativeDashKeychainMod

import typings.reactDashNativeDashKeychain.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-keychain", "getGenericPassword")
@js.native
object getGenericPassword extends js.Object {
  def apply(): js.Promise[Boolean | Anon_Password] = js.native
  def apply(serviceOrOptions: String): js.Promise[Boolean | Anon_Password] = js.native
  def apply(serviceOrOptions: Options): js.Promise[Boolean | Anon_Password] = js.native
}

