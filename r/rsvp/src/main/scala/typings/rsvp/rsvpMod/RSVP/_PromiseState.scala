package typings.rsvp.rsvpMod.RSVP

import typings.rsvp.rsvpMod.RSVP.State.fulfilled
import typings.rsvp.rsvpMod.RSVP.State.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PromiseState[T] extends js.Object

object _PromiseState {
  @scala.inline
  def Resolved[T](state: fulfilled, value: T): _PromiseState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_PromiseState[T]]
  }
  @scala.inline
  def Pending[T](state: pending): _PromiseState[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_PromiseState[T]]
  }
}

