package typings
package rsvpLib.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rejected[T] extends js.Object {
  var reason: T
  var state: State
}

object Rejected {
  @scala.inline
  def apply[T](reason: T, state: State): Rejected[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state)
  
    __obj.asInstanceOf[Rejected[T]]
  }
}

