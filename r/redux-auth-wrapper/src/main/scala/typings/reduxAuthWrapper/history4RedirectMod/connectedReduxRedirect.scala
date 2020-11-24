package typings.reduxAuthWrapper.history4RedirectMod

import typings.reduxAuthWrapper.mod.AuthWrapperDecorator
import typings.reduxAuthWrapper.redirectMod.InjectedAuthReduxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-auth-wrapper/history4/redirect", "connectedReduxRedirect")
@js.native
object connectedReduxRedirect extends js.Object {
  
  def apply[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthReduxProps] = js.native
}
