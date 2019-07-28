package typings.reactDashOnsenui.reactDashOnsenuiMod

import typings.reactDashOnsenui.reactDashOnsenuiStrings.action
import typings.reactDashOnsenui.reactDashOnsenuiStrings.initial
import typings.reactDashOnsenui.reactDashOnsenuiStrings.preaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullHookChangeEvent extends js.Object {
  var state: initial | preaction | action
}

object PullHookChangeEvent {
  @scala.inline
  def apply(state: initial | preaction | action): PullHookChangeEvent = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullHookChangeEvent]
  }
}

