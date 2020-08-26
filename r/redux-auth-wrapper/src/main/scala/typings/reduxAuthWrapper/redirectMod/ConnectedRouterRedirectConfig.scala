package typings.reduxAuthWrapper.redirectMod

import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.redux.mod.Action
import typings.reduxAuthWrapper.mod.AuthBaseConfig
import typings.reduxAuthWrapper.mod.StateSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectedRouterRedirectConfig[OwnProps, State] extends AuthBaseConfig[OwnProps, State] {
  var allowRedirectBack: js.UndefOr[Boolean | (StateSelector[State, OwnProps, Boolean])] = js.native
  var redirectAction: js.UndefOr[js.Function1[/* location */ Location[LocationState], Action[_]]] = js.native
  var redirectPath: String | (StateSelector[State, OwnProps, String]) = js.native
  var redirectQueryParamName: js.UndefOr[String] = js.native
}

object ConnectedRouterRedirectConfig {
  @scala.inline
  def apply[OwnProps, State](
    authenticatedSelector: (State, OwnProps) => Boolean,
    redirectPath: String | (StateSelector[State, OwnProps, String])
  ): ConnectedRouterRedirectConfig[OwnProps, State] = {
    val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedRouterRedirectConfig[OwnProps, State]]
  }
  @scala.inline
  implicit class ConnectedRouterRedirectConfigOps[Self <: ConnectedRouterRedirectConfig[_, _], OwnProps, State] (val x: Self with (ConnectedRouterRedirectConfig[OwnProps, State])) extends AnyVal {
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
    def setRedirectPathFunction2(value: (State, OwnProps) => String): Self = this.set("redirectPath", js.Any.fromFunction2(value))
    @scala.inline
    def setRedirectPath(value: String | (StateSelector[State, OwnProps, String])): Self = this.set("redirectPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowRedirectBackFunction2(value: (State, OwnProps) => Boolean): Self = this.set("allowRedirectBack", js.Any.fromFunction2(value))
    @scala.inline
    def setAllowRedirectBack(value: Boolean | (StateSelector[State, OwnProps, Boolean])): Self = this.set("allowRedirectBack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRedirectBack: Self = this.set("allowRedirectBack", js.undefined)
    @scala.inline
    def setRedirectAction(value: /* location */ Location[LocationState] => Action[_]): Self = this.set("redirectAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRedirectAction: Self = this.set("redirectAction", js.undefined)
    @scala.inline
    def setRedirectQueryParamName(value: String): Self = this.set("redirectQueryParamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectQueryParamName: Self = this.set("redirectQueryParamName", js.undefined)
  }
  
}

