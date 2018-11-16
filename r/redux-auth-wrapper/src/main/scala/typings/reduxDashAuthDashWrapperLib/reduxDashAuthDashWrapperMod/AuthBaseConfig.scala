package typings
package reduxDashAuthDashWrapperLib.reduxDashAuthDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthBaseConfig[OwnProps, State] extends AuthConfig {
  @JSName("authenticatedSelector")
  var authenticatedSelector_Original: StateSelector[State, OwnProps, scala.Boolean] = js.native
  var authenticatingSelector: js.UndefOr[StateSelector[State, OwnProps, scala.Boolean]] = js.native
  def authenticatedSelector(state: State, props: OwnProps): scala.Boolean = js.native
}

