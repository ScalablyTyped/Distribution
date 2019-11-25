package typings.reduxDashAuthDashWrapper.history3RedirectMod

import typings.reduxDashAuthDashWrapper.authWrapperMod.InjectedAuthProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedAuthReduxProps extends InjectedAuthProps {
  var redirectPath: String
}

object InjectedAuthReduxProps {
  @scala.inline
  def apply(isAuthenticated: Boolean, isAuthenticating: Boolean, redirectPath: String): InjectedAuthReduxProps = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InjectedAuthReduxProps]
  }
}

