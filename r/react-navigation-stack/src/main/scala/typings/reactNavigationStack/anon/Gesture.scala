package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gesture extends js.Object {
  
  var closing: Boolean = js.native
  
  var gesture: Boolean = js.native
}
object Gesture {
  
  @scala.inline
  def apply(closing: Boolean, gesture: Boolean): Gesture = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gesture]
  }
  
  @scala.inline
  implicit class GestureOps[Self <: Gesture] (val x: Self) extends AnyVal {
    
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
    def setClosing(value: Boolean): Self = this.set("closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGesture(value: Boolean): Self = this.set("gesture", value.asInstanceOf[js.Any])
  }
}
