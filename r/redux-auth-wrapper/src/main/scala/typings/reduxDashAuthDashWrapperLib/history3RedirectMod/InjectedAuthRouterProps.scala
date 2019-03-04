package typings
package reduxDashAuthDashWrapperLib.history3RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedAuthRouterProps[Redirect] extends InjectedAuthReduxProps {
  var redirect: Redirect
}

object InjectedAuthRouterProps {
  @scala.inline
  def apply[Redirect](
    isAuthenticated: scala.Boolean,
    isAuthenticating: scala.Boolean,
    redirect: Redirect,
    redirectPath: java.lang.String
  ): InjectedAuthRouterProps[Redirect] = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated, isAuthenticating = isAuthenticating, redirect = redirect.asInstanceOf[js.Any], redirectPath = redirectPath)
  
    __obj.asInstanceOf[InjectedAuthRouterProps[Redirect]]
  }
}

