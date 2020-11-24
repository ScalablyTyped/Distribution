package typings.reduxAuthWrapper.history4RedirectMod

import typings.redux.mod.Action
import typings.reduxAuthWrapper.mod.AuthWrapperDecorator
import typings.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig
import typings.reduxAuthWrapper.redirectMod.InjectedAuthRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-auth-wrapper/history4/redirect", "connectedRouterRedirect")
@js.native
object connectedRouterRedirect extends js.Object {
  
  def apply[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps with (InjectedAuthRouterProps[js.Function1[/* repeated */ _, Action[_]]])
  ] = js.native
}
