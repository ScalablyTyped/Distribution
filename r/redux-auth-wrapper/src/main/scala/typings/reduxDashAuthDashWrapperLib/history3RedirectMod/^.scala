package typings
package reduxDashAuthDashWrapperLib.history3RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history3/redirect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connectedReduxRedirect[OwnProps, State](
    config: reduxDashAuthDashWrapperLib.history3RedirectMod.ConnectedReduxRedirectConfig[OwnProps, State]
  ): reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthWrapperDecorator[
    OwnProps with reduxDashAuthDashWrapperLib.history3RedirectMod.InjectedAuthReduxProps
  ] = js.native
  def connectedRouterRedirect[OwnProps, State](
    config: reduxDashAuthDashWrapperLib.history3RedirectMod.ConnectedRouterRedirectConfig[OwnProps, State]
  ): reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthWrapperDecorator[
    OwnProps with (reduxDashAuthDashWrapperLib.history3RedirectMod.InjectedAuthRouterProps[js.Function1[/* repeated */ _, reduxLib.reduxMod.Action[_]]])
  ] = js.native
  def createOnEnter[State](config: reduxDashAuthDashWrapperLib.history3RedirectMod.CreateOnEnterConfig[State]): js.Function3[
    /* store */ reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[
      /* location */ historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState], 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
}

