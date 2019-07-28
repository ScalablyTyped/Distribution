package typings.reduxDashAuthDashWrapper.connectedAuthWrapperMod

import typings.reduxDashAuthDashWrapper.authWrapperMod.InjectedAuthProps
import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthWrapperDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/connectedAuthWrapper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[OwnProps, State](config: ConnectedAuthWrapperConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps with InjectedAuthProps] = js.native
}

