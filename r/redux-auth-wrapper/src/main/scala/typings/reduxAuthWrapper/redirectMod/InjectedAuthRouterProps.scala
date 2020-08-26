package typings.reduxAuthWrapper.redirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedAuthRouterProps[Redirect] extends InjectedAuthReduxProps {
  var redirect: Redirect = js.native
}

object InjectedAuthRouterProps {
  @scala.inline
  def apply[Redirect](isAuthenticated: Boolean, isAuthenticating: Boolean, redirect: Redirect, redirectPath: String): InjectedAuthRouterProps[Redirect] = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedAuthRouterProps[Redirect]]
  }
  @scala.inline
  implicit class InjectedAuthRouterPropsOps[Self <: InjectedAuthRouterProps[_], Redirect] (val x: Self with InjectedAuthRouterProps[Redirect]) extends AnyVal {
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
    def setRedirect(value: Redirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
  }
  
}

