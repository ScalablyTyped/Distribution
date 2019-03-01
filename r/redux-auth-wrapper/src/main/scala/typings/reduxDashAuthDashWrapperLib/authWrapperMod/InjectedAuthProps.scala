package typings
package reduxDashAuthDashWrapperLib.authWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedAuthProps extends js.Object {
  var isAuthenticated: scala.Boolean
  var isAuthenticating: scala.Boolean
}

object InjectedAuthProps {
  @scala.inline
  def apply(isAuthenticated: scala.Boolean, isAuthenticating: scala.Boolean): InjectedAuthProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAuthenticated")(isAuthenticated)
    __obj.updateDynamic("isAuthenticating")(isAuthenticating)
    __obj.asInstanceOf[InjectedAuthProps]
  }
}

