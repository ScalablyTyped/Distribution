package typings.reactDragtastic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnMouseEnter extends js.Object {
  
  def onMouseEnter(): Unit = js.native
  
  def onMouseLeave(): Unit = js.native
  
  def onMouseUp(): Unit = js.native
}
object OnMouseEnter {
  
  @scala.inline
  def apply(onMouseEnter: () => Unit, onMouseLeave: () => Unit, onMouseUp: () => Unit): OnMouseEnter = {
    val __obj = js.Dynamic.literal(onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onMouseUp = js.Any.fromFunction0(onMouseUp))
    __obj.asInstanceOf[OnMouseEnter]
  }
  
  @scala.inline
  implicit class OnMouseEnterOps[Self <: OnMouseEnter] (val x: Self) extends AnyVal {
    
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
    def setOnMouseEnter(value: () => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseLeave(value: () => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseUp(value: () => Unit): Self = this.set("onMouseUp", js.Any.fromFunction0(value))
  }
}
