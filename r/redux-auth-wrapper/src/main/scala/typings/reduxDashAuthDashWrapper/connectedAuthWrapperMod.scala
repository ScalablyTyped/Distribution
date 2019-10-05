package typings.reduxDashAuthDashWrapper

import typings.reduxDashAuthDashWrapper.authWrapperMod.AuthWrapperConfig
import typings.reduxDashAuthDashWrapper.authWrapperMod.InjectedAuthProps
import typings.reduxDashAuthDashWrapper.connectedAuthWrapperMod.ConnectedAuthWrapperConfig
import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthBaseConfig
import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/connectedAuthWrapper", JSImport.Namespace)
@js.native
object connectedAuthWrapperMod extends js.Object {
  def default[OwnProps, State](config: ConnectedAuthWrapperConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthProps] = js.native
  type ConnectedAuthWrapperConfig[OwnProps, State] = AuthWrapperConfig with (AuthBaseConfig[OwnProps, State])
}

