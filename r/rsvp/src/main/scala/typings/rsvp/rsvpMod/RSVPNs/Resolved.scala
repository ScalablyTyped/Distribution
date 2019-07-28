package typings.rsvp.rsvpMod.RSVPNs

import typings.rsvp.rsvpMod.RSVPNs.State.fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolved[T] extends _PromiseState[T] {
  var state: fulfilled
  var value: T
}

object Resolved {
  @scala.inline
  def apply[T](state: fulfilled, value: T): Resolved[T] = {
    val __obj = js.Dynamic.literal(state = state, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Resolved[T]]
  }
}

