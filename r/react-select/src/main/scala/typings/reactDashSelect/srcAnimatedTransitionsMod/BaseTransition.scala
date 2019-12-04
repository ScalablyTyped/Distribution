package typings.reactDashSelect.srcAnimatedTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseTransition extends js.Object {
  /** Whether we are in a transition. */
  var in: Boolean
  /** Function to be called once transition finishes. */
  var onExited: fn
}

object BaseTransition {
  @scala.inline
  def apply(in: Boolean, onExited: () => Unit): BaseTransition = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], onExited = js.Any.fromFunction0(onExited))
  
    __obj.asInstanceOf[BaseTransition]
  }
}

