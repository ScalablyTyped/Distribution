package typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-touch-id", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authenticate(reason: String): js.Promise[Boolean | TouchIDError] = js.native
  def authenticate(reason: String, config: AuthenticateConfig): js.Promise[Boolean | TouchIDError] = js.native
  def isSupported(): js.Promise[Boolean | String | TouchIDError] = js.native
}

