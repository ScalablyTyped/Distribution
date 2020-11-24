package typings.reactRouterRedux.mod

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-router-redux", "replace")
@js.native
object replace extends js.Object {
  
  def apply(location: LocationDescriptor[LocationState]): RouterAction = js.native
  def apply(location: LocationDescriptor[LocationState], state: LocationState): RouterAction = js.native
}
