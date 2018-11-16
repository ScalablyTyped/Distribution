package typings
package rsvpLib.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

// RSVP supplies status for promises in certain places.
@JSImport("rsvp/RSVP", "State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait fulfilled
    extends rsvpLib.rsvpMod.RSVPNs.State
  
  @js.native
  sealed trait pending
    extends rsvpLib.rsvpMod.RSVPNs.State
  
  @js.native
  sealed trait rejected
    extends rsvpLib.rsvpMod.RSVPNs.State
  
}

