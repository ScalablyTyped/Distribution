package typings
package reactDashNativeDashTouchDashIdLib.reactDashNativeDashTouchDashIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-touch-id", JSImport.Namespace)
@js.native
object reactDashNativeDashTouchDashIdModMembers extends js.Object {
  val authenticate: js.Function2[
    /* reason */ java.lang.String, 
    /* config */ js.UndefOr[AuthenticateConfig], 
    js.Promise[scala.Boolean | TouchIDError]
  ] = js.native
  val isSupported: js.Function0[js.Promise[scala.Boolean | java.lang.String | TouchIDError]] = js.native
}

