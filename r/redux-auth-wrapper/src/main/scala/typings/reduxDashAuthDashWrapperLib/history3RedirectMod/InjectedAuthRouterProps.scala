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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAuthenticated")(isAuthenticated)
    __obj.updateDynamic("isAuthenticating")(isAuthenticating)
    __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.updateDynamic("redirectPath")(redirectPath)
    __obj.asInstanceOf[InjectedAuthRouterProps[Redirect]]
  }
}

