package typings.rsvp.mod.RSVP

import typings.rsvp.mod.RSVP.State.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rejected[T] extends js.Object {
  var reason: T
  var state: rejected
}

object Rejected {
  @scala.inline
  def apply[T](reason: T, state: rejected): Rejected[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rejected[T]]
  }
}

