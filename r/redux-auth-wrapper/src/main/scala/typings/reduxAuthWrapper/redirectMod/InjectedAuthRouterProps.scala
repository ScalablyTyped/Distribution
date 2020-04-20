package typings.reduxAuthWrapper.redirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedAuthRouterProps[Redirect] extends InjectedAuthReduxProps {
  var redirect: Redirect
}

object InjectedAuthRouterProps {
  @scala.inline
  def apply[Redirect](isAuthenticated: Boolean, isAuthenticating: Boolean, redirect: Redirect, redirectPath: String): InjectedAuthRouterProps[Redirect] = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedAuthRouterProps[Redirect]]
  }
}

