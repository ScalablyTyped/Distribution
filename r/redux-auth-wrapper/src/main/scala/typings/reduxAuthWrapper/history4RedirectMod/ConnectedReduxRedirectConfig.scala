package typings.reduxAuthWrapper.history4RedirectMod

import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.redux.mod.Action
import typings.reduxAuthWrapper.mod.StateSelector
import typings.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectedReduxRedirectConfig[OwnProps, State] extends ConnectedRouterRedirectConfig[OwnProps, State] {
  @JSName("redirectAction")
  def redirectAction_MConnectedReduxRedirectConfig(location: Location[LocationState]): Action[_] = js.native
}

object ConnectedReduxRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => Boolean,
    redirectAction: Location[LocationState] => Action[_],
    redirectPath: String | (StateSelector[State, OwnProps, String])
  ): ConnectedReduxRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectAction = js.Any.fromFunction1(redirectAction), redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedReduxRedirectConfig[OwnProps, State]]
  }
  @scala.inline
  implicit class ConnectedReduxRedirectConfigOps[Self <: ConnectedReduxRedirectConfig[_, _], OwnProps, State] (val x: Self with (ConnectedReduxRedirectConfig[OwnProps, State])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRedirectAction(value: Location[LocationState] => Action[_]): Self = this.set("redirectAction", js.Any.fromFunction1(value))
  }
  
}

