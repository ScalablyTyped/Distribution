package typings.rsvp.rsvpMod.RSVP

import typings.rsvp.rsvpMod.RSVP.State.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pending
  extends _PromiseState[js.Any] {
  var state: pending
}

object Pending {
  @scala.inline
  def apply(state: pending): Pending = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pending]
  }
}

