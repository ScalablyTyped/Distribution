package typings.reactDashRouterDashRedux.reactDashRouterDashReduxMod

import typings.history.historyMod.LocationDescriptor
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-redux", "replace")
@js.native
object replace extends js.Object {
  def apply(location: LocationDescriptor[LocationState]): RouterAction = js.native
  def apply(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
}

