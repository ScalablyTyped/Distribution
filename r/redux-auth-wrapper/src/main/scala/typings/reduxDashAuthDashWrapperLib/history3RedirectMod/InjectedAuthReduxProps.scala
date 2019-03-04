package typings
package reduxDashAuthDashWrapperLib.history3RedirectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedAuthReduxProps
  extends reduxDashAuthDashWrapperLib.authWrapperMod.InjectedAuthProps {
  var redirectPath: java.lang.String
}

object InjectedAuthReduxProps {
  @scala.inline
  def apply(isAuthenticated: scala.Boolean, isAuthenticating: scala.Boolean, redirectPath: java.lang.String): InjectedAuthReduxProps = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated, isAuthenticating = isAuthenticating, redirectPath = redirectPath)
  
    __obj.asInstanceOf[InjectedAuthReduxProps]
  }
}

