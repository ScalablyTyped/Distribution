package typings
package reactDashSelectLib.libAnimatedTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTransition extends js.Object {
  /** Whether we are in a transition. */
  var in: scala.Boolean = js.native
  /** Function to be called once transition finishes. */
  @JSName("onExited")
  var onExited_Original: fn = js.native
  /** Function to be called once transition finishes. */
  def onExited(): scala.Unit = js.native
}

