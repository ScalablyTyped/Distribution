package typings.reduxDashAuthDashWrapper.history3RedirectMod

import typings.history.historyMod.LocationDescriptorObject
import typings.history.historyMod.LocationState
import typings.redux.reduxMod.Action
import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Store
import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history3/redirect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connectedReduxRedirect[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthReduxProps] = js.native
  def connectedRouterRedirect[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps with (InjectedAuthRouterProps[js.Function1[/* repeated */ _, Action[_]]])
  ] = js.native
  def createOnEnter[State](config: CreateOnEnterConfig[State]): js.Function3[
    /* store */ Store[_, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[/* location */ LocationDescriptorObject[LocationState], Unit], 
    Unit
  ] = js.native
}

