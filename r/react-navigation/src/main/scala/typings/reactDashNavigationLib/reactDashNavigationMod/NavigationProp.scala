package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationProp[S] extends js.Object {
  @JSName("dispatch")
  var dispatch_Original: NavigationDispatch = js.native
  var state: S = js.native
  def dispatch(action: NavigationAction): scala.Boolean = js.native
}

