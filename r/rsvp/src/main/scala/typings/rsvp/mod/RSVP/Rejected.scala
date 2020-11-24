package typings.rsvp.mod.RSVP

import typings.rsvp.mod.RSVP.State.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rejected[T] extends js.Object {
  
  var reason: T = js.native
  
  var state: rejected = js.native
}
object Rejected {
  
  @scala.inline
  def apply[T](reason: T, state: rejected): Rejected[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rejected[T]]
  }
  
  @scala.inline
  implicit class RejectedOps[Self <: Rejected[_], T] (val x: Self with Rejected[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReason(value: T): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: rejected): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
