package typings
package reduxDashAuthDashWrapperLib.history4RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history4/redirect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connectedReduxRedirect[OwnProps, State](
    config: reduxDashAuthDashWrapperLib.history4RedirectMod.ConnectedReduxRedirectConfig[OwnProps, State]
  ): reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthWrapperDecorator[
    OwnProps with reduxDashAuthDashWrapperLib.history3RedirectMod.InjectedAuthReduxProps
  ] = js.native
  def connectedRouterRedirect[OwnProps, State](
    config: reduxDashAuthDashWrapperLib.history3RedirectMod.ConnectedRouterRedirectConfig[OwnProps, State]
  ): reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthWrapperDecorator[
    OwnProps with (reduxDashAuthDashWrapperLib.history3RedirectMod.InjectedAuthRouterProps[js.Function1[/* repeated */ _, reduxLib.reduxMod.Action[_]]])
  ] = js.native
}

