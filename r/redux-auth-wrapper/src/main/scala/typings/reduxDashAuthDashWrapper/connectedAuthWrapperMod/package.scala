package typings.reduxDashAuthDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectedAuthWrapperMod {
  import typings.reduxDashAuthDashWrapper.authWrapperMod.AuthWrapperConfig
  import typings.reduxDashAuthDashWrapper.reduxDashAuthDashWrapperMod.AuthBaseConfig

  type ConnectedAuthWrapperConfig[OwnProps, State] = AuthWrapperConfig with (AuthBaseConfig[OwnProps, State])
}
