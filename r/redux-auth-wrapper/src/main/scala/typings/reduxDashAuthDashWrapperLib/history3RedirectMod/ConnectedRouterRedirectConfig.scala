package typings
package reduxDashAuthDashWrapperLib.history3RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedRouterRedirectConfig[OwnProps, State]
  extends reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthBaseConfig[OwnProps, State] {
  var allowRedirectBack: js.UndefOr[
    scala.Boolean | (reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, scala.Boolean])
  ] = js.undefined
  var redirectAction: js.UndefOr[
    js.Function1[
      /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
      reduxLib.reduxMod.Action[_]
    ]
  ] = js.undefined
  var redirectPath: java.lang.String | (reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, java.lang.String])
  var redirectQueryParamName: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectedRouterRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, scala.Boolean],
    redirectPath: java.lang.String | (reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, java.lang.String]),
    AuthenticatingComponent: reactLib.reactMod.ReactType[_] = null,
    allowRedirectBack: scala.Boolean | (reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, scala.Boolean]) = null,
    authenticatingSelector: reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.StateSelector[State, OwnProps, scala.Boolean] = null,
    redirectAction: /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState] => reduxLib.reduxMod.Action[_] = null,
    redirectQueryParamName: java.lang.String = null,
    wrapperDisplayName: java.lang.String = null
  ): ConnectedRouterRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = authenticatedSelector, redirectPath = redirectPath.asInstanceOf[js.Any])
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (allowRedirectBack != null) __obj.updateDynamic("allowRedirectBack")(allowRedirectBack.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(authenticatingSelector)
    if (redirectAction != null) __obj.updateDynamic("redirectAction")(js.Any.fromFunction1(redirectAction))
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName)
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName)
    __obj.asInstanceOf[ConnectedRouterRedirectConfig[OwnProps, State]]
  }
}

