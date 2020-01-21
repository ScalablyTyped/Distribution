package typings.reduxAuthWrapper.history4RedirectMod

import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.react.mod.ReactType
import typings.redux.mod.Action
import typings.reduxAuthWrapper.mod.StateSelector
import typings.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedReduxRedirectConfig[OwnProps, State] extends ConnectedRouterRedirectConfig[OwnProps, State] {
  @JSName("redirectAction")
  def redirectAction_MConnectedReduxRedirectConfig(location: Location[LocationState]): Action[_]
}

object ConnectedReduxRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => Boolean,
    redirectAction: Location[LocationState] => Action[_],
    redirectPath: String | (StateSelector[State, OwnProps, String]),
    AuthenticatingComponent: ReactType[_] = null,
    allowRedirectBack: Boolean | (StateSelector[State, OwnProps, Boolean]) = null,
    authenticatingSelector: (State, OwnProps) => Boolean = null,
    redirectQueryParamName: String = null,
    wrapperDisplayName: String = null
  ): ConnectedReduxRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectAction = js.Any.fromFunction1(redirectAction), redirectPath = redirectPath.asInstanceOf[js.Any])
    if (AuthenticatingComponent != null) __obj.updateDynamic("AuthenticatingComponent")(AuthenticatingComponent.asInstanceOf[js.Any])
    if (allowRedirectBack != null) __obj.updateDynamic("allowRedirectBack")(allowRedirectBack.asInstanceOf[js.Any])
    if (authenticatingSelector != null) __obj.updateDynamic("authenticatingSelector")(js.Any.fromFunction2(authenticatingSelector))
    if (redirectQueryParamName != null) __obj.updateDynamic("redirectQueryParamName")(redirectQueryParamName.asInstanceOf[js.Any])
    if (wrapperDisplayName != null) __obj.updateDynamic("wrapperDisplayName")(wrapperDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedReduxRedirectConfig[OwnProps, State]]
  }
}

