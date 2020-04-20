package typings.reduxAuthWrapper.authWrapperMod

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
    val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectedAuthProps]
  }
}

