package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassicComponent[P, S]
  extends Component[P, S, js.Any] {
  var getInitialState: js.UndefOr[js.Function0[S]] = js.native
  def isMounted(): scala.Boolean = js.native
  def replaceState(nextState: S): scala.Unit = js.native
  def replaceState(nextState: S, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

