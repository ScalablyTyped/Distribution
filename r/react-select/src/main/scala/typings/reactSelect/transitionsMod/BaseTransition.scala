package typings.reactSelect.transitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseTransition extends js.Object {
  
  /** Whether we are in a transition. */
  var in: Boolean = js.native
  
  /** Function to be called once transition finishes. */
  var onExited: fn = js.native
}
object BaseTransition {
  
  @scala.inline
  def apply(in: Boolean, onExited: () => Unit): BaseTransition = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], onExited = js.Any.fromFunction0(onExited))
    __obj.asInstanceOf[BaseTransition]
  }
  
  @scala.inline
  implicit class BaseTransitionOps[Self <: BaseTransition] (val x: Self) extends AnyVal {
    
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
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnExited(value: () => Unit): Self = this.set("onExited", js.Any.fromFunction0(value))
  }
}
