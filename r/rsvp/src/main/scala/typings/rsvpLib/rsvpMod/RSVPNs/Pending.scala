package typings
package rsvpLib.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pending
  extends _PromiseState[js.Any] {
  var state: State
}

object Pending {
  @scala.inline
  def apply(state: State): Pending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Pending]
  }
}

