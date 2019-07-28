package typings.reduxDashAuthDashWrapper

import typings.reduxDashAuthDashWrapper.authWrapperMod.AuthWrapperConfig
import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthBaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectedAuthWrapperMod {
  type ConnectedAuthWrapperConfig[OwnProps, State] = AuthWrapperConfig with (AuthBaseConfig[OwnProps, State])
}
