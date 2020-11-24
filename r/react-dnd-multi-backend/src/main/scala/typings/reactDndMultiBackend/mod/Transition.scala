package typings.reactDndMultiBackend.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transition extends js.Object {
  
  /**
    * ???
    */
  var _isMBTransition: Boolean = js.native
  
  /**
    * Check function to use for this transition.
    */
  var check: CheckFunction[_] = js.native
  
  /**
    * Event type that this transition should check against. This will be an HTML event, such as
    * "dragstart", "touchstart", etc.
    */
  var event: String = js.native
}
object Transition {
  
  @scala.inline
  def apply(_isMBTransition: Boolean, check: _ => Boolean, event: String): Transition = {
    val __obj = js.Dynamic.literal(_isMBTransition = _isMBTransition.asInstanceOf[js.Any], check = js.Any.fromFunction1(check), event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit class TransitionOps[Self <: Transition] (val x: Self) extends AnyVal {
    
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
    def set_isMBTransition(value: Boolean): Self = this.set("_isMBTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheck(value: _ => Boolean): Self = this.set("check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
