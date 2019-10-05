package typings.reduxDashAuthDashWrapper.history3RedirectMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.ReactType
import typings.redux.reduxMod.Action
import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthBaseConfig
import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.StateSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedRouterRedirectConfig[OwnProps, State] extends AuthBaseConfig[OwnProps, State] {
  var allowRedirectBack: js.UndefOr[Boolean | (StateSelector[State, OwnProps, Boolean])] = js.undefined
  var redirectAction: js.UndefOr[js.Function1[/* location */ Location[LocationState], Action[_]]] = js.undefined
  var redirectPath: String | (StateSelector[State, OwnProps, String])
  var redirectQueryParamName: js.UndefOr[String] = js.undefined
}

object ConnectedRouterRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => Boolean,
    redirectPath: String | (StateSelector[State, OwnProps, String]),
    AuthenticatingComponent: ReactType[_] = null,
    allowRedirectBack: Boolean | (StateSelector[State, OwnProps, Boolean]) = null,
    authenticatingSelector: (State, OwnProps) => Boolean = null,
    redirectAction: /* location */ Location[LocationState] => Action[_] = null,
    redirectQueryParamName: String = null,
    wrapperDisplayName: String = null
  ): ConnectedRouterRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (allowRedirectBack != null) __obj.updateDynamic("allowRedirectBack")(allowRedirectBack.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(js.Any.fromFunction2(authenticatingSelector))
    if (redirectAction != null) __obj.updateDynamic("redirectAction")(js.Any.fromFunction1(redirectAction))
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName)
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName)
    __obj.asInstanceOf[ConnectedRouterRedirectConfig[OwnProps, State]]
  }
}

