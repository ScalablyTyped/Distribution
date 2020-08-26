package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-auth0", "WebAuth")
@js.native
class WebAuth () extends js.Object {
  def authorize(parameters: AuthorizeParams): js.Promise[_] = js.native
  def authorize(parameters: AuthorizeParams, options: AuthorizeOptions): js.Promise[_] = js.native
  def clearSession(): js.Promise[_] = js.native
  def clearSession(parameters: ClearSessionParams): js.Promise[_] = js.native
}

