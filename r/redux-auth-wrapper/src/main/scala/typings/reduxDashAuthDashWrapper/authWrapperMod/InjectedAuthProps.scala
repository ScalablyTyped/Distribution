package typings.reduxDashAuthDashWrapper.authWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedAuthProps extends js.Object {
  var isAuthenticated: Boolean
  var isAuthenticating: Boolean
}

object InjectedAuthProps {
  @scala.inline
  def apply(isAuthenticated: Boolean, isAuthenticating: Boolean): InjectedAuthProps = {
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated, isAuthenticating = isAuthenticating)
  
    __obj.asInstanceOf[InjectedAuthProps]
  }
}

