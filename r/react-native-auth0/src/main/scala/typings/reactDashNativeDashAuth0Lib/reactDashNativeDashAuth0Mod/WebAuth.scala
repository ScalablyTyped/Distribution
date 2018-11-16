package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-auth0", "WebAuth")
@js.native
class WebAuth () extends js.Object {
  def authorize(parameters: AuthorizeParams): stdLib.Promise[_] = js.native
  def clearSession(): stdLib.Promise[_] = js.native
  def clearSession(parameters: ClearSessionParams): stdLib.Promise[_] = js.native
}

