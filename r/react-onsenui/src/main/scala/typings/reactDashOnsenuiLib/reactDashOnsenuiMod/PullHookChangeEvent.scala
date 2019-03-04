package typings
package reactDashOnsenuiLib.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullHookChangeEvent extends js.Object {
  var state: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.initial | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.preaction | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.action
}

object PullHookChangeEvent {
  @scala.inline
  def apply(
    state: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.initial | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.preaction | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.action
  ): PullHookChangeEvent = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullHookChangeEvent]
  }
}

