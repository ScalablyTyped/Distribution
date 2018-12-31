package typings
package reactDashBootstrapLib.reactDashBootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectCallback
  extends reactLib.reactMod.ReactNs.EventHandler[js.Any] {
  /**
    * @deprecated
    * This signature is a hack so can still derive from HTMLProps.
    * It does not reflect the underlying event and should not be used.
    */
  def apply(e: reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent]): scala.Unit = js.native
  def apply(eventKey: js.Any, e: reactLib.reactMod.ReactNs.SyntheticEvent[js.Object, reactLib.Event]): scala.Unit = js.native
}

