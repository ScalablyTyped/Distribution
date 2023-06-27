package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-auth0", "WebAuth")
@js.native
open class WebAuth () extends StObject {
  
  def authorize(parameters: AuthorizeParams): js.Promise[Credentials] = js.native
  def authorize(parameters: AuthorizeParams, options: AuthorizeOptions): js.Promise[Credentials] = js.native
  
  def clearSession(): js.Promise[Any] = js.native
  def clearSession(parameters: Unit, options: ClearSessionOptions): js.Promise[Any] = js.native
  def clearSession(parameters: ClearSessionParams): js.Promise[Any] = js.native
  def clearSession(parameters: ClearSessionParams, options: ClearSessionOptions): js.Promise[Any] = js.native
}
