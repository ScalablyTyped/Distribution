package typings
package reduxDashAuthDashWrapperLib.history3RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history3/redirect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connectedReduxRedirect[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthWrapperDecorator[OwnProps with InjectedAuthReduxProps] = js.native
  def connectedRouterRedirect[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthWrapperDecorator[
    OwnProps with (InjectedAuthRouterProps[js.Function1[/* repeated */ _, reduxLib.reduxMod.Action[_]]])
  ] = js.native
  def createOnEnter[State](config: CreateOnEnterConfig[State]): js.Function3[
    /* store */ reduxLib.reduxMod.Store[_, reduxLib.reduxMod.AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[
      /* location */ historyLib.historyMod.LocationDescriptorObject[historyLib.historyMod.LocationState], 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
}

