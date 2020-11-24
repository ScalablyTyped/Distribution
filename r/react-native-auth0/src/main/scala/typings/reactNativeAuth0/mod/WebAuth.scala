package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-auth0", "WebAuth")
@js.native
class WebAuth () extends js.Object {
  
  def authorize(parameters: AuthorizeParams): js.Promise[Credentials] = js.native
  def authorize(parameters: AuthorizeParams, options: AuthorizeOptions): js.Promise[Credentials] = js.native
  
  def clearSession(): js.Promise[_] = js.native
  def clearSession(parameters: ClearSessionParams): js.Promise[_] = js.native
}
