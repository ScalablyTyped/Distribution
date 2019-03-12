package typings
package reactDashNativeDashTouchDashIdLib.reactDashNativeDashTouchDashIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-touch-id", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authenticate(reason: java.lang.String): js.Promise[scala.Boolean | TouchIDError] = js.native
  def authenticate(reason: java.lang.String, config: AuthenticateConfig): js.Promise[scala.Boolean | TouchIDError] = js.native
  def isSupported(): js.Promise[scala.Boolean | java.lang.String | TouchIDError] = js.native
}

