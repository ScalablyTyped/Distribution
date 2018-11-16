package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-auth0", JSImport.Default)
@js.native
class default protected () extends Auth0 {
  def this(options: Options) = this()
  /* CompleteClass */
  override var auth: Auth = js.native
  /* CompleteClass */
  override var webAuth: WebAuth = js.native
  /* CompleteClass */
  override def users(token: java.lang.String): Users = js.native
}

