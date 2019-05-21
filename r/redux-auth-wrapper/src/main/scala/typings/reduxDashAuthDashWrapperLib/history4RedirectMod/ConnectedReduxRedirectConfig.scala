package typings
package reduxDashAuthDashWrapperLib.history4RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedReduxRedirectConfig[OwnProps, State]
  extends reduxDashAuthDashWrapperLib.history3RedirectMod.ConnectedRouterRedirectConfig[OwnProps, State] {
  @JSName("redirectAction")
  def redirectAction_MConnectedReduxRedirectConfig(location: historyLib.historyMod.Location[historyLib.historyMod.LocationState]): reduxLib.reduxMod.Action[_]
}

object ConnectedReduxRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, scala.Boolean],
    redirectAction: historyLib.historyMod.Location[historyLib.historyMod.LocationState] => reduxLib.reduxMod.Action[_],
    redirectPath: java.lang.String | (reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, java.lang.String]),
    AuthenticatingComponent: reactLib.reactMod.ReactType[_] = null,
    allowRedirectBack: scala.Boolean | (reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, scala.Boolean]) = null,
    authenticatingSelector: reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, scala.Boolean] = null,
    redirectQueryParamName: java.lang.String = null,
    wrapperDisplayName: java.lang.String = null
  ): ConnectedReduxRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = authenticatedSelector, redirectAction = js.Any.fromFunction1(redirectAction), redirectPath = redirectPath.asInstanceOf[js.Any])
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (allowRedirectBack != null) __obj.updateDynamic("allowRedirectBack")(allowRedirectBack.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(authenticatingSelector)
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName)
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName)
    __obj.asInstanceOf[ConnectedReduxRedirectConfig[OwnProps, State]]
  }
}

