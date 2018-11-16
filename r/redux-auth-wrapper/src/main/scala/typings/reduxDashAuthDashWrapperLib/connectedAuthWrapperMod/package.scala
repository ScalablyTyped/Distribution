package typings
package reduxDashAuthDashWrapperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectedAuthWrapperMod {
  type ConnectedAuthWrapperConfig[OwnProps, State] = reduxDashAuthDashWrapperLib.authWrapperMod.AuthWrapperConfig with (reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod.AuthBaseConfig[OwnProps, State])
}
