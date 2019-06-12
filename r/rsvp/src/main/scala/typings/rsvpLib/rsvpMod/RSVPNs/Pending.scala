package typings
package rsvpLib.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pending
  extends _PromiseState[js.Any] {
  var state: rsvpLib.rsvpMod.RSVPNs.State.pending
}

object Pending {
  @scala.inline
  def apply(state: rsvpLib.rsvpMod.RSVPNs.State.pending): Pending = {
    val __obj = js.Dynamic.literal(state = state)
  
    __obj.asInstanceOf[Pending]
  }
}

