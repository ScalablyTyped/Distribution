package typings
package reactDashNativeDashTouchDashIdLib.reactDashNativeDashTouchDashIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-touch-id", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def authenticate(reason: java.lang.String): js.Promise[
    scala.Boolean | reactDashNativeDashTouchDashIdLib.reactDashNativeDashTouchDashIdMod.TouchIDError
  ] = js.native
  def authenticate(
    reason: java.lang.String,
    config: reactDashNativeDashTouchDashIdLib.reactDashNativeDashTouchDashIdMod.AuthenticateConfig
  ): js.Promise[
    scala.Boolean | reactDashNativeDashTouchDashIdLib.reactDashNativeDashTouchDashIdMod.TouchIDError
  ] = js.native
  def isSupported(): js.Promise[
    scala.Boolean | java.lang.String | reactDashNativeDashTouchDashIdLib.reactDashNativeDashTouchDashIdMod.TouchIDError
  ] = js.native
}

