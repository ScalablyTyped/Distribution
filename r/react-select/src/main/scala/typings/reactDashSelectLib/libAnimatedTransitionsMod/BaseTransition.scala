package typings
package reactDashSelectLib.libAnimatedTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTransition extends js.Object {
  /** Whether we are in a transition. */
  var in: scala.Boolean
  /** Function to be called once transition finishes. */
  var onExited: fn
}

object BaseTransition {
  @scala.inline
  def apply(in: scala.Boolean, onExited: fn): BaseTransition = {
    val __obj = js.Dynamic.literal(in = in, onExited = onExited)
  
    __obj.asInstanceOf[BaseTransition]
  }
}

